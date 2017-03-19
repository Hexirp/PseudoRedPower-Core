package hexirp.forge.loadable;

import hexirp.annotation.Getting;
import hexirp.annotation.Setting;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * アイテムが登録される環境を表現する.
 *
 * @author Hexirp
 */
public class Environment {
	/** アイテムが登録されるMODの情報. */
	private final ModMetadata metadata;
	
	/** アイテムが登録されるイベントの情報. */
	private final FMLPreInitializationEvent event;
	
	/**
	 * @param metadata {@link #metadata}
	 * @param event {@link #event}
	 */
	@Setting
	public Environment(final ModMetadata metadata, final FMLPreInitializationEvent event) {
		this.metadata = metadata;
		this.event = event;
	}
	
	/**
	 * @return イベントが行われている場所
	 */
	@Getting
	public Side side() {
		final Side side = event.getSide();
		if (null == side) throw null;
		return side;
	}
	
	/**
	 * @param name アイテムの名前
	 * @param loc TODO: まだ意味が分からない。アイテムを登録する際には"inventory"とする。
	 * @return アイテムを登録するためのモデルリソース箇所の情報
	 */
	@Getting
	public ModelResourceLocation location(final String name, final String loc) {
		return new ModelResourceLocation(metadata.modId + ":" + name, loc);
	}
}
