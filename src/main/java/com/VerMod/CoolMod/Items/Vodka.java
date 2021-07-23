package com.VerMod.CoolMod.Items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Vodka extends Item {
    private static Food food = (new Food.Builder())
            .saturationMod(16)
            .nutrition(2)
            .effect(()->{return new EffectInstance(Effects.POISON, 2 * 20, 1);}, 0.2f)
            .alwaysEat()
            .build();
    public Vodka() {  super(new Properties().food(food).tab(ItemGroup.TAB_FOOD));    }

}
