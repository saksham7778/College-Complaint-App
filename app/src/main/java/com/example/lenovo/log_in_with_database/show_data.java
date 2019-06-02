package com.example.lenovo.log_in_with_database;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class show_data extends AppCompatActivity {

    TextView dish_id,dish_name,dish_description,dish_quantity;
    Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        dish_id=(TextView)findViewById(R.id.dish_id);
        dish_name=(TextView)findViewById(R.id.dish_name);
        dish_description=(TextView)findViewById(R.id.dish_description);
        dish_quantity=(TextView)findViewById(R.id.dish_quantity);
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
            Toast.makeText(this, "you just clicked on Logout ", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder b=new AlertDialog.Builder(this);
            b.setMessage("are u sure you want to exit");
            b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    show_data.this.finish();
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
