package net.bassart1.vs_levitite.register

import dev.architectury.registry.CreativeTabRegistry
import dev.architectury.registry.registries.DeferredRegister
import dev.architectury.registry.registries.RegistrySupplier
import net.bassart1.vs_levitite.VSLevititeMod
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack


class ModCreativeTab {
    companion object{
        var TABS: DeferredRegister<CreativeModeTab> = DeferredRegister.create(VSLevititeMod.MOD_ID, Registries.CREATIVE_MODE_TAB)

        var LEVITITE_TAB: RegistrySupplier<CreativeModeTab> = TABS.register(ResourceLocation(VSLevititeMod.MOD_ID, "vs_levitite_tab"),
            { CreativeTabRegistry.create(
                Component.translatable("creativetab.vs_levitite"),
                { ItemStack(ModItems.LEVITITE_CORE.get())}
            )})
    }
}