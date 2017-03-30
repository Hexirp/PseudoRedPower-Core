package hexirp.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Setting;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;

/**
 * {@link ShapedRecipeMaterialMap}の設定を行う段階を表す.
 *
 * @author Hexirp
 * @param <T1> 受け継いだ値
 * @param <T3> 生成物
 */
public abstract class SettingMaterialPhase<T1, T3> extends MaplikePhase<T1, ShapedRecipeMaterialMap, T3, Character, MinecraftItem> {
	/**
	 * @param stack これまでの値の記録
	 */
	@Setting
	public SettingMaterialPhase(final T1 stack) {
		super(stack, new ShapedRecipeMaterialMap());
	}
	
	@Override
	@Chaining
	public SettingMaterialPhase<T1, T3> set(final Character c, final MinecraftItem i) {
		second.put(c, i);
		return this;
	}
}
