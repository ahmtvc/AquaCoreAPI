package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import me.activated.core.api.player.OfflinePunishData;
import me.activated.core.api.punishment.Punishment;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever player or console tries to punish someone
 */
public class PlayerPunishEvent extends AquaEvent {

    public OfflinePunishData getData() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Punishment getPunishment() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isCancelled() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean setCancelled(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
