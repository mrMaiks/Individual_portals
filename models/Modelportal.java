// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelportal extends ModelBase {
	private final ModelRenderer group2;
	private final ModelRenderer group3;

	public Modelportal() {
		textureWidth = 128;
		textureHeight = 128;

		group2 = new ModelRenderer(this);
		group2.setRotationPoint(0.0F, 24.0F, -1.0F);
		setRotationAngle(group2, 3.1416F, 0.0F, 0.0F);
		group2.cubeList.add(new ModelBox(group2, 0, 8, -24.0F, 0.0F, -1.0F, 48, 3, 2, 0.0F, false));
		group2.cubeList.add(new ModelBox(group2, 0, 16, -25.0F, 3.0F, -2.0F, 50, 2, 4, 0.0F, false));
		group2.cubeList.add(new ModelBox(group2, 0, 0, -24.0F, 5.0F, 0.0F, 48, 5, 0, 0.0F, false));

		group3 = new ModelRenderer(this);
		group3.setRotationPoint(0.0F, -27.0F, -1.0F);
		group3.cubeList.add(new ModelBox(group3, 0, 8, -24.0F, 0.0F, -1.0F, 48, 3, 2, 0.0F, false));
		group3.cubeList.add(new ModelBox(group3, 0, 16, -25.0F, 3.0F, -2.0F, 50, 2, 4, 0.0F, false));
		group3.cubeList.add(new ModelBox(group3, 0, 0, -24.0F, 5.0F, 0.0F, 48, 5, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group2.render(f5);
		group3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}