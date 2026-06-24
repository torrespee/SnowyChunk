package com.snowy.chunk.listeners;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
public class BlockListener implements Listener {
    private JavaPlugin plugin;
    public BlockListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        event.getPlayer().sendMessage(ChatColor.RED + "[SnowyChunk] Block event!");
    }
}