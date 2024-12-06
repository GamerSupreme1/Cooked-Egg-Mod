package github.gamersupreme1.cookedeggmod.init;
import github.gamersupreme1.cookedeggmod.CookedEgg;
import github.gamersupreme1.cookedeggmod.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
public class ItemInit {
    public static final Item COOKED_EGGS = register("cooked_egg", new Item(new Item.Settings().food(FoodList.EGG_FOOD_COMPONENT)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, CookedEgg.id(name), item);
    }
    public static void load() {}
}
