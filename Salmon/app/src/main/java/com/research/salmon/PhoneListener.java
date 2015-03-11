package com.research.salmon;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.NotificationCompat;
import android.telephony.PhoneStateListener;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

public class PhoneListener extends PhoneStateListener {
    private Context context;
    public PhoneListener(Context _context){
        this.context = _context;
    }
    public void onCallStateChanged(int state, String incomingNumber) {

        // Log.d("MyPhoneListener",state+"   incoming no:"+incomingNumber);

        // state = 1 means when phone is ringing
        if (state == 2) {

            String msg = " New Phone Call Event. Incoming Number : "+incomingNumber;
            int mID = 1;
            long when = System.currentTimeMillis();
            NotificationManager notificationManager = (NotificationManager) context
                    .getSystemService(Context.NOTIFICATION_SERVICE);

            Intent notificationIntent = new Intent(context, afterCall.class);
            notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,
                    notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);


            Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            writeToFile(2, Calendar.getInstance().getTime().toString(), context);
            NotificationCompat.Builder mNotifyBuilder = new NotificationCompat.Builder(
                    context).setSmallIcon(R.drawable.ic_launcher)
                    .setContentTitle("Phone Call Made")
                    .setContentText("Touch to Take Survey")
                    .setSound(alarmSound)
                    .setAutoCancel(true).setWhen(when)
                    .setContentIntent(pendingIntent)
                    .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000});
            notificationManager.notify(mID,mNotifyBuilder.build());
            mID++;

        }
    }

    public void writeToFile(int type, String time, Context c){
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

        }

        catch (Exception e)

        {
            e.printStackTrace();
            //                    outputStream = openFileOutput(filename, Context.MODE_APPEND);
            Toast.makeText(c, "File not saved!", Toast.LENGTH_SHORT).show();
        }
    }
}