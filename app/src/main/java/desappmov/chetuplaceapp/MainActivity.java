package desappmov.chetuplaceapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    public int XX;
    public int XY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this,InicioSesion.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public class EjemploView extends View {
        public EjemploView(Context context) {
            super(context);
        }


        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            drawBrackground(canvas);
        }

        private void drawBrackground(Canvas canvas) {
            int ancho = canvas.getWidth();
            int x = canvas.getWidth();
            int y = canvas.getHeight();
            XX = x / 2;
            XY = y / 2;


            Paint pincel1 = new Paint();
            pincel1.setAntiAlias(true);

            //circulo AZUL
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,79,213,255 );
            pincel1.setStrokeWidth(5);
            canvas.drawCircle(x / 2, y / 2, 300, pincel1);

            //rectangulo de enmedio (cafe)
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,89,37,1 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(200, 600, ancho - 200, 780, pincel1);

            //rectangulo NEGRO CARRO
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.BLACK);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(305,620,ancho-305,685,pincel1);

            //rectangulo BLANCO CARRO
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.WHITE);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(320,630,ancho-320,675,pincel1);

            //rectangulo NEGRO
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.BLACK);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(290,650,ancho-290,700,pincel1);

            //rectangulo NEGRO LLANTAS
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.BLACK);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(310,700,ancho-390,720,pincel1);

            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.BLACK);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(390,700,ancho-310,720,pincel1);

            pincel1.setColor(Color.WHITE);
            pincel1.setTextSize(20);
            pincel1.setTypeface(Typeface.SERIF);
            canvas.drawText("TRAVEL", x / 2 - 30, y / 2 +200, pincel1);




            //titulo
            pincel1.setColor(Color.WHITE);
            pincel1.setTextSize(50);
            pincel1.setTypeface(Typeface.SERIF);
            canvas.drawText("Chetu-Places", x / 2 -150, y / 2 -120, pincel1);


            //rectangulos anaranjados
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.parseColor("#f76d04"));
            pincel1.setStrokeWidth(3);
            canvas.drawRect(150,600,ancho-500,780,pincel1);


            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.parseColor("#f76d04"));
            pincel1.setStrokeWidth(3);
            canvas.drawRect(500,600,ancho-150,780,pincel1);


            //rectangulo negro MANIJA
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setColor(Color.BLACK);
            pincel1.setStrokeWidth(3);
            canvas.drawRect(300,530,ancho-300,600,pincel1);


            //rectangulo azul MANIJA
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,79,213,255 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(305,560,ancho-305,600,pincel1);


            //rectangulos izquierdos ESQUINAS VERDE
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,210,255,173 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(150,600,ancho-520,630,pincel1);

            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,210,255,173 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(150,750,ancho-520,780,pincel1);


            //rectangulos derechos ESQUINAS VERDE
            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,210,255,173 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(520,600,ancho-150,630,pincel1);

            pincel1.setStyle(Paint.Style.FILL);
            pincel1.setARGB( 255,210,255,173 );
            pincel1.setStrokeWidth(3);
            canvas.drawRect(520,750,ancho-150,780,pincel1);


        }



    }







}
