package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import lunaastryx.chaotic_comfort.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_BRICKS);

        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_TUFF);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_TUFF_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ELECTRIC_GUITAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_NETHER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.POMMES_ROT_WEISS_MUSIC_DISC, Models.GENERATED);
    }
}
