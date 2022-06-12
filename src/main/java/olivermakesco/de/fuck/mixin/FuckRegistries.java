package olivermakesco.de.fuck.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Registry.class)
public class FuckRegistries {
	/**
	 * @author Oliver
	 */
	@Overwrite
	public static <T> T register(Registry<T> registry, Identifier id, T t) {
		return t;
	}
}
