package me.tryfle.cpscap.main

import net.minecraft.client.Minecraft
import net.weavemc.loader.api.event.MouseEvent
import net.weavemc.loader.api.event.SubscribeEvent
import net.weavemc.loader.api.event.TickEvent
@Suppress("unused")
class Main {
    private var time: Long = 0
    private var list = mutableListOf<Long>()
    private var shouldAdd = true


    @SubscribeEvent
    fun onClick(event: MouseEvent) {
        if (Config.isToggled && Minecraft.getMinecraft().thePlayer != null) {
            if (event.button == 0) {
                if (shouldAdd) list += System.currentTimeMillis()
                if ((Config.cap *2) < list.size) {
                    event.cancelled = true
                    shouldAdd = false
                } else shouldAdd = true
            }
        }
    }


    @SubscribeEvent
    fun timer(event: TickEvent) {
        if (Minecraft.getMinecraft().thePlayer != null) {
            list = list.filter { System.currentTimeMillis() - it < 1000 }.toMutableList()
        }
    }
}
