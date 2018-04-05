package com.example.hindujahospital1;


import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;

public class Maps extends MapActivity {

	touchy t= new touchy();
	MapView map;
	long start;
	long stop;
	MyLocationOverlay compass;
	MapController control;
	int x,y;
	GeoPoint touchedpoint;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.maps);
	    map = (MapView) findViewById(R.id.mapview);
	    map.setBuiltInZoomControls(true);
	    List<Overlay> overlaylist = map.getOverlays();
	    touchy t= new touchy();
	    overlaylist.add(t);
	    compass= new MyLocationOverlay(Maps.this,map);
	    overlaylist.add(compass);
	    control= map.getController();
	    GeoPoint point = new GeoPoint(19033200, 72838600);
	    control .animateTo(point);
	    control.setZoom(6);
	    
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		compass.disableCompass();
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		compass.enableCompass();
		super.onResume();
		
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

class touchy extends Overlay
{
	public boolean onTouchEvent (MotionEvent e , MapView m )
	{
		if(e.getAction()== MotionEvent.ACTION_DOWN)
		{
			start = e.getEventTime();
			x=(int)e.getX();
			y=(int)e.getY();
			touchedpoint= map.getProjection().fromPixels(x, y);
			Geocoder geocoder=new Geocoder(getBaseContext(),Locale.getDefault());
			try
			{
				List<Address> address = geocoder.getFromLocation(touchedpoint.getLatitudeE6()/1E6 , touchedpoint.getLatitudeE6()/1E6, 1);
				if(address.size()>0)
				{String display="";
					for(int i =0;i<address.get(0).getMaxAddressLineIndex();i++)
					{
						
						display += address.get(0).getAddressLine(i)+'\n';
					}
					Toast t =Toast.makeText(getBaseContext(), display,Toast.LENGTH_LONG);
					t.show();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally
			{
				
			}
			
		}
		if(e.getAction()== MotionEvent.ACTION_UP)
		{
			stop = e.getEventTime();
		}
		return false;
	}
}
}