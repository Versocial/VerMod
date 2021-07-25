package com.VerMod.CoolMod.Block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "vermod");
    public static RegistryObject<Block> thinOkaWoodBlock = BLOCKS.register("thin_oka_wood", () -> {
        return new ThinOkaWood();
    });
}
