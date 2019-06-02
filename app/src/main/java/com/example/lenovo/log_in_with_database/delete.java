package com.example.lenovo.log_in_with_database;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class delete extends AppCompatActivity {

    EditText id;
    Button button;
    public  String str_id,type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        id=(EditText)findViewById(R.id.delete_id);
        button=(Button)findViewById(R.id.buttonDelete);
    }

    public void ondeleteREcord(View view) {
        str_id=id.getText().toString();
        type="delete";

        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setMessage("are u sure you want to delete");
        b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                delete_data();
                id.setText("");
            }
        });


        b.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                delete.this.finish();
            }
        });
        b.show();



    }
    public void delete_data(){
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_id);
    }
}
