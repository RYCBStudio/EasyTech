package com.rycb.etech.blocks.tileentity;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.rycb.etech.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Map;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/11 16:54</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.blocks.tileentity/BlastFurnaceRecipes.java</p>
 * <h1><center>BlastFurnaceRecipes</center></h1>
 */
public class BlastFurnaceRecipes {
    
    private static final BlastFurnaceRecipes INSTANCE = new BlastFurnaceRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
    
    private BlastFurnaceRecipes() {
        addFurnaceRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COAL), new ItemStack(ModItems.STEEL_INGOT), 4.5f);
    }
    
    public static BlastFurnaceRecipes getInstance() {
        return INSTANCE;
    }
    
    public void addFurnaceRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) {
        if (getSinteringResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }
    
    public ItemStack getSinteringResult(ItemStack input1, ItemStack input2) {
        return getItemStack(input1, input2);
    }
    
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }
    
    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() {
        return this.smeltingList;
    }
    
    public float getGeneratorExperience(ItemStack stack) {
        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet()) {
            if (this.compareItemStacks(stack, (ItemStack) entry.getKey())) {
                return ((Float) entry.getValue()).floatValue();
            }
        }
        return 0.2F;
    }
    
    public ItemStack getSinterResult(ItemStack stack1, ItemStack stack) {
        return getItemStack(stack1, stack);
    }
    
    private ItemStack getItemStack(ItemStack stack1, ItemStack stack) {
        for (Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) {
            if (this.compareItemStacks(stack1, (ItemStack) entry.getKey())) {
                for (Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) {
                    if (this.compareItemStacks(stack, (ItemStack) ent.getKey())) {
                        return (ItemStack) ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }
}
