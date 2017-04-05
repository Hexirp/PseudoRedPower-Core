package hexirp.forge.test;

import hexirp.forge.Registerable;

/**
 * {@link Registerable}のテストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class RegisterableMock implements Registerable {
	/** 送信先. */
	public final RegistringLog host;
	
	/**
	 * @param host {@link #register()}が呼び出された際のメッセージを送るための参照
	 */
	public RegisterableMock(final RegistringLog host) {
		this.host = host;
	}
	
	@Override
	public void register() {
		host.inc();
	}
}
