package org.shark.healingBed.events;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedLeave implements Listener {
    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();

        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            var maxHealthAttribute = player.getAttribute(Attribute.MAX_HEALTH);

            if (maxHealthAttribute == null) return;

            double maxHealth = maxHealthAttribute.getDefaultValue();

            player.setHealth(maxHealth);
        }
    }
}
