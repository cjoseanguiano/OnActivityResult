package com.onactivityresult.devix.onactivityresult;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 10;
    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = (EditText) findViewById(R.id.editText);
        editTextB = (EditText) findViewById(R.id.editText2);
        editTextc = (EditText) findViewById(R.id.editText3);

    }
    public void abrirActivity(View view){
        Intent intent =  new Intent(getApplicationContext(),Segundo.class);
        String nombre = editTextA.getText().toString();
        int nUno = Integer.valueOf(editTextB.getText().toString());
        int nDos = Integer.valueOf(editTextc.getText().toString());

        Alumno alumno = new Alumno(nombre,nUno,nDos);
        intent.putExtra("pasarvalor",alumno);
        //startActivity(intent);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if (data.hasExtra("suma")){
                Toast.makeText(getApplicationContext(),"Suma es " + data.getExtras().getInt("suma"),Toast.LENGTH_SHORT).show();
            }
        }
        //super.onActivityResult(requestCode, resultCode, data);
    }
}
