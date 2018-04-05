package com.example.hindujahospital1;


import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Homescreen extends Activity {
	
	JSONObject json;
	String conv,conv2;
	JSONObject last,last1,last2;
	Button search,appointment,specialities,schedule,helpline,maps;
	Button about,pat,pro;
	ImageView fb,twitter,youtube;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		search    	=(Button) findViewById(R.id.DoctorSearch);
		appointment =(Button) findViewById(R.id.DoctorAppointment);
		specialities=(Button) findViewById(R.id.Specialities);
        schedule    =(Button) findViewById(R.id.DoctorSchedule);
        helpline    =(Button) findViewById(R.id.Helpline);
        maps        =(Button) findViewById(R.id.MapsAndDirections);
        about       =(Button) findViewById(R.id.aboutus);
        pat         =(Button) findViewById(R.id.Forpatient);
        pro         =(Button) findViewById(R.id.ForProfessional);
        fb          =(ImageView) findViewById(R.id.imageView1);
        twitter     =(ImageView) findViewById(R.id.imageView2);
        youtube     =(ImageView) findViewById(R.id.imageView3);
        
        fb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.facebook.com/HindujaHospital";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});
        
        twitter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				String url = "http://www.twitter.com/WellnessMumbai";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
				}
		});
        

        youtube.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				String url = "http://www.youtube.com/user/HindujaHospitalMRC";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});
        
        maps.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent map= new Intent("com.example.hindujahospital1.MAPS");
				startActivity(map);
				
			}
		});
        
        helpline.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent hp=new Intent("com.example.hindujahospital1.HELPLINE");
				startActivity(hp);
			}
		});
        search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent s= new Intent("com.example.hindujahospital1.DOCTORSEARCH");
				startActivity(s);
			}
		});
        
          appointment.setOnClickListener(new View.OnClickListener() {
			
		
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent a= new Intent("com.example.hindujahospital1.DOCTORSAPPOINTMENT");
				startActivity(a);
			}
		});
        
          specialities.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				Intent sp= new Intent("com.example.hindujahospital1.SPECIALITIES");
  				startActivity(sp);
  			} 
  		});
          
          schedule.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				Intent scd= new Intent("com.example.hindujahospital1.DOCTORSCHEDULE");
  				startActivity(scd);
  			}
  		});
          
          about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent abt= new Intent("com.example.hindujahospital1.ABOUTUS");
				startActivity(abt);
			}
		});
          
          pat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent patient= new Intent("com.example.hindujahospital1.FORPATIENTS");
				startActivity(patient);
				
			}
		});
          
          pro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent profess= new Intent("com.example.hindujahospital1.FORPROFESSIONALS");
				startActivity(profess);
			}
		});
	}

	
}

