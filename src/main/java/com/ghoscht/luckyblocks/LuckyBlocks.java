package com.ghoscht.luckyblocks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(LuckyBlocks.MODID)
public class LuckyBlocks {
    public static final String MODID = "luckyblocks";

    public LuckyBlocks() {
        RegistryHandler.init();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
