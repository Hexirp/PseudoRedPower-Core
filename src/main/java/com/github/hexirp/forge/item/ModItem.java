package com.github.hexirp.forge.item;

import com.github.hexirp.forge.Loadable;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * このクラスは、Itemを表現する. 実際にはMinecraftのItemクラスをラップしている.
 *
 * @author Hexirp
 */
public class ModItem implements Loadable {
	/** アイテムの名前を保持する. */
	private final String name;
	
	/** アイテムを保持する. */
	private final net.minecraft.item.Item item;
	
	/**
	 * コントストラクタ. こちら側で名前を設定するので呼び出し側でする必要はない. 別途リソースを{@code resources}フォルダに置く必要がある.
	 *
	 * @param name スネークケースでの内部名を指定する. 例:{@code sample_item}
	 * @param item アイテム
	 */
	public ModItem(String name, Item item) {
		this.name = name;
		this.item = item.setUnlocalizedName(name);
	};
	
	@Override
	public void load(Environment env) {
		GameRegistry.registerItem(item, name);
		
		if (env.side() == Side.CLIENT) ModelLoader.setCustomModelResourceLocation(item, 0, env.location(name, "inventory"));
	}
}
