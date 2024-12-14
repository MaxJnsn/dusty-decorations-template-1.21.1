package com.maxjnsn.dustydecorations.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CustomBarrelBlock extends Block {

    // Define the filling and wall shapes
    private static final VoxelShape BARREL_FILLING = Block.createCuboidShape(2, 0, 2, 14, 13, 14); // 12x12x14 barrel filling
    private static final VoxelShape NORTH_WALL = Block.createCuboidShape(0, 0, 0, 16, 16, 2); // 16x16x2 north wall
    private static final VoxelShape SOUTH_WALL = Block.createCuboidShape(0, 0, 14, 16, 16, 16); // 16x16x2 south wall
    private static final VoxelShape EAST_WALL = Block.createCuboidShape(14, 0, 0, 16, 16, 16); // 2x16x16 east wall
    private static final VoxelShape WEST_WALL = Block.createCuboidShape(0, 0, 0, 2, 16, 16); // 2x16x16 west wall

    // Combine all shapes into one final shape
    private static final VoxelShape BARREL_SHAPE = VoxelShapes.union(
            BARREL_FILLING,
            NORTH_WALL,
            SOUTH_WALL,
            EAST_WALL,
            WEST_WALL
    );

    public CustomBarrelBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BARREL_SHAPE; // Return the combined shape
    }
}
