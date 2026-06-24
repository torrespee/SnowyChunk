package com.snowy.chunk;
import org.bukkit.plugin.java.JavaPlugin;
import com.snowy.chunk.commands.ChunkCommand;
import com.snowy.chunk.listeners.BlockListener;
import com.snowy.chunk.managers.ConfigManager;
import com.snowy.chunk.managers.DatabaseManager;
public class SnowyChunk extends JavaPlugin {
    private static SnowyChunk instance;
    private ConfigManager configManager;
    private DatabaseManager databaseManager;
    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SnowyChunk v26.1.2 - Enabled!");
        configManager = new ConfigManager(this);
        databaseManager = new DatabaseManager(this);
        configManager.loadConfig();
        databaseManager.connect();
        getCommand("chunk").setExecutor(new ChunkCommand(this));
        getServer().getPluginManager().registerEvents(new BlockListener(this), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("SnowyChunk v26.1.2 - Disabled!");
    }
    public static SnowyChunk getInstance() {
        return instance;
    }
}