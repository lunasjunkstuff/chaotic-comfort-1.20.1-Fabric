package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output,  CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TUFF_BRICKS)
                .add(ModBlocks.TUFF_WALL)
                .add(ModBlocks.TUFF_STAIRS)
                .add(ModBlocks.TUFF_SLAB)
                .add(ModBlocks.TUFF_BRICKS)
                .add(ModBlocks.TUFF_BRICK_STAIRS)
                .add(ModBlocks.TUFF_BRICK_SLAB)
                .add(ModBlocks.TUFF_BRICK_WALL)
                .add(ModBlocks.POLISHED_TUFF)
                .add(ModBlocks.POLISHED_TUFF_SLAB)
                .add(ModBlocks.POLISHED_TUFF_WALL)
                .add(ModBlocks.POLISHED_TUFF_STAIRS)
                .add(ModBlocks.CHISELED_TUFF)
                .add(ModBlocks.CHISELED_TUFF_BRICKS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.TUFF_WALL)
                .add(ModBlocks.POLISHED_TUFF_WALL)
                .add(ModBlocks.TUFF_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.TUFF_SLAB)
                .add(ModBlocks.TUFF_BRICK_SLAB)
                .add(ModBlocks.POLISHED_TUFF_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.TUFF_STAIRS)
                .add(ModBlocks.TUFF_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_TUFF_STAIRS);

    }
}
