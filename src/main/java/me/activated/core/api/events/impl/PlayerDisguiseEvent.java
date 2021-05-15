package me.activated.core.api.events.impl;

import me.activated.core.api.events.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.*;

/**
 * Created by FaceSlap_
 * Created 15. 5. 2021. at 16:05
 */
public class PlayerDisguiseEvent extends AquaEvent {

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getPreviousName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getCurrentName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getDisguisedRank() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
