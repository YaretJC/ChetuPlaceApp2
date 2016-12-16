package tools;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import desappmov.chetuplaceapp.DetalleCreacion;
import desappmov.chetuplaceapp.R;
import modelo.Creaciones;

/**
 * Created by yaret on 16/12/2016.
 */
public class CreacionesAdapter extends RecyclerView.Adapter<CreacionesAdapter.CreacionesViewHolder>
        implements ItemClickListener {

    /**
     * Lista de objetos {@link Creaciones} que representan la fuente de datos
     * de inflado
     */
    private List<Creaciones> items;

    /*
    Contexto donde actua el recycler view
     */
    private Context context;


    public CreacionesAdapter(List<Creaciones> items, Context context) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public CreacionesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_creaciones, viewGroup, false);
        return new CreacionesViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(CreacionesViewHolder viewHolder, int i) {
        viewHolder.Categoria.setText(items.get(i).getCategoria());
        viewHolder.nombreLugar.setText(items.get(i).getNombreLugar());
        viewHolder.descripcion.setText(items.get(i).getDescripcion());
        viewHolder.ubicacion.setText(items.get(i).getUbicacion());
    }

    /**
     * Sobrescritura del método de la interfaz {@link ItemClickListener}
     *
     * @param view     item actual
     * @param position posición del item actual
     */
    @Override
    public void onItemClick(View view, int position) {
        DetalleCreacion.launch(
                (Activity) context, items.get(position).getIdcreacion());
    }


    public static class CreacionesViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public TextView Categoria;
        public TextView nombreLugar;
        public TextView descripcion;
        public TextView ubicacion;
        public ItemClickListener listener;

        public CreacionesViewHolder(View v, ItemClickListener listener) {
            super(v);
            Categoria = (TextView) v.findViewById(R.id.Categoria);
            nombreLugar = (TextView) v.findViewById(R.id.nombreLugar);
            descripcion = (TextView) v.findViewById(R.id.descripcion);
            ubicacion = (TextView) v.findViewById(R.id.ubicacion);
            this.listener = listener;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}


interface ItemClickListener {
    void onBindViewHolder(CreacionesAdapter.CreacionesViewHolder viewHolder, int i);

    void onItemClick(View view, int position);
}


