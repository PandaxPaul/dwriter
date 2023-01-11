package de.pandaxpaul.dwriter.listeners;

import de.pandaxpaul.dwriter.main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class ChatListener implements Listener {


    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        String messagecontent = message.toLowerCase();

    }
}
