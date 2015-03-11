package com.research.salmon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SeekBar;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class randomTimePrompt extends Activity {

    String q1sp1r, q1sp2r, q3sp1r, q4sp1r, q5sp1r;
    String q1et1r, q1et2r;
    int q1sb1r, q1sb2r, q5sb1r, q5sb2r, q5sb3r, q5sb4r;
    String filename = "salmon_randomTime.txt";
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_time1);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        SeekBar q1sb1 = (SeekBar) findViewById(R.id.seekBar1_Q1);
        q1sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q1sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q1sb2 = (SeekBar) findViewById(R.id.seekBar2_Q1);
        q1sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q1sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next1r);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.random_time2);
                setUpQ2();
            }
        });
    }




    public void setUpQ2(){
        EditText q2et2 = (EditText) findViewById(R.id.Q2_CompanionOther);
        q2et2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q1et2r = v.toString();
                }
                return true;
            }
        });
        EditText q2et1 = (EditText) findViewById(R.id.Q2_ActivityOther);
        q2et1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q1et1r = v.toString();
                }
                return true;
            }
        });

        Spinner q1sp1 = (Spinner) findViewById(R.id.Q2_ActivitySpinner);
        ArrayAdapter<CharSequence> q1sp1a = ArrayAdapter.createFromResource(this,
                R.array.activity_options, android.R.layout.simple_spinner_item);
        q1sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q1sp1.setAdapter(q1sp1a);
        q1sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String response;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q1sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner q1sp2 = (Spinner) findViewById(R.id.Q2_CompanionSpinner);
        ArrayAdapter<CharSequence> q1sp2a = ArrayAdapter.createFromResource(this,
                R.array.companion_options, android.R.layout.simple_spinner_item);
        q1sp2a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q1sp2.setAdapter(q1sp2a);
        q1sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String response;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q1sp2r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Button next2 = (Button) findViewById(R.id.next2r);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.random_time3);
                setUpQ3();
            }
        });

    }
    public void setUpQ3(){
        Spinner q3sp1 = (Spinner) findViewById(R.id.Q3_Spinner);
        ArrayAdapter<CharSequence> q3sp1a = ArrayAdapter.createFromResource(this,
                R.array.Q3_Choices, android.R.layout.simple_spinner_item);
        q3sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q3sp1.setAdapter(q3sp1a);
        q3sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String response;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q3sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Button next3 = (Button) findViewById(R.id.next3r);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.random_time4);
                setUpQ4();
            }
        });

    }
    public void setUpQ4(){
        Spinner q4sp1 = (Spinner) findViewById(R.id.Q4_Spinner);
        ArrayAdapter<CharSequence> q4sp1a = ArrayAdapter.createFromResource(this,
                R.array.Q3_Choices, android.R.layout.simple_spinner_item);
        q4sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q4sp1.setAdapter(q4sp1a);
        q4sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String response;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q4sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Button next4 = (Button) findViewById(R.id.next4r);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.random_time5);
                setUpQ5();
            }
        });


    }
    public void setUpQ5(){

        Spinner q5sp1 = (Spinner) findViewById(R.id.Q5_Spinner);
        ArrayAdapter<CharSequence> q5sp1a = ArrayAdapter.createFromResource(this,
                R.array.Q5_Choices, android.R.layout.simple_spinner_item);
        q5sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q5sp1.setAdapter(q5sp1a);
        q5sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String response;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q5sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        SeekBar q5sb1 = (SeekBar) findViewById(R.id.seekBar1_Q5);
        q5sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q5sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SeekBar q5sb2 = (SeekBar) findViewById(R.id.seekBar2_Q5);
        q5sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q5sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SeekBar q5sb3 = (SeekBar) findViewById(R.id.seekBar3_Q5);
        q5sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q5sb3r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SeekBar q5sb4 = (SeekBar) findViewById(R.id.seekBar4_Q5);
        q5sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q5sb4r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = q1sb1r + " positive, \n" + q1sb2r + " negative \n" + q1sp1r + " " + q1et1r + "\n" + q1sp2r + " " + q1et2r + "\n" + q4sp1r + "\n" + q5sb1r + "\n" + q5sb2r + "\n" + q5sb3r + "\n" + q5sb4r + "\n" + q5sp1r;
                String root = Environment.getExternalStorageDirectory().toString();
                File myDir = new File(root + "/Salmon");
                myDir.mkdirs();
                String fname = "RTPrompt.txt";
                File file = new File(myDir, fname);
                try {
                    FileOutputStream out = new FileOutputStream(file, true);
                    out.write(string.getBytes());
                    out.close();
                    Toast.makeText(submit.getContext(), "File saved!", Toast.LENGTH_SHORT).show();

                }

                catch (Exception e){
                    e.printStackTrace();
//                    outputStream = openFileOutput(filename, Context.MODE_APPEND);
                    Toast.makeText(submit.getContext(), "File not saved!", Toast.LENGTH_SHORT).show();
                }

                Intent i = new Intent(randomTimePrompt.this, MainActivity.class);
                randomTimePrompt.this.startActivity(i);
            }
        });
    }
}