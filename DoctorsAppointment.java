package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DoctorsAppointment extends Activity implements OnItemSelectedListener{

	String appdoc,apptype;
	Spinner spintype,spindoc;
	Button submit;
	String doctype[]= {"Allergy","Anesthesiology","Cancer Chemotherapy","Cancer Radiation Therapy","Cancer Surgery","Cancer Urology","Cardiology","Cardiovascular and Thoracic Surgery","Clinical Genetics","Clinical Haematology","Dental","Dental Implant Clinic","Dermatology","Diabetic Foot Surgery","Endocrinology","ENT","Gastroenterology","Gastroenterology Surgery","General Medicine","General Surgery","Gynaecology","Imaging","Interventional Radiology","IVF and Infertility","Lab Medicine","Minimal Access Surgery","Nephrology","Neurology","Neurosurgery","Nuclear Medicine","Ophthalmology","Orthopaedics","Pain Management","Pediatric Nephrology","Pediatric Neurology","Pediatric Neuro-Rehabilitation","Pediatric Surgery","Pediatrics","Physiotherapy","Plastic Surgery","Psychiatry","Pulmonary Medicine","Rheumatology","Urology","Vulva Clinic"};
	String[] docallergy={"Dr.Asha V Pherwani"};
	String[] docanesthesia={"Dr. Anjali Pingle","Dr. E. P. Borges","Dr. J. S. Bapat","Dr. Jacquiline D'Mello","Dr. Joseph N. Monteiro","Dr. Madhavi Goyal"};
	String[] doccancer={"Dr.Asha Kapadia","Dr.B Padate","Dr.Muzammil Shaikh","Dr.Sachin Almel"};
	String[] docempty={"Currently No Doctors"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doctor_appointment);
		submit= (Button) findViewById(R.id.button1);
		spintype = (Spinner) findViewById(R.id.spinner1);
		spindoc = (Spinner) findViewById(R.id.spinner2);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ta= new Intent("com.example.hindujahospital1.bookappointment");
				startActivity(ta);
				
			}
		});
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,doctype);
		spintype.setAdapter(adapter);
		spintype.setOnItemSelectedListener(this);
		
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		int i= spintype.getSelectedItemPosition();
		switch(i)
		{
		case 0 :
			ArrayAdapter<String> adapter1= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,docallergy);
			spindoc.setAdapter(adapter1);
			break;
		case 1 :
			ArrayAdapter<String> adapter2= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,docanesthesia);
			spindoc.setAdapter(adapter2);
			break;
		case 2 :
			ArrayAdapter<String> adapter3= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,doccancer);
			spindoc.setAdapter(adapter3);
			break;
		default:
			ArrayAdapter<String> adapter4= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,docempty);
			spindoc.setAdapter(adapter4);
			break;
		}
		
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 appdoc= spindoc.toString();
				 apptype= spintype.toString();
				Intent email= new Intent("com.example.hindujahospital1.EMAIL");
				startActivity(email);
				
			}
		});
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	}
