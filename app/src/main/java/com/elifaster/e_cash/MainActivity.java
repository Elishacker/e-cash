package com.elifaster.e_cash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button buttonLogin;
    private TextView badili;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.wakala);
        password = findViewById(R.id.pass);
        buttonLogin = findViewById(R.id.login);
        badili = findViewById(R.id.siri);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simulate a successful login (You should implement your own authentication logic here)
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                String Siri = badili.getText().toString();

                // For demonstration purposes, check if username and password are not empty
                if (!uname.isEmpty() && !pass.isEmpty())

                {

                    // Navigate to DashboardActivity on successful login
                    Intent intent = new Intent(MainActivity.this, home.class);
                    startActivity(intent);
                    finish();
                }

                else if(uname.isEmpty() && !pass.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter  username", Toast.LENGTH_SHORT).show();

                }

                else if(!uname.isEmpty() && pass.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter  password", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                }


            }


        });
    }


}
