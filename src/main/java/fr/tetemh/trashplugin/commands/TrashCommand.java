package fr.tetemh.trashplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class TrashCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player player) {
            Inventory trashinv = Bukkit.createInventory(player, 3*9, "Trash");
            player.openInventory(trashinv);
        } else {
            sender.sendMessage("Only player execute this command");
        }

        return false;
    }
}
