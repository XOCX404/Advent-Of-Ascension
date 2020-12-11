package net.tslat.aoa3.client.model.entity.mob.shyrelands;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class StimuloModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer head2;

	public StimuloModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(1.0F, -2.0F, -3.0F, 3, 3, 6);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0F, 0.0F, 0.0F);
		body = new ModelRenderer(this, 21, 33);
		body.addBox(-3.0F, 0.0F, -2.0F, 6, 2, 4);
		body.setRotationPoint(0.0F, 14.0F, 0.0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0F, 0.0F, 0.0F);
		rightLeg2 = new ModelRenderer(this, 0, 27);
		rightLeg2.addBox(-2.0F, 6.0F, -4.0F, 4, 2, 6);
		rightLeg2.setRotationPoint(-3.0F, 16.0F, 0.0F);
		rightLeg2.setTextureSize(64, 32);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0.0F, 0.0F, 0.0F);
		leftLeg2 = new ModelRenderer(this, 0, 27);
		leftLeg2.addBox(-2.0F, 6.0F, -4.0F, 4, 2, 6);
		leftLeg2.setRotationPoint(3.0F, 16.0F, 0.0F);
		leftLeg2.setTextureSize(64, 32);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0.0F, 0.0F, 0.0F);
		rightLeg = new ModelRenderer(this, 0, 16);
		rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
		rightLeg.setRotationPoint(-3.0F, 16.0F, 0.0F);
		rightLeg.setTextureSize(64, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0F, 0.0F, 0.0F);
		leftLeg = new ModelRenderer(this, 0, 16);
		leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
		leftLeg.setRotationPoint(3.0F, 16.0F, 0.0F);
		leftLeg.setTextureSize(64, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0F, 0.0F, 0.0F);
		body2 = new ModelRenderer(this, 38, 16);
		body2.addBox(-2.0F, 0.0F, 0.0F, 4, 9, 1);
		body2.setRotationPoint(0.0F, 7.0F, 2.0F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0F, 0.0F, 0.1745329F);
		body3 = new ModelRenderer(this, 26, 6);
		body3.addBox(-6.0F, 4.0F, -2.5F, 12, 4, 5);
		body3.setRotationPoint(0.0F, -4.0F, 0.0F);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0.0F, 0.0F, 0.0F);
		body4 = new ModelRenderer(this, 38, 16);
		body4.addBox(-2.0F, 0.0F, -3.0F, 4, 9, 1);
		body4.setRotationPoint(0.0F, 7.0F, 0.0F);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0.0F, 0.0F, -0.1745329F);
		body5 = new ModelRenderer(this, 21, 16);
		body5.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		body5.setRotationPoint(0.0F, -4.0F, 0.0F);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 0.0F, 0.0F, 0.0F);
		head2 = new ModelRenderer(this, 0, 0);
		head2.addBox(-4.0F, -2.0F, -3.0F, 3, 3, 6);
		head2.setRotationPoint(0.0F, -4.0F, 0.0F);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		rightLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		rightLeg.rotateAngleY = 0.0F;

		rightLeg2.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		rightLeg2.rotateAngleY = 0.0F;

		leftLeg.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount);
		leftLeg2.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount);
	}
}
