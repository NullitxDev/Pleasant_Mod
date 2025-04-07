package net.nullitx.tutorialmod.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nullitx.tutorialmod.TutorialMod;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLEASANT_TAB = CREATIVE_MODE_TABS.register("pleasant_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPRINGIUM.get()))
                    .title(Component.translatable("creativetab.pleasant_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SPRINGIUM.get());
                        output.accept(ModItems.CRUDE_SPRINGIUM.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
