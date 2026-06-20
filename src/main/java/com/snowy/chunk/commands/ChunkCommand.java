package com.snowy.chunk.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
public class ChunkCommand implements CommandExecutor {
    private JavaPlugin plugin;
    public ChunkCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        player.sendMessage(ChatColor.GREEN + "SnowyChunk v26.1.2");
        return true;
    }
}