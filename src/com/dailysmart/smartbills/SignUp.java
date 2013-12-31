package com.dailysmart.smartbills;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.widget.TextView;

public class SignUp extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        
        EditText lastname = (EditText) findViewById(R.id.EditText01);
        lastname.setHint("Nom");
        EditText firstname = (EditText) findViewById(R.id.editText2);
        firstname.setHint("Prenom");
        EditText email = (EditText) findViewById(R.id.EditText02);
        firstname.setHint("E-mail");
        EditText login = (EditText) findViewById(R.id.EditText03);
        firstname.setHint("Profil");
        EditText password = (EditText) findViewById(R.id.editText1);
        firstname.setHint("Mot de passe");
        EditText confirm = (EditText) findViewById(R.id.EditText04);
        firstname.setHint("Confirmer mot de passe");
        //name.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        //name.setLines(5); 
        
        /*button = (Button) findViewById(R.id.button1);
    	button.setOnClickListener (new View.OnClickListener() {
    	    public void onClick(View v) {
    	    	setContentView(R.layout.signup);
    	    }
    	});*/

    }
    
}
