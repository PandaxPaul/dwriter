package de.pandaxpaul.dwriter;

import de.pandaxpaul.dwriter.listeners.ChatListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new ChatListener(), this);
             Plugin plugin = Bukkit.getPluginManager().getPlugin(this.getName());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public class ChatListener implements Listener {
        @EventHandler
        public void onPlayerChatEvent(AsyncPlayerChatEvent event) {
            String message = event.getMessage();
            String messagecontent = message.toLowerCase();
            if (messagecontent.equalsIgnoreCase("du stinkst") || messagecontent.equalsIgnoreCase("l")) {
                Bukkit.getScheduler().scheduleSyncDelayedTask(main.this, new Runnable() {
                    public void run() {
                        Bukkit.getServer().broadcastMessage("D:");
                    }
                }, 1L);
            }
        }
    }

}
