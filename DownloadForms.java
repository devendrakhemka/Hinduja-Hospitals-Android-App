package com.example.hindujahospital1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class DownloadForms extends Activity{

	WebView web;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.downloadforms);
		web = (WebView) findViewById(R.id.webView1);
		web.loadUrl("http://www.hindujahospital.com/mobile/for-patient/outpatients.aspx");
	}
	
}
