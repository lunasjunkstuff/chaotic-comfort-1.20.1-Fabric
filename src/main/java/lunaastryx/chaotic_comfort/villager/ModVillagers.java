package lunaastryx.chaotic_comfort.villager;

import com.google.common.collect.ImmutableSet;
import lunaastryx.chaotic_comfort.ChaoticComfort;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> GUY_POI_KEY = poikey("guypoi");
    public static final PointOfInterestType GUY_POI = registerPoi("guypoi", Blocks.TERRACOTTA);

    public static final VillagerProfession GUY = registerProfession("guy", GUY_POI_KEY);

    public static final RegistryKey<PointOfInterestType> FLORIST_POI_KEY = poikey("floristpoi");
    public static final PointOfInterestType FLORIST_POI = registerPoi("floristpoi", Blocks.DECORATED_POT);

    public static final VillagerProfession FLORIST = registerProfession("florist", FLORIST_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(ChaoticComfort.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_MASON));
    }





    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(ChaoticComfort.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poikey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(ChaoticComfort.MOD_ID, name));
    }

    public static void registerVillagers() {
        ChaoticComfort.LOGGER.info("Registering Villager J-words for " + ChaoticComfort.MOD_ID);
    }
}
