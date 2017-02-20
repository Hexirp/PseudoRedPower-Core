package hexirp.forge.prp.core.items;

import hexirp.forge.loadable.Named;
import hexirp.forge.loadable.item.LoadableItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 銀インゴットを表現する.
 *
 * @author Hexirp
 */
public class SilverIngot extends Item implements Named {
	/** コントストラクタ. */
	public SilverIngot() {
		super();
		setUnlocalizedName(this.name());
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String name() {
		return "silver_ingot";
	}
	
	/**
	 * ロードが可能であるようにする.
	 *
	 * @return ロード可能なアイテム
	 */
	public LoadableItem toLoadable() {
		return new LoadableItem(this);
	}
}