package com.example.tutomod.setup;

import com.example.tutomod.item.custom.ModArmorItem;
import com.example.tutomod.tutomod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

import static com.example.tutomod.tutomod.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;
    public static ToIntFunction<BlockState> lightLevelSoul = BlockState -> 10;

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final BlockBehaviour.Properties LANTERN_PROPERTIES = Block.Properties.of(Material.METAL).strength(2f).sound(SoundType.LANTERN).lightLevel(lightLevel).noOcclusion();
    public static final BlockBehaviour.Properties SOUL_LANTERN_PROPERTIES = Block.Properties.of(Material.METAL).strength(2f).sound(SoundType.LANTERN).lightLevel(lightLevelSoul).noOcclusion();
    public static final BlockBehaviour.Properties CHAIN_PROPERTIES = Block.Properties.of(Material.METAL).strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion();
    public static final BlockBehaviour.Properties DECO_PROPERTIES = BlockBehaviour.Properties.of(Material.DECORATION);

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    //Block + item
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register( "platinum_ore", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_ORE_ITEM = fromBlock(PLATINUM_ORE);
    public static final RegistryObject<Block> PLATINUM_ORE_DEEPSLATE = BLOCKS.register( "platinum_ore_deepslate", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_ORE_DEEPSLATE_ITEM = fromBlock(PLATINUM_ORE_DEEPSLATE);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = fromBlock(PLATINUM_BLOCK);
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> RAW_PLATINUM_BLOCK_ITEM = fromBlock(RAW_PLATINUM_BLOCK);

    //Block chiant
    public static final RegistryObject<Block> PLATINUM_LANTERN = BLOCKS.register("platinum_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F)
            .lightLevel(lightLevel)
            .noOcclusion()));
    public static final RegistryObject<Item> PLATINUM_LANTERN_ITEM = fromBlock(PLATINUM_LANTERN);
    public static final RegistryObject<Block> PLATINUM_CHAIN = BLOCKS.register("platinum_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F)
            .noOcclusion()));
    public static final RegistryObject<Item> PLATINUM_CHAIN_ITEM = fromBlock(PLATINUM_CHAIN);
    public static final RegistryObject<Block> PLATINUM_SOUL_LANTERN = BLOCKS.register("platinum_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F)
            .lightLevel(lightLevelSoul)
            .noOcclusion()));
    public static final RegistryObject<Item> PLATINUM_SOUL_LANTERN_ITEM = fromBlock(PLATINUM_SOUL_LANTERN);

    //Item
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(ITEM_PROPERTIES));

    //Tools
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(ModTiers.PLATINUM, 5, -2.4f, ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(ModTiers.PLATINUM, 3, -2.8f, ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(ModTiers.PLATINUM, 3.5f, -3, ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(ModTiers.PLATINUM, 8, -3.1f, ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(ModTiers.PLATINUM, 0, -2.7f, ITEM_PROPERTIES));

    //Armor
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> PLATINUM_INLAID_GOLD_HELMET = ITEMS.register("platinum_inlaid_gold_helmet", () -> new PlatinumGold(ModArmorMaterial.PLATINUMGOLD, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_GOLD_CHESTPLATE = ITEMS.register("platinum_inlaid_gold_chestplate", () -> new PlatinumGold(ModArmorMaterial.PLATINUMGOLD, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_GOLD_LEGGINGS = ITEMS.register("platinum_inlaid_gold_leggings", () -> new PlatinumGold(ModArmorMaterial.PLATINUMGOLD, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_GOLD_BOOTS = ITEMS.register("platinum_inlaid_gold_boots", () -> new PlatinumGold(ModArmorMaterial.PLATINUMGOLD, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> PLATINUM_INLAID_LAPIS_HELMET = ITEMS.register("platinum_inlaid_lapis_helmet", () -> new ArmorItem(ModArmorMaterial.PLATINUMLAPIS, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_LAPIS_CHESTPLATE = ITEMS.register("platinum_inlaid_lapis_chestplate", () -> new ArmorItem(ModArmorMaterial.PLATINUMLAPIS, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_LAPIS_LEGGINGS = ITEMS.register("platinum_inlaid_lapis_leggings", () -> new ArmorItem(ModArmorMaterial.PLATINUMLAPIS, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_LAPIS_BOOTS = ITEMS.register("platinum_inlaid_lapis_boots", () -> new ArmorItem(ModArmorMaterial.PLATINUMLAPIS, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> PLATINUM_INLAID_REDSTONE_HELMET = ITEMS.register("platinum_inlaid_redstone_helmet", () -> new ModArmorItem(ModArmorMaterial.PLATINUMREDSTONE, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_REDSTONE_CHESTPLATE = ITEMS.register("platinum_inlaid_redstone_chestplate", () -> new ArmorItem(ModArmorMaterial.PLATINUMREDSTONE, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_REDSTONE_LEGGINGS = ITEMS.register("platinum_inlaid_redstone_leggings", () -> new ArmorItem(ModArmorMaterial.PLATINUMREDSTONE, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_REDSTONE_BOOTS = ITEMS.register("platinum_inlaid_redstone_boots", () -> new ArmorItem(ModArmorMaterial.PLATINUMREDSTONE, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> PLATINUM_INLAID_DIAMOND_HELMET = ITEMS.register("platinum_inlaid_diamond_helmet", () -> new ModArmorItem(ModArmorMaterial.PLATINUMDIAMOND, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_DIAMOND_CHESTPLATE = ITEMS.register("platinum_inlaid_diamond_chestplate", () -> new ArmorItem(ModArmorMaterial.PLATINUMDIAMOND, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_DIAMOND_LEGGINGS = ITEMS.register("platinum_inlaid_diamond_leggings", () -> new ArmorItem(ModArmorMaterial.PLATINUMDIAMOND, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_DIAMOND_BOOTS = ITEMS.register("platinum_inlaid_diamond_boots", () -> new ArmorItem(ModArmorMaterial.PLATINUMDIAMOND, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    public static final RegistryObject<Item> PLATINUM_INLAID_EMERALD_HELMET = ITEMS.register("platinum_inlaid_emerald_helmet", () -> new ModArmorItem(ModArmorMaterial.PLATINUMEMERALD, EquipmentSlot.HEAD,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_EMERALD_CHESTPLATE = ITEMS.register("platinum_inlaid_emerald_chestplate", () -> new ArmorItem(ModArmorMaterial.PLATINUMEMERALD, EquipmentSlot.CHEST,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_EMERALD_LEGGINGS = ITEMS.register("platinum_inlaid_emerald_leggings", () -> new ArmorItem(ModArmorMaterial.PLATINUMEMERALD, EquipmentSlot.LEGS,  ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INLAID_EMERALD_BOOTS = ITEMS.register("platinum_inlaid_emerald_boots", () -> new ArmorItem(ModArmorMaterial.PLATINUMEMERALD, EquipmentSlot.FEET,  ITEM_PROPERTIES));

    //Ajout de Tag
    public static final Tags.IOptionalNamedTag<Block> PLATINUM_ORES = BlockTags.createOptional(new ResourceLocation(tutomod.MODID, "platinum_ore"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_ORES_ITEM = ItemTags.createOptional(new ResourceLocation(tutomod.MODID, "deepslate_platinum_ore"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_BLOCKS_ITEM = ItemTags.createOptional(new ResourceLocation(tutomod.MODID, "platinum_block"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_TOOLS = ItemTags.createOptional(new ResourceLocation(tutomod.MODID, "platinum_ingot"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_ARMORS = ItemTags.createOptional(new ResourceLocation(tutomod.MODID, "platinum_ingot"));



    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
