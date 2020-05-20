package me.activated.core.api.player.alt;

import org.bukkit.ChatColor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class Alt {

    public String getName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public UUID getUniqueId() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getNameColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
