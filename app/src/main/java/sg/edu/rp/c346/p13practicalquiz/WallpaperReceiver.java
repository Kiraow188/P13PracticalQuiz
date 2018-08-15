package sg.edu.rp.c346.p13practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;


public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        int id = pref.getInt("id", R.id.msg1);
        if (id== R.id.msg1){
            Toast.makeText(context, R.string.msg1, Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(context, R.string.msg2, Toast.LENGTH_LONG).show();
        }
    }
}
