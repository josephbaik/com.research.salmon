package com.research.salmon;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.io.FileOutputStream;
import android.content.Context;
import java.io.File;
import android.widget.Toast;

/**
 * Created by Joseph and Andrew on 2/14/2015.
 */
public class afterCall extends Activity {
    String q1spr, q4spr, q5sp1r, q5sp2r;
    String q1etr, q4etr, q5et1r, q5et2r;
    int q2sb1r, q2sb2r, q3sb1r, q3sb2r;
    int currentID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aftercall1);
        currentID = R.layout.aftercall1;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        Spinner q1sp = (Spinner) findViewById(R.id.spinner_Q1);
        ArrayAdapter<CharSequence> q1spa = ArrayAdapter.createFromResource(this,
                R.array.companion_options, android.R.layout.simple_spinner_item);
        q1spa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q1sp.setAdapter(q1spa);
        q1sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q1spr = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText q1et = (EditText) findViewById(R.id.answer_1);
        q1et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q1etr = v.toString();
                }
                return true;
            }
        });

        final Button next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.aftercall2);
                setUpQuestion2();
            }
        });
    }



/*Setup methods for each individual question, 1,2,3,4,5. Each has a next button which starts the next question. Final question had submit button for finishing. Back button takes you back to the home screen, Andrew Mitchell, 3/9/15*/

    public void setUpQuestion2() {
        final SeekBar q2sb1 = (SeekBar) findViewById(R.id.seekBar1_Q2);
        q2sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q2sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q2sb2 = (SeekBar) findViewById(R.id.seekBar2_Q2);
        q2sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q2sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.aftercall3);
                setUpQuestion3();
            }
        });
    }

    public void setUpQuestion3() {
        final SeekBar q3sb1 = (SeekBar) findViewById(R.id.seekBar1_Q3);
        q3sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q3sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q3sb2 = (SeekBar) findViewById(R.id.seekBar2_Q3);
        q3sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q3sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next3 = (Button) findViewById(R.id.next3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.aftercall4);
                setUpQuestion4();
            }
        });
    }
    public void setUpQuestion4() {
        Spinner q4sp = (Spinner) findViewById(R.id.spinner_Q4);
        ArrayAdapter<CharSequence> q4spa = ArrayAdapter.createFromResource(this,
                R.array.purpose_list, android.R.layout.simple_spinner_item);
        q4spa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q4sp.setAdapter(q4spa);
        q4sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q4spr = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        EditText q4et = (EditText) findViewById(R.id.answer_4);
        q4et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q4etr = v.toString();
                }
                return true;
            }
        });
        final Button next4 = (Button) findViewById(R.id.next4);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.aftercall5);
                setUpQuestion5();
            }
        });
    }

    public void setUpQuestion5() {

        Spinner q5sp1 = (Spinner) findViewById(R.id.spinner1_Q5);
        ArrayAdapter<CharSequence> q5spa1 = ArrayAdapter.createFromResource(this,
                R.array.activity_options, android.R.layout.simple_spinner_item);
        q5spa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q5sp1.setAdapter(q5spa1);
        q5sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q5sp1r = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner q5sp2 = (Spinner) findViewById(R.id.spinner2_Q5);
        ArrayAdapter<CharSequence> q5spa2 = ArrayAdapter.createFromResource(this,
                R.array.companion_options, android.R.layout.simple_spinner_item);
        q5spa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q5sp2.setAdapter(q5spa2);
        q5sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q5sp2r = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        EditText q5et1 = (EditText) findViewById(R.id.answer1_5);
        q5et1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q5et1r = v.toString();
                }
                return true;
            }
        });

        EditText q5et2 = (EditText) findViewById(R.id.answer2_5);
        q5et2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q5et2r = v.toString();
                }
                return true;
            }
        });
        final Button submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String filename = "salmon_afterCall.txt";
                String string = q1spr + " " + q1etr + "\n" + q2sb1r + " positive, " + q2sb2r + " negative \n" + q3sb1r + " positive, " + q3sb2r + " negative \n" + q4spr + " " + q4etr + "\n" + q5sp1r + " " +  q5et1r + "\n" + q5sp2r + " " + q5et2r;
                String root = Environment.getExternalStorageDirectory().toString();
                File myDir = new File(root + "/Salmon");
                myDir.mkdirs();
                String fname = "FCPrompt.txt";
                File file = new File(myDir, fname);
                try {

                    FileOutputStream out = new FileOutputStream(file, true);
                    out.write(string.getBytes());
                    out.close();
                    Toast.makeText(submit.getContext(), "File saved!", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
//                    outputStream = openFileOutput(filename, Context.MODE_APPEND);
                    Toast.makeText(submit.getContext(), "File not saved!", Toast.LENGTH_SHORT).show();
                }
                Intent i = new Intent(afterCall.this, MainActivity.class);
                afterCall.this.startActivity(i);
            }
        });
    }
}
