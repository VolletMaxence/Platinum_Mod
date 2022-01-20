package com.example.tutomod.setup;

import com.example.tutomod.tutomod;
import com.example.tutomod.world.gen.OreType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.world.entity.monster.piglin.PiglinAi;

public class ModSetup {

    public static final String TAB_NAME = "tutomod";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(Registration.PLATINUM_INGOT.get()); }
    };

    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener(OreType::onBiomeLoadingEvent);
    }

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork( () -> {
            OreType.registerConfiguredFeatures();
        });


/*
        public static void makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
        {
            @Override
            return stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ArmorMaterials.GOLD;
        }
 */
    }
}
