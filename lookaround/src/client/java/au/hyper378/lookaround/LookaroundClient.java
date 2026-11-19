package au.hyper378.lookaround;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;

public final class LookaroundClient implements ClientModInitializer {
    public static final String MOD_ID = "lookaround";

    private static final KeyMapping.Category CATEGORY =
            KeyMapping.Category.register(Identifier.fromNamespaceAndPath(MOD_ID, "controls"));

    public static final KeyMapping TOGGLE_FREECAM = KeyMappingHelper.registerKeyMapping(
            new KeyMapping(
                    "key.lookaround.toggle",
                    InputConstants.Type.KEYSYM,
                    InputConstants.KEY_F6,
                    CATEGORY
            )
    );

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (TOGGLE_FREECAM.consumeClick()) {
                if (client.player == null || client.level == null) {
                    continue;
                }

                /*
                 * Freecam controller will be connected here in the next build step.
                 * Keeping the keybind live first lets us verify that LOOKAROUND loads
                 * correctly on Minecraft 26.3 before adding the detached camera.
                 */
                client.player.displayClientMessage(
                        net.minecraft.network.chat.Component.literal(
                                "LOOKAROUND: toggle key detected"
                        ),
                        true
                );
            }
        });
    }
}
