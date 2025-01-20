
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.individualportals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.individualportals.item.Magicsticklvl3Item;
import net.mcreator.individualportals.item.Magicsticklvl2Item;
import net.mcreator.individualportals.item.Magicsticklvl1Item;
import net.mcreator.individualportals.IndividualPortalsMod;

public class IndividualPortalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IndividualPortalsMod.MODID);
	public static final RegistryObject<Item> MAGICSTICKLVL_3 = REGISTRY.register("magicsticklvl_3", () -> new Magicsticklvl3Item());
	public static final RegistryObject<Item> MAGICSTICKLVL_2 = REGISTRY.register("magicsticklvl_2", () -> new Magicsticklvl2Item());
	public static final RegistryObject<Item> MAGICSTICKLVL_1 = REGISTRY.register("magicsticklvl_1", () -> new Magicsticklvl1Item());
}
