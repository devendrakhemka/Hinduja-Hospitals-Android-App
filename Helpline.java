package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Helpline extends Activity{
	Button b;
	TextView help,appoint,endo,broncho,cardio,carehome,healthcheck,homesample;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helpline);
		help = (TextView) findViewById(R.id.TextView01);
		appoint = (TextView) findViewById(R.id.textView1);
		endo = (TextView) findViewById(R.id.TextView06);
		broncho =(TextView) findViewById(R.id.TextView04);
		cardio =(TextView) findViewById(R.id.TextView05);
		carehome =(TextView) findViewById(R.id.TextView03);
		healthcheck =(TextView) findViewById(R.id.TextView07);
		homesample =(TextView) findViewById(R.id.TextView02);
		
		help.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				String number = "tel:02224448542";
				Intent call = new Intent(Intent.ACTION_CALL);
				call.setData(Uri.parse(number));
				startActivity(call);
				return false;
			}
		});
		
		appoint.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				String number="tel:02267668181";
				Intent call = new Intent(Intent.ACTION_CALL);
				call.setData(Uri.parse(number));
				startActivity(call);
				return false;
			}
		});
		
			endo.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				String number="tel:02224447355";
				Intent call = new Intent(Intent.ACTION_CALL);
				call.setData(Uri.parse(number));
				startActivity(call);
				return false;
			}
		});
			
			broncho.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					String number="tel:02224447334";
					Intent call = new Intent(Intent.ACTION_CALL);
					call.setData(Uri.parse(number));
					startActivity(call);
					return false;
				}
			});
			cardio.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					String number="tel:02224447353";
					Intent call = new Intent(Intent.ACTION_CALL);
					call.setData(Uri.parse(number));
					startActivity(call);
					return false;
				}
			});
			healthcheck.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					String number="tel:02224447376";
					Intent call = new Intent(Intent.ACTION_CALL);
					call.setData(Uri.parse(number));
					startActivity(call);
					return false;
				}
			});
			carehome.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					String number="tel:02239818181";
					Intent call = new Intent(Intent.ACTION_CALL);
					call.setData(Uri.parse(number));
					startActivity(call);
					return false;
				}
			});
			homesample.setOnLongClickListener(new View.OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					String number="tel:02228112323";
					Intent call = new Intent(Intent.ACTION_CALL);
					call.setData(Uri.parse(number));
					startActivity(call);
					return false;
				}
			});
}
}