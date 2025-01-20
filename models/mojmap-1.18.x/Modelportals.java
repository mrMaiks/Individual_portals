// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelportals<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "portals"), "main");
	private final ModelPart group2;
	private final ModelPart group3;

	public Modelportals(ModelPart root) {
		this.group2 = root.getChild("group2");
		this.group3 = root.getChild("group3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group2 = partdefinition.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-24.0F, 0.0F, -1.0F, 48.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-25.0F, 3.0F, -2.0F, 50.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, 5.0F, 0.0F, 48.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition group3 = partdefinition.addOrReplaceChild("group3",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-24.0F, 0.0F, -1.0F, 48.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-25.0F, 3.0F, -2.0F, 50.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.0F, 5.0F, 0.0F, 48.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -27.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}