package hexirp.forge.loadable.item;

import hexirp.annotation.Method.Command;
import hexirp.annotation.Method.Setting;
import hexirp.forge.Index;
import hexirp.forge.Loadable;
import hexirp.forge.MinecraftItem;
import hexirp.forge.loadable.Environment;
import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.NamedType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * {@link Loadable}である{@link Item}を表現する.
 *
 * @author Hexirp
 * @param <Type> 名前付きレシピ
 */
public class LoadableItem<Type extends Item & Named> extends NamedType<Type> implements Loadable {
	/**
	 * コントストラクタ.
	 *
	 * @param item スネークケースでの名前が付いたアイテム
	 */
	@Setting
	public LoadableItem(final Type item) {
		super(item);
	}
	
	@Override
	@Command
	public Index<MinecraftItem> load(final Environment env) {
		GameRegistry.registerItem(this.value(), this.name());
		
		new ItemResourceLocation<>(this.value()).set(env);
		
		return new Index<MinecraftItem>().put(
		    this.name(),
		    new MinecraftItem(this.value()));
	}
}
