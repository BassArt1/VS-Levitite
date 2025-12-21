package net.bassart1.vs_levitite.fabric

import net.fabricmc.api.ModInitializer
import net.bassart1.vs_levitite.VSLevititeMod

/**
 * The fabric-side initializer for the mod. Used for fabric-platform-specific code.
 */
class VSLevititeModFabric : ModInitializer {
    override fun onInitialize() {
        // Put anything initialized on fabric-side here, such as platform-specific registries.
        VSLevititeMod.init()
    }
}
