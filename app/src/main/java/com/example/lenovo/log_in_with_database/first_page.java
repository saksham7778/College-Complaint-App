package com.example.lenovo.log_in_with_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first_page extends AppCompatActivity {

    Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        button=(Button)findViewById(R.id.buttonStudents);
        button1=(Button)findViewById(R.id.buttonAdmin);
        button2=(Button)findViewById(R.id.buttonTeachers);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(first_page.this,MainActivity.class);
                startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(first_page.this,front_for_student.class);
                startActivity(intent);
            }
        });
    }
}
