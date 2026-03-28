package lunaastryx.chaotic_comfort.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {

        });
    }
}
