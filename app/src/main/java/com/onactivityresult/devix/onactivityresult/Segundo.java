package com.onactivityresult.devix.onactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segundo extends AppCompatActivity {

    Alumno alumno;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        textView = (TextView) findViewById(R.id.textView);
        alumno = getIntent().getParcelableExtra("pasarvalor");
        textView.setText(alumno.getNombre() + "--" + alumno.getnUno() + "--" + alumno.getnDos());
    }


    @Override
    public void finish() {
        Intent i = new Intent();
        int resultado = alumno.getnUno() + alumno.getnDos();
        i.putExtra("suma", resultado);
        setResult(RESULT_OK, i);
        super.finish();
    }
}
