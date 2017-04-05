package hexirp.forge.test;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.forge.Registerable;

/**
 * {@link Registerable}のテストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class RegisterableMock implements Registerable {
	/** 送信先. */
	public final RegisteringLog host;
	
	/**
	 * @param host {@link #register()}が呼び出された際のメッセージを送るための参照
	 */
	@Setting
	public RegisterableMock(final RegisteringLog host) {
		this.host = host;
	}
	
	@Override
	@Command
	public void register() {
		host.inc();
	}
}
