package com.github.hexirp.forge.item;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * このクラスは、Itemを表現する. 実際にはMinecraftのItemクラスをラップしている.
 *
 * @author Hexirp
 */
public class ModItem {
	/** アイテムの名前を保持する. */
	private final String name;
	
	/** アイテムを保持する. */
	private final net.minecraft.item.Item item;
	
	/**
	 * コントストラクタ. こちら側でするので呼び出し側で名前を設定する必要はない. 別途リソースを{@code resources}フォルダに置く必要がある.
	 *
	 * @param name スネークケースでの内部名を指定する. 例:{@code sample_item}
	 * @param item アイテム
	 */
	public ModItem(String name, Item item) {
		this.name = name;
		this.item = item.setUnlocalizedName(name);
	};
	
	/**
	 * 自分自身を読み込む.
	 *
	 * @param env アイテムが登録される環境
	 */
	public void load(Environment env) {
		GameRegistry.registerItem(item, name);
		
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(item, 0, env.location(name, "inventory"));
	}
}
