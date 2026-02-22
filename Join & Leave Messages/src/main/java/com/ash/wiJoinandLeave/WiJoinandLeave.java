package com.ash.wiJoinandLeave;

import com.ash.wiJoinandLeave.Listener.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WiJoinandLeave extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);

    }
}
