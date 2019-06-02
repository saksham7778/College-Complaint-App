package com.example.lenovo.log_in_with_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class update extends AppCompatActivity {

    EditText id,name,surname,age,user_name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        id=(EditText)findViewById(R.id.update_id);
        name=(EditText)findViewById(R.id.update_name);
        surname=(EditText)findViewById(R.id.update_surname);
        age=(EditText)findViewById(R.id.update_age);
        user_name=(EditText)findViewById(R.id.update_username);
        password=(EditText)findViewById(R.id.update_password);
    }

    public void onRegisterUpdate(View view) {

        String str_id=id.getText().toString();
        String str_name=name.getText().toString();
        String str_surname=surname.getText().toString();
        String str_age=age.getText().toString();
        String str_user_name=user_name.getText().toString();
        String str_password=password.getText().toString();
        String type="update";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,str_id,str_name,str_surname,str_age,str_user_name,str_password);
    }
}
