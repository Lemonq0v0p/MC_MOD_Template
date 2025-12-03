package com.example.templatemod;

import com.example.templatemod.init.*;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TemplateMod.MOD_ID)
public class TemplateMod {
    // ★ここを変えるだけで、コード内の全ての参照IDが変わります
    public static final String MOD_ID = "templatemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TemplateMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // 登録クラスの一括ロード
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        // ModEnchantments.register(modEventBus); // 必要に応じてコメントアウト解除
        // ModBlockEntities.register(modEventBus);
        // ModEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}