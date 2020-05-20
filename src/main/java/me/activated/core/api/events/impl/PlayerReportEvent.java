package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import me.activated.core.api.player.GlobalPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever player tries to report global player [defined as getHacker()]
 */
public class PlayerReportEvent extends AquaEvent {

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public GlobalPlayer getHacker() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getReason() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isCancelled() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean setCancelled(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
