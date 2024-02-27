package fr.program.tutomod.item;

import fr.program.tutomod.TutoMod;
import fr.program.tutomod.item.custom.FuelItem;
import fr.program.tutomod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutoMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(
                     new Item.Properties()
            ));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(
                    new Item.Properties().food(ModFoods.STRAWBERRY)
            ));

    public static final RegistryObject<Item> BIG_COAL = ITEMS.register("big_coal",
            () -> new FuelItem(
                    new Item.Properties(), 800
            ));

    public static final RegistryObject<Item> BIG_APPLE = ITEMS.register("big_apple",
            () -> new Item(
                    new Item.Properties().food(ModFoods.BIG_APPLE)
            ));


    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0,
                    new Item.Properties()
            ));
}
