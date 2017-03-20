package hexirp.forge.prp.core.ore;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
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
	@Setting
	public SilverIngot() {
		super();
		setUnlocalizedName(this.name());
		setRegistryName(this.name());
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@Getting
	public String name() {
		return "silver_ingot";
	}
}
