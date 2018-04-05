package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_us_founder extends Activity {

	Button back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us_founder);
		back = (Button)findViewById(R.id.button1);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent b= new Intent("com.example.hindujahospital1.ABOUTUS");
				startActivity(b);
			}
		});
	}

	
}
