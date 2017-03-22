package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.Phase;
import hexirp.collection.GettableTwoFields;
import hexirp.collection.Unit;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * 並び順を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OrderPhase extends Phase<GettableTwoFields<MinecraftItem, Integer>, ShapedRecipeAbstractOrder, MaterialPhase, Unit> {
	/**
	 * @param stack これまでの段階の記録
	 */
	@Setting
	public OrderPhase(final GettableTwoFields<MinecraftItem, Integer> stack) {
		super(stack, new ShapedRecipeAbstractOrder());
	}
	
	/**
	 * 要素を追加する.
	 *
	 * @param element 要素
	 * @return this
	 */
	@Chaining
	public OrderPhase set(final String element) {
		second.add(element);
		return this;
	}
	
	@Override
	@Getting
	public MaterialPhase to(final Unit value) {
		return new MaterialPhase(this);
	}
}
