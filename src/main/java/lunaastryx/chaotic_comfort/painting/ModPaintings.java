package lunaastryx.chaotic_comfort.painting;

import lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {

    public static final PaintingVariant VICTORY = registerPainting("victory",new PaintingVariant(64, 48));

    public static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(ChaoticComfort.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
    }
}
