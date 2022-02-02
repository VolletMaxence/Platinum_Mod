package com.example.tutomod.setup;

import com.example.tutomod.tutomod;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

import static net.minecraftforge.common.Tags.Blocks.NEEDS_GOLD_TOOL;

public class ModTiers {
    public static final ForgeTier PLATINUM = new ForgeTier(2 , 907, 0, 0, 15,
            NEEDS_GOLD_TOOL, () -> Ingredient.of((ItemLike) Registration.PLATINUM_INGOT.get()));

}
