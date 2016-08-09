package the_fireplace.wars.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import the_fireplace.wars.entities.EntityPTNTPrimed;
import the_fireplace.wars.init.WarsBlocks;

/**
 * @author The_Fireplace
 */
public class RenderPTNTPrimed extends Render {
    public RenderPTNTPrimed(RenderManager rm)
    {
        super(rm);
        this.shadowSize = 0.5F;
    }

    public void doRender(EntityPTNTPrimed entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        BlockRendererDispatcher blockRenderer = Minecraft.getMinecraft().getBlockRendererDispatcher();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z);
        float f2;

        if ((float)entity.fuse - partialTicks + 1.0F < 10.0F)
        {
            f2 = 1.0F - ((float)entity.fuse - partialTicks + 1.0F) / 10.0F;

            if (f2 < 0.0F)
            {
                f2 = 0.0F;
            }

            if (f2 > 1.0F)
            {
                f2 = 1.0F;
            }

            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0F + f2 * 0.3F;
            GL11.glScalef(f3, f3, f3);
        }

        f2 = (1.0F - ((float)entity.fuse - partialTicks + 1.0F) / 100.0F) * 0.8F;
        this.bindEntityTexture(entity);
        blockRenderer.renderBlockBrightness(WarsBlocks.playerTNT.getDefaultState(), entity.getBrightness(partialTicks));

        if (entity.fuse / 5 % 2 == 0)
        {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_DST_ALPHA);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f2);
            blockRenderer.renderBlockBrightness(WarsBlocks.playerTNT.getDefaultState(), 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
        }

        GL11.glPopMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return TextureMap.locationBlocksTexture;
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.doRender((EntityPTNTPrimed) entity, x, y, z, p_76986_8_, partialTicks);
    }
}
