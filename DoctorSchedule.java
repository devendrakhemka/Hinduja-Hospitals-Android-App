package com.example.hindujahospital1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DoctorSchedule extends Activity implements OnItemSelectedListener{
	
	Spinner spinner;
	String types[]= {"All Specialities","Allergy","Anesthesiology","Cancer Chemotherapy","Cancer Radiation Therapy","Cancer Surgery","Cancer Urology","Cardiology","Cardiovascular and Thoracic Surgery","Clinical Genetics","Clinical Haematology","Dental","Dental Implant Clinic","Dermatology","Diabetic Foot Surgery","Endocrinology","ENT","Gastroenterology","Gastroenterology Surgery","General Medicine","General Surgery","Gynaecology","Imaging","Interventional Radiology","IVF and Infertility","Lab Medicine","Minimal Access Surgery","Nephrology","Neurology","Neurosurgery","Nuclear Medicine","Ophthalmology","Orthopaedics","Pain Management","Pediatric Nephrology","Pediatric Neurology","Pediatric Neuro-Rehabilitation","Pediatric Surgery","Pediatrics","Physiotherapy","Plastic Surgery","Psychiatry","Pulmonary Medicine","Rheumatology","Urology","Vulva Clinic"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doctor_schedule);
		spinner= (Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,types);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);	
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
	int pos=spinner.getSelectedItemPosition();
		switch(pos)
		{
		
		}
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	

}
