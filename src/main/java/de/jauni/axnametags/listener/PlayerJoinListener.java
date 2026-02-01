package de.jauni.axnametags.listener;

import de.jauni.axnametags.AxNameTags;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    AxNameTags reference;
    public PlayerJoinListener(AxNameTags reference){
        this.reference = reference;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        reference.setNameTag(e.getPlayer());
    }
}
