package com.ash.wiJoinandLeave.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().sendMessage("§aWelcome to the Server!");
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        e.getPlayer().sendMessage("§cGood to See You!");
    }
}
