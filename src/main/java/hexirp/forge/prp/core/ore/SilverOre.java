package hexirp.forge.prp.core.ore;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.Named;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * 銀の鉱石を表現する.
 *
 * @author Hexirp
 */
public class SilverOre extends Block implements Named {
	/** コントストラクタ. */
	@Setting
	public SilverOre() {
		super(Material.rock);
		setUnlocalizedName(this.name());
		setRegistryName(this.name());
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	@Getting
	public String name() {
		return "silver_ore";
	}
}
