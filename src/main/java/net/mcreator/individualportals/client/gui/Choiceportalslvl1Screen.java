
package net.mcreator.individualportals.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.Minecraft;

import net.mcreator.individualportals.world.inventory.Choiceportalslvl1Menu;
import net.mcreator.individualportals.network.Choiceportalslvl1ButtonMessage;
import net.mcreator.individualportals.IndividualPortalsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Choiceportalslvl1Screen extends AbstractContainerScreen<Choiceportalslvl1Menu> {
	private final static HashMap<String, Object> guistate = Choiceportalslvl1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox IdDimension;
	EditBox coordinate;
	ImageButton imagebutton_button_textures;
	ImageButton imagebutton_button_textures1;

	public Choiceportalslvl1Screen(Choiceportalslvl1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		IdDimension.render(ms, mouseX, mouseY, partialTicks);
		coordinate.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("individual_portals:textures/screens/gui_portal_choice.png"));
		this.blit(ms, this.leftPos + -68, this.topPos + -22, 0, 0, 300, 256, 300, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (IdDimension.isFocused())
			return IdDimension.keyPressed(key, b, c);
		if (coordinate.isFocused())
			return coordinate.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		IdDimension.tick();
		coordinate.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		IdDimension = new EditBox(this.font, this.leftPos + -47, this.topPos + 10, 120, 20, new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.IdDimension")) {
			{
				setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.IdDimension").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.IdDimension").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.IdDimension").getString());
				else
					setSuggestion(null);
			}
		};
		IdDimension.setMaxLength(32767);
		guistate.put("text:IdDimension", IdDimension);
		this.addWidget(this.IdDimension);
		coordinate = new EditBox(this.font, this.leftPos + -47, this.topPos + 73, 120, 20, new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.coordinate")) {
			{
				setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.coordinate").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.coordinate").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(new TranslatableComponent("gui.individual_portals.choiceportalslvl_1.coordinate").getString());
				else
					setSuggestion(null);
			}
		};
		coordinate.setMaxLength(32767);
		guistate.put("text:coordinate", coordinate);
		this.addWidget(this.coordinate);
		imagebutton_button_textures = new ImageButton(this.leftPos + -45, this.topPos + 99, 115, 23, 0, 0, 23, new ResourceLocation("individual_portals:textures/screens/atlas/imagebutton_button_textures.png"), 115, 46, e -> {
			if (true) {
				IndividualPortalsMod.PACKET_HANDLER.sendToServer(new Choiceportalslvl1ButtonMessage(0, x, y, z));
				Choiceportalslvl1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_textures", imagebutton_button_textures);
		this.addRenderableWidget(imagebutton_button_textures);
		imagebutton_button_textures1 = new ImageButton(this.leftPos + -45, this.topPos + 36, 115, 23, 0, 0, 23, new ResourceLocation("individual_portals:textures/screens/atlas/imagebutton_button_textures1.png"), 115, 46, e -> {
			if (true) {
				IndividualPortalsMod.PACKET_HANDLER.sendToServer(new Choiceportalslvl1ButtonMessage(1, x, y, z));
				Choiceportalslvl1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button_textures1", imagebutton_button_textures1);
		this.addRenderableWidget(imagebutton_button_textures1);
	}
}
