package ru.ekzebiche;

import com.badlogic.gdx.Game;

import ru.ekzebiche.Screen.MenuScreen;

public class piupiu extends Game {

	@Override
	public void create() {
			setScreen(new MenuScreen());
	}
}