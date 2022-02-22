package fr.nowayy.arqioncore.Commands.moderation;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.nowayy.arqioncore.Main;
import fr.nowayy.arqioncore.utils.Messages;

public class OpenEnderChestCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("openEc") && sender instanceof Player && args.length == 1) {
			
			Player user = (Player) sender;
			
			Player target = null;
			try {
				target = Bukkit.getPlayer(args[0]);
				user.openInventory(target.getEnderChest());
			} catch(NullPointerException e) {
				sender.sendMessage(Main.Error_Prefix + Messages.Error_PlayerNotFound.toString().replace("{@target}", args[0]));
				return true;
			}
			return true;
		}

		return false;
	}

}