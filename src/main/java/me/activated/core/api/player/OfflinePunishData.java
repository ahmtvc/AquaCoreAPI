package me.activated.core.api.player;

import me.activated.core.api.player.alt.Alt;
import me.activated.core.api.punishment.Punishment;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

/**
 * This class can be initialized or accessed from other classes which already initialize it
 * */
public class OfflinePunishData {

    public List<Punishment> getPunishments() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<Alt> getAlts() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getPunishPriority() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public OfflinePunishData(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public OfflinePunishData load() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public OfflinePunishData load(boolean activeOnly) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Alt getAlt(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public OfflinePunishData loadAlts() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isBanned() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isIPBanned() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isBlacklisted() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isWarned() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isMuted() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Punishment getActiveBan() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Punishment getActiveMute() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Punishment getActiveBlacklist() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}