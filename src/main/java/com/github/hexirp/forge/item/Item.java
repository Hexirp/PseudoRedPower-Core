package com.github.hexirp.forge.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * このクラスは、無機能Itemを表現する.
 *
 * @author Hexirp
 */
public class Item {
	/**
	 * アイテムの名前を保持する.
	 */
	private final String name;
	
	/**
	 * コントストラクタ. 別途リソースを{@code resources}フォルダに置く必要がある.
	 *
	 * @param name スネークケースでの内部名を指定する. 例:{@code sample_item}
	 */
	public Item(String name) {
		this.name = name;
	};
	
	/**
	 * インスタンスを生成する.
	 *
	 * @return 生成されたアイテム.
	 */
	public net.minecraft.item.Item gen() {
		return new net.minecraft.item.Item().setUnlocalizedName(name);
	}
	
	/**
	 * 自分自身を読み込む.
	 *
	 * @param env アイテムが登録される環境
	 * @return インスタンス
	 */
	public net.minecraft.item.Item load(Environment env) {
		net.minecraft.item.Item item = gen();
		
		GameRegistry.registerItem(item, name);
		
		eee(env, item);
		
		return item;
	}

	private void eee(Environment env, net.minecraft.item.Item item) {
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(item, 0, location(env));
	}
	
	/**
	 * 自分自身のモデルのリソースのファイルパスを登録する.
	 */
	private ModelResourceLocation location(Environment env) {
		return new ModelResourceLocation(env.mod_id() + ":" + name, "inventory");
	}
}
