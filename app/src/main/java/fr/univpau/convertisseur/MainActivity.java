package fr.univpau.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import fr.univpau.convertisseur.listener.ActionConvertion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "onstart()");

        Spinner spinnerSrc = (Spinner) findViewById(R.id.SpinnerSrc);

        Spinner spinnerDest = (Spinner) findViewById(R.id.SpinnerDest);

        EditText textSrc = (EditText) findViewById(R.id.enterSrc);

        EditText textDest = (EditText) findViewById(R.id.enterDest);
        textDest.setEnabled(false);

        Button b = findViewById(R.id.boutonConv);
        b.setOnClickListener(new ActionConvertion(spinnerSrc, spinnerDest, textSrc, textDest));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "onresume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "onpause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onstop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "onrestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "ondestroy()");
    }
}