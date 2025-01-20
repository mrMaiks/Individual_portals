
package net.mcreator.individualportals.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.individualportals.entity.PortalEntity;
import net.mcreator.individualportals.client.model.Modelportals;

public class PortalRenderer extends MobRenderer<PortalEntity, Modelportals<PortalEntity>> {
	public PortalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelportals(context.bakeLayer(Modelportals.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<PortalEntity, Modelportals<PortalEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("individual_portals:textures/entities/glowportal.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PortalEntity entity) {
		return new ResourceLocation("individual_portals:textures/entities/portalll.png");
	}
}
