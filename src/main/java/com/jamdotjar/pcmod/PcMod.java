package com.jamdotjar.pcmod;

import com.jamdotjar.pcmod.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PcMod implements ModInitializer {
	public static final String MOD_ID = "pcmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("pcmod");


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}