package org.shark.healingBed;

import org.bukkit.plugin.java.JavaPlugin;
import org.shark.healingBed.events.PlayerBedLeave;

public final class HealingBed extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerBedLeave(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
