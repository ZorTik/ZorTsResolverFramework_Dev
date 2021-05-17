package me.zort.commons.resolverframework.type.minecraft;

import org.bukkit.event.Event;

public @interface EventBukkit {

    Class<? extends Event> value();

}
