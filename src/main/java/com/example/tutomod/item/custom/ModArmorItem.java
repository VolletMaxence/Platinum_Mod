package com.example.tutomod.item.custom;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.*;
import com.google.common.collect.ImmutableMap;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.server.PlayerAdvancements;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import org.jline.utils.Status;

import static com.example.tutomod.setup.ModArmorMaterial.*;
import static net.minecraft.world.effect.MobEffects.*;

import java.util.Map;



public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffect> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffect>())
                    .put(PLATINUMREDSTONE, MobEffects.MOVEMENT_SPEED).build();
                    .put(PLATINUMDIAMOND, MobEffects.DAMAGE_RESISTANCE).build();
                    .put(PLATINUMEMERALD, MobEffects.HERO_OF_THE_VILLAGE).build();


    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean selected) {
        if(!world.isClientSide) {
            if(entity instanceof LivingEntity) {
                LivingEntity player = (Player)entity;

                if(hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(LivingEntity player) {
        for (Map.Entry<ArmorMaterial, MobEffect> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffect mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(LivingEntity player, ArmorMaterial mapArmorMaterial, MobEffect mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect);

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(, 20, 1));


            /*
            if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
                player.getInventory().damageArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            }*/
        }
    }

    private boolean hasFullSuitOfArmorOn(LivingEntity player) {
        ItemStack boots = player.getArmorSlots(0);
        ItemStack leggings = player.getArmorSlots(1);
        ItemStack breastplate = player.getArmorSlots(2);
        ItemStack helmet = player.getArmorSlots(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, LivingEntity player) {
        ArmorItem boots = ((ArmorItem)player.inventory.ArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}