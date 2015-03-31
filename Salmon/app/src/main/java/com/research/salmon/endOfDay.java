package com.research.salmon;

import android.app.Activity;
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
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class endOfDay extends Activity {
    int q1sb1r, q1sb2r, q2sb1r, q3sb1r, q4sb1r, q4sb2r, q4sb3r, q4sb4r, q4sb5r, q4sb6r, q5sb1r, q5sb2r, q5sb3r, q5sb4r, q6sb1r, q6sb2r, q6sb3r, q6sb4r, q6sb5r, q6sb6r, q6sb7r, q6sb8r, q6sb9r, q6sb10r, q6sb11r, q6sb12r, q6sb13r, q6sb14r, q6sb15r, q6sb16r, q6sb17r, q6sb18r, q7sb1r, q8sb1r, q8sb2r, q8sb3r, q8sb4r, q8sb5r, q8sb6r, q8sb7r, q8sb8r, q8sb9r, q8sb10r, q9sb1r, q9sb2r, q10sb1r, q10sb2r, q10sb3r, q10sb4r, q10sb5r, q10sb6r, q10sb7r, q10sb8r, q10sb9r, q10sb10r, q11sb1r, q12sb1r, q12sb2r;
    String q9sp1r, q9etr, q12sp1r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.endofday1);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        SeekBar q1sb1 = (SeekBar) findViewById(R.id.q1_sb1);
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

        SeekBar q1sb2 = (SeekBar) findViewById(R.id.q1_sb2);
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
        final Button next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday2);
                setUpQ2();
            }
        });
    }


    public void setUpQ2() {
        SeekBar q2sb1 = (SeekBar) findViewById(R.id.q2_sb1);
        q2sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

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
        final Button next1 = (Button) findViewById(R.id.next2);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday3);
                setUpQ3();
            }
        });
    }

    public void setUpQ3() {
        SeekBar q3sb1 = (SeekBar) findViewById(R.id.q3_sb1);
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

        final Button next1 = (Button) findViewById(R.id.next3);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday4);
                setUpQ4();
            }
        });

    }

    public void setUpQ4() {
        SeekBar q4sb1 = (SeekBar) findViewById(R.id.q4_sb1);
        q4sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        SeekBar q4sb2 = (SeekBar) findViewById(R.id.q4_sb2);
        q4sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q4sb3 = (SeekBar) findViewById(R.id.q4_sb3);
        q4sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb3r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q4sb4 = (SeekBar) findViewById(R.id.q4_sb4);
        q4sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb4r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q4sb5 = (SeekBar) findViewById(R.id.q4_sb5);
        q4sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb5r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q4sb6 = (SeekBar) findViewById(R.id.q4_sb6);
        q4sb6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q4sb6r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next4);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday5);
                setUpQ5();
            }
        });

    }

    public void setUpQ5() {
        SeekBar q5sb1 = (SeekBar) findViewById(R.id.q5_sb1);
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


        SeekBar q5sb2 = (SeekBar) findViewById(R.id.q5_sb2);
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

        SeekBar q5sb3 = (SeekBar) findViewById(R.id.q5_sb3);
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

        SeekBar q5sb4 = (SeekBar) findViewById(R.id.q5_sb4);
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

        final Button next1 = (Button) findViewById(R.id.next5);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6);
                setUpQ6();
            }
        });
    }

    public void setUpQ6() {
        SeekBar q6sb1 = (SeekBar) findViewById(R.id.q6_sb1);
        q6sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb2 = (SeekBar) findViewById(R.id.q6_sb2);
        q6sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb3 = (SeekBar) findViewById(R.id.q6_sb3);
        q6sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb3r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next6);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6b);
                setUpQ6B();
            }
        });
    }

    public void setUpQ6B() {
        SeekBar q6sb4 = (SeekBar) findViewById(R.id.q6_sb4);
        q6sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb4r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb5 = (SeekBar) findViewById(R.id.q6_sb5);
        q6sb5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb5r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb6 = (SeekBar) findViewById(R.id.q6_sb6);
        q6sb6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb6r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next6b);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6c);
                setUpQ6C();
            }
        });
    }

    public void setUpQ6C() {
        SeekBar q6sb7 = (SeekBar) findViewById(R.id.q6_sb7);
        q6sb7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb7r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb8 = (SeekBar) findViewById(R.id.q6_sb8);
        q6sb8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb8r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb9 = (SeekBar) findViewById(R.id.q6_sb9);
        q6sb9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb9r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next6c);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6d);
                setUpQ6D();
            }
        });
    }

    public void setUpQ6D() {
        SeekBar q6sb10 = (SeekBar) findViewById(R.id.q6_sb10);
        q6sb10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb10r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb11 = (SeekBar) findViewById(R.id.q6_sb11);
        q6sb11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb11r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb12 = (SeekBar) findViewById(R.id.q6_sb12);
        q6sb12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb12r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next1 = (Button) findViewById(R.id.next6d);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6e);
                setUpQ6E();
            }
        });
    }

    public void setUpQ6E() {
        SeekBar q6sb13 = (SeekBar) findViewById(R.id.q6_sb13);
        q6sb13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb13r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb14 = (SeekBar) findViewById(R.id.q6_sb14);
        q6sb14.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb14r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb15 = (SeekBar) findViewById(R.id.q6_sb15);
        q6sb15.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb15r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next1 = (Button) findViewById(R.id.next6e);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday6f);
                setUpQ6F();
            }
        });
    }

    public void setUpQ6F() {
        SeekBar q6sb16 = (SeekBar) findViewById(R.id.q6_sb16);
        q6sb16.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb16r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb17 = (SeekBar) findViewById(R.id.q6_sb17);
        q6sb17.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb17r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q6sb18 = (SeekBar) findViewById(R.id.q6_sb18);
        q6sb18.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q6sb18r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next6f);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday7);
                setUpQ7();
            }
        });
    }

    public void setUpQ7() {

        SeekBar q7sb1 = (SeekBar) findViewById(R.id.q7_sb1);
        q7sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q7sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button next1 = (Button) findViewById(R.id.next7);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday8);
                setUpQ8();
            }
        });
    }

    public void setUpQ8() {

        SeekBar q8sb1 = (SeekBar) findViewById(R.id.q8_sb1);
        q8sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb2 = (SeekBar) findViewById(R.id.q8_sb2);
        q8sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb3 = (SeekBar) findViewById(R.id.q8_sb3);
        q8sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb3r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb4 = (SeekBar) findViewById(R.id.q8_sb4);
        q8sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb4r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb5 = (SeekBar) findViewById(R.id.q8_sb5);
        q8sb5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb5r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb6 = (SeekBar) findViewById(R.id.q8_sb6);
        q8sb6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb6r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb7 = (SeekBar) findViewById(R.id.q8_sb7);
        q8sb7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb7r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb8 = (SeekBar) findViewById(R.id.q8_sb8);
        q8sb8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb8r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb9 = (SeekBar) findViewById(R.id.q8_sb9);
        q8sb9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb9r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q8sb10 = (SeekBar) findViewById(R.id.q8_sb10);
        q8sb10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q8sb10r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next1 = (Button) findViewById(R.id.next8);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday9);
                setUpQ9();
            }
        });
    }

    public void setUpQ9() {
        SeekBar q9sb1 = (SeekBar) findViewById(R.id.q9_sb1);
        q9sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q9sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q9sb2 = (SeekBar) findViewById(R.id.q9_sb2);
        q9sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q9sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Spinner q9sp1 = (Spinner) findViewById(R.id.q9_s1);
        ArrayAdapter<CharSequence> q9sp1a = ArrayAdapter.createFromResource(this,
                R.array.precentages, android.R.layout.simple_spinner_item);
        q9sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q9sp1.setAdapter(q9sp1a);
        q9sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q9sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final EditText q9et = (EditText) findViewById(R.id.q9_e1);
        q9et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            String response;

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    q9etr = v.toString();
                }
                return true;
            }
        });
        final Button next1 = (Button) findViewById(R.id.next9);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday10);
                setUpQ10();
            }
        });
    }

    public void setUpQ10() {
        SeekBar q10sb1 = (SeekBar) findViewById(R.id.q10_sb1);
        q10sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        SeekBar q10sb2 = (SeekBar) findViewById(R.id.q10_sb2);
        q10sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb3 = (SeekBar) findViewById(R.id.q10_sb3);
        q10sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb3r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb4 = (SeekBar) findViewById(R.id.q10_sb4);
        q10sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb4r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb5 = (SeekBar) findViewById(R.id.q10_sb5);
        q10sb5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb5r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb6 = (SeekBar) findViewById(R.id.q10_sb6);
        q10sb6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb6r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb7 = (SeekBar) findViewById(R.id.q10_sb7);
        q10sb7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb7r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb8 = (SeekBar) findViewById(R.id.q10_sb8);
        q10sb8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb8r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb9 = (SeekBar) findViewById(R.id.q10_sb9);
        q10sb9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb9r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q10sb10 = (SeekBar) findViewById(R.id.q10_sb10);
        q10sb10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q10sb10r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next1 = (Button) findViewById(R.id.next10);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday11);
                setUpQ11();
            }
        });
    }

    public void setUpQ11() {
        SeekBar q11sb1 = (SeekBar) findViewById(R.id.q11_sb1);
        q11sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q11sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button next1 = (Button) findViewById(R.id.next11);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.endofday12);
                setUpQ12();
            }
        });

    }

    public void setUpQ12() {
        Spinner q12sp1 = (Spinner) findViewById(R.id.q12_s1);
        ArrayAdapter<CharSequence> q12sp1a = ArrayAdapter.createFromResource(this,
                R.array.companion_options, android.R.layout.simple_spinner_item);
        q12sp1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q12sp1.setAdapter(q12sp1a);
        q12sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                q12sp1r = (String) parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        SeekBar q12sb1 = (SeekBar) findViewById(R.id.q12_sb1);
        q12sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q12sb1r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar q12sb2 = (SeekBar) findViewById(R.id.q12_sb2);
        q12sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChanged = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                q12sb2r = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        final Button submit = (Button) findViewById(R.id.submitEnd);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = q1sb1r + "Positive" + "/n" + q1sb2r + "Negative" + "/n" + q2sb1r + "Not Effective" + "/n" + q3sb1r + "Extremely Disliked" + "/n" + q4sb1r + "Felt Relaxed" + "/n" + q4sb2r + "Entered Social Situations" + "/n" + q4sb3r + "At ease talking to strangers" + "/n" + q4sb4r + "Avoided New People" + "/n" + q4sb5r + "Worried about peoples opinions" + "/n" + q4sb6r + "Anxious about being foolish in front of people" + "/n" + q5sb1r + "Was dwelling on mistakes I made in social interactions" + "/n" + q5sb2r + "Kept thinking about bad things that could happen during social interactions" + "/n" + q5sb3r + "Was worrying about how my social interactions would turn out" + "/n" + q5sb4r + "I kept thinking about bad things that could happen during social interactions" + "/n" + q6sb1r + ">2 hours" + "/n" + q6sb2r + "Very positive" + "/n" + q6sb3r + "Very negative" + "/n" + q6sb4r + ">2 hours" + "/n" + q6sb5r + "Very positive" + "/n" + q6sb6r + "Very negative" + "/n" + q6sb7r + ">2 hours" + "/n" + q6sb8r + "Very positive" + "/n" + q6sb9r + "Very negative" + "/n" + q6sb10r + ">2 hours" + "/n" + q6sb11r + "Very positive" + "/n" + q6sb12r + "Very negative" + "/n" + q6sb13r + ">2 hours" + "/n" + q6sb14r + "Very positive" + "/n" + q6sb15r + "Very negative" + "/n" + q6sb16r + ">2 hours" + "/n" + q6sb17r + "Very positive" + "/n" + q6sb18r + "Very negative" + "/n" + q7sb1r + "Very invaded" + "/n" + q8sb1r + "All the time" + "/n" + q8sb2r + "All the time" + "/n" + q8sb3r + "All the time" + "/n" + q8sb4r + "All the time" + "/n" + q8sb5r + "All the time" + "/n" + q8sb6r + "All the time" + "/n" + q8sb7r + "All the time" + "/n" + q8sb8r + "All the time" + "/n" + q8sb9r + "All the time" + "/n" + q8sb10r + "All the time" + "/n" + q9sp1r + "All the time" + "/n" + q9sb2r + "All the time" + "/n" + q9sp1r + "/n" + q9etr + "/n" + q10sb1r + "A great deal" + "/n" + q10sb2r + "A great deal" + "/n" + q10sb3r + "A great deal" + "/n" + q10sb4r + "A great deal" + "/n" + q10sb5r + "A great deal" + "/n" + q10sb6r + "A great deal" + "/n" + q10sb7r + "A great deal" + "/n" + q10sb8r + "A great deal" + "/n" + q10sb9r + "A great deal" + "/n" + q10sb10r + "A great deal" + "/n" + q11sb1r + "75%" + "/n" + q12sb1r + "Very effectively" + "/n" + q12sb2r + "Extremely like them";
                String root = Environment.getExternalStorageDirectory().toString();
                File myDir = new File(root + "/Salmon");
                myDir.mkdirs();
                String fname = "EndOfDayPrompt.txt";
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

                Intent i = new Intent(endOfDay.this, MainActivity.class);
                endOfDay.this.startActivity(i);
            }
        });

    }
}