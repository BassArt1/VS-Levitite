package net.bassart1.vs_levitite

import net.bassart1.vs_levitite.register.ModBlocks
import net.bassart1.vs_levitite.register.ModCreativeTab
import net.bassart1.vs_levitite.register.ModItems

/**
 * The common static object that represents the mod. Referenced by both fabric and forge for initialization.
 */
object VSLevititeMod {
    const val MOD_ID = "vs_levitite"

    @JvmStatic
    fun init() {
        // Write common init code here.

        //Register
        ModCreativeTab()
        ModBlocks()
        ModItems()
    }
}
