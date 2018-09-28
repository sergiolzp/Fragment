package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rjuarez on 11/09/2018.
 */

public class ListViewPersonalizado extends Activity {
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view_personalizado);

        listView = findViewById(R.id.list_pers);

        String[] marca = new String[]{"BWM", "Ford", "Nissa"};
        String[] modelo = new String[]{"320i", "Eagle", "Tsuru"};
        String[] anio = new String[]{"2013", "2016", "2001"};

        int[] img_marca = new int[]{R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};


        ArrayList<ItemAuto> arrayList = new ArrayList<>();
        AdapterAutos adapterAutos;

        for (int index = 0; index <= marca.length - 1; index++) {
            arrayList.add(new ItemAuto(marca[index], modelo[index],
                    anio[index], img_marca[index]));
        }

        adapterAutos = new AdapterAutos(this, 0, arrayList);
        listView.setAdapter(adapterAutos);
    }
}
