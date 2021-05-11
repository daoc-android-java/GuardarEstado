package com.example.guardardatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BundleActivity extends Activity {

	private String msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void guardaMensaje(View v) {
		EditText et = (EditText) findViewById(R.id.msg);
		msg = et.getText().toString();
	}

	public void recuperaMensaje(View v) {
		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
	}

	/*
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);//Siempre llame a super (guarda estado de Views)
		//si comenta esta linea no se guarda el estado
		//pruebe cambiando la orientacion de la pantalla
		outState.putString("perro", msg);
	}

	//Solo se invoca si el bundle no es null
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
	    super.onRestoreInstanceState(savedInstanceState);//Siempre llame a super (restaura estado de Views)
		//si comenta esta linea no se restaura el estado
		//pruebe cambiando la orientacion de la pantalla
	    msg = savedInstanceState.getString("perro");
	}
	*/

}
