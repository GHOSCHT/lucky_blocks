package com.ghoscht.luckyblocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            LuckyBlocks.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            LuckyBlocks.MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    static Block lbb = new Block(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.AMETHYST));
    public static final RegistryObject<Block> LUCKY_BLOCK_BASIC = BLOCKS.register("lucky_block_basic", () -> lbb);

    public static final RegistryObject<Item> LUCKY_BLOCK_BASIC_ITEM = ITEMS.register("lucky_block_basic",
            () -> new BlockItem(lbb, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
