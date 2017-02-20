package hexirp.forge.prp.core.items;

import hexirp.forge.loadable.Named;
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
}