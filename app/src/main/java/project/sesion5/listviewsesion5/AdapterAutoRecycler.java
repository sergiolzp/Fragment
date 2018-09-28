package project.sesion5.listviewsesion5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterAutoRecycler extends RecyclerView.Adapter<AdapterAutoRecycler.ViewCustomHolder> {

    private Context context;
    private ArrayList<ItemAuto> itemAutos;
    private LayoutInflater inflater;

    public AdapterAutoRecycler(Context context, ArrayList<ItemAuto> itemAutos) {
        this.context = context;
        this.itemAutos = itemAutos;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewCustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_auto_cardview,
                parent, false);

        ViewCustomHolder holder = new ViewCustomHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewCustomHolder holder, int position) {
        holder.lbl_marca.setText(itemAutos.get(position).getMarca().toString());
        holder.lbl_modelo.setText(itemAutos.get(position).getModelo().toString());
        holder.lbl_anio.setText(itemAutos.get(position).getAnio().toString());

        holder.img_marca.setImageResource(itemAutos.get(position).getImg_marca());
    }


    class ViewCustomHolder extends RecyclerView.ViewHolder {

        TextView lbl_marca, lbl_modelo, lbl_anio;
        ImageView img_marca;

        public ViewCustomHolder(View itemView) {
            super(itemView);

            lbl_marca = itemView.findViewById(R.id.lbl_marca);
            lbl_modelo = itemView.findViewById(R.id.lbl_modelo);
            lbl_anio = itemView.findViewById(R.id.lbl_anio);

            img_marca = itemView.findViewById(R.id.img_marca);

        }
    }


    @Override
    public int getItemCount() {
        return itemAutos.size();
    }
}
