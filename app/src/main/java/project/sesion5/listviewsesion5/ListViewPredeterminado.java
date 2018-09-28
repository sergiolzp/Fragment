package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by rjuarez on 11/09/2018.
 */

public class ListViewPredeterminado extends Activity {

    ListView list_pred;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view_predeterminado);

        list_pred = findViewById(R.id.lst_pred);

        ArrayAdapter<String> adapter;

        String[] autos = new String[]{"BMW", "FORD", "NISSAN", "KIA", "CHEVROLET", "MAZDA"};

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                autos);

        list_pred.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewPredeterminado.this,
                        "Auto: " + (String) list_pred.getItemAtPosition(i)
                                + "Fila: " + String.valueOf(l),
                        Toast.LENGTH_LONG).show();
            }
        });

        list_pred.setAdapter(adapter);
    }
}
