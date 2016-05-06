package net.bbrooker.msskill.class;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class CommonSkill extends MinespaceSkill implements Listener {
	
	


	@EventHandler(priority = EventPriority.HIGHEST)
	public void onHealSkill(PlayerInteractEvent event){
		Player player = event.getPlayer();
		Action action = event.getAction();
		
		if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_AIR))  {
			
			if (player.getItemInHand().getType() == Material.RECORD_11 && event.getItem().getDurability() == 1 && player.hasPermission("minespace.skill.heal"))
			
			{	
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 1));
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1200, 1));
				player.playSound(player.getLocation(), Sound.LEVEL_UP, 1, 1);	
				player.sendMessage(ChatColor.AQUA + ("[MINESPACE]") + ChatColor.GREEN + ("Using Heal Skill!"));
				new BukkitRunnable(){
					@Override
					public void run(){
					player.chat("Cooldown Skill for 1 Minutes");
					}
					}.runTaskLater(this, 1200L);
        }
			else {
				player.sendMessage(ChatColor.DARK_RED + ("[MINESPACE]") + ChatColor.RED + "You do not have permission to do that skill");
			}
		}
	}
