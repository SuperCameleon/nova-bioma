package net.supercameleon.novabioma.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.supercameleon.novabioma.NovaBioma;
import net.supercameleon.novabioma.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NovaBioma.MOD_ID);

    public static final RegistryObject<Item> PEATCLOD = ITEMS.register("peat_clod",
            () -> new FuelItem(new Item.Properties(), 600));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
