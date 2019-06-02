package com.example.lenovo.log_in_with_database;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class admin_view extends AppCompatActivity {

    Button showdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);

        showdata=(Button)findViewById(R.id.btn_disp);
        showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(admin_view.this,showAllData.class);
                startActivity(intent);
            }
        });
    }


    public void onUpdate(View view) {
        Intent intent=new Intent(admin_view.this,update.class);
        startActivity(intent);
    }

    public void onDelete(View view) {
        Intent intent=new Intent(admin_view.this,delete.class);
        startActivity(intent);
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
            //Toast.makeText(this, "you just clicked on Logout ", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder b=new AlertDialog.Builder(this);
            b.setMessage("are u sure you want to exit");
            b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    admin_view.this.finish();
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
