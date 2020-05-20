package me.activated.core.api.player;

import me.activated.core.api.punishment.Punishment;
import me.activated.core.api.punishment.PunishmentType;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.Set;

/**
 * This class is accessed from PlayerData
 */
public class PunishData {

    public Set<Punishment> getPunishments() {
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

    public List<Punishment> getPunishments(PunishmentType type) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
