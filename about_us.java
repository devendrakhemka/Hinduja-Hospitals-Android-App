package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_us extends Activity {

	Button quality,milestone,board,found,insp,age,back,guide;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us_home);
		quality = (Button)findViewById(R.id.button1);
		milestone= (Button) findViewById(R.id.button2);
		board = (Button) findViewById(R.id.button3);
		found = (Button)findViewById(R.id.button4);
		insp = (Button) findViewById( R.id.button5);
		age = (Button) findViewById(R.id.button6);
		guide = (Button) findViewById(R.id.button7);
		
		found.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent fd= new Intent("com.example.hindujahospital1.ABOUTUSFOUNDER");
				startActivity(fd);
				
			}
		});
	}



}
