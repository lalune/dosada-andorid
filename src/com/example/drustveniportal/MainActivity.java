package com.example.drustveniportal;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
				
		switch(item.getItemId()){
		case R.id.home:
			homeMenuItem();
			break;
		case R.id.categories:
			categoriesMenuItem();
			break;
		case R.id.login:
			loginMenuItem();
			break;	
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	private void homeMenuItem(){
		Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
	}
	
	private void categoriesMenuItem(){
		
	}
	
	private void loginMenuItem(){
		
		Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
		
		
	}
	
}
