package ru.ekzebiche.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class MenuScreen extends ru.ekzebiche.base.baseScreen {

    private Texture img;
    private Texture img2;
    private Texture img3;
    private Texture img4;
    float point = 0f;
    float point2 = 1503f;
    private Vector2 pos;
    private Vector2 posc;
    private Vector2 V;
    private Vector2 N;

    @Override
    public void show() {
        super.show();
        img = new Texture("space.jpg");
        img2 = new Texture("flyspace.jpg");
        img3 = new Texture("flyspace.jpg");
        img4 = new Texture("sh1.png");
        pos = new Vector2(300, 10);
        posc = new Vector2(300,10);
        V=new Vector2( 0,0);
        N=new Vector2( 0,0);


    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.setColor(1f, 1f, 1f, 1f);
        batch.draw(img, 0, 0);
        batch.setColor(1f, 1f, 1f, 0.5f);
        batch.draw(img2, point, 0);
        point -= 1;
        batch.setColor(1f, 1f, 1f, 0.5f);
        batch.draw(img3, point2, 0);
        point2 -= 1;
        batch.setColor(1f, 1f, 1f, 1f);
        batch.draw(img4, pos.x, pos.y);
        if (point2 == -100) {
            point = 1400f;
            batch.setColor(1f, 1f, 1f, 0.5f);
            batch.draw(img3, point2, 0);
            point2 -= 1;
        }
        if (point == -100) {
            point2 = 1400f;
            batch.setColor(1f, 1f, 1f, 0.5f);
            batch.draw(img2, point, 0);
            point -= 1;
        }
       if (N.x ==Math.round(pos.x)){V.set(0, 0);}
        pos.add(V);

    if (V.x>=0){img4 = new Texture("sh3.png"); }
    if (V.x<=0){img4 = new Texture("sh2.png"); }
    if (V.x==0){img4 = new Texture("sh1.png"); }
        System.out.println(N.x + "VVVVVVVVV" +N.y);
       System.out.println(pos.x + "VVVVVVVVV" +pos.y );
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
posc.set(screenX, Gdx.graphics.getHeight()-screenY);
        N.set(screenX, Gdx.graphics.getHeight()-screenY);
        System.out.println(posc.x + "------" + posc.y);
       // N.set(posc.sub(pos));
        posc.sub(pos);
        System.out.println(posc.x + "+++++++" + posc.y);
        posc.len();
      V.x = (posc.x/posc.len());
        V.y = (posc.y /posc.len());
        System.out.println(V.x + "VVVVVVVVV" + V.y);

        return false;
    }
}
