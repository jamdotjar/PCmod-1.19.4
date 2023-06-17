package com.jamdotjar.pcmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PcMod implements ModInitializer {
	public static final String MOD_ID = "pcmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("pcmod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}