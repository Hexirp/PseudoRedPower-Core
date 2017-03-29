package hexirp.forge.recipe.builder;

import hexirp.annotation.Chaining;
import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import hexirp.builder.ListingPhase;
import hexirp.collection.GettableTwoFields;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapedRecipeAbstractOrder;

/**
 * 並び順を定義する段階を表現する.
 *
 * @author Hexirp
 */
public class OrderPhase extends ListingPhase<GettableTwoFields<MinecraftItem, Integer>, ShapedRecipeAbstractOrder, MaterialPhase, String> {
	/**
	 * @param stack これまでの段階の記録
	 */
	@Setting
	public OrderPhase(final GettableTwoFields<MinecraftItem, Integer> stack) {
		super(stack, new ShapedRecipeAbstractOrder());
	}
	
	@Override
	@Chaining
	public OrderPhase set(final String element) {
		second.add(element);
		return this;
	}
	
	@Override
	@Getting
	public MaterialPhase to() {
		return new MaterialPhase(this);
	}
}
