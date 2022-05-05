package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity {

    //declara variables
    TextView resultados, total;
    Button porcentaje, limpiar, dividir, siete, ocho, nueve, cuatro, cinco, seis, uno, dos, tres, resta, suma, multiplicacion,
            signo, cero, punto, igual, borrar, avanzada, Parentesis;
    boolean parentesis = false;
    String proceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inicial();
    }

    public void Inicial() {
        resultados = findViewById(R.id.proceso);
        total = findViewById(R.id.resultado);

        cero = (Button) findViewById(R.id.cero);
        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);

        suma = (Button) findViewById(R.id.suma);
        multiplicacion = findViewById(R.id.multiplicar);
        resta = findViewById(R.id.resta);
        Parentesis = findViewById(R.id.parentesis);
        dividir = findViewById(R.id.dividir);
        punto = findViewById(R.id.punto);
        porcentaje = findViewById(R.id.porcentaje);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "9");
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "+");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "-");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "*");
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "/");
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + ".");
            }
        });
        Parentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (parentesis) {
                    proceso = resultados.getText().toString();
                    resultados.setText(proceso + ")");
                    parentesis = false;
                } else {
                    proceso = resultados.getText().toString();
                    resultados.setText(proceso + "(");
                    parentesis = true;
                }
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso = resultados.getText().toString();
                resultados.setText(proceso + "%");
            }
        });


    }

    public void clear(View view) {
        resultados.setText("");
        total.setText("");

    }

    public void borrar(View view) {

        String string = resultados.getText().toString();

        if (string.length() >= 1) {
            string = string.substring(0, string.length() - 1);
            resultados.setText(string);
        } else if (string.length() < 1) {
            resultados.setText("");
        }

    }
}

//    public void igual(View view){
//
//        proceso = resultados.getText().toString();
//        proceso = proceso.replaceAll( " x " , "*" );
//        proceso = proceso.replaceAll( "%" , "/100" );
//
//        Context context =  Context. enter();
//        context.setOptimizationLevel( - 1 );
//
//        String ResultFinal =  "" ;
//
//        try {
//            Scriptable scriptable = context.initStandardObjects();
//            ResultFinal= context.evaluateString(scriptable, proceso, "javascript", 1,null).toString();
//
//
//        }catch (Exception e){
//            ResultFinal= " 0 " ;
//
//        }
//        total.setText(ResultFinal);
//    }
//
//
//}