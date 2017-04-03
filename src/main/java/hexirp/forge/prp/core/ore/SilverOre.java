package hexirp.forge.prp.core.ore;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.ExtendedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * 銀の鉱石を表現する.
 *
 * @author Hexirp
 */
public final class SilverOre extends Block implements ExtendedBlock {
	/** コントストラクタ. */
	@Setting
	public SilverOre() {
		super(Material.rock);
		setName();
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	@Getting
	public String name() {
		return "silver_ore";
	}
}
