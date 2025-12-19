package meteordevelopment.meteorclient.systems.modules.player;

import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;
import net.minecraft.world.GameMode;

public class CreativeMode extends Module {
    public CreativeMode() {
        super(Categories.Player, "creative-mode", "Locally sets your gamemode to creative.");
    }

    @Override
    public void onActivate() {
        if (mc.interactionManager != null) {
            mc.interactionManager.setGameMode(GameMode.CREATIVE);
        }
    }

    @Override
    public void onDeactivate() {
        if (mc.interactionManager != null) {
            mc.interactionManager.setGameMode(GameMode.SURVIVAL);
        }
    }
}
