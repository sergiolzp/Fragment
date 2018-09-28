package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rjuarez on 11/09/2018.
 */

public class AdapterAutos extends ArrayAdapter<ItemAuto> {
    private Activity activity;
    private ArrayList<ItemAuto> items;

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();

        TextView lbl_marca, lbl_modelo, lbl_anio;
        ImageView img_marca;

        RelativeLayout contenedor;

        View item = inflater.inflate(R.layout.item_auto,
                parent, false);

        lbl_marca = item.findViewById(R.id.lbl_marca);
        lbl_modelo = item.findViewById(R.id.lbl_modelo);
        lbl_anio = item.findViewById(R.id.lbl_anio);
        img_marca = item.findViewById(R.id.img_marca);
        contenedor = item.findViewById(R.id.contenedor);


        lbl_marca.setText(items.get(position).getMarca());
        lbl_modelo.setText(items.get(position).getModelo());
        lbl_anio.setText(items.get(position).getAnio());
        img_marca.setImageResource(items.get(position).getImg_marca());

        contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, items.get(position).getMarca().toString(),
                        Toast.LENGTH_LONG).show();
            }
        });

        return item;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    public AdapterAutos(@NonNull Activity context, int resource,
                        ArrayList<ItemAuto> items) {
        super(context, resource, items);

        this.activity = context;
        this.items = items;
    }


}
