package com.VerMod.CoolMod.ItemGroups;

import com.VerMod.CoolMod.Items.ItemRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.sql.DatabaseMetaData;

public abstract class ModGroup {
    private static int base=12;
    @OnlyIn(Dist.CLIENT)
    public static ItemGroup verItemGroup = (new ItemGroup(base+0, "vercoolthings") {
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.CCCPSymbol.get());
        }
    }).setRecipeFolderName("ver_cool_things");

}
