package ru.ekzebiche.base;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.ekzebiche.MAth.Rect;

public class Sprite  extends Rect {

    protected  float angle;
    protected float scale =1;
    protected TextureRegion[] regions;
    protected int frame;

    public Sprite(TextureRegion region) {
        this.regions = new TextureRegion[1];
        regions[0] = region;
    }

    public void setHeightProportion(float height) {
        setHeight(height);
        float aspect = regions[frame].getRegionWidth() / (float) regions[frame].getRegionHeight();
        setWidth(height*aspect);
    }


     public void draw(SpriteBatch batch) {
         batch.draw(
                 regions[frame],
                 getLeft(), getBottom(),
                 halfWidth, halfHeight,
                 getWidth(), getHeight(),
                 scale, scale,
                 angle
        );
     }
    public void updata(float delta) {

    }
    public void resize(Rect worldBounds) {

    }

    public boolean touchDown(Vector2 touch, int pointer, int button) {
        return false;
    }


    public boolean touchUp(Vector2 touch, int pointer, int button) {

        return false;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }
}
