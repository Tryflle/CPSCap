package me.tryfle.cpscap.command

import me.tryfle.cpscap.main.Config
import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText
import net.minecraft.util.EnumChatFormatting
import net.weavemc.loader.api.command.Command

class CPSToggleCommand: Command("cpscap") {
    override fun handle(args: Array<out String>) {
        Config.isToggled = !Config.isToggled
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(EnumChatFormatting.GREEN.toString() + "CPS cap has been" + if (Config.isToggled) " enabled" else " disabled"))
    }
}