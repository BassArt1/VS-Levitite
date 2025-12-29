package net.bassart1.vs_levitite.register

import dev.architectury.registry.registries.DeferredRegister
import dev.architectury.registry.registries.Registrar
import dev.architectury.registry.registries.RegistrySupplier
import net.bassart1.vs_levitite.VSLevititeMod
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockBehaviour

class ModBlocks {
    companion object{
        var BLOCKS: DeferredRegister<Block> = DeferredRegister.create(VSLevititeMod.MOD_ID, Registries.BLOCK)
        var BLOCK_REGISTRAR: Registrar<Block> = BLOCKS.getRegistrar()

        var LEVITITE_ENGINE: RegistrySupplier<Block> = BLOCK_REGISTRAR.register(ResourceLocation(VSLevititeMod.MOD_ID, "levitite_engine"),
            {Block(BlockBehaviour.Properties.copy(Blocks.BLAST_FURNACE))} )
    }
}