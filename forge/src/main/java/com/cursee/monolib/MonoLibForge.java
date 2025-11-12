package com.cursee.monolib;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod(Constants.MOD_ID)
public class MonoLibForge {

  public static IEventBus eventBus;

  public MonoLibForge(final FMLJavaModLoadingContext context) {

    MonoLibForge.eventBus = context.getModEventBus();

    MonoLib.init();

    if (FMLLoader.getDist() == Dist.CLIENT || FMLEnvironment.dist == Dist.CLIENT) {
      new MonoLibClientForge();
    }
  }

  public MonoLibForge() {
    this(FMLJavaModLoadingContext.get());
  }
}