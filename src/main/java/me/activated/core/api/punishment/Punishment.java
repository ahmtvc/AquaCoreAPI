package me.activated.core.api.punishment;

import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * This class is accessed from PunishData
 */
public class Punishment {

    public PunishmentType getType() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isClear() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isSilent() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getAddedBy() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isIPRelative() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getRemovedFor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getRemovedBy() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getReason() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getNiceDuration() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getNiceExpire() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isPermanent() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasExpired() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
