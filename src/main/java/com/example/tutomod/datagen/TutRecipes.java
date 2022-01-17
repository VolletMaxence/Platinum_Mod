package com.example.tutomod.datagen;

import com.example.tutomod.setup.Registration;
import mezz.jei.gui.CraftingGridHelper;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider {

    public TutRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        //Smelt in furnace
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PLATINUM_ORES_ITEM),
                        Registration.PLATINUM_INGOT.get(), 1.0f, 100)
                    .unlockedBy("has_ore", has(Registration.PLATINUM_ORES_ITEM))
                    .save(consumer, "smelting_ore_platinum_ingot");

            SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PLATINUM.get()),
                        Registration.PLATINUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_PLATINUM.get()))
                .save(consumer, "smelting_raw_platinum_ingot");

        //Smelt in Blast_Furnace
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.PLATINUM_ORES_ITEM),
                        Registration.PLATINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PLATINUM_ORES_ITEM))
                .save(consumer, "blasting_ore_platinum_ingot");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RAW_PLATINUM.get()),
                        Registration.PLATINUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_PLATINUM.get()))
                .save(consumer, "blasting_raw_platinum_ingot");

            //Platinum Block Craft from Platinum Ingot
            ShapedRecipeBuilder.shaped(Registration.PLATINUM_BLOCK.get())
                    .pattern("ppp")
                    .pattern("ppp")
                    .pattern("ppp")
                    .define('p', Registration.PLATINUM_INGOT.get())
                    .group("tutomod")
                    .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                    .save(consumer, "craft_platinum_block_from_platinum_ingot");
            //Platinum Ingot Craft from Platinum Nugget
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_INGOT.get())
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', Registration.PLATINUM_NUGGET.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, "craft_platinum_ingot_from_platinum_nugget");

            //Platinum Ingot Craft from Platinum Block
        ShapelessRecipeBuilder.shapeless(Registration.PLATINUM_INGOT.get(), 9)
                .requires(Registration.PLATINUM_BLOCK.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BLOCK.get()))
                .save(consumer, "craft_platinum_ingot_from_platinum_block");
            //Platinum Nugget Craft from Platinum Ingot
        ShapelessRecipeBuilder.shapeless(Registration.PLATINUM_NUGGET.get(), 9)
                .requires(Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_nugget_from_platinum_ingot");

            //Platinum Sword Craft 1
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_SWORD.get())
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .define('S', Items.STICK)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_sword");

        //Platinum Pickaxe Craft 1
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .define('S', Items.STICK)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_pickaxe");

        //Platinum Shovel Craft 1
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_SHOVEL.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .define('S', Items.STICK)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_shovel");

        //Platinum Axe Craft 1
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_AXE.get())
                .pattern("PP ")
                .pattern("PS ")
                .pattern(" S ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .define('S', Items.STICK)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_axe");

        //Platinum Hoe Craft 1
        ShapedRecipeBuilder.shaped(Registration.PLATINUM_HOE.get())
                .pattern("PP ")
                .pattern(" S ")
                .pattern(" S ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .define('S', Items.STICK)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_hoe");
    }
}
