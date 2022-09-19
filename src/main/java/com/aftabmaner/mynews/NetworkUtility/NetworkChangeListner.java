package com.aftabmaner.mynews.NetworkUtility;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

import com.aftabmaner.mynews.R;

public class NetworkChangeListner extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Common.isConnectedToInternet(context)) {    //INTERNET IS NOT CONNECTED
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            View layout_dailog = LayoutInflater.from(context).inflate(R.layout.check_internet_dailog, null);
            builder.setView(layout_dailog);

            AppCompatButton Btn_retry = layout_dailog.findViewById(R.id.btnRetry);


            //SHOW DAILOG
            AlertDialog dialog = builder.create();
            dialog.show();
            dialog.setCancelable(false);

            dialog.getWindow().setGravity(Gravity.CENTER);

            Btn_retry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    onReceive(context, intent);
                }
            });
        }


    }
}

