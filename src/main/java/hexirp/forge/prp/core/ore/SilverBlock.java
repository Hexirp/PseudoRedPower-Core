package hexirp.forge.prp.core.ore;

import hexirp.annotation.NonNull;
import hexirp.annotation.Setting;
import hexirp.forge.loadable.ExtendedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * 銀ブロックを表現する.
 *
 * @author Hexirp
 */
public class SilverBlock extends Block implements ExtendedBlock {
	/** Setiing. */
	@Setting
	public SilverBlock() {
		super(Material.iron);
		setName();
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public @NonNull String name() {
		return "silver_block";
	}
	
}
