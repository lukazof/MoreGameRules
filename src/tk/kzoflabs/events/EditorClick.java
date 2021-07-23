package tk.kzoflabs.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import tk.kzoflabs.Main;

public class EditorClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){

        if(e.getInventory() == null)
            return;

        if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)
            return;

        if(!e.getInventory().getName().equalsIgnoreCase("§8MoreGameRules - Editor"))
            return;

        e.setCancelled(true);
        Player p = (Player) e.getWhoClicked();

        if(e.getCurrentItem().getType() == Material.IRON_DOOR && Main.getInstance().getConfig().getBoolean("no-join-quit-messages")){
                Main.getInstance().getConfig().set("no-join-quit-messages", false);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.IRON_DOOR && !Main.getInstance().getConfig().getBoolean("no-join-quit-messages")){
                Main.getInstance().getConfig().set("no-join-quit-messages", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }


        if(e.getCurrentItem().getType() == Material.BREAD && Main.getInstance().getConfig().getBoolean("no-hunger")){
            Main.getInstance().getConfig().set("no-hunger", false);
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.BREAD && !Main.getInstance().getConfig().getBoolean("no-hunger")){
                Main.getInstance().getConfig().set("no-hunger", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }

        if(e.getCurrentItem().getType() == Material.DIAMOND_PICKAXE && Main.getInstance().getConfig().getBoolean("unbreakable-items")){
            Main.getInstance().getConfig().set("unbreakable-items", false);
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.DIAMOND_PICKAXE && !Main.getInstance().getConfig().getBoolean("unbreakable-items")){
                Main.getInstance().getConfig().set("unbreakable-items", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }

        if(e.getCurrentItem().getType() == Material.WHEAT && Main.getInstance().getConfig().getBoolean("anti-soil-trampling")){
            Main.getInstance().getConfig().set("anti-soil-trampling", false);
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.WHEAT && !Main.getInstance().getConfig().getBoolean("anti-soil-trampling")){
                Main.getInstance().getConfig().set("anti-soil-trampling", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }


        if(e.getCurrentItem().getType() == Material.BEDROCK && Main.getInstance().getConfig().getBoolean("anti-modify-blocks")){
            Main.getInstance().getConfig().set("anti-modify-blocks", false);
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.BEDROCK && !Main.getInstance().getConfig().getBoolean("anti-modify-blocks")){
                Main.getInstance().getConfig().set("anti-modify-blocks", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }

        if(e.getCurrentItem().getType() == Material.GOLDEN_APPLE && Main.getInstance().getConfig().getBoolean("invincible")){
            Main.getInstance().getConfig().set("invincible", false);
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();
        }else{
            if(e.getCurrentItem().getType() == Material.GOLDEN_APPLE && !Main.getInstance().getConfig().getBoolean("invincible")){
                Main.getInstance().getConfig().set("invincible", true);
                Main.getInstance().saveConfig();
                Main.getInstance().reloadConfig();
                p.updateInventory();
            }

        }

        if(e.getCurrentItem().getType() == Material.EMERALD_BLOCK){
            Main.getInstance().saveConfig();
            Main.getInstance().reloadConfig();
            p.updateInventory();


        }

    }
}