package com.example.operaciones2;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Salud extends AppCompatActivity {

    EditText txtNombre,txtPeso,txtAltura;
    Button btnCalcular,btnLimpiar;
    RadioButton rbtHombre,rbtMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtAltura = (EditText) findViewById(R.id.txtAltura);
        txtPeso = (EditText) findViewById(R.id.txtPeso);
        btnCalcular =(Button) findViewById(R.id.btnCalcular);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        rbtHombre = (RadioButton) findViewById(R.id.rbtHombre);
        rbtMujer = (RadioButton) findViewById(R.id.rbtMujer);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularIMC();
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAltura.setText("");
                txtNombre.setText("");
                txtPeso.setText("");
            }
        });

    }

    private String MensajeIMC(double IMC){
        String mensaje ="";
        String condicion ="";
        if (IMC<16){
            mensaje = "Peso bajo muy grave";
            condicion = "bajo";
        }
        else if (IMC >= 16 & IMC < 17){
            mensaje = "Peso bajo grave";
            condicion = "bajo";
        }
        else if (IMC >= 17 & IMC <=18.49){
            mensaje = "Bajo peso";
            condicion = "bajo";
        }
        else if (IMC >= 18.50 & IMC <=24.99){
            mensaje = "Peso normal";
            condicion = "normal";
        }
        else if (IMC >= 25 & IMC <=29.99){
            mensaje = "Sobrepeso";
            condicion = "alto";
        }
        else if (IMC >= 30 & IMC <=34.99){
            mensaje = "Obesidad grado I";
            condicion = "alto";
        }
        else if (IMC >= 35 & IMC <=39.99){
            mensaje = "Obesidad grado II";
            condicion = "alto";
        }
        else if (IMC > 40){
            mensaje = "Obesidad grado III";
            condicion = "alto";
        }
        else{
            mensaje = "Otro tipo de IMC";}

        Intent normal = new Intent(Salud.this,NormalPeso.class);
        normal.putExtra("nombre",txtNombre.getText().toString());
        normal.putExtra("mensaje",mensaje);
        normal.putExtra("condicion",condicion);
        normal.putExtra("imc",Double.toString(Math.round(IMC*100.0)/100.0));
        startActivity(normal);

        return mensaje;
    }


    public void CalcularIMC() {
        Double altura = Double.valueOf(txtAltura.getText().toString());
        Double peso = Double.valueOf(txtPeso.getText().toString());
        double IMC = peso / Math.pow(altura,2);

        Toast.makeText(this, "Tu IMC es" + String.format("%.2f",IMC)+MensajeIMC(IMC), Toast.LENGTH_SHORT).show();

    }
}