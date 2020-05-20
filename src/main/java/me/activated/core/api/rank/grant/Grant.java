package me.activated.core.api.rank.grant;


import me.activated.core.api.rank.RankData;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * This class is accessed from PlayerData
 */
public class Grant {

    public boolean hasExpired() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isActiveSomewhere() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isPermanent() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    /*If server is "Global", grant is global*/
    public String getServer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getNiceDuration() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getNiceExpire() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public RankData getRank() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
