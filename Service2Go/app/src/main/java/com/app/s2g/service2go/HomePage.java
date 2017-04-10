package com.app.s2g.service2go;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class HomePage extends Activity {

    private Button loginButton;
    private Button registerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        loginButton = (Button) findViewById(R.id.loginId) ;
        registerButton = (Button) findViewById(R.id.registerId) ;

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),LoginPage.class);
                startActivity(i);
                setContentView(R.layout.activity_login_page);            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
                setContentView(R.layout.activity_register);            }
        });
    }

}
