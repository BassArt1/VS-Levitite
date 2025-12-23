package net.bassart1.vs_levitite.forge

import dev.architectury.platform.forge.EventBuses
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.loading.FMLEnvironment
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import net.bassart1.vs_levitite.VSLevititeMod
import net.bassart1.vs_levitite.forge.client.VSLevititeModForgeClient

@Mod(VSLevititeMod.MOD_ID)
class VSLevititeModForge {

    //Deferred Registries
    private val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VSLevititeMod.MOD_ID)
    private val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VSLevititeMod.MOD_ID)
    //private val ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VSLevititeMod.MOD_ID)
    //private val BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VSLevititeMod.MOD_ID)

    // Put RegistryObjects here:


    // end of RegistryObjects

    init {
        val modBus = Bus.MOD.bus().get()
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(VSLevititeMod.MOD_ID, modBus)

        modBus.addListener(::init)
        if (FMLEnvironment.dist.isClient) {
            modBus.addListener(VSLevititeModForgeClient.Companion::clientInit)
        }

        // Run our common setup.
        VSLevititeMod.init()
    }

    // Helper function, taken from VS2.

    companion object {
        @JvmStatic
        fun init (event: FMLCommonSetupEvent) {
            // Put anything initialized on forge-side here.
        }
    }
}
