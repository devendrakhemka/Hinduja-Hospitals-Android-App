package com.example.hindujahospital1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class DoctorSearch extends Activity implements OnItemSelectedListener {
	Button search;
	Spinner spin;
	EditText et1;
	String[] types = new String[10];
	static String URL = "http://124.30.44.228/hhsrv/getspecialty.aspx";
	static String key="Category";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doctorsearch);
		for(int i =0;i<10;i++)
			types[i]="hello";
		new MyAsyncTask().execute();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,types);
		spin.setAdapter(adapter);
		spin.setOnItemSelectedListener(this);
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		int pos = spin.getSelectedItemPosition();
		switch (pos)
		{
		
		}
		
	}
	  
	
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	private class MyAsyncTask extends AsyncTask<String,String,String>
	{

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			DefaultHttpClient httpclient = new DefaultHttpClient(new BasicHttpParams());
			
			HttpPost httppost = new HttpPost(URL);
			
			httppost.setHeader("Content-type","application/json");
			
			InputStream inputstream = null;
			
			String result = "";
			try
			{
				HttpResponse response = httpclient.execute(httppost);
				HttpEntity entity = response.getEntity();
				inputstream = entity.getContent();
				BufferedReader reader = new BufferedReader (new InputStreamReader(inputstream,"UTF-8"),8);
				StringBuilder theStringbuilder = null;
				String line= null;
				while((line = reader.readLine())!=null)
				{
					theStringbuilder.append(line+'\n');
				}
				result = theStringbuilder.toString();
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try{
					if(inputstream!=null)
						inputstream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			JSONObject jsonObject ;
			try
			{
				jsonObject = new JSONObject (result);
				JSONObject categorylist = jsonObject.getJSONObject("Category");
				JSONArray data = jsonObject.names();
				String msg= data.toString();
				Log.v("Parsed data",msg);
				
				List<String> list = new ArrayList<String>();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				
			}
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
		}
		
	}
	
}