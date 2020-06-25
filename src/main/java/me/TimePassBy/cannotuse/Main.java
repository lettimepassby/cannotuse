package me.TimePassBy.cannotuse;

import me.TimePassBy.cannotuse.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {

            Bukkit.getConsoleSender().sendMessage("§7[§e方块禁止交互§7]§b已启用√");

            getConfig().options().copyDefaults();
            saveDefaultConfig();

            getServer().getPluginManager().registerEvents(new useFURNACE(), this);
            getServer().getPluginManager().registerEvents(new useDISPENSER(), this);
            getServer().getPluginManager().registerEvents(new useDROPPER(), this);
            getServer().getPluginManager().registerEvents(new useHOPPER(), this);
            getServer().getPluginManager().registerEvents(new useC(), this);
    }




    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§7[§e方块禁止交互§7]§b已关闭√");
    }


}
