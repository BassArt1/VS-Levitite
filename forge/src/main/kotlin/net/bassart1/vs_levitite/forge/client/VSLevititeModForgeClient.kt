package net.bassart1.vs_levitite.forge.client

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.bassart1.vs_levitite.client.VSLevititeModClient

class VSLevititeModForgeClient {
    companion object {
        @JvmStatic
        fun clientInit(event: FMLClientSetupEvent) {
            // Put anything initialized on forge-side client here.
            VSLevititeModClient.initClient()
        }
    }
}
