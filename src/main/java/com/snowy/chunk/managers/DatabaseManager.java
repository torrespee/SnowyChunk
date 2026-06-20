package com.snowy.chunk.managers;
import org.bukkit.plugin.java.JavaPlugin;
import java.sql.*;
public class DatabaseManager {
    private JavaPlugin plugin;
    private Connection connection;
    public DatabaseManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + plugin.getDataFolder() + "/snowy_chunk.db");
            plugin.getLogger().info("Database connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}