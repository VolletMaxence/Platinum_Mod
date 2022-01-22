package com.example.tutomod.datagen;

import com.example.tutomod.setup.Registration;
import net.minecraft.data.DataGenerator;

public class TutLootTables extends BaseLootTableProvider {

    public TutLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.PLATINUM_ORE.get(), createSilkTouchTable("platinum_ore", Registration.PLATINUM_ORE.get(), Registration.RAW_PLATINUM.get(), 1, 3));
        lootTables.put(Registration.PLATINUM_ORE_DEEPSLATE.get(), createSilkTouchTable("deepslate_platinum_ore", Registration.PLATINUM_ORE_DEEPSLATE.get(), Registration.RAW_PLATINUM.get(), 1, 3));
        lootTables.put(Registration.PLATINUM_BLOCK.get(), createSilkTouchTable("platinum_block", Registration.PLATINUM_BLOCK.get(), Registration.PLATINUM_BLOCK_ITEM.get(), 1, 1));
        lootTables.put(Registration.RAW_PLATINUM_BLOCK.get(), createSilkTouchTable("raw_platinum_block", Registration.RAW_PLATINUM_BLOCK.get(), Registration.RAW_PLATINUM_BLOCK_ITEM.get(), 1, 1));
        lootTables.put(Registration.PLATINUM_LANTERN.get(), createSilkTouchTable("platinum_lantern", Registration.PLATINUM_LANTERN.get(), Registration.PLATINUM_LANTERN_ITEM.get(), 1, 1));
        lootTables.put(Registration.PLATINUM_CHAIN.get(), createSilkTouchTable("platinum_lantern", Registration.PLATINUM_CHAIN.get(), Registration.PLATINUM_CHAIN_ITEM.get(), 1, 1));

    }
}
