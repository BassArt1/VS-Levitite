package net.bassart1.vs_levitite.fabric.client

import net.fabricmc.api.ClientModInitializer
import net.bassart1.vs_levitite.client.VSLevititeModClient

/**
 * The fabric-side client initializer for the mod. Used for fabric-platform-specific code that runs on the client exclusively.
 */
class VSLevititeModFabricClient : ClientModInitializer {
    override fun onInitializeClient() {
        // Put anything initialized on fabric-side client here.
        VSLevititeModClient.initClient()
    }
}
