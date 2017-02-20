package hexirp.forge.prp.core.blocks;

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
	public SilverOre() {
		super(Material.rock);
		setUnlocalizedName(name());
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public String name() {
		return "silver_ore";
	}
}