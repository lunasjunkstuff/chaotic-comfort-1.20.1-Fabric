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

    public static final RegistryKey<PointOfInterestType> SOUND_POI_KEY = poikey("soundpoi");
    public static final PointOfInterestType SOUND_POI = registerPoi("soundpoi", Blocks.TERRACOTTA);

    public static final VillagerProfession GUY = registerProfession("guy", SOUND_POI_KEY);

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
        ChaoticComfort.LOGGER.info("Registering Villagers " + ChaoticComfort.MOD_ID);
    }
}
