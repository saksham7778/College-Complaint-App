package com.example.lenovo.log_in_with_database;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class CustomListView extends ArrayAdapter<String> {

private String[] profilename;
private String[] surname;
private String[] age;
private Activity context;
        Bitmap bitmap;

public CustomListView(Activity context,String[] profilename,String[] surname,String[] age) {
        super(context, R.layout.row_data,profilename);
        this.context=context;
        this.profilename=profilename;
        this.surname=surname;
        this.age=age;
        }

@NonNull
@Override

public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null){
        LayoutInflater layoutInflater=context.getLayoutInflater();
        r=layoutInflater.inflate(R.layout.row_data,null,true);
        viewHolder=new ViewHolder(r);
        r.setTag(viewHolder);
        }
        else {
        viewHolder=(ViewHolder)r.getTag();

        }

        viewHolder.tvw1.setText(profilename[position]);
        viewHolder.tvw2.setText(surname[position]);
        viewHolder.tvw3.setText(age[position]);


        return r;
        }

class ViewHolder{

    TextView tvw1;
    TextView tvw2;
    TextView tvw3;

    ViewHolder(View v){
        tvw1=(TextView)v.findViewById(R.id.name);
        tvw2=(TextView)v.findViewById(R.id.surname);
        tvw3=(TextView)v.findViewById(R.id.age);
    }

}

    public class GetImageFromURL extends AsyncTask<String,Void,String>
    {

        ImageView imgView;

        public GetImageFromURL(ImageView imgv)
        {
            this.imgView=imgv;
        }
        @Override
        protected String doInBackground(String... url) {
            String urldisplay=url[0];
            bitmap=null;

            try{

                InputStream ist=new java.net.URL(urldisplay).openStream();
                bitmap= BitmapFactory.decodeStream(ist);
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }

            return String.valueOf(bitmap);
        }

        
        protected void onPostExecute(Bitmap bitmap){

            super.onPostExecute(String.valueOf(bitmap));
            imgView.setImageBitmap(bitmap);
        }
    }
}




