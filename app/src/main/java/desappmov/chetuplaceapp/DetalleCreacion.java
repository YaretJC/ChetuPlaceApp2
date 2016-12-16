package desappmov.chetuplaceapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tools.constantes;

public class DetalleCreacion extends AppCompatActivity {

    private String idCreacion;

    /**
     * Inicia una nueva instancia de la actividad
     *
     * @param activity Contexto desde donde se lanzará
     * @param idCreacion   Identificador de la creacion a detallar
     */
    public static void launch(Activity activity, String idCreacion) {
        Intent intent = getLaunchIntent(activity, idCreacion);
        activity.startActivityForResult(intent, constantes.CODIGO_DETALLE);
    }
    /**
     * Construye un Intent a partir del contexto y la actividad
     * de detalle.
     *
     * @param context Contexto donde se inicia
     * @param idCreacion  Identificador de la Creacion
     * @return Intent listo para usar
     */
    public static Intent getLaunchIntent(Context context, String idCreacion) {
        Intent intent = new Intent(context, DetalleCreacion.class);
        intent.putExtra(constantes.EXTRA_ID, idCreacion);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_creacion);
    }
}
