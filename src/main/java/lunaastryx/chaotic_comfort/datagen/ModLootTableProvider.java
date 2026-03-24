package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TUFF_BRICKS);

        addDrop(ModBlocks.CHISELED_TUFF);
        addDrop(ModBlocks.CHISELED_TUFF_BRICKS);
    }
}
