package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever player gets access to operator ot gets access of operator removed
 */
public class PlayerOpChangeEvent extends AquaEvent {

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isOped() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
