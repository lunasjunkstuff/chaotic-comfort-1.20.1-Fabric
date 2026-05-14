/*package lunaastryx.chaotic_comfort.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    public static final Identifier CAT_MORNING_GIFT_ID =
            new Identifier("minecraft", "gameplay/cat_morning_gift");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {
            if(CAT_MORNING_GIFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls()
            }
        });
    }
} */