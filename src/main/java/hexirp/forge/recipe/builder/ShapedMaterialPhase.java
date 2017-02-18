package hexirp.forge.recipe.builder;

import hexirp.builder.SimpleTransitional;
import hexirp.builder.StackedPhase;
import hexirp.forge.MinecraftItem;
import hexirp.forge.recipe.ShapedRecipe;
import hexirp.forge.recipe.ShapedRecipeMaterialMap;
import hexirp.forge.recipe.ShapedRecipeOrder;

/**
 * 対応関係の定義の段階を表現する.
 *
 * @author Hexirp
 */
public class ShapedMaterialPhase
    extends
        StackedPhase<ShapedOrderPhase>
    implements
        SimpleTransitional<ShapedRecipe> {
	/** 対応関係. */
	private final ShapedRecipeMaterialMap map = new ShapedRecipeMaterialMap();
	
	/**
	 * Setter.
	 *
	 * @param order {@link #previous}
	 */
	public ShapedMaterialPhase(final ShapedOrderPhase order) {
		super(order);
	}
	
	/**
	 * 対応関係を追加する.
	 *
	 * @param key アルファベット大文字
	 * @param value 材料
	 * @return メソッドチェーン用
	 * @see ShapedRecipeMaterialMap#put(Character, MinecraftItem)
	 */
	public ShapedMaterialPhase put(final Character key, final MinecraftItem value) {
		map.put(key, value);
		return this;
	}
	
	@Override
	public ShapedRecipe to() {
		return new ShapedRecipe(previous().previous().previous(), new ShapedRecipeOrder(previous().order(), map));
	}
}