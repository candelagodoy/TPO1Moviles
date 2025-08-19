package com.example.tpo1moviles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ModoAvionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean modoAvionDetectado = intent.getBooleanExtra("connected",false);

        if(modoAvionDetectado){
            Toast.makeText(context, "Modo avion activo", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Modo avion desactivado", Toast.LENGTH_SHORT).show();
        }

    }
}