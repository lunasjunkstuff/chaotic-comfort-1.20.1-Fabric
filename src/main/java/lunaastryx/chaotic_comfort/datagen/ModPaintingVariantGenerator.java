package lunaastryx.chaotic_comfort.datagen;

import lunaastryx.chaotic_comfort.datagen.provider.PaintingTagProvider;
import lunaastryx.chaotic_comfort.painting.ModPaintings;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantGenerator extends PaintingTagProvider {
        public ModPaintingVariantGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .add(ModPaintings.VICTORY);
    }
}
