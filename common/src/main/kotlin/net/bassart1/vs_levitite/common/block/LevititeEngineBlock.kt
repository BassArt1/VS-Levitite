package net.bassart1.vs_levitite.common.block

import net.minecraft.core.Direction
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.HorizontalDirectionalBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.DirectionProperty
import net.minecraft.world.level.block.state.properties.IntegerProperty

class LevititeEngineBlock(properties: Properties) : Block(properties) {
    companion object {
        val FACING: DirectionProperty = HorizontalDirectionalBlock.FACING
        val LEVEL: IntegerProperty = IntegerProperty.create("level", 0, 4)
    }

    init {
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(LEVEL, 0))
    }

    override fun getStateForPlacement(blockPlaceContext: BlockPlaceContext): BlockState? {
        return this.defaultBlockState().setValue(FACING, blockPlaceContext.horizontalDirection.opposite)
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(FACING, LEVEL)
    }
}