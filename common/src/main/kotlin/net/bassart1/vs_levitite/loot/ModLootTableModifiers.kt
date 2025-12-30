package net.bassart1.vs_levitite.loot

import dev.architectury.event.events.common.LootEvent
import net.bassart1.vs_levitite.register.ModItems
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue

class ModLootTableModifiers {
    init {
        LootEvent.MODIFY_LOOT_TABLE.register { _, id, context, builtin ->

            fun addPool(lootTableLoc: String, pool: LootPool) {
                val lootTable: ResourceLocation = ResourceLocation(lootTableLoc)
                if (builtin && (lootTable == id)) {
                    context.addPool(pool)
                }
            }

            addPool("minecraft:entities/shulker", levititeCorePool().build())

        }
    }

    private fun levititeCorePool(): LootPool.Builder = (LootPool.lootPool(
    ).`when`(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.1f,0.05f)
    ).setRolls(ConstantValue.exactly(1.0f)).setBonusRolls(ConstantValue.exactly(0.0f)
    ).add(LootItem.lootTableItem(ModItems.LEVITITE_CORE.get())))
}