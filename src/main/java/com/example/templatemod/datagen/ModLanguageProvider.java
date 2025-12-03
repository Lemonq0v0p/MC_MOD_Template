package com.example.templatemod.datagen;

import com.example.templatemod.TemplateMod;
import com.example.templatemod.init.ModBlocks;
import com.example.templatemod.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, TemplateMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        String locale = this.getName().replace("Languages: ", "");

        if (locale.equals("en_us")) {
            add(ModItems.RUBY.get(), "Ruby");
            add(ModBlocks.RUBY_BLOCK.get(), "Ruby Block");
            add("creativetab.course_tab", "Template Tab");
        } else if (locale.equals("ja_jp")) {
            add(ModItems.RUBY.get(), "ルビー");
            add(ModBlocks.RUBY_BLOCK.get(), "ルビーブロック");
            add("creativetab.course_tab", "テンプレートタブ");
        }
    }
}