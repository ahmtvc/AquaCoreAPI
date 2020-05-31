package me.activated.core.api.events.impl;

import me.activated.core.api.events.AquaEvent;
import me.activated.core.api.player.PlayerData;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Event called whenever player likes your server on NameMC (NameMC is updating every 5 minutes per user)
 */
public class NameMCVerificationChangeEvent extends AquaEvent {

    private PlayerData playerData;
    private boolean finalLiked;

    public PlayerData getPlayerData() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isFinalLiked() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
