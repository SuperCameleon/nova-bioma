package net.supercameleon.novabioma.item.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class FuelBlockItem extends Item {
    private int burnTime = 0;
    private final Block block;

    public FuelBlockItem(Block pBlock, Item.Properties pProperties, int burnTime) {
        super(pProperties);
        this.block = pBlock;
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}