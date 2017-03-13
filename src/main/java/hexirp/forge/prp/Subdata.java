package hexirp.forge.prp;

import hexirp.annotation.Method.Command;
import hexirp.forge.ModData;
import net.minecraftforge.fml.common.ModMetadata;

/**
 * PRP-Coreの細かい情報を定義する.
 *
 * @author Hexirp
 */
final class Subdata implements ModData {
	/** MODの解説. */
	private static final String DESCRIPTION = "PseudoRedPower-Core is the salvaged RedPower2 to 1.8.9 or later. So, respect the author of RedPower2 if you think that this MOD is interesting.";
	
	/** MODのホームページ. */
	private static final String URL = "https://github.com/Hexirp/PseudoRedPower-Core";
	
	@Override
	@Command
	public void set(final ModMetadata metadata) {
		metadata.description = DESCRIPTION;
		metadata.url = URL;
	}
}
