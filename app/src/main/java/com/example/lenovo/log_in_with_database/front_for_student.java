package com.example.lenovo.log_in_with_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class front_for_student extends AppCompatActivity {

    EditText editText1,editText2;
    //String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_for_student);

        editText1=(EditText)findViewById(R.id.edit_name1);
        editText2=(EditText)findViewById(R.id.edit_pass1);

    }

    public void onLogin(View view) {

        String username=editText1.getText().toString();
        String password=editText2.getText().toString();
        String type="login1";

        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);

        editText1.setText("");
        editText2.setText("");
//        Intent intent=new Intent(front_for_student.this,student_view.class);
//        //startActivity(intent);
//        string=editText1.getText().toString();
//        intent.putExtra("value",string);
//        startActivity(intent);
//        finish();

    }

    public void onRegister(View view) {
        Intent intent=new Intent(front_for_student.this,register.class);
        startActivity(intent);
    }
}
