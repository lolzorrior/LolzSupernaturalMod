package com.lolzorrior.lolzsupernaturalmod.Block;

import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;



public class BlockWitchWood extends LogBlock {

    public BlockWitchWood(Properties properties)
    {
        super(MaterialColor.GREEN, properties);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }
}
