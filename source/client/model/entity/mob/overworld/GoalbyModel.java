package net.tslat.aoa3.client.model.entity.mob.overworld;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class GoalbyModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg3p2;
	private final ModelRenderer leg4p2;
	private final ModelRenderer leg1p2;
	private final ModelRenderer leg2p2;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer head8;
	private final ModelRenderer head9;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer body8;

	public GoalbyModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 23)).addBox(2.5f, 8.0f, -4.5f, 2, 2, 2);
		head.setRotationPoint(0.0f, 5.0f, -9.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 0, 28)).addBox(-7.0f, -10.0f, -7.0f, 8, 9, 4);
		body.setRotationPoint(3.0f, 14.0f, -3.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 6.0f, -1.0f, 2, 6, 2);
		leg1.setRotationPoint(-7.0f, 12.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 16, 16)).addBox(0.0f, 6.0f, -1.0f, 2, 6, 2);
		leg2.setRotationPoint(7.0f, 12.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 6.0f, -2.0f, 2, 6, 2);
		leg3.setRotationPoint(-7.0f, 12.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 16, 16)).addBox(0.0f, 6.0f, -2.0f, 2, 6, 2);
		leg4.setRotationPoint(7.0f, 12.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 13)).addBox(-3.0f, 0.0f, -3.0f, 4, 6, 4);
		leg3p2.setRotationPoint(-7.0f, 12.0f, -5.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 13)).addBox(-1.0f, 0.0f, -3.0f, 4, 6, 4);
		leg4p2.setRotationPoint(7.0f, 12.0f, -5.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 13)).addBox(-3.0f, 0.0f, -2.0f, 4, 6, 4);
		leg1p2.setRotationPoint(-7.0f, 12.0f, 7.0f);
		leg1p2.setTextureSize(64, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 13)).addBox(-1.0f, 0.0f, -2.0f, 4, 6, 4);
		leg2p2.setRotationPoint(7.0f, 12.0f, 7.0f);
		leg2p2.setTextureSize(64, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 24, 8)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 8);
		body2.setRotationPoint(0.0f, 9.0f, 2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 3, 42)).addBox(3.0f, -10.0f, -7.0f, 1, 12, 8);
		body3.setRotationPoint(1.0f, 3.0f, 2.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 2.268928f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 3, 42)).addBox(-6.0f, -10.0f, -7.0f, 1, 12, 8);
		body4.setRotationPoint(1.0f, 3.0f, 2.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 2.268928f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 39, 0)).addBox(3.0f, -7.0f, -6.0f, 2, 2, 4);
		head2.setRotationPoint(0.0f, 5.0f, -9.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 23)).addBox(-4.5f, 8.0f, -4.5f, 2, 2, 2);
		head3.setRotationPoint(0.0f, 5.0f, -9.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 58, 0)).addBox(3.0f, -1.0f, -4.0f, 1, 9, 1);
		head4.setRotationPoint(0.0f, 5.0f, -9.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 58, 0)).addBox(-4.0f, -1.0f, -4.0f, 1, 9, 1);
		head5.setRotationPoint(0.0f, 5.0f, -9.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -4.0f, -6.0f, 6, 5, 8);
		head6.setRotationPoint(0.0f, 5.0f, -9.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 39, 0)).addBox(-5.0f, -7.0f, -6.0f, 2, 2, 4);
		head7.setRotationPoint(0.0f, 5.0f, -9.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 29, 0)).addBox(3.0f, -7.0f, -2.0f, 2, 5, 2);
		head8.setRotationPoint(0.0f, 5.0f, -9.0f);
		head8.setTextureSize(64, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 29, 0)).addBox(-5.0f, -7.0f, -2.0f, 2, 5, 2);
		head9.setRotationPoint(0.0f, 5.0f, -9.0f);
		head9.setTextureSize(64, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 25, 22)).addBox(6.5f, -6.0f, 2.0f, 0, 22, 19);
		body5.setRotationPoint(11.0f, -2.0f, -1.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, -1.867502f, 3.141593f, 0.0f);
		(body6 = new ModelRenderer(this, 25, 22)).addBox(-5.5f, -6.0f, -2.0f, 0, 22, 19);
		body6.setRotationPoint(1.0f, -2.0f, -1.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 1.867502f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 25, 22)).addBox(6.5f, -6.0f, 2.0f, 0, 22, 19);
		body7.setRotationPoint(2.0f, -2.0f, -1.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, -1.867502f, 3.141593f, 0.0f);
		(body8 = new ModelRenderer(this, 25, 22)).addBox(-5.5f, -6.0f, -2.0f, 0, 22, 19);
		body8.setRotationPoint(10.0f, -2.0f, -1.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 1.867502f, 0.0f, 0.0f);
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / 79.57747f;
		head.rotateAngleX = headPitch / 76.39437f;
		head2.rotateAngleY = netHeadYaw / 79.57747f;
		head2.rotateAngleX = headPitch / 76.39437f;
		head3.rotateAngleY = netHeadYaw / 79.57747f;
		head3.rotateAngleX = headPitch / 76.39437f;
		head4.rotateAngleY = netHeadYaw / 79.57747f;
		head4.rotateAngleX = headPitch / 76.39437f;
		head5.rotateAngleY = netHeadYaw / 79.57747f;
		head5.rotateAngleX = headPitch / 76.39437f;
		head6.rotateAngleY = netHeadYaw / 79.57747f;
		head6.rotateAngleX = headPitch / 76.39437f;
		head7.rotateAngleY = netHeadYaw / 79.57747f;
		head7.rotateAngleX = headPitch / 76.39437f;
		head8.rotateAngleY = netHeadYaw / 79.57747f;
		head8.rotateAngleX = headPitch / 76.39437f;
		head9.rotateAngleY = netHeadYaw / 79.57747f;
		head9.rotateAngleX = headPitch / 76.39437f;
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg2p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg3p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
