package com.example.lenovo.log_in_with_database;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button showdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.edit_name);
        editText2=(EditText)findViewById(R.id.edit_pass);
        showdata=(Button)findViewById(R.id.btn_disp);
        showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,showAllData.class);
                startActivity(intent);
            }
        });
    }


    public void onLogin(View view) {
        String username=editText1.getText().toString();
        String password=editText2.getText().toString();
        String type="login";

        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);
       /* Button login=(Button)findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,show_data.class);
                startActivity(intent);
            }
        });
        */
        editText1.setText("");
        editText2.setText("");
    }

    public void onRegister(View view) {
        Intent intent=new Intent(MainActivity.this,register.class);
        startActivity(intent);
    }


    public void onUpdate(View view) {
        Intent intent=new Intent(MainActivity.this,update.class);
        startActivity(intent);
    }

    public void onDelete(View view) {
        Intent intent=new Intent(MainActivity.this,delete.class);
        startActivity(intent);
    }

}
