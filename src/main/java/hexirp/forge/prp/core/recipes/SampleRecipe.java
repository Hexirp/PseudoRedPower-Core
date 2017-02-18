package hexirp.forge.prp.core.recipes;

import hexirp.forge.Index;
import hexirp.forge.MinecraftItem;
import hexirp.forge.RegisterableLibrary;
import hexirp.forge.recipe.builder.RecipeBuilder;
import net.minecraft.init.Blocks;

// TODO:試験的コード
/**
 * サンプルレシピを表現する.
 *
 * @author Hexirp
 */
public class SampleRecipe extends RegisterableLibrary {
	/**
	 * アイテムをセットする.
	 *
	 * @param index アイテムの索引
	 */
	public SampleRecipe(final Index<MinecraftItem> index) {
		add(
		    new RecipeBuilder()
		        .product(new MinecraftItem(Blocks.bedrock), 1)
		        .order()
		        .add("AAA")
		        .add("AAA")
		        .add("AAA")
		        .to()
		        .put('A', index.lookup("silver_ingot"))
		        .to());
	}
}