package me.leopold95.shootinggalery.core;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

public class Target {
	public  void spawn(Location location, Tiers tier){
		ArmorStand target = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
		target.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		target.getPersistentDataContainer().set(Globals.TARGET_KEY, PersistentDataType.BYTE, (byte)1);

		switch (tier){
			case FIRST:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 1);
				break;

			case SECOND:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 2);
				break;

			case THIRD:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 3);
				break;

			case FIFTH:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 4);
				break;

			case FOURTH:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 5);
				break;
		}


	}

	public void move(Location from, Location to, double speed){

	}
}
