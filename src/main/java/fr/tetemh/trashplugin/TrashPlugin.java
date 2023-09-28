package fr.tetemh.trashplugin;

import fr.tetemh.trashplugin.commands.TrashCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TrashPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("trash").setExecutor(new TrashCommand());
    }
}
