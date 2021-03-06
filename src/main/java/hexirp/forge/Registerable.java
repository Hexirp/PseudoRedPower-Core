package hexirp.forge;

import hexirp.annotation.Command;

/**
 * 自分自身をゲームに登録することが出来る事を表現する.
 *
 * @author Hexirp
 */
@FunctionalInterface
public interface Registerable {
	/** 自分自身をゲームに登録する. */
	@Command
	public void register();
}
