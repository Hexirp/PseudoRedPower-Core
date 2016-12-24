package com.github.hexirp.minecraft.prp.core;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは、PRP-Coreで追加されるアイテム群を定義する.
 *
 * @author Hexirp
 */
public class Items {
	/**
	 * 情報を取り出すためにEventを保持する.
	 */
	private FMLPreInitializationEvent event;
	
	/**
	 * Eventを内部に保持するためのコントストラクタ.
	 *
	 * @param e 初期化前処理イベント
	 */
	public Items(FMLPreInitializationEvent e) {
		event = e;
	}
	
	private Item sampleitem;
	private String sampleitem_system_name = "SampleItem";
	private String sampleitem_resource_name = "sampleitem";
	
	public void add() {
		sampleitem = new Item()
		    .setUnlocalizedName(sampleitem_system_name)
		    .setCreativeTab(CreativeTabs.tabMaterials)
		    .setMaxStackSize(64);
			
		GameRegistry.registerItem(sampleitem, sampleitem_resource_name);
		
		if (event.getSide().isClient()) {
			ModelLoader.setCustomModelResourceLocation(
			    sampleitem,
			    0,
			    new ModelResourceLocation(
			        Main.MOD_ID + ":" + sampleitem_resource_name,
			        "inventory"));
		}
	}
}
