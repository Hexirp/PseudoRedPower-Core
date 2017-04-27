package hexirp.forge;

import hexirp.annotation.Chaining;
import hexirp.annotation.Command;

/**
 * 要素一つ一つを登録することが出来る{@link Library}を表現する.
 *
 * @author Hexirp
 */
public class RegisterableLibrary extends Library<Registerable> implements Registerable {
	@Override
	@Command
	public void register() {
		forEach(recipe -> recipe.register());
	}
	
	@Override
	@Chaining
	public RegisterableLibrary add(final Registerable element) {
		super.add(element);
		return this;
	}
}
