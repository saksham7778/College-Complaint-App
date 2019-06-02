package com.example.lenovo.log_in_with_database;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class student_view extends AppCompatActivity {

    Button button;
    EditText editText1;
    EditText textView;
    //String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_view);

        button=(Button)findViewById(R.id.buttonStudent);
        textView=(EditText) findViewById(R.id.t2);
        editText1=(EditText)findViewById(R.id.editTextStudent);
//
//        s=getIntent().getExtras().getString("value");
//        textView.setText(s);

    }

    public void feedback(View view) {

        String str_id=textView.getText().toString();
        String str_name=editText1.getText().toString();

        String type="feedback";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,str_id,str_name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mm1)
        {
           // Toast.makeText(this, "you just clicked on Logout ", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder b=new AlertDialog.Builder(this);
            b.setMessage("are u sure you want to exit");
            b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    student_view.this.finish();
                }
            });


            b.setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            b.show();

        }

        return super.onOptionsItemSelected(item);
    }


}
