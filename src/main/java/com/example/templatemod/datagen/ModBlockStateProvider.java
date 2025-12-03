package com.example.templatemod.datagen;

import com.example.templatemod.TemplateMod;
import com.example.templatemod.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TemplateMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // 単純なブロックはこれ1行でJSON生成完了
        blockWithItem(ModBlocks.RUBY_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}