package com.example.tutomod.datagen;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags extends ItemTagsProvider {

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, tutomod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.PLATINUM_ORE_ITEM.get())
                .add(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.PLATINUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(Registration.PLATINUM_NUGGET.get());
        tag(Tags.Items.RAW_MATERIALS)
                .add(Registration.RAW_PLATINUM.get());
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(Registration.PLATINUM_INGOT.get());

        tag(ItemTags.PIGLIN_LOVED)
                .add(Registration.PLATINUM_INLAID_GOLD_HELMET.get())
                .add(Registration.PLATINUM_INLAID_GOLD_CHESTPLATE.get())
                .add(Registration.PLATINUM_INLAID_GOLD_LEGGINGS.get())
                .add(Registration.PLATINUM_INLAID_GOLD_BOOTS.get());


        tag(Registration.PLATINUM_ORES_ITEM)
                .add(Registration.PLATINUM_ORE_ITEM.get())
                .add(Registration.PLATINUM_ORE_DEEPSLATE_ITEM.get());
        tag(Registration.PLATINUM_TOOLS)
                .add(Registration.PLATINUM_SWORD.get())
                .add(Registration.PLATINUM_PICKAXE.get())
                .add(Registration.PLATINUM_SHOVEL.get())
                .add(Registration.PLATINUM_AXE.get())
                .add(Registration.PLATINUM_HOE.get());
        tag(Registration.PLATINUM_ARMORS)
                .add(Registration.PLATINUM_HELMET.get())
                .add(Registration.PLATINUM_CHESTPLATE.get())
                .add(Registration.PLATINUM_LEGGINGS.get())
                .add(Registration.PLATINUM_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
