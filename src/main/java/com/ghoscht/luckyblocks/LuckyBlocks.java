package com.ghoscht.luckyblocks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(LuckyBlocks.MODID)
public class LuckyBlocks {
    public static final String MODID = "luckyblocks";
    private static final Logger LOGGER = LogManager.getLogger();

    public LuckyBlocks() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
