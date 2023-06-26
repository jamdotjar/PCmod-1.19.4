package com.jamdotjar.pcmod.items;

import com.jamdotjar.pcmod.PcMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //item declaration
    public static final Item GPU = RegisterItem("gpu",
        new Item(new FabricItemSettings()));
    public static final Item CPU = RegisterItem("cpu",
            new Item(new FabricItemSettings()));
    public static final Item RAM = RegisterItem("ram",
            new Item(new FabricItemSettings()));
    public static final Item SSD_SATA = RegisterItem("ssd_sata",
            new Item(new FabricItemSettings()));



    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PcMod.MOD_ID, name ), item);
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, GPU);
        addToItemGroup(ItemGroups.INGREDIENTS, CPU);
        addToItemGroup(ItemGroups.INGREDIENTS, RAM);
        addToItemGroup(ItemGroups.INGREDIENTS, SSD_SATA);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        PcMod.LOGGER.info("Registerin the Mod items for"+PcMod.MOD_ID);

        addItemsToItemGroup();
    }

}
