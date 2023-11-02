package me.tryfle.cpscap

import me.tryfle.cpscap.command.CPSCapCommand
import me.tryfle.cpscap.command.CPSToggleCommand
import me.tryfle.cpscap.main.Main
import net.weavemc.loader.api.ModInitializer
import net.weavemc.loader.api.command.CommandBus
import net.weavemc.loader.api.event.EventBus

//after writing this mod i realized i should probably start writing my mods in java again because i suck at kotlin
class Mod: ModInitializer {

    override fun preInit() {
        println("[CPSCap] Initializing..")
        CommandBus.register(CPSCapCommand())
        CommandBus.register(CPSToggleCommand())
        EventBus.subscribe(Main())
    }
}