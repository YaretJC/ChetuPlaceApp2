package tools;

/**
 * Created by yaret on 16/12/2016.
 *
 * esta clase que contiene los códigos usados en "ChetuplaceApp" para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */

public class constantes {

    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     *
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://10.0.3.2:";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP + PUERTO_HOST + "/ChetuPlaceApp/obtenerCreaciones.php";
   /* public static final String GET_BY_ID = IP + PUERTO_HOST + "/ChetuPlaceApp/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/ChetuPlaceApp/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST + "/ChetuPlaceApp/borrar_meta.php";
    public static final String INSERT = IP + PUERTO_HOST + "/ChetuPlaceApp/insertar_meta.php";*/

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";
}
