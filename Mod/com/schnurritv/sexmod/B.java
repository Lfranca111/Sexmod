package com.schnurritv.sexmod;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEndGateway;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class b extends EntityEnderPearl {
  public b(World paramWorld) {
    super(paramWorld);
  }
  
  public b(World paramWorld, EntityLivingBase paramEntityLivingBase) {
    super(paramWorld, paramEntityLivingBase);
  }
  
  protected void func_70184_a(RayTraceResult paramRayTraceResult) {
    EntityLivingBase entityLivingBase = func_85052_h();
    if (paramRayTraceResult.field_72313_a == RayTraceResult.Type.BLOCK) {
      BlockPos blockPos = paramRayTraceResult.func_178782_a();
      TileEntity tileEntity = this.field_70170_p.func_175625_s(blockPos);
      if (tileEntity instanceof TileEntityEndGateway) {
        TileEntityEndGateway tileEntityEndGateway = (TileEntityEndGateway)tileEntity;
        try {
          if (entityLivingBase != null) {
            try {
              if (entityLivingBase instanceof EntityPlayerMP)
                CriteriaTriggers.field_192124_d.func_192193_a((EntityPlayerMP)entityLivingBase, this.field_70170_p.func_180495_p(blockPos)); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            tileEntityEndGateway.func_184306_a((Entity)entityLivingBase);
            func_70106_y();
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        tileEntityEndGateway.func_184306_a((Entity)this);
        return;
      } 
    } 
    byte b1 = 0;
    try {
      while (b1 < 32) {
        this.field_70170_p.func_175688_a(EnumParticleTypes.PORTAL, this.field_70165_t, this.field_70163_u + this.field_70146_Z.nextDouble() * 2.0D, this.field_70161_v, this.field_70146_Z.nextGaussian(), 0.0D, this.field_70146_Z.nextGaussian(), new int[0]);
        b1++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.field_70170_p.field_72995_K) {
        if (entityLivingBase != null) {
          bS bS = (bS)entityLivingBase;
          if (bS.f.func_72438_d(func_174791_d()) < 5.0D) {
            EnderTeleportEvent enderTeleportEvent = new EnderTeleportEvent(entityLivingBase, this.field_70165_t, this.field_70163_u, this.field_70161_v, 5.0F);
            try {
              if (!MinecraftForge.EVENT_BUS.post((Event)enderTeleportEvent)) {
                try {
                  if (entityLivingBase.func_184218_aH())
                    entityLivingBase.func_184210_p(); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                entityLivingBase.func_70634_a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
                entityLivingBase.field_70143_R = 0.0F;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } 
        func_70106_y();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a {
    @SubscribeEvent
    public void a(EnderTeleportEvent param1EnderTeleportEvent) {
      if (param1EnderTeleportEvent.getEntityLiving() instanceof bS) {
        bS bS = (bS)param1EnderTeleportEvent.getEntityLiving();
        bS.v = null;
        bS.c(m.NULL);
        bS.func_184212_Q().func_187227_b(bS.z, Boolean.valueOf(false));
        bS.A();
      } 
    }
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\com\schnurritv\sexmod\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */