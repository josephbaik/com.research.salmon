package com.research.salmon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.provider.Telephony;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

public class textReceiver extends BroadcastReceiver {
    public textReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        goAsync();
        if (intent.getAction().equals(Telephony.Sms.Intents.SMS_RECEIVED_ACTION)) {
            writeToFile(0, Calendar.getInstance().getTime().toString(), context);
        }

    }

    public void writeToFile(int type, String time, Context c) {
        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/Salmon");
        if (!myDir.exists()) {
            myDir.mkdir();
        }
        String fname = "callLog.txt";
        File file = new File(myDir, fname);
        String s = "";
        if (type == 2) {
            s += "Call Made: ";
        } else if (type == 1) {
            s += "Text Sent: ";
        } else if (type == 0) {
            s += "Text Received: ";
        }
        try {
            FileOutputStream out = new FileOutputStream(file, true);
            out.write((s + time + "\n").getBytes());
            out.close();
            Toast.makeText(c, "File saved!", Toast.LENGTH_SHORT).show();

        } catch (Exception e)

        {
            e.printStackTrace();
            //                    outputStream = openFileOutput(filename, Context.MODE_APPEND);
            Toast.makeText(c, "File not saved!", Toast.LENGTH_SHORT).show();
        }
    }
}
