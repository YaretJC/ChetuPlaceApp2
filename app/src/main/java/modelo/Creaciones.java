package modelo;

/**
 * Created by yaret on 16/12/2016.
 */
public class Creaciones {

        private String idcreacion;
        private String Categoria;
        private String nombreLugar;



    private String imagen;
        private String descripcion;
        private String ubicacion;

        public Creaciones(String idcreacion,
                          String Categoria,
                          String nombreLugar,
                          String imagen,
                          String descripcion,
                          String ubicacion){
            this.idcreacion= idcreacion;
            this.Categoria = Categoria;
            this.nombreLugar = nombreLugar;
            this.imagen = imagen;
            this.descripcion = descripcion;
            this.ubicacion = ubicacion;
        }
        public String getIdcreacion() {
            return idcreacion;
        }


        public String getCategoria() {
            return Categoria;
        }


        public String getNombreLugar() {
            return nombreLugar;
        }


        public String getImagen() {  return imagen;       }


        public String getDescripcion() {
            return descripcion;
        }


        public String getUbicacion() {
            return ubicacion;
        }
        /**
         * Compara los atributos de dos metas
         *
         * @param creaciones Meta externa
         * @return true si son iguales, false si hay cambios
         */
        public boolean compararcon(Creaciones creaciones) {
            return this.Categoria.compareTo(creaciones.Categoria) == 0 &&
                    this.nombreLugar.compareTo(creaciones.nombreLugar) == 0 &&
                    this.imagen.compareTo(creaciones.imagen) == 0 &&
                    this.descripcion.compareTo(creaciones.descripcion) == 0 &&
                    this.ubicacion.compareTo(creaciones.ubicacion) == 0;
        }
    }


