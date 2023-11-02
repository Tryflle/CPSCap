package me.tryfle.cpscap.command

import me.tryfle.cpscap.main.Config
import net.minecraft.client.Minecraft
import net.weavemc.loader.api.command.Command
import net.minecraft.util.ChatComponentText
import net.minecraft.util.EnumChatFormatting

class CPSCapCommand : Command("cpsmax") {
    override fun handle(args: Array<out String>) {
        if (args.size == 1) {
            Config.cap = args[0].toInt()
            Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(EnumChatFormatting.GREEN.toString() + "CPS Cap set to ${Config.cap}"))
        } else Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(EnumChatFormatting.RED.toString() + "Invalid syntax, usage: /cpsmax <number>"))
    }
}
