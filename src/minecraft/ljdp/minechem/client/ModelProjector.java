// Date: 22/12/2012 23:07:17
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package ljdp.minechem.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelProjector extends ModelBase {
    // fields
    ModelRenderer base;
    ModelRenderer projectorstand;
    ModelRenderer body;
    ModelRenderer lecternstand;
    ModelRenderer panelright;
    ModelRenderer lectern;
    ModelRenderer panelrod;
    ModelRenderer panelleft;
    ModelRenderer lens1;
    ModelRenderer lens2;
    ModelRenderer lens3;
    ModelRenderer lens4;
    ModelRenderer keypad;
    ModelRenderer keypadstand;
    ModelRenderer lecternlip;

    public ModelProjector() {
        textureWidth = 128;
        textureHeight = 64;

        base = new ModelRenderer(this, 0, 48);
        base.addBox(0F, 0F, 0F, 14, 2, 14);
        base.setRotationPoint(-7F, 22F, -7F);
        base.setTextureSize(128, 64);
        base.mirror = true;
        setRotation(base, 0F, 0F, 0F);
        projectorstand = new ModelRenderer(this, 0, 42);
        projectorstand.addBox(0F, 0F, 0F, 4, 2, 4);
        projectorstand.setRotationPoint(-2F, 20F, -3F);
        projectorstand.setTextureSize(128, 64);
        projectorstand.mirror = true;
        setRotation(projectorstand, 0F, 0F, 0F);
        body = new ModelRenderer(this, 0, 30);
        body.addBox(0F, 0F, 0F, 6, 6, 6);
        body.setRotationPoint(-3F, 14F, -4F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        lecternstand = new ModelRenderer(this, 0, 25);
        lecternstand.addBox(0F, 0F, 0F, 2, 3, 2);
        lecternstand.setRotationPoint(-1F, 11F, -1F);
        lecternstand.setTextureSize(128, 64);
        lecternstand.mirror = true;
        setRotation(lecternstand, 0F, 0F, 0F);
        panelright = new ModelRenderer(this, 56, 32);
        panelright.addBox(0F, 0F, 0F, 1, 8, 8);
        panelright.setRotationPoint(7F, 12F, -4F);
        panelright.setTextureSize(128, 64);
        panelright.mirror = true;
        setRotation(panelright, 0F, 0F, 0F);
        lectern = new ModelRenderer(this, 16, 37);
        lectern.addBox(0F, 0F, 0F, 10, 1, 10);
        lectern.setRotationPoint(-5F, 12F, -4F);
        lectern.setTextureSize(128, 64);
        lectern.mirror = true;
        setRotation(lectern, 0.3490659F, 0F, 0F);
        panelrod = new ModelRenderer(this, 74, 60);
        panelrod.addBox(0F, 0F, 0F, 14, 2, 2);
        panelrod.setRotationPoint(-7F, 15F, -1F);
        panelrod.setTextureSize(128, 64);
        panelrod.mirror = true;
        setRotation(panelrod, 0F, 0F, 0F);
        panelleft = new ModelRenderer(this, 56, 48);
        panelleft.addBox(0F, 0F, 0F, 1, 8, 8);
        panelleft.setRotationPoint(-8F, 12F, -4F);
        panelleft.setTextureSize(128, 64);
        panelleft.mirror = true;
        setRotation(panelleft, 0F, 0F, 0F);
        lens1 = new ModelRenderer(this, 74, 55);
        lens1.addBox(0F, 0F, 0F, 4, 4, 1);
        lens1.setRotationPoint(-2F, 15F, 2F);
        lens1.setTextureSize(128, 64);
        lens1.mirror = true;
        setRotation(lens1, 0F, 0F, 0F);
        lens2 = new ModelRenderer(this, 74, 51);
        lens2.addBox(0F, 0F, 0F, 2, 2, 2);
        lens2.setRotationPoint(-1F, 16F, 3F);
        lens2.setTextureSize(128, 64);
        lens2.mirror = true;
        setRotation(lens2, 0F, 0F, 0F);
        lens3 = new ModelRenderer(this, 74, 46);
        lens3.addBox(0F, 0F, 0F, 4, 4, 1);
        lens3.setRotationPoint(-2F, 15F, 5F);
        lens3.setTextureSize(128, 64);
        lens3.mirror = true;
        setRotation(lens3, 0F, 0F, 0F);
        lens4 = new ModelRenderer(this, 74, 39);
        lens4.addBox(0F, 0F, 0F, 6, 6, 1);
        lens4.setRotationPoint(-3F, 14F, 6F);
        lens4.setTextureSize(128, 64);
        lens4.mirror = true;
        setRotation(lens4, 0F, 0F, 0F);
        keypad = new ModelRenderer(this, 0, 0);
        keypad.addBox(0F, 0F, 0F, 7, 1, 5);
        keypad.setRotationPoint(-3.5F, 15F, -8F);
        keypad.setTextureSize(128, 64);
        keypad.mirror = true;
        setRotation(keypad, 0.3490659F, 0F, 0F);
        keypadstand = new ModelRenderer(this, 0, 6);
        keypadstand.addBox(0F, 0F, 0F, 4, 3, 2);
        keypadstand.setRotationPoint(-2F, 15F, -5F);
        keypadstand.setTextureSize(128, 64);
        keypadstand.mirror = true;
        setRotation(keypadstand, 0.3490659F, 0F, 0F);
        lecternlip = new ModelRenderer(this, 26, 35);
        lecternlip.addBox(0F, 0F, 0F, 8, 1, 1);
        lecternlip.setRotationPoint(-4F, 11F, -4F);
        lecternlip.setTextureSize(128, 64);
        lecternlip.mirror = true;
        setRotation(lecternlip, 0F, 0F, 0F);
    }

    public void render(float scale) {
        base.render(scale);
        projectorstand.render(scale);
        body.render(scale);
        lecternstand.render(scale);
        // panelright.render(scale);
        lectern.render(scale);
        // panelrod.render(scale);
        // panelleft.render(scale);
        lens1.render(scale);
        lens2.render(scale);
        lens3.render(scale);
        lens4.render(scale);
        keypad.render(scale);
        keypadstand.render(scale);
        lecternlip.render(scale);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
