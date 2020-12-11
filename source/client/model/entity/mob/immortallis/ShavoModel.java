package net.tslat.aoa3.client.model.entity.mob.immortallis;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class ShavoModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer leg2p2;
	private final ModelRenderer leg1p2;
	private final ModelRenderer leg4p2;
	private final ModelRenderer leg3p2;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer head8;

	public ShavoModel() {
		super(RenderType::getEntityTranslucent);
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 52, 0)).addBox(4.0f, -7.0f, -2.0f, 2, 6, 2);
		head.setRotationPoint(0.0f, 2.0f, -8.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 20, 11)).addBox(-6.0f, -10.0f, 0.0f, 12, 17, 4);
		body.setRotationPoint(0.0f, 5.0f, 2.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 53, 16)).addBox(-2.0f, 0.0f, -1.0f, 2, 7, 2);
		leg1.setRotationPoint(-3.0f, 5.0f, 7.0f);
		leg1.setTextureSize(64, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 53, 16)).addBox(0.0f, 0.0f, -1.0f, 2, 7, 2);
		leg2.setRotationPoint(3.0f, 5.0f, 7.0f);
		leg2.setTextureSize(64, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 53, 16)).addBox(-2.0f, 0.0f, -2.0f, 2, 7, 2);
		leg3.setRotationPoint(-3.0f, 5.0f, -5.0f);
		leg3.setTextureSize(64, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 53, 16)).addBox(0.0f, 0.0f, -2.0f, 2, 7, 2);
		leg4.setRotationPoint(3.0f, 5.0f, -5.0f);
		leg4.setTextureSize(64, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 43, 1)).addBox(-1.0f, -7.0f, -2.0f, 2, 2, 2);
		head2.setRotationPoint(0.0f, 2.0f, -8.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 52, 0)).addBox(-6.0f, -7.0f, -2.0f, 2, 6, 2);
		head3.setRotationPoint(0.0f, 2.0f, -8.0f);
		head3.setTextureSize(64, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 7.0f, -2.0f, 4, 12, 4);
		leg2p2.setRotationPoint(3.0f, 5.0f, 7.0f);
		leg2p2.setTextureSize(64, 32);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 7.0f, -2.0f, 4, 12, 4);
		leg1p2.setRotationPoint(-3.0f, 5.0f, 7.0f);
		leg1p2.setTextureSize(64, 32);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 7.0f, -3.0f, 4, 12, 4);
		leg4p2.setRotationPoint(3.0f, 5.0f, -5.0f);
		leg4p2.setTextureSize(64, 32);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 7.0f, -3.0f, 4, 12, 4);
		leg3p2.setRotationPoint(-3.0f, 5.0f, -5.0f);
		leg3p2.setTextureSize(64, 32);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -2.0f, 8, 11, 2);
		head4.setRotationPoint(0.0f, 2.0f, -8.0f);
		head4.setTextureSize(64, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 21, 0)).addBox(-2.0f, -5.0f, -2.0f, 4, 1, 2);
		head5.setRotationPoint(0.0f, 2.0f, -8.0f);
		head5.setTextureSize(64, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 44, 6)).addBox(2.0f, -10.0f, -2.0f, 1, 2, 2);
		head6.setRotationPoint(0.0f, 2.0f, -8.0f);
		head6.setTextureSize(64, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 21, 4)).addBox(-3.0f, -8.0f, -2.0f, 6, 1, 2);
		head7.setRotationPoint(0.0f, 2.0f, -8.0f);
		head7.setTextureSize(64, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 44, 6)).addBox(-3.0f, -10.0f, -2.0f, 1, 2, 2);
		head8.setRotationPoint(0.0f, 2.0f, -8.0f);
		head8.setTextureSize(64, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p2.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p2.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg2p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
