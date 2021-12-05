package me.activated.core.api.rank;

import org.bukkit.ChatColor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

/**
 * This class is accessed from PlayerData or AquaCoreAPI
 */
public class RankData {

    public ChatColor getColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isGlobal() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isBungee() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isDefaultRank() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isPurchasable() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<String> getServers() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<String> getBungeePermissions() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<String> getAllPermissions() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<String> getAvailablePermissions() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getPrefix() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getSuffix() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasPermission(String value) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasInheritance(String value) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getChatColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getWeight() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
