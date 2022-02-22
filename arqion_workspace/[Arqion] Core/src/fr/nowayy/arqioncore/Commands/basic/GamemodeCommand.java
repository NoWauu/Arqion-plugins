package fr.nowayy.arqioncore.Commands.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import fr.nowayy.arqioncore.Main;
import fr.nowayy.arqioncore.utils.Messages;

public class GamemodeCommand implements TabExecutor {
	
	@SuppressWarnings("deprecation")
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> list = new ArrayList<String>();
			if(cmd.getName().equalsIgnoreCase("gamemode") && args.length <= 1) {
				Arrays.asList(GameMode.values()).forEach(gm -> { 
					list.add(String.valueOf(gm.getValue()));
					list.add(gm.name().toLowerCase());
				});
				return list;
			}		
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("gameMode")) {
			
			Player target = null;
			
			if (args.length > 1) {
				
				try{
					target = Bukkit.getPlayer(args[1]);
				} catch(NullPointerException e) {
					sender.sendMessage(Main.Error_Prefix + Messages.Error_PlayerNotFound.toString().replace("{@target}", args[0]));
					return true;
				}
				
			} else if (sender instanceof Player && args.length < 2) {
				target = (Player) sender;
			} else {
				sender.sendMessage(Main.Error_Prefix.toString());
			}
			
			if (target == null || args.length < 1) return false;
			String sgm = args[0];
			
			GameMode chosen_gM = GameMode.SURVIVAL;
			
			for (GameMode gm : GameMode.values()) {
				if (sgm.equalsIgnoreCase(gm.name()) || sgm.equalsIgnoreCase(String.valueOf(gm.getValue()))) {
					chosen_gM = gm;
					break;
				}
			}
			
			target.setGameMode(chosen_gM);
			if (sender.getName().equals(target.getName())) {
				sender.sendMessage(Main.prefix + Messages.GameMode_SetYourself.toString().replace("{@GameMode}", chosen_gM.toString().toLowerCase()));
			} else {
				sender.sendMessage(Main.prefix + Messages.GameMode_SetOther.toString().replace("{@target}", target.getDisplayName()).replace("{@GameMode}", chosen_gM.toString().toLowerCase()));
				target.sendMessage(Main.prefix + Messages.GameMode_SetYourself.toString().replace("{@GameMode}", chosen_gM.toString().toLowerCase()));
			}
			
			return true;
			
		}
		
		return false;
	}

}