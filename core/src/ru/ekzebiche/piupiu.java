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
	Texture img3;
	float point = 0f;
	float point2 = 1503f;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("space.jpg");
		img2 = new Texture("flyspace.jpg");
		img3 = new Texture("flyspace.jpg");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(1f, 1f, 1f, 1f);
		batch.draw(img, 0, 0);
		batch.setColor(1f, 1f, 1f, 0.5f);
		batch.draw(img2, point, 0);
		point -= 1;
		batch.setColor(1f, 1f, 1f, 0.5f);
		batch.draw(img3, point2, 0);
		point2 -= 1;
		if (point2 == -100) {
			point = 1603f;
			batch.setColor(1f, 1f, 1f, 0.5f);
			batch.draw(img3, point2, 0);
			point2 -= 1;
		}
		if (point == -100) {
			point2 = 1603f;
			batch.setColor(1f, 1f, 1f, 0.5f);
			batch.draw(img2, point, 0);
			point -= 1;
		}
		batch.end();
	}





	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		img2.dispose();
		img3.dispose();
	}

}