package com.sahil.novaai;

import com.sahil.novaai.registry.ModEntities;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NovaAI implements ModInitializer {

    public static final String MOD_ID = "novaai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Initializing NovaAI...");

        // Register custom entities
        ModEntities.register();

        LOGGER.info("NovaAI loaded successfully!");
    }
}
