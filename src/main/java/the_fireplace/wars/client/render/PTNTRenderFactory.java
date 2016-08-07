package the_fireplace.wars.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import the_fireplace.wars.entities.EntityPTNTPrimed;

/**
 * @author The_Fireplace
 */
public class PTNTRenderFactory implements IRenderFactory<EntityPTNTPrimed> {
    @Override
    public Render<? super EntityPTNTPrimed> createRenderFor(RenderManager manager) {
        return new RenderPTNTPrimed(manager);
    }
}
