package hexirp.forge.test;

import hexirp.annotation.Command;
import hexirp.annotation.Setting;
import hexirp.collection.OneField;
import hexirp.forge.Registerable;

/**
 * {@link Registerable}のテストのためのダミーを表す.
 *
 * @author Hexirp
 */
public class RegisterableMock extends OneField<RegisteringLog> implements Registerable {
	/**
	 * @param value {@link #register()}が呼び出された際のメッセージを送るための参照
	 */
	@Setting
	public RegisterableMock(final RegisteringLog value) {
		super(value);
	}
	
	@Override
	@Command
	public void register() {
		value.inc();
	}
}
