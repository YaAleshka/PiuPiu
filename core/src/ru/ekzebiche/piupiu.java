package ru.ekzebiche;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class piupiu extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	float point = 200f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("space.jpg");
		img2 = new Texture("space2.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(1f, 1f,1f, 1f);
		batch.draw(img, 0, 0);
		batch.setColor(1f, 1f,1f, 0.5f);
		batch.draw(img2, point, 0);
		batch.end();
		point -=1;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		img2.dispose();
	}
}
