package com.example.lenovo.log_in_with_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class showAllData extends AppCompatActivity {
    ArrayList<String> first_name = new ArrayList<String>();
    ArrayList<String> last_name = new ArrayList<String>();
    ArrayList<String> birth_date = new ArrayList<String>();
    String str,str2;
    int[] n;
    int length;
    String[] str4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_data);
        str = BackgroundWorker.ShowAllDrivers();
        length = str.length();
        n = new int[length];
//         Toast.makeText(this, "Result"+str, Toast.LENGTH_LONG).show();
        String[] str3 = str.split("&");// problem start here
     //   Toast.makeText(this, ""+str3.length, Toast.LENGTH_LONG).show();  //str3.length=3
        for (int i = 0; i < str3.length; i++) {
            if (i == 0) {// 0 represent first_name column in database

                 str4 = str3[i].split(",");
      //          Toast.makeText(this, ""+str4.length, Toast.LENGTH_SHORT).show();
                for (int j = 0; j < str4.length; j++) {
                    first_name.add(str4[j]);
                }
            }
            if (i == 1) {// 1 represent last_name column in database

                String[] str5 = str3[i].split(",");
                //Toast.makeText(this, ""+str4.length, Toast.LENGTH_SHORT).show();
                for (int j = 0; j < str5.length; j++) {
                    last_name.add(str5[j]);
                }
            }
            if (i == 2) {// 1 represent last_name column in database

                String[] str5 = str3[i].split(",");
                //Toast.makeText(this, ""+str4.length, Toast.LENGTH_SHORT).show();
                for (int j = 0; j < str5.length; j++) {
                    birth_date.add(str5[j]);
                }
            }
        }
            //Toast.makeText(this, ""+str, Toast.LENGTH_SHORT).show();
            ListView mlistview = findViewById(R.id.lview);
            CustomAdapter customAdapter = new CustomAdapter();
            mlistview.setAdapter(customAdapter);
      //  Toast.makeText(this, ""+first_name, Toast.LENGTH_SHORT).show();
        }
            class CustomAdapter extends BaseAdapter {

                @Override
                public int getCount() {
                    return str4.length;
                }

                @Override
                public Object getItem(int i) {
                    return null;
                }

                @Override
                public long getItemId(int i) {
                    return 0;
                }

                @Override
                public View getView(int i, View view, ViewGroup viewGroup) {
                    view = getLayoutInflater().inflate(R.layout.row_data, null);
                    //ImageView mImageView = view.findViewById(R.id.imageView);
                    TextView mTextView = view.findViewById(R.id.name);
                    TextView mTextView2 = view.findViewById(R.id.surname);
                    TextView mTextView3 = view.findViewById(R.id.age);
                    //mImageView.setImageResource(images[i]);
                    Toast.makeText(showAllData.this, "" +i, Toast.LENGTH_SHORT).show();

                    try {
                        mTextView.setText(first_name.get(i));
                        mTextView2.setText(last_name.get(i));
                        mTextView3.setText(birth_date.get(i));
                    }catch(Exception e)
                    {}return view;
                }
            }
        }

