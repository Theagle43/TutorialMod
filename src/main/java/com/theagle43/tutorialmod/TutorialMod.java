package com.theagle43.tutorialmod;

import com.theagle43.tutorialmod.proxy.iProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="TutorialMod", name="Tutorial Mod", version="1.7.10-1.0.0")
/**
 * Created by Theagle43 on 11/13/2015.
 */
public class TutorialMod
{
    @Mod.Instance("TutorialMod")
    public static  TutorialMod instance;

    @SidedProxy(clientSide = "com.theagle43.TutorialMod.proxy.ClientProxy", serverSide = "com/theagle43.TutorialMod.proxy.ServerProxy")
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

