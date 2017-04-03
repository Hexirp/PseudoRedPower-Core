package hexirp.forge.prp.core.ore;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.ExtendedItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 銀インゴットを表現する.
 *
 * @author Hexirp
 */
public final class SilverIngot extends Item implements ExtendedItem {
	/** コントストラクタ. */
	@Setting
	public SilverIngot() {
		super();
		setName();
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@Getting
	public String name() {
		return "silver_ingot";
	}
}
