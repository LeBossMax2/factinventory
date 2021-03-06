package fr.max2.factinventory.capability;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class StackItemHandlerProvider extends ItemStackHandler implements ICapabilitySerializable<CompoundNBT>
{
	
	public StackItemHandlerProvider()
	{
		super();
	}
	
	
	public StackItemHandlerProvider(int size)
	{
		super(size);
	}
	
	public StackItemHandlerProvider(NonNullList<ItemStack> stacks)
	{
		super(stacks);
	}


	@Override
	@Nonnull
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
	{
		return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.orEmpty(cap, LazyOptional.of(() -> this));
	}
	
}
