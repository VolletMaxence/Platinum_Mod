package com.example.tutomod.datagen;

import com.example.tutomod.setup.Registration;
import mezz.jei.gui.CraftingGridHelper;
import mezz.jei.plugins.vanilla.anvil.SmithingRecipeCategory;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.SmithingMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraftforge.common.ForgeConfigSpec;
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
                        Registration.PLATINUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_PLATINUM.get()))
                .save(consumer, "smelting_raw_platinum_ingot");

        //Smelt in Blast_Furnace
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.PLATINUM_ORES_ITEM),
                        Registration.PLATINUM_INGOT.get(), 1.0f, 50)
                .unlockedBy("has_ore", has(Registration.PLATINUM_ORES_ITEM))
                .save(consumer, "blasting_ore_platinum_ingot");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RAW_PLATINUM.get()),
                        Registration.PLATINUM_INGOT.get(), 1.0f, 50)
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

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_HELMET.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("   ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_helmet");

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_CHESTPLATE.get())
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_chestplate");

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_LEGGINGS.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P', Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_leggings");

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_BOOTS.get())
                .pattern("P P")
                .pattern("P P")
                .pattern("   ")
                .define('P', Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .save(consumer, "craft_platinum_boots");

        //Smithing Table Craft
        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.PLATINUM_HELMET.get()), Ingredient.of(Items.GOLD_INGOT), Registration.PLATINUM_INLAID_GOLD_HELMET.get())
                .unlocks("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_HELMET.get()))
                .save(consumer, "smithing_platinum_inlaid_with_gold_helmet");
        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.PLATINUM_CHESTPLATE.get()), Ingredient.of(Items.GOLD_INGOT), Registration.PLATINUM_INLAID_GOLD_CHESTPLATE.get())
                .unlocks("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_CHESTPLATE.get()))
                .save(consumer, "smithing_platinum_inlaid_with_gold_chestplate");
        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.PLATINUM_LEGGINGS.get()), Ingredient.of(Items.GOLD_INGOT), Registration.PLATINUM_INLAID_GOLD_LEGGINGS.get())
                .unlocks("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_LEGGINGS.get()))
                .save(consumer, "smithing_platinum_inlaid_with_gold_leggings");
        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.PLATINUM_BOOTS.get()), Ingredient.of(Items.GOLD_INGOT), Registration.PLATINUM_INLAID_GOLD_BOOTS.get())
                .unlocks("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BOOTS.get()))
                .save(consumer, "smithing_platinum_inlaid_with_gold_boots");

        ShapedRecipeBuilder.shaped(Registration.RAW_PLATINUM_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', Registration.RAW_PLATINUM.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_PLATINUM.get()))
                .save(consumer, "craft_raw_platinum_block_from_raw_platinum");

        //Platinum Ingot Craft from Platinum Block
        ShapelessRecipeBuilder.shapeless(Registration.RAW_PLATINUM.get(), 9)
                .requires(Registration.RAW_PLATINUM_BLOCK.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.RAW_PLATINUM_BLOCK.get()))
                .save(consumer, "craft_raw_platinum_from_raw_platinum_block");

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_LANTERN.get())
                .pattern("ppp")
                .pattern("pTp")
                .pattern("ppp")
                .define('p', Registration.PLATINUM_NUGGET.get())
                .define('T', Items.TORCH)
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Items.TORCH))
                .save(consumer, "craft_platinum_lantern");

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_CHAIN.get())
                .pattern(" p ")
                .pattern(" P ")
                .pattern(" p ")
                .define('p', Registration.PLATINUM_NUGGET.get())
                .define('P', Registration.PLATINUM_INGOT.get())
                .group("tutomod")
                .unlockedBy("platinum", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, "craft_platinum_chain");
    }
}