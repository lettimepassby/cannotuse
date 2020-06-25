package me.TimePassBy.cannotuse.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

public class useHOPPER implements Listener {
    Plugin plugin = me.TimePassBy.cannotuse.Main.getPlugin(me.TimePassBy.cannotuse.Main.class);
    @EventHandler
    public void useHOPPER(PlayerInteractEvent e1){
        Player player = e1.getPlayer();
        if (plugin.getConfig().getBoolean("HOPPER")){
            if (e1.getClickedBlock().getType() == Material.HOPPER){
                if(e1.getAction() == Action.RIGHT_CLICK_BLOCK){
                    if (player.hasPermission("cannotuse.hopper")){
                        player.sendMessage("§7(§c!§7)§8您成功绕过漏斗限制");
                    }else {
                        e1.setCancelled(true);
                        player.sendMessage("§7(§c!§7)§8漏斗暂时无法使用!");
                    }
                }
            }

        }

        }
    }