package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForPatients extends Activity {

	Button inp,outp,care,special,sss;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.for_patient);
		
		inp = (Button) findViewById(R.id.button4);
	    outp = (Button) findViewById(R.id.button5);
		care = (Button) findViewById(R.id.button2);
		special = (Button) findViewById(R.id.button1);
		sss = (Button) findViewById(R.id.button3);
		
		outp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("com.example.hindujahospital1.FOR_PATIENT_OUTPATIENT");
				startActivity(i);
				
			}
		});
		
	   
	}

	
	
}
