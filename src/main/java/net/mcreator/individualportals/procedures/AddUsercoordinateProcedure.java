package net.mcreator.individualportals.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.individualportals.network.IndividualPortalsModVariables;

import java.util.HashMap;

public class AddUsercoordinateProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			String _setval = guistate.containsKey("text:coordinate") ? ((EditBox) guistate.get("text:coordinate")).getValue() : "";
			entity.getCapability(IndividualPortalsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Coordinates = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
