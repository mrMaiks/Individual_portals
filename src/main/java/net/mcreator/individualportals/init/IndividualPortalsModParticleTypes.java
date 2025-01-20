
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.individualportals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.individualportals.IndividualPortalsMod;

public class IndividualPortalsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, IndividualPortalsMod.MODID);
	public static final RegistryObject<ParticleType<?>> PORTALPARTICLE = REGISTRY.register("portalparticle", () -> new SimpleParticleType(true));
}
