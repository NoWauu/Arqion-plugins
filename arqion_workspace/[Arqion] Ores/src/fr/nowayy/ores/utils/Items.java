package fr.nowayy.ores.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Items {

	public final ItemStack  hammerItem = new ItemManager.ItemBuilder(Material.STONE_PICKAXE, 1, "�3Crushing Hammer")
									.setLore("Casser Casser Casser").build(),
							rockBreaker = new ItemManager.ItemBuilder(Material.OBSERVER, 1, "�3Rock Breaker").addFakeEnchant()
									.setLore("").build(),
							compressor = new ItemManager.SkullBuilder(1, "�1Compressor").setBase64Texture(
									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ4MzM3ZjdlZGUxNWMzYjJmOGRjNmE2M2JkOTI4NzRjZGY3NGVjODYyYjQxMThjN2UzNTU1OWNlOGI0ZCJ9fX0=")
									.setLore("").build(),
							cobbleGen = new ItemManager.SkullBuilder(1, "�1Cobblestone Generator").setBase64Texture(
									"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGVmZGVlYjEyODJlMWQxM2Y1NmYwNjc0Nzc0OGE0NjM0MTM3Yzg2NjQyODA4NzAyMzdjOTc3ZDA0NGExODNiNiJ9fX0=")
									.setLore("").build(),
							cobbleGenT1 = new ItemManager.ItemBuilder(Material.PAPER, 1,
									"�6Cobblestone Generator Upgrade �7[�6Tier I�7]").addFakeEnchant().build(),
							cobbleGenT2 = new ItemManager.ItemBuilder(Material.PAPER, 1,
									"�6Cobblestone Generator Upgrade �7[�6Tier II�7]").addFakeEnchant().build(),
							cobbleGenT3 = new ItemManager.ItemBuilder(Material.PAPER, 1,
									"�6Cobblestone Generator Upgrade �7[�6Tier III�7]").addFakeEnchant().build(),
							cobbleGenT4 = new ItemManager.ItemBuilder(Material.PAPER, 1,
									"�6Cobblestone Generator Upgrade �7[�6Tier IV�7]").addFakeEnchant().build(),
							cobbleGenT5 = new ItemManager.ItemBuilder(Material.PAPER, 1,
									"�6Cobblestone Generator Upgrade �7[�6Tier V�7]").addFakeEnchant().build(),
							
							compressCobble = new ItemManager.ItemBuilder(Material.COBBLESTONE, 1, "Compressed Cobblestone").addFakeEnchant().build(),
							cable = new ItemManager.ItemBuilder(Material.LEAD, 1, "Cable").addFakeEnchant(Enchantment.SILK_TOUCH, 5).build();
	
							

}
