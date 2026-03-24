package lunaastryx.chaotic_comfort.block;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));

    public static final Block CHISELED_TUFF = registerBlock("chiseled_tuff",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block CHISELED_TUFF_BRICKS = registerBlock("chiseled_tuff_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ChaoticComfort.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(ChaoticComfort.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ChaoticComfort.LOGGER.info("Registering ModBlocks for " + ChaoticComfort.MOD_ID);
    }
}
