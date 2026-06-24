package com.snowy.chunk.managers;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import java.io.File;
public class ConfigManager {
    private JavaPlugin plugin;
    private FileConfiguration config;
    public ConfigManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    public void loadConfig() {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdirs();
        }
        File configFile = new File(plugin.getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            plugin.saveResource("config.yml", false);
        }
        config = YamlConfiguration.loadConfiguration(configFile);
    }
    public FileConfiguration getConfig() {
        return config;
    }
}