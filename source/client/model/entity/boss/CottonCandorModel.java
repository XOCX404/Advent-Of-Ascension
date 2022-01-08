package net.tslat.aoa3.client.model.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.tslat.aoa3.object.entity.boss.CottonCandorEntity;

public class CottonCandorModel extends EntityModel<CottonCandorEntity> {
	private final ModelRenderer r1;
	private final ModelRenderer r2;
	private final ModelRenderer r3;
	private final ModelRenderer r4;
	private final ModelRenderer r5;
	private final ModelRenderer r6;
	private final ModelRenderer r7;
	private final ModelRenderer r8;
	private final ModelRenderer r9;
	private final ModelRenderer r10;
	private final ModelRenderer r11;
	private final ModelRenderer r12;
	private final ModelRenderer r13;
	private final ModelRenderer r14;
	private final ModelRenderer r15;
	private final ModelRenderer r16;
	private final ModelRenderer shape1;
	private final ModelRenderer shape2;
	private final ModelRenderer shape3;
	private final ModelRenderer shape4;
	private final ModelRenderer shape5;
	private final ModelRenderer shape6;
	private final ModelRenderer shape7;
	private final ModelRenderer shape8;
	private final ModelRenderer shape9;
	private final ModelRenderer shape10;
	private final ModelRenderer shape11;
	private final ModelRenderer shape12;
	private final ModelRenderer shape13;

	public CottonCandorModel() {
		texWidth = 64;
		texHeight = 64;
		(r1 = new ModelRenderer(this, 0, 14)).addBox(-6.0f, 1.0f, -6.0f, 2, 5, 2);
		r1.setPos(12.0f, 18.0f, 2.0f);
		r1.setTexSize(64, 64);
		r1.mirror = true;
		setRotation(r1, 0.0f, 0.0f, 0.0f);
		(r2 = new ModelRenderer(this, 0, 14)).addBox(4.0f, 1.0f, -6.0f, 2, 5, 2);
		r2.setPos(12.0f, 18.0f, 2.0f);
		r2.setTexSize(64, 64);
		r2.mirror = true;
		setRotation(r2, 0.0f, 0.0f, 0.0f);
		(r3 = new ModelRenderer(this, 0, 14)).addBox(-6.0f, 1.0f, 4.0f, 2, 5, 2);
		r3.setPos(12.0f, 18.0f, 2.0f);
		r3.setTexSize(64, 64);
		r3.mirror = true;
		setRotation(r3, 0.0f, 0.0f, 0.0f);
		(r4 = new ModelRenderer(this, 0, 14)).addBox(4.0f, 1.0f, 4.0f, 2, 5, 2);
		r4.setPos(12.0f, 18.0f, 2.0f);
		r4.setTexSize(64, 64);
		r4.mirror = true;
		setRotation(r4, 0.0f, 0.0f, 0.0f);
		(r5 = new ModelRenderer(this, 0, 0)).addBox(2.0f, -5.0f, 2.0f, 6, 6, 6);
		r5.setPos(12.0f, 18.0f, 2.0f);
		r5.setTexSize(64, 64);
		r5.mirror = true;
		setRotation(r5, 0.0f, 0.0f, 0.0f);
		(r6 = new ModelRenderer(this, 0, 0)).addBox(2.0f, -5.0f, -8.0f, 6, 6, 6);
		r6.setPos(12.0f, 18.0f, 2.0f);
		r6.setTexSize(64, 64);
		r6.mirror = true;
		setRotation(r6, 0.0f, 0.0f, 0.0f);
		(r7 = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -5.0f, 2.0f, 6, 6, 6);
		r7.setPos(12.0f, 18.0f, 2.0f);
		r7.setTexSize(64, 64);
		r7.mirror = true;
		setRotation(r7, 0.0f, 0.0f, 0.0f);
		(r8 = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -5.0f, -8.0f, 6, 6, 6);
		r8.setPos(12.0f, 18.0f, 2.0f);
		r8.setTexSize(64, 64);
		r8.mirror = true;
		setRotation(r8, 0.0f, 0.0f, 0.0f);
		(r9 = new ModelRenderer(this, 0, 14)).addBox(-6.0f, 1.0f, 4.0f, 2, 5, 2);
		r9.setPos(-12.0f, 18.0f, 2.0f);
		r9.setTexSize(64, 64);
		r9.mirror = true;
		setRotation(r9, 0.0f, 0.0f, 0.0f);
		(r10 = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -5.0f, 2.0f, 6, 6, 6);
		r10.setPos(-12.0f, 18.0f, 2.0f);
		r10.setTexSize(64, 64);
		r10.mirror = true;
		setRotation(r10, 0.0f, 0.0f, 0.0f);
		(r11 = new ModelRenderer(this, 0, 14)).addBox(4.0f, 1.0f, 4.0f, 2, 5, 2);
		r11.setPos(-12.0f, 18.0f, 2.0f);
		r11.setTexSize(64, 64);
		r11.mirror = true;
		setRotation(r11, 0.0f, 0.0f, 0.0f);
		(r12 = new ModelRenderer(this, 0, 0)).addBox(2.0f, -5.0f, 2.0f, 6, 6, 6);
		r12.setPos(-12.0f, 18.0f, 2.0f);
		r12.setTexSize(64, 64);
		r12.mirror = true;
		setRotation(r12, 0.0f, 0.0f, 0.0f);
		(r13 = new ModelRenderer(this, 0, 14)).addBox(-6.0f, 1.0f, -6.0f, 2, 5, 2);
		r13.setPos(-12.0f, 18.0f, 2.0f);
		r13.setTexSize(64, 64);
		r13.mirror = true;
		setRotation(r13, 0.0f, 0.0f, 0.0f);
		(r14 = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -5.0f, -8.0f, 6, 6, 6);
		r14.setPos(-12.0f, 18.0f, 2.0f);
		r14.setTexSize(64, 64);
		r14.mirror = true;
		setRotation(r14, 0.0f, 0.0f, 0.0f);
		(r15 = new ModelRenderer(this, 0, 14)).addBox(4.0f, 1.0f, -6.0f, 2, 5, 2);
		r15.setPos(-12.0f, 18.0f, 2.0f);
		r15.setTexSize(64, 64);
		r15.mirror = true;
		setRotation(r15, 0.0f, 0.0f, 0.0f);
		(r16 = new ModelRenderer(this, 0, 0)).addBox(2.0f, -5.0f, -8.0f, 6, 6, 6);
		r16.setPos(-12.0f, 18.0f, 2.0f);
		r16.setTexSize(64, 64);
		r16.mirror = true;
		setRotation(r16, 0.0f, 0.0f, 0.0f);
		(shape1 = new ModelRenderer(this, 50, 16)).addBox(5.0f, 2.0f, -2.0f, 2, 2, 2);
		shape1.setPos(-6.0f, -3.0f, -6.0f);
		shape1.setTexSize(64, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 10, 39)).addBox(2.0f, -16.0f, 3.0f, 10, 12, 12);
		shape2.setPos(6.0f, 2.0f, -7.0f);
		shape2.setTexSize(64, 64);
		shape2.mirror = true;
		setRotation(shape2, 0.0f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 10, 39)).addBox(2.0f, -16.0f, 3.0f, 10, 12, 12);
		shape3.setPos(-20.0f, 2.0f, -7.0f);
		shape3.setTexSize(64, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.0f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 10, 6)).addBox(0.0f, -4.0f, 0.0f, 12, 10, 15);
		shape4.setPos(-6.0f, -3.0f, -6.0f);
		shape4.setTexSize(64, 64);
		shape4.mirror = true;
		setRotation(shape4, 0.0f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 20, 0)).addBox(0.0f, -4.0f, -2.0f, 12, 2, 2);
		shape5.setPos(-6.0f, -3.0f, -6.0f);
		shape5.setTexSize(64, 64);
		shape5.mirror = true;
		setRotation(shape5, 0.0f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 20, 0)).addBox(0.0f, 0.0f, -2.0f, 12, 2, 2);
		shape6.setPos(-6.0f, -3.0f, -6.0f);
		shape6.setTexSize(64, 64);
		shape6.mirror = true;
		setRotation(shape6, 0.0f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 50, 0)).addBox(0.0f, -2.0f, -2.0f, 3, 2, 2);
		shape7.setPos(-6.0f, -3.0f, -6.0f);
		shape7.setTexSize(64, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 50, 0)).addBox(9.0f, -2.0f, -2.0f, 3, 2, 2);
		shape8.setPos(-6.0f, -3.0f, -6.0f);
		shape8.setTexSize(64, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 50, 6)).addBox(5.0f, -2.0f, -2.0f, 2, 2, 2);
		shape9.setPos(-6.0f, -3.0f, -6.0f);
		shape9.setTexSize(64, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.0f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 50, 10)).addBox(1.0f, 2.0f, -2.0f, 3, 3, 2);
		shape10.setPos(-6.0f, -3.0f, -6.0f);
		shape10.setTexSize(64, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.0f, 0.0f, 0.0f);
		(shape11 = new ModelRenderer(this, 50, 10)).addBox(8.0f, 2.0f, -2.0f, 3, 3, 2);
		shape11.setPos(-6.0f, -3.0f, -6.0f);
		shape11.setTexSize(64, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.0f, 0.0f, 0.0f);
		(shape12 = new ModelRenderer(this, 0, 32)).addBox(0.0f, -4.0f, 0.0f, 14, 13, 18);
		shape12.setPos(6.0f, 2.0f, -7.0f);
		shape12.setTexSize(64, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.0f, 0.0f, 0.0f);
		(shape13 = new ModelRenderer(this, 0, 32)).addBox(0.0f, -4.0f, 0.0f, 14, 13, 18);
		shape13.setPos(-20.0f, 2.0f, -7.0f);
		shape13.setTexSize(64, 64);
		shape13.mirror = true;
		setRotation(shape13, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void renderToBuffer(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		r1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}

	@Override
	public void setupAnim(CottonCandorEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		r1.yRot = ageInTicks * 0.267f * 1.25f;
		r2.yRot = ageInTicks * 0.267f * 1.25f;
		r3.yRot = ageInTicks * 0.267f * 1.25f;
		r4.yRot = ageInTicks * 0.267f * 1.25f;
		r5.yRot = ageInTicks * 0.267f * 1.25f;
		r6.yRot = ageInTicks * 0.267f * 1.25f;
		r7.yRot = ageInTicks * 0.267f * 1.25f;
		r8.yRot = ageInTicks * 0.267f * 1.25f;
		r9.yRot = ageInTicks * 0.267f * 1.25f;
		r10.yRot = ageInTicks * 0.267f * 1.25f;
		r11.yRot = ageInTicks * 0.267f * 1.25f;
		r12.yRot = ageInTicks * 0.267f * 1.25f;
		r13.yRot = ageInTicks * 0.267f * 1.25f;
		r14.yRot = ageInTicks * 0.267f * 1.25f;
		r15.yRot = ageInTicks * 0.267f * 1.25f;
		r16.yRot = ageInTicks * 0.267f * 1.25f;
	}
}