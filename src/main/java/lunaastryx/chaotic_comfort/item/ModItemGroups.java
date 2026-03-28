package lunaastryx.chaotic_comfort.item;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHAOTIC_COMFORT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChaoticComfort.MOD_ID, "chaotic_comfort"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chaotic_comfort"))
                    .icon(() -> new ItemStack(ModItems.ELECTRIC_GUITAR)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ELECTRIC_GUITAR);
                        entries.add(ModItems.GOLDEN_NETHER_STAR);
                        entries.add(ModItems.POMMES_ROT_WEISS_MUSIC_DISC);
                        entries.add(Blocks.TUFF);
                        entries.add(ModBlocks.TUFF_STAIRS);
                        entries.add(ModBlocks.TUFF_SLAB);
                        entries.add(ModBlocks.TUFF_WALL);
                        entries.add(ModBlocks.TUFF_BRICKS);
                        entries.add(ModBlocks.TUFF_BRICK_STAIRS);
                        entries.add(ModBlocks.TUFF_BRICK_SLAB);
                        entries.add(ModBlocks.TUFF_BRICK_WALL);
                        entries.add(ModBlocks.POLISHED_TUFF);
                        entries.add(ModBlocks.POLISHED_TUFF_STAIRS);
                        entries.add(ModBlocks.POLISHED_TUFF_SLAB);
                        entries.add(ModBlocks.POLISHED_TUFF_WALL);
                        entries.add(ModBlocks.CHISELED_TUFF);
                        entries.add(ModBlocks.CHISELED_TUFF_BRICKS);
                        entries.add(ModBlocks.PALE_OAK_PLANKS);
                        entries.add(ModBlocks.PALE_OAK_BUTTON);
                        entries.add(ModBlocks.PALE_OAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALE_OAK_FENCE);
                        entries.add(ModBlocks.PALE_OAK_FENCE_GATE);
                        entries.add(ModBlocks.PALE_OAK_STAIRS);
                        entries.add(ModBlocks.PALE_OAK_SLAB);
                        entries.add(ModBlocks.PALE_OAK_DOOR);
                        entries.add(ModBlocks.PALE_OAK_TRAPDOOR);
                        entries.add(ModBlocks.PALE_OAK_LEAVES);
                        entries.add(ModBlocks.PALE_OAK_LOG);
                        entries.add(ModBlocks.PALE_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALE_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_PALE_OAK_WOOD);
                        entries.add(ModBlocks.PALE_MOSS_BLOCK);
                        entries.add(ModBlocks.PALE_MOSS_CARPET);

                    }).build());


    public static void registerItemGroups() {
        ChaoticComfort.LOGGER.info("Registering Item Groups for " + ChaoticComfort.MOD_ID);
    }
}
