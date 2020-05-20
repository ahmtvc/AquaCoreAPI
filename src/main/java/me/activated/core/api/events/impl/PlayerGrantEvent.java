package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import me.activated.core.api.player.PlayerData;
import me.activated.core.api.rank.grant.Grant;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever player or console grants a rank
 */
public class PlayerGrantEvent extends AquaEvent {

    public Grant getGrant() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public PlayerData getTargetData() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public CommandSender getExecutor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isCancelled() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean setCancelled(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
