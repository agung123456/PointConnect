package com.pointconnect;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		System.out.println(event.getUnicodeChar(event.getMetaState()));
//		return super.onKeyDown(keyCode, event);
//	}
	
	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println(event.getUnicodeChar(event.getMetaState()));
		return super.dispatchKeyEvent(event);
	}

}
