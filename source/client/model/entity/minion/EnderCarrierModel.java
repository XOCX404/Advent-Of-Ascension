package net.tslat.aoa3.client.model.entity.minion;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class EnderCarrierModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer body8;
	private final ModelRenderer body9;
	private final ModelRenderer body10;
	private final ModelRenderer body11;
	private final ModelRenderer body12;
	private final ModelRenderer body13;
	private final ModelRenderer body14;
	private final ModelRenderer body15;
	private final ModelRenderer body16;
	private final ModelRenderer body17;
	private final ModelRenderer body18;
	private final ModelRenderer body19;
	private final ModelRenderer body20;
	private final ModelRenderer body21;
	private final ModelRenderer body22;
	private final ModelRenderer body23;
	private final ModelRenderer body24;
	private final ModelRenderer body25;
	private final ModelRenderer body26;

	public EnderCarrierModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 14)).addBox(5.0f, -7.0f, -7.0f, 2, 5, 2);
		head.setRotationPoint(0.0f, 6.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, -0.8726646f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 21, 33)).addBox(5.0f, -10.0f, 0.0f, 1, 1, 1);
		body.setRotationPoint(0.0f, 11.0f, 5.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 33)).addBox(-4.0f, 0.0f, -2.0f, 5, 12, 5);
		leg1.setRotationPoint(-3.0f, 12.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 33)).addBox(-1.0f, 0.0f, -2.0f, 5, 12, 5);
		leg2.setRotationPoint(3.0f, 12.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 33)).addBox(-4.0f, 0.0f, -3.0f, 5, 12, 5);
		leg3.setRotationPoint(-3.0f, 12.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 33)).addBox(-1.0f, 0.0f, -3.0f, 5, 12, 5);
		leg4.setRotationPoint(3.0f, 12.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6);
		head2.setRotationPoint(0.0f, 6.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 14)).addBox(-7.0f, -7.0f, -7.0f, 2, 5, 2);
		head3.setRotationPoint(0.0f, 6.0f, -8.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, -0.8726646f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 14)).addBox(4.0f, -4.0f, -5.0f, 4, 5, 4);
		head4.setRotationPoint(0.0f, 6.0f, -8.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 0, 14)).addBox(-8.0f, -4.0f, -5.0f, 4, 5, 4);
		head5.setRotationPoint(0.0f, 6.0f, -8.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 0, 14)).addBox(4.5f, -6.0f, -5.5f, 3, 5, 3);
		head6.setRotationPoint(0.0f, 6.0f, -8.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, -0.3490659f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 14)).addBox(-7.5f, -6.0f, -5.5f, 3, 5, 3);
		head7.setRotationPoint(0.0f, 6.0f, -8.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, -0.3490659f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 18, 4)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		body8.setRotationPoint(0.0f, 5.0f, 2.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 1.570796f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 21, 33)).addBox(-6.0f, -10.0f, -7.0f, 10, 4, 10);
		body9.setRotationPoint(1.0f, 8.0f, 4.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 21, 33)).addBox(5.0f, -10.0f, -7.0f, 1, 1, 1);
		body10.setRotationPoint(0.0f, 11.0f, 5.0f);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 21, 48)).addBox(-6.0f, -14.0f, 0.0f, 12, 1, 1);
		body11.setRotationPoint(0.0f, 11.0f, 5.0f);
		body11.setTextureSize(64, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 21, 48)).addBox(-6.0f, -14.0f, -7.0f, 12, 1, 1);
		body12.setRotationPoint(0.0f, 11.0f, 5.0f);
		body12.setTextureSize(64, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 21, 33)).addBox(-6.0f, -10.0f, -7.0f, 1, 1, 1);
		body13.setRotationPoint(0.0f, 11.0f, 5.0f);
		body13.setTextureSize(64, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 21, 33)).addBox(-6.0f, -10.0f, 0.0f, 1, 1, 1);
		body14.setRotationPoint(0.0f, 11.0f, 5.0f);
		body14.setTextureSize(64, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 21, 33)).addBox(-8.0f, -6.0f, -7.5f, 2, 2, 2);
		body15.setRotationPoint(0.0f, 11.0f, 5.0f);
		body15.setTextureSize(64, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 21, 33)).addBox(-8.0f, -6.0f, -0.5f, 2, 2, 2);
		body16.setRotationPoint(0.0f, 11.0f, 5.0f);
		body16.setTextureSize(64, 64);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 21, 33)).addBox(6.0f, -6.0f, -7.5f, 2, 2, 2);
		body17.setRotationPoint(0.0f, 11.0f, 5.0f);
		body17.setTextureSize(64, 64);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 21, 33)).addBox(6.0f, -6.0f, -0.5f, 2, 2, 2);
		body18.setRotationPoint(0.0f, 11.0f, 5.0f);
		body18.setTextureSize(64, 64);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, 0.0f);
		(body19 = new ModelRenderer(this, 21, 33)).addBox(5.0f, -13.0f, -7.0f, 1, 3, 1);
		body19.setRotationPoint(0.0f, 11.0f, 5.0f);
		body19.setTextureSize(64, 64);
		body19.mirror = true;
		setRotation(body19, 0.0f, 0.0f, 0.0f);
		(body20 = new ModelRenderer(this, 21, 33)).addBox(5.0f, -13.0f, 0.0f, 1, 3, 1);
		body20.setRotationPoint(0.0f, 11.0f, 5.0f);
		body20.setTextureSize(64, 64);
		body20.mirror = true;
		setRotation(body20, 0.0f, 0.0f, 0.0f);
		(body21 = new ModelRenderer(this, 21, 33)).addBox(-6.0f, -13.0f, -7.0f, 1, 3, 1);
		body21.setRotationPoint(0.0f, 11.0f, 5.0f);
		body21.setTextureSize(64, 64);
		body21.mirror = true;
		setRotation(body21, 0.0f, 0.0f, 0.0f);
		(body22 = new ModelRenderer(this, 21, 33)).addBox(-6.0f, -13.0f, 0.0f, 1, 3, 1);
		body22.setRotationPoint(0.0f, 11.0f, 5.0f);
		body22.setTextureSize(64, 64);
		body22.mirror = true;
		setRotation(body22, 0.0f, 0.0f, 0.0f);
		(body23 = new ModelRenderer(this, 21, 33)).addBox(6.0f, -10.0f, 0.0f, 1, 5, 1);
		body23.setRotationPoint(0.0f, 11.0f, 5.0f);
		body23.setTextureSize(64, 64);
		body23.mirror = true;
		setRotation(body23, 0.0f, 0.0f, 0.0f);
		(body24 = new ModelRenderer(this, 21, 33)).addBox(6.0f, -10.0f, -7.0f, 1, 5, 1);
		body24.setRotationPoint(0.0f, 11.0f, 5.0f);
		body24.setTextureSize(64, 64);
		body24.mirror = true;
		setRotation(body24, 0.0f, 0.0f, 0.0f);
		(body25 = new ModelRenderer(this, 21, 33)).addBox(-7.0f, -10.0f, 0.0f, 1, 5, 1);
		body25.setRotationPoint(0.0f, 11.0f, 5.0f);
		body25.setTextureSize(64, 64);
		body25.mirror = true;
		setRotation(body25, 0.0f, 0.0f, 0.0f);
		(body26 = new ModelRenderer(this, 21, 33)).addBox(-7.0f, -10.0f, -7.0f, 1, 5, 1);
		body26.setRotationPoint(0.0f, 11.0f, 5.0f);
		body26.setTextureSize(64, 64);
		body26.mirror = true;
		setRotation(body26, 0.0f, 0.0f, 0.0f);
	}

	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body23.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body24.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body25.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body26.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
