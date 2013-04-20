package com.me.mygdxgame;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication{
	@Override
	public void onCreate(Bundle savedInstanceState ){
		super.onCreate( savedInstanceState );

		// whether to use OpenGL ES 2.0
		boolean useOpenGLES2 = false;

		// create the game
		initialize( new MyGdxGame(), useOpenGLES2 );
	}
}