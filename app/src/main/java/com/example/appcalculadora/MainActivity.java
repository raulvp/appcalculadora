package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    public EditText pantalla;
    public double operando1,operando2,respuesta;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = (EditText) findViewById(R.id.et_pantalla);
    }

    /*********
     *
     * botones
     * @param v
     */

    //boton1
    public void boton1(View v){
        String captura = pantalla.getText().toString();
        captura = captura+1;
        pantalla.setText(captura);
    }
    //boton2
    public void boton2(View v){
        String captura = pantalla.getText().toString();
        captura = captura+2;
        pantalla.setText(captura);
    }
    //boton3
    public void boton3(View v){
        String captura = pantalla.getText().toString();
        captura = captura+3;
        pantalla.setText(captura);
    }
    //boton4
    public void boton4(View v){
        String captura = pantalla.getText().toString();
        captura = captura+4;
        pantalla.setText(captura);
    }
    //boton5
    public void boton5(View v){
        String captura = pantalla.getText().toString();
        captura = captura+5;
        pantalla.setText(captura);
    }
    //boton6
    public void boton6(View v){
        String captura = pantalla.getText().toString();
        captura = captura+6;
        pantalla.setText(captura);
    }

    /*********OPERACIONES*************/

    public void suma(View v){
        String aux = pantalla.getText().toString();
        operando1 = Double.parseDouble(aux);
        pantalla.setText("");//limpiando pantalla
        operacion=1;
    }

    public void resta(View v){
        String aux = pantalla.getText().toString();
        operando1 = Double.parseDouble(aux);
        pantalla.setText("");//limpiando pantalla
        operacion=2;
    }

    /*******OPERACION IGUAL******/

    public void igual(View v){

        String aux2 = pantalla.getText().toString();
        operando2 = Double.parseDouble(aux2);
        pantalla.setText("");

        if(operacion==1){
            respuesta = operando1+operando2; //suma de operadores
        }
        if(operacion==2){
            respuesta = operando1 - operando2;
        }

        pantalla.setText(respuesta+"");
        operando1 = respuesta;
    }

}
