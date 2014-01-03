package com.dailysmart.smartbills;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SmartBills extends Activity {

	Button signup;
	Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_bills);
    	signup = (Button) findViewById(R.id.button1);
    	signup.setOnClickListener (new View.OnClickListener() {
    	    public void onClick(View v) {
    	    	setContentView(R.layout.signup);
    	    }
    	});
    	
    	login = (Button) findViewById(R.id.button2);
    	login.setOnClickListener (new View.OnClickListener() {
    	    public void onClick(View v) {
    	    	setContentView(R.layout.test);
    	    }
    	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.smart_bills, menu);
        return true;
    }
    
}
