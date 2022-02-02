package com.example.tutomod.item.custom;

import com.example.tutomod.tutomod;
import com.example.tutomod.setup.*;
import com.google.common.collect.ImmutableMap;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.network.chat.HoverEvent;
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
    /*
                    .put(PLATINUMDIAMOND, MobEffects.DAMAGE_RESISTANCE).build();
                    .put(PLATINUMEMERALD, MobEffects.HERO_OF_THE_VILLAGE).build();
    */

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

            int ValArmure = hasCorrectArmorOn(mapArmorMaterial, player);

            //0 = pas bon // 1 = Redstone = Speed // 2 = Diamant = Resistance // 3 = Emeraude = Hero of the Village
            if (ValArmure == 0)
            {

            } else if(ValArmure == 1)
            {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20));

            } else if(ValArmure == 2)
            {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20));

            } else if(ValArmure == 3)
            {
                player.addEffect(new MobEffectInstance(HERO_OF_THE_VILLAGE, 20));

            }
        }
    }
    /*
    private void addStatusEffectForMaterial(LivingEntity player, ArmorMaterial mapArmorMaterial, MobEffect mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect);

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
                player.getInventory().damageArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            }
        }
    }
    */

    //Verifie si il possède une armure
    private boolean hasFullSuitOfArmorOn(LivingEntity player) {
        //float ArmorLevel = player.getArmorCoverPercentage();

        Boolean boots = player.hasItemInSlot(EquipmentSlot.FEET);
        Boolean leggings = player.hasItemInSlot(EquipmentSlot.LEGS);
        Boolean breastplate = player.hasItemInSlot(EquipmentSlot.CHEST);
        Boolean helmet = player.hasItemInSlot(EquipmentSlot.HEAD);

        if (boots && leggings && breastplate && helmet)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private int hasCorrectArmorOn(ArmorMaterial material, LivingEntity player) {

        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);


        /*
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());
        */
        if(boots.getItem() == Registration.PLATINUM_INLAID_REDSTONE_BOOTS.get()
            && leggings.getItem() == Registration.PLATINUM_INLAID_REDSTONE_LEGGINGS.get()
            && chestplate.getItem() == Registration.PLATINUM_INLAID_REDSTONE_CHESTPLATE.get()
            && helmet.getItem() == Registration.PLATINUM_INLAID_REDSTONE_HELMET.get())
        {
            return 1;
        } else if(boots.getItem() == Registration.PLATINUM_INLAID_DIAMOND_BOOTS.get()
                && leggings.getItem() == Registration.PLATINUM_INLAID_DIAMOND_LEGGINGS.get()
                && chestplate.getItem() == Registration.PLATINUM_INLAID_DIAMOND_CHESTPLATE.get()
                && helmet.getItem() == Registration.PLATINUM_INLAID_DIAMOND_HELMET.get())
        {
            return 2;
        } else if(boots.getItem() == Registration.PLATINUM_INLAID_EMERALD_BOOTS.get()
                && leggings.getItem() == Registration.PLATINUM_INLAID_EMERALD_LEGGINGS.get()
                && chestplate.getItem() == Registration.PLATINUM_INLAID_EMERALD_CHESTPLATE.get()
                && helmet.getItem() == Registration.PLATINUM_INLAID_EMERALD_HELMET.get())
        {
            return 3;
        } else
        {
            return 0;
        }
    }
}