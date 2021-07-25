package com.VerMod.CoolMod.Items;


import com.VerMod.CoolMod.Block.BlockRegistry;
import com.VerMod.CoolMod.ItemGroups.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "vermod");


    public static RegistryObject<Item> CCCPSymbol = ITEMS.register("cccpsymbol", () -> { return new CCCPSymbol();});
    public static RegistryObject<Item> Vodka=ITEMS.register("vodka",()->{return new Vodka(); });
    public static RegistryObject<Item> ThinOkaWood = ITEMS.register("thin_oka_wood", () -> {
        return new BlockItem(BlockRegistry.thinOkaWoodBlock.get(), new Item.Properties().tab(ModGroup.verItemGroup));
    });
}