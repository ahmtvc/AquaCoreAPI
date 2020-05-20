package me.activated.core.api;

import me.activated.core.api.player.GlobalPlayer;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

/**
 * This class is accessed from AquaCoreAPI
 */
public class ServerData {

    public String getServerName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isWhitelisted() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isMaintenance() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getMaxPlayers() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public double[] getRecentTps() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<GlobalPlayer> getOnlinePlayers() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
