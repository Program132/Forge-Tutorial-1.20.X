package fr.program.tutomod.item;

import fr.program.tutomod.TutoMod;
import fr.program.tutomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CreativeTabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutoMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        CreativeTabs.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> TUTO_TAB = CreativeTabs.register("tuto_tab", // Create a custom tab in creative menu
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tuto_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Accepting items from the mod
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        // We can add other items : pOutput.accept(Items.DIAMOND);


                        // Accepting blocks from the mod
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                    })
                    .build()); // Set icon of the tab to Sapphire
}
