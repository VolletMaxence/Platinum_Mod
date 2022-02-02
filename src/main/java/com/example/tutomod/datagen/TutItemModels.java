package com.example.tutomod.datagen;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, tutomod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Block Texture
        withExistingParent(Registration.PLATINUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore"));
        withExistingParent(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore_deepslate"));
        withExistingParent(Registration.PLATINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_block"));
        withExistingParent(Registration.RAW_PLATINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/raw_platinum_block"));
        withExistingParent(Registration.PLATINUM_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_ore"));

        //Item Texture
        singleTexture(Registration.RAW_PLATINUM.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
        "layer0", modLoc("item/raw_platinum"));
        singleTexture(Registration.PLATINUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_ingot"));
        singleTexture(Registration.PLATINUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_nugget"));

        //Tools Texture
        singleTexture(Registration.PLATINUM_SWORD.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/platinum_sword"));
        singleTexture(Registration.PLATINUM_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/platinum_pickaxe"));
        singleTexture(Registration.PLATINUM_SHOVEL.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/platinum_shovel"));
        singleTexture(Registration.PLATINUM_AXE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/platinum_axe"));
        singleTexture(Registration.PLATINUM_HOE.get().getRegistryName().getPath(),
                mcLoc("item/handheld"),
                "layer0", modLoc("item/platinum_hoe"));
        singleTexture(Registration.PLATINUM_LANTERN.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_lantern"));
        singleTexture(Registration.PLATINUM_CHAIN.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_chain"));
        singleTexture(Registration.PLATINUM_SOUL_LANTERN.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_soul_lantern"));

        //Armor Texture
        singleTexture(Registration.PLATINUM_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_helmet"));
        singleTexture(Registration.PLATINUM_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_chestplate"));
        singleTexture(Registration.PLATINUM_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_leggings"));
        singleTexture(Registration.PLATINUM_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinum_boots"));

        singleTexture(Registration.PLATINUM_INLAID_GOLD_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumgold_helmet"));
        singleTexture(Registration.PLATINUM_INLAID_GOLD_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumgold_chestplate"));
        singleTexture(Registration.PLATINUM_INLAID_GOLD_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumgold_leggings"));
        singleTexture(Registration.PLATINUM_INLAID_GOLD_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumgold_boots"));

        singleTexture(Registration.PLATINUM_INLAID_LAPIS_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumlapis_helmet"));
        singleTexture(Registration.PLATINUM_INLAID_LAPIS_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumlapis_chestplate"));
        singleTexture(Registration.PLATINUM_INLAID_LAPIS_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumlapis_leggings"));
        singleTexture(Registration.PLATINUM_INLAID_LAPIS_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumlapis_boots"));

        singleTexture(Registration.PLATINUM_INLAID_REDSTONE_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumredstone_helmet"));
        singleTexture(Registration.PLATINUM_INLAID_REDSTONE_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumredstone_chestplate"));
        singleTexture(Registration.PLATINUM_INLAID_REDSTONE_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumredstone_leggings"));
        singleTexture(Registration.PLATINUM_INLAID_REDSTONE_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumredstone_boots"));

        singleTexture(Registration.PLATINUM_INLAID_DIAMOND_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumdiamond_helmet"));
        singleTexture(Registration.PLATINUM_INLAID_DIAMOND_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumdiamond_chestplate"));
        singleTexture(Registration.PLATINUM_INLAID_DIAMOND_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumdiamond_leggings"));
        singleTexture(Registration.PLATINUM_INLAID_DIAMOND_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumdiamond_boots"));

        singleTexture(Registration.PLATINUM_INLAID_EMERALD_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumemerald_helmet"));
        singleTexture(Registration.PLATINUM_INLAID_EMERALD_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumemerald_chestplate"));
        singleTexture(Registration.PLATINUM_INLAID_EMERALD_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumemerald_leggings"));
        singleTexture(Registration.PLATINUM_INLAID_EMERALD_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/platinumemerald_boots"));
    }
}
