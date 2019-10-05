package com.example.singh_practical_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    EditText commentBox;
    Button nextButton;

    private static final String fileName = "subjects.txt";
    private static final String comment = "comment.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.cb1);
        checkBox2 = findViewById(R.id.cb2);
        checkBox3 = findViewById(R.id.cb3);
        checkBox4 = findViewById(R.id.cb4);
        checkBox5 = findViewById(R.id.cb5);
        checkBox6 = findViewById(R.id.cb6);
        checkBox7 = findViewById(R.id.cb7);
        checkBox8 = findViewById(R.id.cb8);
        commentBox = findViewById(R.id.editText);

    }

    public void saveData(View v)
    {
        String subjectString = "";

        if(checkBox1.isChecked())
        {
            String text=checkBox1.getText().toString();
            subjectString = subjectString + "\n" + text + "\n";
        }
        if(checkBox2.isChecked())
        {
            String text=checkBox2.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox3.isChecked())
        {
            String text=checkBox3.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox4.isChecked())
        {
            String text=checkBox4.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox5.isChecked())
        {
            String text=checkBox5.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox6.isChecked())
        {
            String text=checkBox6.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox7.isChecked())
        {
            String text=checkBox7.getText().toString();
            subjectString = subjectString + text + "\n";
        }
        if(checkBox8.isChecked())
        {
            String text=checkBox8.getText().toString();
            subjectString = subjectString + text;
        }

        String comment = commentBox.getText().toString();

        FileOutputStream fos;
        FileOutputStream fos2;
        try {
            fos = openFileOutput("subjects.txt", MODE_PRIVATE);
            OutputStreamWriter out = new OutputStreamWriter(fos);
            out.write(subjectString);
            out.close();
            fos.close();
            fos2 = openFileOutput("comment.txt", MODE_PRIVATE);
            OutputStreamWriter out2 = new OutputStreamWriter(fos2);
            out2.write(comment);
            out2.close();
            fos2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "Data Saved... " , Toast.LENGTH_LONG).show();



    }
    public void nextActivity(View v)
    {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}