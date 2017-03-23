package hexirp.forge.loadable;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.TwoFields;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * ロード可能なブロックを表現する.
 *
 * @author Hexirp
 */
public class LoadableBlock extends TwoFields<Block, String> implements Loadable {
	/**
	 * @param first 名前付きブロック
	 * @param second スネークケースでの名前
	 */
	@Setting
	public LoadableBlock(final Block first, final String second) {
		super(first, second);
	}
	
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerBlock(first, second); // ブロックを登録する
		
		new ItemResourceLocation(Item.getItemFromBlock(first), second).set(env); // ブロックのアイテム状態のリソースを登録する
		
		return new Index<MinecraftItem>().put(
		    second,
		    new MinecraftItem(first));
	}
}
