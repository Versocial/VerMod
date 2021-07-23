package com.VerMod.CoolMod.Items;


import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "vermod");


    public static RegistryObject<Item> CCCPSymbol = ITEMS.register("cccpsymbol", () -> { return new CCCPSymbol();});
    public static RegistryObject<Item> Vodka=ITEMS.register("vodka",()->{return new Vodka(); });
}