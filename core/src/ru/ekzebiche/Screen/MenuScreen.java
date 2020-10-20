package ru.ekzebiche.Screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;


public class MenuScreen extends ru.ekzebiche.base.baseScreen {

    private Texture img;
    private Vector2 pos;


    @Override
    public void show() {
        super.show();
        img = new Texture("space1k1.jpg");
        pos = new Vector2(-0.5f, -0.5f);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.setColor(1f, 1f, 1f, 1f);
        batch.draw(img, pos.x, pos.y,1f,1f);

        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
    }


}
