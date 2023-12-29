package com.sebastian.cadditions;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAdditions implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("create_additions");
    public static final String MODNAME = "Create: Additions";
	public static final String MOD_ID = "create_additions";
	public static final String MODVERSION = "1.0.0";

	@Override
	public void onInitialize() {
		LOGGER.info(MODNAME + " is starting with profile " + MinecraftClient.getInstance().getSession().getUsername());
	}
}