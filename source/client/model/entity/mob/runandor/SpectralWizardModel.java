package net.tslat.aoa3.client.model.entity.mob.runandor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class SpectralWizardModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer rightArm2;
	private final ModelRenderer rightArm3;
	private final ModelRenderer rightArm4;
	private final ModelRenderer rightArm5;
	private final ModelRenderer rightArm6;
	private final ModelRenderer rightArm7;
	private final ModelRenderer rightArm8;
	private final ModelRenderer rightArm9;
	private final ModelRenderer rightArm10;
	private final ModelRenderer rightArm11;

	public SpectralWizardModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 33, 0)).addBox(6.0f, -6.0f, -2.0f, 4, 4, 4);
		head.setRotationPoint(0.0f, -3.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 38)).addBox(0.5f, 8.5f, -14.0f, 1, 1, 6);
		rightArm.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm.setTextureSize(64, 64);
		rightArm.mirror = true;
		setRotation(rightArm, -0.4363323f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm.setRotationPoint(8.0f, 3.0f, 0.0f);
		leftArm.setTextureSize(64, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		rightLeg.setRotationPoint(-4.0f, 15.0f, 0.0f);
		rightLeg.setTextureSize(64, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		leftLeg.setRotationPoint(4.0f, 15.0f, 0.0f);
		leftLeg.setTextureSize(64, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, -3.0f, 0.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 33, 0)).addBox(-10.0f, -6.0f, -2.0f, 4, 4, 4);
		head3.setRotationPoint(0.0f, -3.0f, 0.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 33, 0)).addBox(-2.0f, -14.0f, -2.0f, 4, 4, 4);
		head4.setRotationPoint(0.0f, -3.0f, 0.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm2.setRotationPoint(-8.0f, 3.0f, 0.0f);
		rightArm2.setTextureSize(64, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 31, 46)).addBox(-2.0f, 7.0f, -7.0f, 2, 2, 14);
		rightArm3.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm3.setTextureSize(64, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, -0.4363323f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 27, 38)).addBox(-2.5f, 6.5f, -10.0f, 3, 3, 3);
		rightArm4.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm4.setTextureSize(64, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, -0.4363323f, 0.0f, 0.0f);
		(rightArm5 = new ModelRenderer(this, 40, 38)).addBox(-0.5f, 9.5f, -14.0f, 1, 1, 6);
		rightArm5.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm5.setTextureSize(64, 64);
		rightArm5.mirror = true;
		setRotation(rightArm5, -0.4363323f, 0.0f, 0.0f);
		(rightArm6 = new ModelRenderer(this, 40, 38)).addBox(-3.5f, 8.5f, -14.0f, 1, 1, 6);
		rightArm6.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm6.setTextureSize(64, 64);
		rightArm6.mirror = true;
		setRotation(rightArm6, -0.4363323f, 0.0f, 0.0f);
		(rightArm7 = new ModelRenderer(this, 40, 38)).addBox(-3.5f, 6.5f, -14.0f, 1, 1, 6);
		rightArm7.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm7.setTextureSize(64, 64);
		rightArm7.mirror = true;
		setRotation(rightArm7, -0.4363323f, 0.0f, 0.0f);
		(rightArm8 = new ModelRenderer(this, 40, 38)).addBox(0.5f, 6.5f, -14.0f, 1, 1, 6);
		rightArm8.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm8.setTextureSize(64, 64);
		rightArm8.mirror = true;
		setRotation(rightArm8, -0.4363323f, 0.0f, 0.0f);
		(rightArm9 = new ModelRenderer(this, 40, 38)).addBox(-2.5f, 9.5f, -14.0f, 1, 1, 6);
		rightArm9.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm9.setTextureSize(64, 64);
		rightArm9.mirror = true;
		setRotation(rightArm9, -0.4363323f, 0.0f, 0.0f);
		(rightArm10 = new ModelRenderer(this, 40, 38)).addBox(-0.5f, 5.5f, -14.0f, 1, 1, 6);
		rightArm10.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm10.setTextureSize(64, 64);
		rightArm10.mirror = true;
		setRotation(rightArm10, -0.4363323f, 0.0f, 0.0f);
		(rightArm11 = new ModelRenderer(this, 40, 38)).addBox(-2.5f, 5.5f, -14.0f, 1, 1, 6);
		rightArm11.setRotationPoint(-8.0f, 1.0f, 0.0f);
		rightArm11.setTextureSize(64, 64);
		rightArm11.mirror = true;
		setRotation(rightArm11, -0.4363323f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head2.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm5.rotateAngleZ = 0.0f;
		rightArm6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm6.rotateAngleZ = 0.0f;
		rightArm7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm7.rotateAngleZ = 0.0f;
		rightArm8.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm8.rotateAngleZ = 0.0f;
		rightArm9.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm9.rotateAngleZ = 0.0f;
		rightArm10.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm10.rotateAngleZ = 0.0f;
		rightArm11.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f - 0.436f;
		rightArm11.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
