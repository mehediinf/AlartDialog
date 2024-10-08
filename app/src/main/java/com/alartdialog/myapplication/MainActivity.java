package com.alartdialog.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    AlertDialog.Builder alertdialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_id);

        button.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {


        alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialogBuilder.setTitle(R.string.titel_text);
        alertdialogBuilder.setMessage(R.string.message_txt);
        alertdialogBuilder.setIcon(R.drawable.ic_launcher_foreground);
        alertdialogBuilder.setCancelable(false);

        alertdialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertdialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Click No Button",Toast.LENGTH_LONG).show();
            }
        });

        alertdialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Click Cancel Button",Toast.LENGTH_LONG).show();
            }
        });


        AlertDialog alertDialog = alertdialogBuilder.create();
        alertDialog.show();

    }
}