package com.schnurritv.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class bs extends bm {
  public bs(RenderManager paramRenderManager, AnimatedGeoModel paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
  }
  
  protected void a(boolean paramBoolean, ItemStack paramItemStack) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179114_b(paramBoolean ? 290.0F : 90.0F, 1.0F, 0.0F, 0.0F);
  }
  
  protected void c() {
    GlStateManager.func_179109_b(0.0F, -0.6F, 0.0F);
    GlStateManager.func_179152_a(0.4F, 0.4F, 0.4F);
  }
  
  protected void a(boolean paramBoolean) {
    try {
      super.a(paramBoolean);
      if (paramBoolean)
        GlStateManager.func_179137_b(0.1D, 0.0D, 0.0D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (paramBoolean1) {
        try {
          GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
          GlStateManager.func_179114_b(90.0F, 1.0F, 0.0F, 0.0F);
          GlStateManager.func_179109_b(0.0F, -0.14F, -0.17F);
          if (paramBoolean2) {
            GlStateManager.func_179114_b(90.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.func_179137_b(0.067D, 0.0D, 0.0D);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramBoolean2) {
            GlStateManager.func_179114_b(-90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.func_179114_b(-90.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.func_179109_b(0.0F, 0.165F, 0.0F);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */