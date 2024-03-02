package fr.program.tutomod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200), 0.1f)
            .fast()
            .build();

    public static final FoodProperties BIG_APPLE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 0.1f)
            .fast()
            .build();

    public static final FoodProperties CORN = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 0.01f)
            .build();
}
