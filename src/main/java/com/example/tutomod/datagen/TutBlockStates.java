package com.example.tutomod.datagen;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.Registration;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.xml.transform.Templates;
import javax.xml.transform.sax.TemplatesHandler;

public class TutBlockStates extends BlockStateProvider {

    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {

        super(gen, tutomod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(Registration.PLATINUM_ORE.get());
        simpleBlock(Registration.PLATINUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.PLATINUM_BLOCK.get());
        simpleBlock(Registration.RAW_PLATINUM_BLOCK.get());
        ItemBlockRenderTypes.setRenderLayer(Registration.PLATINUM_LANTERN.get(), RenderType.cutout());
    }

}
