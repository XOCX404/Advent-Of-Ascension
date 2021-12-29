package net.tslat.aoa3.client.model.entities.mobs.mysterium;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSpiritProtector extends ModelBase {
	private ModelRenderer shape50;
	private ModelRenderer Rotator;
	private ModelRenderer shape3;
	private ModelRenderer shape4;
	private ModelRenderer shape5;
	private ModelRenderer shape6;
	private ModelRenderer shape7;
	private ModelRenderer shape8;
	private ModelRenderer shape9;
	private ModelRenderer shape10;
	private ModelRenderer shape11;
	private ModelRenderer shape12;
	private ModelRenderer shape13;
	private ModelRenderer shape14;
	private ModelRenderer shape15;
	private ModelRenderer shape16;
	private ModelRenderer shape17;
	private ModelRenderer shape18;
	private ModelRenderer head;
	private ModelRenderer shape24;
	private ModelRenderer shape1;
	private ModelRenderer shape51;
	private ModelRenderer shape30;
	private ModelRenderer shape31;
	private ModelRenderer shape32;
	private ModelRenderer shape33;
	private ModelRenderer shape34;
	private ModelRenderer shape35;
	private ModelRenderer shape36;
	private ModelRenderer shape37;

	public ModelSpiritProtector() {
		textureWidth = 128;
		textureHeight = 64;
		(shape50 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 2, 6, 4);
		shape50.setRotationPoint(6.0f, 12.0f, 3.0f);
		shape50.setTextureSize(128, 64);
		shape50.mirror = true;
		setRotation(shape50, 0.0f, 0.0f, 0.0f);
		(Rotator = new ModelRenderer(this, 51, 55)).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
		Rotator.setRotationPoint(0.0f, 18.0f, 3.0f);
		Rotator.setTextureSize(128, 64);
		Rotator.mirror = true;
		setRotation(Rotator, 0.0f, 0.0f, 0.7853982f);
		(shape3 = new ModelRenderer(this, 18, 9)).addBox(-6.5f, -7.0f, -9.0f, 1, 10, 1);
		shape3.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape3.setTextureSize(128, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.6981317f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 74, 38)).addBox(-1.0f, 0.0f, -0.5f, 1, 10, 1);
		shape4.setRotationPoint(3.0f, -2.0f, 3.0f);
		shape4.setTextureSize(128, 64);
		shape4.mirror = true;
		setRotation(shape4, 0.0f, 0.0f, -0.5235988f);
		(shape5 = new ModelRenderer(this, 35, 50)).addBox(-1.0f, 10.0f, -1.5f, 3, 5, 3);
		shape5.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape5.setTextureSize(128, 64);
		shape5.mirror = true;
		setRotation(shape5, 0.0f, 0.0f, 0.5235988f);
		(shape6 = new ModelRenderer(this, 73, 50)).addBox(-2.0f, 10.0f, -1.5f, 3, 5, 3);
		shape6.setRotationPoint(3.0f, -2.0f, 3.0f);
		shape6.setTextureSize(128, 64);
		shape6.mirror = true;
		setRotation(shape6, 0.0f, 0.0f, -0.5235988f);
		(shape7 = new ModelRenderer(this, 33, 30)).addBox(-2.0f, 0.0f, -2.0f, 3, 2, 4);
		shape7.setRotationPoint(-4.0f, -2.0f, 3.0f);
		shape7.setTextureSize(128, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 73, 30)).addBox(-1.0f, 0.0f, -2.0f, 3, 2, 4);
		shape8.setRotationPoint(4.0f, -2.0f, 3.0f);
		shape8.setTextureSize(128, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 30, 0)).addBox(0.0f, 0.0f, -2.0f, 1, 1, 8);
		shape9.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape9.setTextureSize(128, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.6108652f, -0.5235988f, 0.0f);
		(shape10 = new ModelRenderer(this, 72, 0)).addBox(-1.0f, 0.0f, -2.0f, 1, 1, 8);
		shape10.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape10.setTextureSize(128, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.6108652f, 0.5235988f, 0.0f);
		(shape11 = new ModelRenderer(this, 110, 0)).addBox(-1.0f, 3.0f, 5.0f, 1, 30, 1);
		shape11.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape11.setTextureSize(128, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.7853982f, 0.5235988f, 0.0f);
		(shape12 = new ModelRenderer(this, 104, 0)).addBox(-1.0f, 2.0f, 3.0f, 1, 25, 1);
		shape12.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape12.setTextureSize(128, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.6981317f, 0.5235988f, 0.0f);
		(shape13 = new ModelRenderer(this, 98, 0)).addBox(-1.0f, 2.0f, 1.0f, 1, 20, 1);
		shape13.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape13.setTextureSize(128, 64);
		shape13.mirror = true;
		setRotation(shape13, 0.6108652f, 0.5235988f, 0.0f);
		(shape14 = new ModelRenderer(this, 92, 0)).addBox(-1.0f, 2.0f, -1.0f, 1, 15, 1);
		shape14.setRotationPoint(3.0f, -2.0f, 5.0f);
		shape14.setTextureSize(128, 64);
		shape14.mirror = true;
		setRotation(shape14, 0.5235988f, 0.5235988f, 0.0f);
		(shape15 = new ModelRenderer(this, 6, 0)).addBox(0.0f, 3.0f, 5.0f, 1, 30, 1);
		shape15.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape15.setTextureSize(128, 64);
		shape15.mirror = true;
		setRotation(shape15, 0.7853982f, -0.5235988f, 0.0f);
		(shape16 = new ModelRenderer(this, 12, 0)).addBox(0.0f, 2.0f, 3.0f, 1, 25, 1);
		shape16.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape16.setTextureSize(128, 64);
		shape16.mirror = true;
		setRotation(shape16, 0.6981317f, -0.5235988f, 0.0f);
		(shape17 = new ModelRenderer(this, 18, 0)).addBox(0.0f, 2.0f, 1.0f, 1, 20, 1);
		shape17.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape17.setTextureSize(128, 64);
		shape17.mirror = true;
		setRotation(shape17, 0.6108652f, -0.5235988f, 0.0f);
		(shape18 = new ModelRenderer(this, 24, 0)).addBox(0.0f, 2.0f, -1.0f, 1, 15, 1);
		shape18.setRotationPoint(-3.0f, -2.0f, 5.0f);
		shape18.setTextureSize(128, 64);
		shape18.mirror = true;
		setRotation(shape18, 0.5235988f, -0.5235988f, 0.0f);
		(head = new ModelRenderer(this, 52, 20)).addBox(-2.0f, -4.0f, -2.0f, 4, 4, 4);
		head.setRotationPoint(0.0f, -1.0f, 1.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(shape24 = new ModelRenderer(this, 75, 59)).addBox(-1.5f, 15.0f, -1.0f, 2, 2, 2);
		shape24.setRotationPoint(3.0f, -2.0f, 3.0f);
		shape24.setTextureSize(128, 64);
		shape24.mirror = true;
		setRotation(shape24, 0.0f, 0.0f, -0.5235988f);
		(shape1 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 6, 16, 4);
		shape1.setRotationPoint(0.0f, -2.0f, 3.0f);
		shape1.setTextureSize(128, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(shape51 = new ModelRenderer(this, 50, 30)).addBox(-3.0f, 0.0f, -2.0f, 2, 6, 4);
		shape51.setRotationPoint(-2.0f, 12.0f, 3.0f);
		shape51.setTextureSize(128, 64);
		shape51.mirror = true;
		setRotation(shape51, 0.0f, 0.0f, 0.0f);
		(shape30 = new ModelRenderer(this, 42, 38)).addBox(0.0f, 0.0f, -0.5f, 1, 10, 1);
		shape30.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape30.setTextureSize(128, 64);
		shape30.mirror = true;
		setRotation(shape30, 0.0f, 0.0f, 0.5235988f);
		(shape31 = new ModelRenderer(this, 56, 34)).addBox(-6.5f, 13.0f, -9.0f, 1, 2, 1);
		shape31.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape31.setTextureSize(128, 64);
		shape31.mirror = true;
		setRotation(shape31, 0.6981317f, 0.0f, 0.0f);
		(shape32 = new ModelRenderer(this, 18, 9)).addBox(-6.5f, 3.0f, -9.0f, 1, 10, 1);
		shape32.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape32.setTextureSize(128, 64);
		shape32.mirror = true;
		setRotation(shape32, 0.6981317f, 0.0f, 0.0f);
		(shape33 = new ModelRenderer(this, 51, 55)).addBox(-8.0f, 6.5f, -11.0f, 4, 4, 4);
		shape33.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape33.setTextureSize(128, 64);
		shape33.mirror = true;
		setRotation(shape33, -0.8726646f, 0.0f, 0.0f);
		(shape34 = new ModelRenderer(this, 51, 36)).addBox(-5.0f, 9.5f, -13.0f, 1, 1, 2);
		shape34.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape34.setTextureSize(128, 64);
		shape34.mirror = true;
		setRotation(shape34, -0.8726646f, 0.0f, 0.0f);
		(shape35 = new ModelRenderer(this, 51, 36)).addBox(-8.0f, 9.5f, -13.0f, 1, 1, 2);
		shape35.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape35.setTextureSize(128, 64);
		shape35.mirror = true;
		setRotation(shape35, -0.8726646f, 0.0f, 0.0f);
		(shape36 = new ModelRenderer(this, 51, 36)).addBox(-5.0f, 6.5f, -13.0f, 1, 1, 2);
		shape36.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape36.setTextureSize(128, 64);
		shape36.mirror = true;
		setRotation(shape36, -0.8726646f, 0.0f, 0.0f);
		(shape37 = new ModelRenderer(this, 51, 36)).addBox(-8.0f, 6.5f, -13.0f, 1, 1, 2);
		shape37.setRotationPoint(-3.0f, -2.0f, 3.0f);
		shape37.setTextureSize(128, 64);
		shape37.mirror = true;
		setRotation(shape37, -0.8726646f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		shape50.render(par7);
		Rotator.render(par7);
		shape3.render(par7);
		shape4.render(par7);
		shape5.render(par7);
		shape6.render(par7);
		shape7.render(par7);
		shape8.render(par7);
		shape9.render(par7);
		shape10.render(par7);
		shape11.render(par7);
		shape12.render(par7);
		shape13.render(par7);
		shape14.render(par7);
		shape15.render(par7);
		shape16.render(par7);
		shape17.render(par7);
		shape18.render(par7);
		head.render(par7);
		shape24.render(par7);
		shape1.render(par7);
		shape51.render(par7);
		shape30.render(par7);
		shape31.render(par7);
		shape32.render(par7);
		shape33.render(par7);
		shape34.render(par7);
		shape35.render(par7);
		shape36.render(par7);
		shape37.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		final ModelRenderer rotator = Rotator;
		rotator.rotateAngleZ += MathHelper.sin(par2 * 0.067f) * 0.25f;
	}
}