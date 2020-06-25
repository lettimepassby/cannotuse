package me.TimePassBy.cannotuse.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

public class useFURNACE implements Listener {
    Plugin plugin = me.TimePassBy.cannotuse.Main.getPlugin(me.TimePassBy.cannotuse.Main.class);
    @EventHandler
    public void useFURNACE(PlayerInteractEvent e1){
        Player player = e1.getPlayer();
        if (plugin.getConfig().getBoolean("FURNACE")){
            if (e1.getClickedBlock().getType() == Material.FURNACE){
                if(e1.getAction() == Action.RIGHT_CLICK_BLOCK){
                    if (player.hasPermission("cannotuse.furnace")){
                        player.sendMessage("§7(§c!§7)§8您成功绕过熔炉限制");
                    }else {
                        e1.setCancelled(true);
                        player.sendMessage("§7(§c!§7)§8熔炉暂时无法使用!");
                    }
                }
            }
        }


    }
}