package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.core.Globals;
import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

public class Target {
	public static ArmorStand spawn(Location location, Tiers tier){
		ArmorStand target = (ArmorStand) location.getWorld().spawnEntity(location.add(0.5, 0, 0.5), EntityType.ARMOR_STAND);
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

			case FOURTH:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 4);
				break;

			case FIFTH:
				target.getPersistentDataContainer().set(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER, 5);
				break;
		}

		return target;
	}

	public void move(ArmorStand target, Location from, Location to, double speed){

	}
}
