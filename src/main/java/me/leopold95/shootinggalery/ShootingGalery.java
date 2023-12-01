package me.leopold95.shootinggalery;

import me.leopold95.shootinggalery.commands.BaseCommand;
import me.leopold95.shootinggalery.commands.BaseTabCompliter;
import me.leopold95.shootinggalery.core.Config;
import me.leopold95.shootinggalery.listeners.ArrowHit;
import me.leopold95.shootinggalery.listeners.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Точка входа плагина
 */
public final class ShootingGalery extends JavaPlugin {
    private static ShootingGalery inst;

    @Override
    public void onEnable() {
        inst = this;
        Config.register();
        // Plugin startup logic


        getServer().getPluginManager().registerEvents(new ArrowHit(), this);
        getServer().getPluginManager().registerEvents(new Player(), this);
        //getServer().getPluginManager().registerEvents(new A, this);

        getCommand("shootingallery").setExecutor(new BaseCommand());
        getCommand("shootingallery").setTabCompleter(new BaseTabCompliter());
    }

    @Override
    public void onDisable() {
        inst = null;
        // Plugin shutdown logic
    }

    public static ShootingGalery getPlugin(){
        return inst;
    }
}
