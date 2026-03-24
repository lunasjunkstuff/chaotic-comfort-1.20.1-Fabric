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
        addDrop(ModBlocks.TUFF_STAIRS);
        addDrop(ModBlocks.TUFF_SLAB);
        addDrop(ModBlocks.TUFF_WALL);

        addDrop(ModBlocks.TUFF_BRICKS);
        addDrop(ModBlocks.TUFF_BRICK_SLAB);
        addDrop(ModBlocks.TUFF_BRICK_STAIRS);
        addDrop(ModBlocks.TUFF_BRICK_WALL);

        addDrop(ModBlocks.POLISHED_TUFF);
        addDrop(ModBlocks.POLISHED_TUFF_WALL);
        addDrop(ModBlocks.POLISHED_TUFF_STAIRS);
        addDrop(ModBlocks.POLISHED_TUFF_SLAB);

        addDrop(ModBlocks.CHISELED_TUFF);
        addDrop(ModBlocks.CHISELED_TUFF_BRICKS);
    }
}
