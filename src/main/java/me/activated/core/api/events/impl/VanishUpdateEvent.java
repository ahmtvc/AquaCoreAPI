package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever a staff player execute vanish command
 */
public class VanishUpdateEvent extends AquaEvent {

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
