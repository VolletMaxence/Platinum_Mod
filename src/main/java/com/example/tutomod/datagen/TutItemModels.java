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
    }
}
