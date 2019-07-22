package com.lolzorrior.lolzsupernaturalmod.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import static com.lolzorrior.lolzsupernaturalmod.SupernaturalMod.MODID;
import static com.lolzorrior.lolzsupernaturalmod.init.ModBlocks.block_witch_wood;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new BlockItem(block_witch_wood, (new Item.Properties()).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block_witch_wood.getRegistryName())
        );
    }
}
