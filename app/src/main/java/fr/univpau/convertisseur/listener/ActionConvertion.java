package fr.univpau.convertisseur.listener;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import fr.univpau.convertisseur.calcul.Convertion;

public class ActionConvertion implements View.OnClickListener {
    private Spinner SpinSrc;
    private Spinner SpinDest;
    private EditText textSrc;
    private EditText textDest;

    public ActionConvertion(Spinner SpinSrc, Spinner SpinDest, EditText textSrc, EditText textDest) {
        this.SpinSrc = SpinSrc;
        this.SpinDest = SpinDest;
        this.textSrc = textSrc;
        this.textDest = textDest;
    }
    @Override
    public void onClick(View v) {
        Log.i("BOUTON", "on click");

        Log.i("BOUTON", SpinSrc.getSelectedItem().toString());

        Log.i("BOUTON", "value : "+ textSrc.getText().toString());

        if(textSrc.getText().toString().matches("")) {
            Log.i("BOUTON", "valeur incorrecte");
            Context context = v.getContext();
            CharSequence message = "Veuillez entrer une valeur";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, message,duration);
            toast.show();
        }else{
            Log.i("BOUTON", "valeur correcte");
            Convertion c = new Convertion();
            String tempSrc = SpinSrc.getSelectedItem().toString();
            String tempDest = SpinDest.getSelectedItem().toString();
            float temp = Float.parseFloat(textSrc.getText().toString());
            float res = c.ConvertionTemp(temp, tempSrc,tempDest);
            textDest.setText(String.valueOf(res));
        }



    }
}
