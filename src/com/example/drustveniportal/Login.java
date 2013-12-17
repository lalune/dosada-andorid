package com.example.drustveniportal;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Login extends MainActivity{
	
		 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		super.onOptionsItemSelected(item);
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
		
		return true;
	}
	
	private void homeMenuItem(){
		Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
	}
	
	private void categoriesMenuItem(){
		
	}
	
	private void loginMenuItem(){
		
		Intent intent = new Intent(Login.this, Login.class);
        startActivity(intent);
		
		
	}
}
