package com.example.examen02pregunta02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);

    }
    class Vista extends View {

        public Vista(Context context){
            super(context);
        }
        public void onDraw(Canvas canvas){
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2);
            paint.setColor(Color.GRAY);

            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(5);
            paint2.setColor(Color.RED);

            Paint paintTexto = new Paint();
            paintTexto.setTextSize(25);
            paintTexto.setStrokeWidth(5);
            paintTexto.setColor(Color.BLACK);

            int ancho = canvas.getWidth();
            //margen
            canvas.drawRect(10,1400,ancho-10,20,paint);
            //cuadricula
            for(int i=0;i<10;i++){
                canvas.drawLine(100,200+(i*100),ancho-100,200+(i*100),paint);
            }
            //numerosKilometos
            //3412023
            canvas.drawText("3",200,460,paintTexto);
            canvas.drawText("4",310,260,paintTexto);
            canvas.drawText("1",420,860,paintTexto);
            canvas.drawText("2",530,660,paintTexto);
            canvas.drawText("0",640,1060,paintTexto);
            canvas.drawText("2",750,660,paintTexto);
            canvas.drawText("3",860,460,paintTexto);

            //lineas
            canvas.drawLine(200,500,310,300,paint2);
            canvas.drawLine(310,300,420,900,paint2);
            canvas.drawLine(420,900,530,700,paint2);
            canvas.drawLine(530,700,640,1100,paint2);
            canvas.drawLine(640,1100,750,700,paint2);
            canvas.drawLine(750,700,860,500,paint2);
            //textoDias
            for(int i=0;i<7;i++) {
                canvas.drawText("Dia"+(i+1),(200+(i*110)),1200,paintTexto);
            }
            canvas.drawText("DIAS",500,1300,paintTexto);
            //texto
            canvas.drawText("PROGRESO",500,100,paintTexto);
            canvas.rotate(270, 60, 600);
            canvas.drawText("Kilometros", 60, 600, paintTexto);
        }
    }

}