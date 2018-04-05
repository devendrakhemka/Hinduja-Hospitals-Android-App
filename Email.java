package com.example.hindujahospital1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Email extends Activity implements OnItemSelectedListener, OnCheckedChangeListener, android.widget.RadioGroup.OnCheckedChangeListener
{
	DoctorsAppointment obj = new DoctorsAppointment();
	String appointmentdoc = obj.appdoc;
	String appointmenttype= obj.apptype;
	String gender="";
	Button send;
	EditText pName,bName,rel,ph,mail;
	RadioGroup g;
	Spinner day1,month1,year1;
	Spinner day2,month2,year2;
	Spinner day3,month3,year3;
	String[] days31={"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String[] months={"month","1","2","3","4","5","6","7","8","9","10","11","12"};
	String[] year={"year","2014","2015"};
	String[] days30={"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String[] days28={"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		 setContentView(R.layout.email_appointment);
		 send=   (Button)      findViewById(R.id.button1);
		 pName=	 (EditText)    findViewById(R.id.editText1);
		 bName=	 (EditText)    findViewById(R.id.editText2);
		 rel = 	 (EditText)    findViewById(R.id.editText3);
		 ph=   	 (EditText)    findViewById(R.id.editText4);
		 mail= 	 (EditText)    findViewById(R.id.editText5);
		 year1 = (Spinner)     findViewById(R.id.spinner1);
		 year2 = (Spinner)     findViewById(R.id.spinner11);
		 year3 = (Spinner)     findViewById(R.id.spinner21);
		 month1= (Spinner)     findViewById(R.id.spinner2);
		 month2= (Spinner) 	   findViewById(R.id.spinner12);
		 month3= (Spinner) 	   findViewById(R.id.spinner22);
		 day1 =  (Spinner) 	   findViewById(R.id.spinner3);
		 day2 =  (Spinner) 	   findViewById(R.id.spinner13);
		 day3=   (Spinner) 	   findViewById(R.id.spinner23);
		 g   =   (RadioGroup)  findViewById(R.id.radioGroup1);
		 
		 g.setOnCheckedChangeListener(this);
		 
		 ArrayAdapter<String> m12 = 
				 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,months);

		 ArrayAdapter<String> y2 = 
				 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,year);
		 year1.setAdapter(y2);
		 year2.setAdapter(y2);
		 year3.setAdapter(y2);
		 month1.setAdapter(m12);
		 month2.setAdapter(m12);
		 month3.setAdapter(m12);
		 month1.setOnItemSelectedListener(this);
		 month2.setOnItemSelectedListener(this);
		 month3.setOnItemSelectedListener(this);

		 send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 String[] emailid={"devendrakhemka1994@gmail.com"};
				 String patient =  pName.getText().toString();
				 String relative = bName.getText().toString();
				 String relation = rel.getText().toString();		
				 String num = ph.getText().toString();
				 String date1 = day1.getSelectedItem().toString() +"  ";
				 date1+= month1.getSelectedItem().toString()+"  ";
				 date1+=year1.getSelectedItem().toString();
				 String date2 = day2.getSelectedItem().toString() +"  ";
				 date2+= month2.getSelectedItem().toString()+ "  ";
				 date2+= year2.getSelectedItem().toString();
				 String date3 = day3.getSelectedItem().toString() +"  ";
				 date3+= String.valueOf(month3.getSelectedItem()) +"  ";
				 date3+=String.valueOf(year3.getSelectedItem());
				
				 String msg= "Appointment with :"+ appointmentdoc+ '\n';
				 msg+= "Department :"+appointmenttype+ '\n';
				 msg+="Patient Name :" + patient + '\n';
				 msg+= "Gender :"+ gender +'\n';
				 msg += "Person taking the appointment :"+ relative + '\n';
				 msg +="Relation :"+relation+'\n';
				 msg+="Contact Number :"+num;
				 msg+="Date 1 :"+date1+'\n';
				 msg+="Date 2 :"+date2+'\n';
				 msg+="Date 3 :"+date3+'\n';
				 Intent sendmail = new Intent(android.content.Intent.ACTION_SEND);
				 sendmail.putExtra(android.content.Intent.EXTRA_EMAIL,emailid);
				 sendmail.putExtra(android.content.Intent.EXTRA_SUBJECT, "Doctor Appointment");
				 sendmail.setType("plain/text");
				 sendmail.putExtra(android.content.Intent.EXTRA_TEXT,msg);
				 startActivity(sendmail);
				 InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
				 imm.hideSoftInputFromInputMethod(send.getWindowToken(), 0);
			}
		});
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		ArrayAdapter<String> d31 = 
				 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,days31);

		ArrayAdapter<String> d30 = 
				 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,days30);
		 
		 ArrayAdapter<String> d28 =
				 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,days28);
		
		 int a = month1.getSelectedItemPosition();
		 int b = month2.getSelectedItemPosition();
		 int c = month3.getSelectedItemPosition();
		
		 switch (a)
		 {
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10: 
		 case 12:
		 		day1.setAdapter(d31);
		 		break;
		 
		 case 2:
			 	day1.setAdapter(d28);
			 	break;
		 		
		 default: 
			 	day1.setAdapter(d30);
		 		break;
			 
		 }
		 switch (b)
		 {
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10: 
		 case 12:
		 		day2.setAdapter(d31);
		 		break;
		 
		 case 2:
			 	day2.setAdapter(d28);
		 		break;
		 		
		 default: 
		 		day2.setAdapter(d30);
		 		break;
			 
		 }
		 switch (c)
		 {
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10: 
		 case 12:
		 		day3.setAdapter(d31);
		 		break;
		 
		 case 2:
			 	day3.setAdapter(d28);
		 		break;
		 		
		 default: 
			 	day3.setAdapter(d30);
		 		break;
			 
		 }
		
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
	
		int a = R.id.radio0;
		int b = R.id.radio2;
		if(checkedId == a)
		gender = "Male";
		else if(checkedId==b)	
		gender = "Female";
		}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}
		
	}
	
	


