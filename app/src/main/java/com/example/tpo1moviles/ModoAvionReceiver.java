package com.example.tpo1moviles;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean modoAvionDetectado = intent.getBooleanExtra("state",false);

        if(modoAvionDetectado){
            Toast.makeText(context, "Modo avion activo", Toast.LENGTH_SHORT).show();
            Intent marcando= new Intent(Intent.ACTION_DIAL);
            marcando.setData(Uri.parse("tel:2664553747"));
            marcando.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(marcando);

        }
        else{
            Toast.makeText(context, "Modo avion desactivado", Toast.LENGTH_SHORT).show();
        }

    }
}