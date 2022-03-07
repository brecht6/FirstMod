package net.brecht6.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.brecht6.firstmod.FirstMod;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FRUIT)));

    public static final Item LEMON = registerItem("lemon",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.FRUIT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
            FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);
        }
}
