package me.leopold95.shootinggalery.core;


import me.leopold95.shootinggalery.ShootingGalery;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {
	private static File configFile;
	private static FileConfiguration cfg;

	public static void setInt(String path, int value){
		cfg.set(path, value);
		try {
			cfg.save(configFile);
		}
		catch (IOException exp){
			exp.printStackTrace();
		}
	}

	public static String getString(String path){
		return cfg.getString(path);
	}

	public static int getInt(String path){
		return cfg.getInt(path);
	}

	public static double getDouble(String path){
		return cfg.getDouble(path);
	}

	public static void register(){
		createConfigFile("config.yml");
	}

	private static void createConfigFile(String file){
		configFile = new File(ShootingGalery.getPlugin().getDataFolder(), file);
		if(!configFile.exists()){
			configFile.getParentFile().mkdirs();
			ShootingGalery.getPlugin().saveResource(file, false);
		}
		cfg = new YamlConfiguration();
		try {
			cfg.load(configFile);
			cfg.save(configFile);
		}catch (IOException | InvalidConfigurationException exp){
			exp.printStackTrace();
		}
	}

}
