package com.github.hexirp.forge.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは、無機能Itemを表現する.
 *
 * @author Hexirp
 */
public class Item {
	/**
	 * アイテムを保持する.
	 */
	private final net.minecraft.item.Item item;
	
	/**
	 * アイテムの名前を保持する.
	 */
	private final String name;
	
	/**
	 * コントストラクタ. 別途リソースを{@code resources}フォルダに置く必要がある.
	 *
	 * @param name スネークケースでの内部名を指定する. 例:{@code sample_item}
	 * @param tab クリエイティブモードでのインベントリのタブのどこに入れられるかを指定する.
	 */
	public Item(String name, CreativeTabs tab) {
		this.name = name;
		this.item = new net.minecraft.item.Item()
		    .setUnlocalizedName(name)
		    .setCreativeTab(tab);
	};
	
	/**
	 * 自分自身を登録する.
	 *
	 * @param metadata 登録されるModの情報
	 * @param event 登録されるイベントの情報
	 */
	public void register(ModMetadata metadata, FMLPreInitializationEvent event) {
		GameRegistry.registerItem(item, name);
		
		if (event.getSide().isClient()) setResourceLocation(metadata);
	}
	
	/**
	 * 自分自身のモデルのリソースのファイルパスを登録する.
	 */
	private void setResourceLocation(ModMetadata metadata) {
		String path = metadata.modId + ":" + name;
		
		ModelResourceLocation location = new ModelResourceLocation(path, "inventory");
		
		ModelLoader.setCustomModelResourceLocation(item, 0, location);
	}
}
