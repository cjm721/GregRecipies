package com.gmail.cjmiller721.GregRecipies;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class GregRecipies extends JavaPlugin{

	public Logger logger;

	public void onEnable(){
		this.saveDefaultConfig();
		
		logger = getLogger();
		
		logger.info("Fixing Power Armor GregTech Recipies.");

		gregRecipies();
		
		logger.info("Fixed Power Armor GregTech Recipies.");
	}

	public void gregRecipies(){
		String path = "recipies.";
		
		//Power Armor Head
		if(getConfig().getBoolean(path + "powerHead")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("powerArmorHead").toItemStack(1));
			item.shape("ADA","MCM");

			item.setIngredient('A', getMaterial("aluminium"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('M', getMaterial("machineParts"));
			
			item.setIngredient('C', getMaterial("computerMonitor"));
			
			getServer().addRecipe(item);
			logger.info("Added Power Armor Head");
		}
		
		//Power Armor Torso
		if(getConfig().getBoolean(path + "powerTorso")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("powerArmorTorso").toItemStack(1));
			item.shape("AMA","ADA","AAA");

			item.setIngredient('A', getMaterial("aluminium"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('M', getMaterial("machineParts"));
			
			getServer().addRecipe(item);
			logger.info("Added Power Armor Torso");
		}
		
		//Power Armor Legs
		if(getConfig().getBoolean(path + "powerLegs")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("powerArmorLegs").toItemStack(1));
			item.shape("MDM","A A","A A");

			item.setIngredient('A', getMaterial("aluminium"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('M', getMaterial("machineParts"));
			
			
			getServer().addRecipe(item);
			logger.info("Added Power Armor Legs");
		}
		
		//Power Armor Feet
		if(getConfig().getBoolean(path + "powerFeet")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("powerArmorFeet").toItemStack(1));
			item.shape("M M","ADA");

			item.setIngredient('A', getMaterial("aluminium"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('M', getMaterial("machineParts"));
			
			
			getServer().addRecipe(item);
			logger.info("Added Power Armor Feet");
		}
		
		//Power Tool
		if(getConfig().getBoolean(path + "powerTool")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("powerTool").toItemStack(1));
			item.shape("A A","AMA"," D ");

			item.setIngredient('A', getMaterial("aluminium"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('M', getMaterial("machineParts"));
			
			
			getServer().addRecipe(item);
			logger.info("Added Power Tool");
		}
		
		//Tinker Table
		if(getConfig().getBoolean(path + "tinkerTable")){
			ShapedRecipe tinker1 = new ShapedRecipe(getMaterial("powerArmorTinkerTable").toItemStack(1));
			tinker1.shape("CSC","IEI","IAI");

			tinker1.setIngredient('C', getMaterial("advancedCircuit"));

			tinker1.setIngredient('S', getMaterial("computerMonitor"));

			tinker1.setIngredient('I', getMaterial("refinedIron"));

			tinker1.setIngredient('E', Material.EMERALD);

			tinker1.setIngredient('A', getMaterial("steelMachineHull"));

			getServer().addRecipe(tinker1);
			logger.info("Added Tinker Table");
		}
		
		//Servo Motor
		if(getConfig().getBoolean(path + "servoMotor")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("servoMotor").toItemStack(1));
			item.shape("SBS","COC","SBS");

			item.setIngredient('S', getMaterial("steelRC"));
			
			item.setIngredient('B', getMaterial("brass"));
			
			item.setIngredient('C', getMaterial("advancedCircuit"));
			
			item.setIngredient('O', getMaterial("solenoid"));
			
			//RT Steel
			getServer().addRecipe(item);
			logger.info("Added Server Motor (RT)");
			
			//GT Steel
			item.setIngredient('S', getMaterial("steelGT"));
			getServer().addRecipe(item);
			logger.info("Added Server Motor (GregTech)");
		}
		
		//Glider Wing
		if(getConfig().getBoolean(path + "gliderWing")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("gliderWing").toItemStack(1));
			item.shape(" MA","MCS","M  ");

			item.setIngredient('M', getMaterial("magnaliumPlate"));
			
			item.setIngredient('A', getMaterial("advancedCircuit"));
			
			item.setIngredient('C', getMaterial("carbonPlate"));
			
			item.setIngredient('S', getMaterial("solenoid"));
					
			getServer().addRecipe(item);
			logger.info("Added Glider Wing");
		}
		
		//Field Emitter
		if(getConfig().getBoolean(path + "fieldEmitter")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("forceFieldEmitter").toItemStack(1));
			item.shape("ISI","UEU","ISI");

			item.setIngredient('I', getMaterial("iridiumPlate"));
			
			item.setIngredient('S', getMaterial("solenoid"));
			
			item.setIngredient('U', getMaterial("superconductor"));
			
			item.setIngredient('E', getMaterial("energyFlowCircuit"));
					
			getServer().addRecipe(item);
			logger.info("Added Force Field Emitter");
		}
		
		//LV Capacitor
		if(getConfig().getBoolean(path + "lvcapacitor")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("lvcapacitor").toItemStack(1));
			item.shape("IWI","ICI","ICI");

			item.setIngredient('I', getMaterial("refinedIron"));
			
			item.setIngredient('W', getMaterial("wiring"));
			
			item.setIngredient('C', getMaterial("energyCrystal"));
					
			getServer().addRecipe(item);
			logger.info("Added LV Capacitor");
		}
		
		//MV Capacitor
		if(getConfig().getBoolean(path + "mvcapacitor")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("mvcapacitor").toItemStack(1));
			item.shape("IWI","ICI","ICI");

			item.setIngredient('I', getMaterial("titanium"));
			
			item.setIngredient('W', getMaterial("wiring"));
			
			item.setIngredient('C', getMaterial("lapotronCrystal"));
					
			getServer().addRecipe(item);
			logger.info("Added MV Capacitor");
		}
		
		//HV Capacitor
		if(getConfig().getBoolean(path + "hvcapacitor")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("hvcapacitor").toItemStack(1));
			item.shape("IWI","ICI","ICI");

			item.setIngredient('I', getMaterial("chrome"));
			
			item.setIngredient('W', getMaterial("wiring"));
			
			item.setIngredient('C', getMaterial("lapotronicEnergyOrb"));
					
			getServer().addRecipe(item);
			logger.info("Added HV Capacitor");
		}

		//Basic Plating
		if(getConfig().getBoolean(path + "basicPlating")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("basicPlating").toItemStack(1));
			item.shape("II ","CI ","II ");

			item.setIngredient('I', getMaterial("titanium"));

			item.setIngredient('C', getMaterial("electronicCircuit"));
					
			getServer().addRecipe(item);
			logger.info("Added Basic Plating");
		}

		//Advanced Plating
		if(getConfig().getBoolean(path + "advancedPlating")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("advancedPlating").toItemStack(1));
			item.shape("II ","CI ","II ");

			item.setIngredient('I', getMaterial("iridiumPlate"));

			item.setIngredient('C', getMaterial("advancedCircuit"));
					
			getServer().addRecipe(item);
			logger.info("Added Advanced Plating");
		}

		//Control Circuit
		if(getConfig().getBoolean(path + "controlCircuit")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("controlCircuit").toItemStack(1));
			item.shape("WCE","DOC","EDW");

			item.setIngredient('W', getMaterial("wiring"));

			item.setIngredient('C', getMaterial("advancedCircuit"));
			
			item.setIngredient('E', getMaterial("electrumIngot"));
			
			item.setIngredient('D', getMaterial("dataStorageCircuit"));
			
			item.setIngredient('O', getMaterial("energyFlowCircuit"));
					
			getServer().addRecipe(item);
			logger.info("Added Control Circuit");
		}

		//Solar Panel
		if(getConfig().getBoolean(path + "solarPanel")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("solarPanel").toItemStack(1));
			item.shape("GGG","IEI");

			item.setIngredient('G', getMaterial("reinforcedGlass"));

			item.setIngredient('I', getMaterial("iridiumPlate"));
			
			item.setIngredient('E', getMaterial("energyFlowCircuit"));
			
			getServer().addRecipe(item);
			logger.info("Added Solar Panel");
		}
		
		//Ion Thruster
		if(getConfig().getBoolean(path + "ionThruster")){
			ShapedRecipe item = new ShapedRecipe(getMaterial("ionThruster").toItemStack(1));
			item.shape("ISI","FHF","P P");

			item.setIngredient('S', getMaterial("superconductor"));

			item.setIngredient('I', getMaterial("iridiumPlate"));
			
			item.setIngredient('F', getMaterial("forceFieldEmitter"));
			
			item.setIngredient('H', getMaterial("hvCapacitor"));
			
			item.setIngredient('P', getMaterial("iridiumNeutronReflector"));
			
			getServer().addRecipe(item);
			logger.info("Added Ion Thruster");
		}

	}
	
	public MaterialData getMaterial(String m){
		String path = "materials.";
		
		int id = getConfig().getInt(path + m + ".id");
		int damage = getConfig().getInt(path + m + ".damage");
		
		return new MaterialData(id, (byte)damage);
	}
}
