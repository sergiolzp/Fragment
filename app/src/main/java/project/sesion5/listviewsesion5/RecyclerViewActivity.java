package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends Activity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_view_activity);

        recyclerView = findViewById(R.id.rview);

        String[] marca = new String[]{"BWM", "Ford", "Nissa"};
        String[] modelo = new String[]{"320i", "Eagle", "Tsuru"};
        String[] anio = new String[]{"2013", "2016", "2001"};

        int[] img_marca = new int[]{R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};


        ArrayList<ItemAuto> arrayList = new ArrayList<>();
        AdapterAutoRecycler adapterAutos;

        for (int index = 0; index <= marca.length - 1; index++) {
            arrayList.add(new ItemAuto(marca[index], modelo[index],
                    anio[index], img_marca[index]));
        }

        adapterAutos = new AdapterAutoRecycler(this, arrayList);
        recyclerView.setAdapter(adapterAutos);

        //lista desplegable de manera vertical
        //recyclerView.setLayoutManager(new LinearLayoutManager((this)));

        //lista desplegable de manera horizontal
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
        //  LinearLayoutManager.HORIZONTAL, false);
        //recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
