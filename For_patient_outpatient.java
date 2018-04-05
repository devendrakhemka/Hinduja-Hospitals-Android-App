package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class For_patient_outpatient extends Activity{

	Button app,freeopd,consult,dwnld;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.for_patients_outpatients);
		app     = (Button) findViewById(R.id.button1);
		consult = (Button) findViewById(R.id.button2);
		freeopd = (Button) findViewById(R.id.button3);
		dwnld   = (Button) findViewById(R.id.button4);
		
		
		app.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Context context =  getApplicationContext();
				String  msg = "Appointments can be taken by calling helpline numbers or visiting the \"Appointments\" section from the homescreen.\nAll patients need to be registered prior to consultation. Please fill in a Registration Form(also available for download below). The registration fee(one time charge) is Rs. 50/. You will be issued an HH card which is valid for all services of the hospital. Your medical record folder will be retained with the hospital.\nIf you have been registered previously, kindly quote your P. D. Hinduja Hospital (HH) number when taking an appointment.\nIn case you are a non - appointment / walk-in patient, you may have to wait to see the doctor.";
				int duration =Toast.LENGTH_LONG;
				final Toast toast = Toast.makeText(context, msg, duration);
				
				new CountDownTimer(12000, 1000)
				{

				    public void onTick(long millisUntilFinished) {toast.show();}
				    public void onFinish() 
				    {toast.show();}

				}.start();

				
				}
		});
		consult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Context context1 =  getApplicationContext();
				String  msg1 = "First time consultation with the doctor - Rs 1150 (Rs 1100 for consultation and Rs 50 for folder)\n Consulting the same doctor within 90 days - Rs 750 \n Consulating the same doctor after 90 days (after full payment) - Rs 1100 \n Privelege Clinic(Offered by selected doctors only on Saturdays) - Rs1800";
				int duration1 =Toast.LENGTH_LONG;
				final Toast toast1 = Toast.makeText(context1, msg1, duration1);
				
				new CountDownTimer(9000, 1000)
				{

				    public void onTick(long millisUntilFinished) {toast1.show();}
				    public void onFinish() 
				    {toast1.show();}

				}.start();

				
				}
		});
		freeopd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Context context2 =  getApplicationContext();
				String  msg2 = "Consultations are conducted on a scheduled basis with prior appointment from Monday - Saturday at a nominal fee of Rs.10/- & Registration (one time charge) Rs. 50/-";
				int duration2 =Toast.LENGTH_LONG;
				final Toast toast2 = Toast.makeText(context2, msg2, duration2);
				
				new CountDownTimer(5000, 1000)
				{

				    public void onTick(long millisUntilFinished) {toast2.show();}
				    public void onFinish() 
				    {toast2.show();}

				}.start();

				
				}
		});
		dwnld.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent disclaimer = new Intent("com.example.hindujahospital1.PATIENTSOUTPATIENTSDISCLAIMER");
				startActivity(disclaimer);
				
			}
		});
		
	}

	
}
