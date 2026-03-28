package lunaastryx.chaotic_comfort;

import lunaastryx.chaotic_comfort.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ChaoticComfortClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALE_OAK_LEAVES, RenderLayer.getCutout());

    }
}
