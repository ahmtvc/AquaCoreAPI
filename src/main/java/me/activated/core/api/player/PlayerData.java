package me.activated.core.api.player;

import lombok.NonNull;
import me.activated.core.api.rank.RankData;
import me.activated.core.api.rank.grant.Grant;
import me.activated.core.api.tags.Tag;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

/**
 * This class is accessed from AquaCoreAPI
 */
public class PlayerData {

    public boolean hasPermission(String permission) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasDefaultGrant() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void loadAttachments(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public List<Grant> getActiveGrants() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasRank(RankData rankData) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @NonNull
    public RankData getHighestRank() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getLastSeenAgo() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getNameColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Tag getTag() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCoins() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCoins(int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getTagColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getChatColor() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isNameTag() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setNameTag(boolean value) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isVanished() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isInStaffMode() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public PunishData getPunishData() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
