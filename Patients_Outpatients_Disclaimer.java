package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class Patients_Outpatients_Disclaimer extends Activity{

	EditText name,email;
	Button send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.disclaimer_mail);
		name= (EditText)findViewById(R.id.editText1);
		email= (EditText)findViewById(R.id.editText2);
		send =(Button)findViewById(R.id.button1);
		send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String[] emailid = {"devendrakhemka1994@gmail.com"};
				String msg = "";
				msg+= name.toString() +'\n';
				msg+= email.toString();
				Intent sendmail = new Intent(android.content.Intent.ACTION_SEND);
				 sendmail.putExtra(android.content.Intent.EXTRA_EMAIL,emailid);
				 sendmail.putExtra(android.content.Intent.EXTRA_SUBJECT, "Disclaimer download form");
				 sendmail.setType("plain/text");
				 sendmail.putExtra(android.content.Intent.EXTRA_TEXT,msg);
				 startActivity(sendmail);
				 InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
				 imm.hideSoftInputFromInputMethod(send.getWindowToken(), 0);
				 Intent download = new Intent("com.example.hindujahospital1.DOWNLOADFORMS");
				 startActivity(download);
			}
		});
		 
	}
	
}
