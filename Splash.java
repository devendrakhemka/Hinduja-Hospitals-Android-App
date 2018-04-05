package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		Thread splash = new Thread()
		{
		
			public void run()
			{
				try{
				Thread.sleep(3);
			}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent startapp = new Intent ("com.example.hindujahospital1.HOMESCREEN");
					startActivity(startapp);
					
				}
				
				}
		
			};
			splash.start();
		}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	}


