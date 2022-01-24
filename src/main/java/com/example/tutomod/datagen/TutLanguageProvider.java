package com.example.tutomod.datagen;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.tutomod.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, tutomod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME , "Platinum");

        add(Registration.PLATINUM_ORE.get(), "Platinum Ore");
        add(Registration.PLATINUM_ORE_DEEPSLATE.get(), "Deepslate Platinum Ore");
        add(Registration.PLATINUM_BLOCK.get(), "Platinum Block");
        add(Registration.RAW_PLATINUM_BLOCK.get(), "Block of Raw Platinum");
        add(Registration.PLATINUM_LANTERN.get(), "Platinum Lantern");
        add(Registration.PLATINUM_CHAIN.get(), "Platinum Chain");
        add(Registration.PLATINUM_SOUL_LANTERN.get(), "Platinum Soul Lantern");

        add(Registration.RAW_PLATINUM.get(), "Raw Platinum");
        add(Registration.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(Registration.PLATINUM_NUGGET.get(), "Platinum Nugget");

        add(Registration.PLATINUM_SWORD.get(), "Platinum Sword");
        add(Registration.PLATINUM_PICKAXE.get(), "Platinum Pickaxe");
        add(Registration.PLATINUM_SHOVEL.get(), "Platinum Shovel");
        add(Registration.PLATINUM_AXE.get(), "Platinum Axe");
        add(Registration.PLATINUM_HOE.get(), "Platinum Hoe");

        add(Registration.PLATINUM_HELMET.get(), "Platinum Helmet");
        add(Registration.PLATINUM_CHESTPLATE.get(), "Platinum Chestplate");
        add(Registration.PLATINUM_LEGGINGS.get(), "Platinum Leggings");
        add(Registration.PLATINUM_BOOTS.get(), "Platinum Boots");

        add(Registration.PLATINUM_INLAID_GOLD_HELMET.get(), "Platinum Inlaid With Gold Helmet");
        add(Registration.PLATINUM_INLAID_GOLD_CHESTPLATE.get(), "Platinum Inlaid With Gold Chestplate");
        add(Registration.PLATINUM_INLAID_GOLD_LEGGINGS.get(), "Platinum Inlaid With Gold Leggings");
        add(Registration.PLATINUM_INLAID_GOLD_BOOTS.get(), "Platinum Inlaid With Gold Boots");
    }
}
