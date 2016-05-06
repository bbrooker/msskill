package net.bbrooker.minespace;

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

public class MinespaceSkill extends JavaPlugin implements Listener {
	
	
	public void onEnable(){
		
		getLogger().info("== MINE SPACE SKILL ACTIVATED ==");
		
	}
	
	public void onDisable(){
		
		getLogger().info("== MINE SPACE SKILL DEACTIVATED ==");
		
	}
	
	//PLUGIN CHECKER
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("minespace skill")) { 
			
			sender.sendMessage(ChatColor.RED + "[" + ChatColor.AQUA + "MINESPACE-SKILL" + ChatColor.RED + "]" + ChatColor.GOLD + "Minespace Skill Version 0.10B");
			
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the value of false will be returned.
		return false; 
	}
	
	
	///////////////////////////////////////////////
    //     ALL RESOURCE AND METERIAL DEVELOPED   //
	//                BY MRBBOOK                 //
	//          MINE SPACE RP THAILAND           //
	///////////////////////////////////////////////
	
	
	//PASSIVE SKILL

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

	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onSpeedSkill(PlayerInteractEvent event){
			Player player = event.getPlayer();
			Action action = event.getAction();
			
			if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_AIR))  {
				
				if (player.getItemInHand().getType() == Material.RECORD_6 && event.getItem().getDurability() == 1 && player.hasPermission("minespace.skill.heal"))
				
				{	
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1));
					player.playSound(player.getLocation(), Sound.SLIME_WALK, 1, 1);	
					player.sendMessage(ChatColor.AQUA + ("[MINESPACE]") + ChatColor.GREEN + ("Using Speed Skill!"));
					new BukkitRunnable(){
						@Override
						public void run(){
						player.chat("Cooldown Skill for 1 Minutes");
						}
					}.runTaskLater(this, 1200L);
				}
	        }
				else {
					player.sendMessage(ChatColor.DARK_RED + ("[MINESPACE]") + ChatColor.RED + "You do not have permission to do that skill");
				}
			}
			
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onJumpSkill(PlayerInteractEvent event){
			Player player = event.getPlayer();
			Action action = event.getAction();
			
			if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_AIR))  {
				
				if (player.getItemInHand().getType() == Material.RECORD_5 && event.getItem().getDurability() == 1 && player.hasPermission("minespace.skill.heal"))
				
				{	
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1));
					player.playSound(player.getLocation(), Sound.ENDERDRAGON_WINGS, 1, 1);	
					player.sendMessage(ChatColor.AQUA + ("[MINESPACE]") + ChatColor.GREEN + ("Using Jump Skill!"));
					new BukkitRunnable(){
						@Override
						public void run(){
						player.chat("Cooldown Skill for 1 Minutes");
						}
					}.runTaskLater(this, 1200L);
				}
	        }
				else {
					player.sendMessage(ChatColor.DARK_RED + ("[MINESPACE]") + ChatColor.RED + "You do not have permission to do that skill");
				}
			}
			

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onTempRegenSkill(PlayerInteractEvent event){
			Player player = event.getPlayer();
			Action action = event.getAction();
			
			if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_AIR))  {
				
				if (player.getItemInHand().getType() == Material.RECORD_4 && event.getItem().getDurability() == 1 && player.hasPermission("minespace.skill.heal"))
				
				{	
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1));
					player.playSound(player.getLocation(), Sound.ENDERDRAGON_WINGS, 1, 1);	
					player.sendMessage(ChatColor.AQUA + ("[MINESPACE]") + ChatColor.GREEN + ("Using TempRegen Skill!"));
					new BukkitRunnable(){
						@Override
						public void run(){
						player.chat("Cooldown Skill for 5 Minutes");
						}
					}.runTaskLater(this, 6000L);
				}
	        }
				else {
					player.sendMessage(ChatColor.DARK_RED + ("[MINESPACE]") + ChatColor.RED + "You do not have permission to do that skill");
				}
			}
			
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onReskill(PlayerInteractEvent event){
			Player player = event.getPlayer();
			Action action = event.getAction();
			
			if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_AIR))  {
				
				if (player.getItemInHand().getType() == Material.RECORD_3 && event.getItem().getDurability() == 1 && player.hasPermission("minespace.skill.heal"))
				
				{	
					for (PotionEffect effect : player.getActivePotionEffects())
				        player.removePotionEffect(effect.getType());
					player.sendMessage(ChatColor.DARK_AQUA + "[MINESPACE]" + ChatColor.GREEN + "You are no longer on any effects");
	        }
				else {
					player.sendMessage(ChatColor.DARK_RED + ("[MINESPACE]") + ChatColor.RED + "You do not have permission to do that skill");
				}
			
				
		}
			
	}
}
