package me.leopold95.shootingallery;

import me.leopold95.shootingallery.commands.BaseCommand;
import me.leopold95.shootingallery.commands.BaseTabCompliter;
import me.leopold95.shootingallery.core.Config;
import me.leopold95.shootingallery.listeners.ArrowHit;
import me.leopold95.shootingallery.listeners.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Точка входа плагина
 */
public final class ShootingGallery extends JavaPlugin {
    private static ShootingGallery inst;

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

    public static ShootingGallery getPlugin(){
        return inst;
    }
}
