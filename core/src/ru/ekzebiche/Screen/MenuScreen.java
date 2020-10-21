package ru.ekzebiche.Screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.ekzebiche.MAth.Rect;
import ru.ekzebiche.sprite.Background;

public class MenuScreen extends ru.ekzebiche.base.baseScreen {
    private Texture img;
    private Background background;


    @Override
    public void show() {
        super.show();
        img = new Texture("space1k1.jpg");
        background = new Background(new TextureRegion(img));


    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        background.draw(batch);
        batch.end();
    }

    @Override
    public void resize(Rect worldBounds) {
        background.resize(worldBounds);
    }

    @Override
    public void dispose()
    {   img.dispose();
        super.dispose();
    }


}
