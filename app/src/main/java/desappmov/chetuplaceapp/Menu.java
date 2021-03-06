package desappmov.chetuplaceapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //pasa a otro layaut
        findViewById(R.id.txtLugares).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Lugares.class));
            }
        });

        //pasa a otro layaut
        findViewById(R.id.txtPreferencias).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, listadoPreferencias.class));
            }
        });

        //pasa a otro layaut
        findViewById(R.id.txtCreaciones).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Creaciones.class));
            }
        });
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }*/
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Se seleccionó la primer opción", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.opcion2) {
            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle("Cerrar Sesion");
            dialogo1.setMessage("¿Desea salir de ChetuPlace?");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    Intent ListSong = new Intent(getApplicationContext(), InicioSesion.class);
                    startActivity(ListSong);

                }

            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                }
            });
            dialogo1.show();

        }

        return super.onOptionsItemSelected(item);


        //Toast.makeText(this,"Se seleccionó la segunda opción",Toast.LENGTH_LONG).show();



    }


}
