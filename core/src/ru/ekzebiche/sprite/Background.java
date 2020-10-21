package ru.ekzebiche.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.ekzebiche.MAth.Rect;
import ru.ekzebiche.base.Sprite;

public class Background extends Sprite {
    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
