package net.bassart1.vs_levitite.register

import dev.architectury.registry.registries.DeferredRegister
import dev.architectury.registry.registries.Registrar
import dev.architectury.registry.registries.RegistrySupplier
import net.bassart1.vs_levitite.VSLevititeMod
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item

class ModItems {
    companion object{
        var ITEMS: DeferredRegister<Item> = DeferredRegister.create(VSLevititeMod.MOD_ID, Registries.ITEM)
        var ITEM_REGISTRAR: Registrar<Item> = ITEMS.getRegistrar()

        var LEVITITE_CORE: RegistrySupplier<Item> = ITEM_REGISTRAR.register(ResourceLocation(VSLevititeMod.MOD_ID, "levitite_core"),
            { Item(Item.Properties().`arch$tab`(ModCreativeTab.LEVITITE_TAB)) } )
        var LEVITITE_ENGINE: RegistrySupplier<Item> = ITEM_REGISTRAR.register(ResourceLocation(VSLevititeMod.MOD_ID, "levitite_engine"),
            { BlockItem(ModBlocks.LEVITITE_ENGINE.get(),Item.Properties().`arch$tab`(ModCreativeTab.LEVITITE_TAB)) } )
    }
}