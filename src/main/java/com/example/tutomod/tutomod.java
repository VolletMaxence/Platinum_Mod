package com.example.tutomod;

import com.example.tutomod.setup.ModSetup;
import com.example.tutomod.setup.ClientSetup;
import com.example.tutomod.setup.Registration;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraft.client.renderer.RenderType.cutout;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(tutomod.MODID)
public class tutomod {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "tutomod";

    public tutomod() {
        //Register the deferred registery
        ModSetup.setup();
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        modbus.addListener(this::setupClient);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }

    private void  setupClient(final FMLClientSetupEvent event)
    {
        ItemBlockRenderTypes.setRenderLayer(Registration.PLATINUM_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.PLATINUM_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Registration.PLATINUM_SOUL_LANTERN.get(), RenderType.cutout());
    }
}
