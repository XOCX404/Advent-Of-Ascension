package net.tslat.aoa3.client.model.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;

public class VisualentModel extends EntityModel<MobEntity> {
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
	private final ModelRenderer shape14;
	private final ModelRenderer shape15;
	private final ModelRenderer shape16;
	private final ModelRenderer shape17;
	private final ModelRenderer shape18;
	private final ModelRenderer shape19;
	private final ModelRenderer shape20;
	private final ModelRenderer shape21;
	private final ModelRenderer shape22;
	private final ModelRenderer shape23;
	private final ModelRenderer shape24;
	private final ModelRenderer shape25;
	private final ModelRenderer shape26;
	private final ModelRenderer shape27;
	private final ModelRenderer shape28;
	private final ModelRenderer shape29;
	private final ModelRenderer shape30;
	private final ModelRenderer shape32;
	private final ModelRenderer shape31;
	private final ModelRenderer shape33;
	private final ModelRenderer shape34;
	private final ModelRenderer shape35;
	private final ModelRenderer shape36;
	private final ModelRenderer shape37;
	private final ModelRenderer shape38;
	private final ModelRenderer shape39;
	private final ModelRenderer shape40;
	private final ModelRenderer shape41;
	private final ModelRenderer shape42;
	private final ModelRenderer shape43;
	private final ModelRenderer shape44;
	private final ModelRenderer shape45;
	private final ModelRenderer shape46;
	private final ModelRenderer shape47;
	private final ModelRenderer shape48;
	private final ModelRenderer shape49;
	private final ModelRenderer shape50;
	private final ModelRenderer shape51;
	private final ModelRenderer shape52;
	private final ModelRenderer shape53;
	private final ModelRenderer shape54;

	public VisualentModel() {
		textureWidth = 128;
		textureHeight = 32;
		(shape1 = new ModelRenderer(this, 0, 15)).addBox(3.0f, 3.0f, -12.0f, 4, 4, 4);
		shape1.setRotationPoint(-13.0f, 0.0f, 8.0f);
		shape1.setTextureSize(128, 32);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 4);
		shape2.setRotationPoint(-13.0f, 0.0f, 3.0f);
		shape2.setTextureSize(128, 32);
		shape2.mirror = true;
		setRotation(shape2, 0.0f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 0.0f, -4.0f, 10, 2, 4);
		shape3.setRotationPoint(-13.0f, 0.0f, 3.0f);
		shape3.setTextureSize(128, 32);
		shape3.mirror = true;
		setRotation(shape3, 0.0f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 70, 18)).addBox(-4.0f, -1.0f, -14.0f, 16, 2, 12);
		shape4.setRotationPoint(-4.0f, 21.0f, 7.0f);
		shape4.setTextureSize(128, 32);
		shape4.mirror = true;
		setRotation(shape4, 0.0f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 2.0f, -4.0f, 2, 6, 4);
		shape5.setRotationPoint(-13.0f, 0.0f, 3.0f);
		shape5.setTextureSize(128, 32);
		shape5.mirror = true;
		setRotation(shape5, 0.0f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 29, 2)).addBox(8.0f, 2.0f, -4.0f, 2, 6, 4);
		shape6.setRotationPoint(-13.0f, 0.0f, 3.0f);
		shape6.setTextureSize(128, 32);
		shape6.mirror = true;
		setRotation(shape6, 0.0f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 34, 10)).addBox(4.0f, 4.0f, -8.0f, 2, 2, 8);
		shape7.setRotationPoint(-13.0f, 0.0f, 5.0f);
		shape7.setTextureSize(128, 32);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 0.0f, -4.0f, 10, 2, 4);
		shape8.setRotationPoint(-5.0f, 4.0f, -5.0f);
		shape8.setTextureSize(128, 32);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 4);
		shape9.setRotationPoint(-5.0f, 4.0f, -5.0f);
		shape9.setTextureSize(128, 32);
		shape9.mirror = true;
		setRotation(shape9, 0.0f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 2.0f, -4.0f, 2, 6, 4);
		shape10.setRotationPoint(-5.0f, 4.0f, -5.0f);
		shape10.setTextureSize(128, 32);
		shape10.mirror = true;
		setRotation(shape10, 0.0f, 0.0f, 0.0f);
		(shape11 = new ModelRenderer(this, 29, 2)).addBox(8.0f, 2.0f, -4.0f, 2, 6, 4);
		shape11.setRotationPoint(-5.0f, 4.0f, -5.0f);
		shape11.setTextureSize(128, 32);
		shape11.mirror = true;
		setRotation(shape11, 0.0f, 0.0f, 0.0f);
		(shape12 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 8.0f, -4.0f, 10, 2, 4);
		shape12.setRotationPoint(-5.0f, 4.0f, -5.0f);
		shape12.setTextureSize(128, 32);
		shape12.mirror = true;
		setRotation(shape12, 0.0f, 0.0f, 0.0f);
		(shape13 = new ModelRenderer(this, 34, 10)).addBox(4.0f, 4.0f, -8.0f, 2, 2, 8);
		shape13.setRotationPoint(-5.0f, 4.0f, -3.0f);
		shape13.setTextureSize(128, 32);
		shape13.mirror = true;
		setRotation(shape13, 0.0f, 0.0f, 0.0f);
		(shape14 = new ModelRenderer(this, 0, 15)).addBox(3.0f, 3.0f, -12.0f, 4, 4, 4);
		shape14.setRotationPoint(-5.0f, 4.0f, 0.0f);
		shape14.setTextureSize(128, 32);
		shape14.mirror = true;
		setRotation(shape14, 0.0f, 0.0f, 0.0f);
		(shape15 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 8.0f, -4.0f, 10, 2, 4);
		shape15.setRotationPoint(-13.0f, 0.0f, 3.0f);
		shape15.setTextureSize(128, 32);
		shape15.mirror = true;
		setRotation(shape15, 0.0f, 0.0f, 0.0f);
		(shape16 = new ModelRenderer(this, 17, 22)).addBox(0.0f, 8.0f, -4.0f, 4, 6, 4);
		shape16.setRotationPoint(-10.0f, 2.0f, 5.0f);
		shape16.setTextureSize(128, 32);
		shape16.mirror = true;
		setRotation(shape16, 0.0f, 0.0f, 0.0f);
		(shape17 = new ModelRenderer(this, 17, 22)).addBox(0.0f, 8.0f, -4.0f, 4, 2, 4);
		shape17.setRotationPoint(-2.0f, 6.0f, -3.0f);
		shape17.setTextureSize(128, 32);
		shape17.mirror = true;
		setRotation(shape17, 0.0f, 0.0f, 0.0f);
		(shape18 = new ModelRenderer(this, 35, 22)).addBox(0.0f, 7.0f, -4.0f, 17, 2, 4);
		shape18.setRotationPoint(-9.0f, 11.0f, 5.0f);
		shape18.setTextureSize(128, 32);
		shape18.mirror = true;
		setRotation(shape18, 0.0f, 0.0f, 0.0f);
		(shape19 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 6, 1);
		shape19.setRotationPoint(14.0f, 19.0f, 6.0f);
		shape19.setTextureSize(128, 32);
		shape19.mirror = true;
		setRotation(shape19, 0.0f, 0.0f, 0.0f);
		(shape20 = new ModelRenderer(this, 35, 23)).addBox(0.0f, 8.0f, -4.0f, 12, 4, 4);
		shape20.setRotationPoint(-6.0f, 4.0f, 5.0f);
		shape20.setTextureSize(128, 32);
		shape20.mirror = true;
		setRotation(shape20, 0.0f, 0.0f, 0.0f);
		(shape21 = new ModelRenderer(this, 59, 0)).addBox(-5.0f, -1.0f, -14.0f, 20, 2, 14);
		shape21.setRotationPoint(-5.0f, 17.0f, 5.0f);
		shape21.setTextureSize(128, 32);
		shape21.mirror = true;
		setRotation(shape21, 0.0f, 0.0f, 0.0f);
		(shape22 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape22.setRotationPoint(2.0f, 19.0f, 6.0f);
		shape22.setTextureSize(128, 32);
		shape22.mirror = true;
		setRotation(shape22, 0.0f, 0.0f, 0.0f);
		(shape23 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 6, 1);
		shape23.setRotationPoint(-5.0f, 19.0f, 6.0f);
		shape23.setTextureSize(128, 32);
		shape23.mirror = true;
		setRotation(shape23, 0.0f, 0.0f, 0.0f);
		(shape24 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape24.setRotationPoint(-2.0f, 19.0f, 6.0f);
		shape24.setTextureSize(128, 32);
		shape24.mirror = true;
		setRotation(shape24, 0.0f, 0.0f, 0.0f);
		(shape25 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape25.setRotationPoint(-5.0f, 19.0f, 12.0f);
		shape25.setTextureSize(128, 32);
		shape25.mirror = true;
		setRotation(shape25, 0.0f, 0.0f, 0.0f);
		(shape26 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape26.setRotationPoint(7.0f, 19.0f, 6.0f);
		shape26.setTextureSize(128, 32);
		shape26.mirror = true;
		setRotation(shape26, 0.0f, 0.0f, 0.0f);
		(shape27 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape27.setRotationPoint(11.0f, 19.0f, 6.0f);
		shape27.setTextureSize(128, 32);
		shape27.mirror = true;
		setRotation(shape27, 0.0f, 0.0f, 0.0f);
		(shape28 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape28.setRotationPoint(-5.0f, 19.0f, 9.0f);
		shape28.setTextureSize(128, 32);
		shape28.mirror = true;
		setRotation(shape28, 0.0f, 0.0f, 0.0f);
		(shape29 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape29.setRotationPoint(14.0f, 19.0f, 12.0f);
		shape29.setTextureSize(128, 32);
		shape29.mirror = true;
		setRotation(shape29, 0.0f, 0.0f, 0.0f);
		(shape30 = new ModelRenderer(this, 1, 24)).addBox(-5.0f, -1.0f, -14.0f, 1, 4, 1);
		shape30.setRotationPoint(14.0f, 19.0f, 9.0f);
		shape30.setTextureSize(128, 32);
		shape30.mirror = true;
		setRotation(shape30, 0.0f, 0.0f, 0.0f);
		(shape32 = new ModelRenderer(this, 17, 22)).addBox(0.0f, 0.0f, 0.0f, 4, 2, 4);
		shape32.setRotationPoint(-12.0f, 16.0f, 1.0f);
		shape32.setTextureSize(128, 32);
		shape32.mirror = true;
		setRotation(shape32, 0.0f, 0.0f, -1.570796f);
		(shape31 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 8.0f, -4.0f, 10, 2, 4);
		shape31.setRotationPoint(-22.0f, 12.0f, 3.0f);
		shape31.setTextureSize(128, 32);
		shape31.mirror = true;
		setRotation(shape31, 0.0f, 0.0f, 0.0f);
		(shape33 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 2.0f, -4.0f, 2, 6, 4);
		shape33.setRotationPoint(-22.0f, 12.0f, 3.0f);
		shape33.setTextureSize(128, 32);
		shape33.mirror = true;
		setRotation(shape33, 0.0f, 0.0f, 0.0f);
		(shape34 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 0.0f, -4.0f, 10, 2, 4);
		shape34.setRotationPoint(-22.0f, 12.0f, 3.0f);
		shape34.setTextureSize(128, 32);
		shape34.mirror = true;
		setRotation(shape34, 0.0f, 0.0f, 0.0f);
		(shape35 = new ModelRenderer(this, 29, 2)).addBox(8.0f, 2.0f, -4.0f, 2, 6, 4);
		shape35.setRotationPoint(-22.0f, 12.0f, 3.0f);
		shape35.setTextureSize(128, 32);
		shape35.mirror = true;
		setRotation(shape35, 0.0f, 0.0f, 0.0f);
		(shape36 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 4);
		shape36.setRotationPoint(-22.0f, 12.0f, 3.0f);
		shape36.setTextureSize(128, 32);
		shape36.mirror = true;
		setRotation(shape36, 0.0f, 0.0f, 0.0f);
		(shape37 = new ModelRenderer(this, 34, 10)).addBox(4.0f, 4.0f, -8.0f, 2, 2, 8);
		shape37.setRotationPoint(-22.0f, 12.0f, 5.0f);
		shape37.setTextureSize(128, 32);
		shape37.mirror = true;
		setRotation(shape37, 0.0f, 0.0f, 0.0f);
		(shape38 = new ModelRenderer(this, 0, 15)).addBox(3.0f, 3.0f, -12.0f, 4, 4, 4);
		shape38.setRotationPoint(-22.0f, 12.0f, 8.0f);
		shape38.setTextureSize(128, 32);
		shape38.mirror = true;
		setRotation(shape38, 0.0f, 0.0f, 0.0f);
		(shape39 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 8.0f, -4.0f, 10, 2, 4);
		shape39.setRotationPoint(3.0f, 0.0f, 3.0f);
		shape39.setTextureSize(128, 32);
		shape39.mirror = true;
		setRotation(shape39, 0.0f, 0.0f, 0.0f);
		(shape40 = new ModelRenderer(this, 29, 2)).addBox(8.0f, 2.0f, -4.0f, 2, 6, 4);
		shape40.setRotationPoint(3.0f, 0.0f, 3.0f);
		shape40.setTextureSize(128, 32);
		shape40.mirror = true;
		setRotation(shape40, 0.0f, 0.0f, 0.0f);
		(shape41 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 0.0f, -4.0f, 10, 2, 4);
		shape41.setRotationPoint(3.0f, 0.0f, 3.0f);
		shape41.setTextureSize(128, 32);
		shape41.mirror = true;
		setRotation(shape41, 0.0f, 0.0f, 0.0f);
		(shape42 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 2.0f, -4.0f, 2, 6, 4);
		shape42.setRotationPoint(3.0f, 0.0f, 3.0f);
		shape42.setTextureSize(128, 32);
		shape42.mirror = true;
		setRotation(shape42, 0.0f, 0.0f, 0.0f);
		(shape43 = new ModelRenderer(this, 34, 10)).addBox(4.0f, 4.0f, -8.0f, 2, 2, 8);
		shape43.setRotationPoint(3.0f, 0.0f, 5.0f);
		shape43.setTextureSize(128, 32);
		shape43.mirror = true;
		setRotation(shape43, 0.0f, 0.0f, 0.0f);
		(shape44 = new ModelRenderer(this, 0, 15)).addBox(3.0f, 3.0f, -12.0f, 4, 4, 4);
		shape44.setRotationPoint(3.0f, 0.0f, 8.0f);
		shape44.setTextureSize(128, 32);
		shape44.mirror = true;
		setRotation(shape44, 0.0f, 0.0f, 0.0f);
		(shape45 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 4);
		shape45.setRotationPoint(3.0f, 0.0f, 3.0f);
		shape45.setTextureSize(128, 32);
		shape45.mirror = true;
		setRotation(shape45, 0.0f, 0.0f, 0.0f);
		(shape46 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 8.0f, -4.0f, 10, 2, 4);
		shape46.setRotationPoint(12.0f, 12.0f, 3.0f);
		shape46.setTextureSize(128, 32);
		shape46.mirror = true;
		setRotation(shape46, 0.0f, 0.0f, 0.0f);
		(shape47 = new ModelRenderer(this, 29, 2)).addBox(8.0f, 2.0f, -4.0f, 2, 6, 4);
		shape47.setRotationPoint(12.0f, 12.0f, 3.0f);
		shape47.setTextureSize(128, 32);
		shape47.mirror = true;
		setRotation(shape47, 0.0f, 0.0f, 0.0f);
		(shape48 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 0.0f, -4.0f, 10, 2, 4);
		shape48.setRotationPoint(12.0f, 12.0f, 3.0f);
		shape48.setTextureSize(128, 32);
		shape48.mirror = true;
		setRotation(shape48, 0.0f, 0.0f, 0.0f);
		(shape49 = new ModelRenderer(this, 29, 2)).addBox(0.0f, 2.0f, -4.0f, 2, 6, 4);
		shape49.setRotationPoint(12.0f, 12.0f, 3.0f);
		shape49.setTextureSize(128, 32);
		shape49.mirror = true;
		setRotation(shape49, 0.0f, 0.0f, 0.0f);
		(shape50 = new ModelRenderer(this, 34, 10)).addBox(4.0f, 4.0f, -8.0f, 2, 2, 8);
		shape50.setRotationPoint(12.0f, 12.0f, 5.0f);
		shape50.setTextureSize(128, 32);
		shape50.mirror = true;
		setRotation(shape50, 0.0f, 0.0f, 0.0f);
		(shape51 = new ModelRenderer(this, 0, 15)).addBox(3.0f, 3.0f, -12.0f, 4, 4, 4);
		shape51.setRotationPoint(12.0f, 12.0f, 8.0f);
		shape51.setTextureSize(128, 32);
		shape51.mirror = true;
		setRotation(shape51, 0.0f, 0.0f, 0.0f);
		(shape52 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 4);
		shape52.setRotationPoint(12.0f, 12.0f, 3.0f);
		shape52.setTextureSize(128, 32);
		shape52.mirror = true;
		setRotation(shape52, 0.0f, 0.0f, 0.0f);
		(shape53 = new ModelRenderer(this, 17, 22)).addBox(0.0f, 8.0f, -4.0f, 4, 6, 4);
		shape53.setRotationPoint(6.0f, 2.0f, 5.0f);
		shape53.setTextureSize(128, 32);
		shape53.mirror = true;
		setRotation(shape53, 0.0f, 0.0f, 0.0f);
		(shape54 = new ModelRenderer(this, 17, 22)).addBox(0.0f, 0.0f, 0.0f, 4, 2, 4);
		shape54.setRotationPoint(12.0f, 12.0f, 1.0f);
		shape54.setTextureSize(128, 32);
		shape54.mirror = true;
		setRotation(shape54, 0.0f, 0.0f, 1.570796f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
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
		shape14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape23.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape24.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape25.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape26.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape27.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape28.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape29.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape30.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape32.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape31.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape33.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape34.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape35.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape36.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape37.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape38.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape39.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape40.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape41.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape42.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape43.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape44.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape45.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape46.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape47.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape48.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape49.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape50.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape51.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape52.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape53.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape54.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
