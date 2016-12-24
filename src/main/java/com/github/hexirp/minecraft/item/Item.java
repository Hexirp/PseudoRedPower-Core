package com.github.hexirp.minecraft.item;

import com.github.hexirp.minecraft.Registerable;
import com.github.hexirp.minecraft.prp.core.Main;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * このクラスは、無機能Itemを表現する.
 *
 * @author Hexirp
 */
public class Item implements Registerable {
	/**
	 * 情報を取り出すためにEventを保持する.
	 */
	private FMLPreInitializationEvent event;
	
	/**
	 * 良く使うためアイテムの名前を保持する.
	 */
	private final String name;
	
	/**
	 * アイテムを保持する.
	 */
	private final net.minecraft.item.Item item;
	
	/**
	 * コントストラクタ. 名前はシステム内部名でありゲーム本体では表示されないため、 別途{@code lang}ファイルを{@code resources}フォルダに置く必要がある.
	 * モデルのリソースは{@code asset\prp\core\\models\item\name}に置く.
	 *
	 * @param e 初期化前処理イベント
	 * @param name スネークケースでの内部名を指定する. 例:{@code sample_item}
	 * @param tab クリエイティブモードでのインベントリのタブのどこに入れられるかを指定する.
	 */
	public Item(FMLPreInitializationEvent e, String name, CreativeTabs tab) {
		this.event = e;
		this.name = name;
		this.item = new net.minecraft.item.Item()
		    .setUnlocalizedName(name)
		    .setCreativeTab(tab);
	};
	
	@Override
	public void registry() {
		GameRegistry.registerItem(item, name);
		
		if (event.getSide().isClient()) setResourceLocation();
	}
	
	/**
	 * 自分自身のモデルのリソースのファイルパスを登録する.
	 */
	private void setResourceLocation() {
		String path = Main.MOD_ID + ":" + name;
		
		ModelResourceLocation location = new ModelResourceLocation(path, "inventory");
		
		ModelLoader.setCustomModelResourceLocation(item, 0, location);
	}
}
