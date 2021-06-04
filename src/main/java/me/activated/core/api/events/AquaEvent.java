package me.activated.core.api.events;

import org.bukkit.event.*;
import org.bukkit.plugin.*;

public class AquaEvent extends Event {

    @Override
    public HandlerList getHandlers() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
