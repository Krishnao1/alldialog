package com.example.krish.alldialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);

         b1.setOnClickListener(new View.OnClickListener()
         {
             @Override
             public void onClick(View view)
             {
                 AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                 alert.setTitle("hello");
                 alert.setMessage("THIS IS NORMAL DIALOG");

                 alert.setPositiveButton("YES", new DialogInterface.OnClickListener()
                 {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i)
                     {
                         Toast.makeText(MainActivity.this,"YES",Toast.LENGTH_SHORT).show();
                         finish();

                     }
                 });

                 alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Toast.makeText(MainActivity.this,"NO",Toast.LENGTH_SHORT).show();
                     }
                 });
                 alert.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                       Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_SHORT).show();

                     }

                 });
                 alert.show();

             }

         });

         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom);
                Button bt=dialog.findViewById(R.id.button);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });dialog.show();

             }
         });

         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                 progressDialog.setTitle("Please Wait");
                 progressDialog.setMessage("Content Loading");
                 progressDialog.dismiss();
                 progressDialog.setCancelable(true);
                 progressDialog.show();

             }
         });

         b4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                 progressDialog.setTitle("Please Wait");
                 progressDialog.setMessage("Content Loading");
                 progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                 progressDialog.show();
             }
         });


    }
}
