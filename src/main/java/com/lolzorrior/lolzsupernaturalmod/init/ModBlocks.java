package com.lolzorrior.lolzsupernaturalmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import com.lolzorrior.lolzsupernaturalmod.Block.BlockWitchWood;

import static com.lolzorrior.lolzsupernaturalmod.SupernaturalMod.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MODID)
public class ModBlocks
{
    public static final Block block_witch_wood = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).harvestLevel(2).harvestTool(ToolType.AXE)).setRegistryName(MODID, "block_witch_wood"));
    }
}
