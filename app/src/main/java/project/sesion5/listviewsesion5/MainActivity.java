package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by rjuarez on 11/09/2018.
 */

public class MainActivity extends Activity {

    Button btn_predeterminado, btn_personalizado, btn_recycler, btn_fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        btn_predeterminado = findViewById(R.id.btn_predeterminado);
        btn_personalizado = findViewById(R.id.btn_personalizado);
        btn_recycler = findViewById(R.id.btn_recycler);
        btn_fragment = findViewById(R.id.btn_fragment);

        btn_predeterminado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,
                        ListViewPredeterminado.class));
            }
        });

        btn_personalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListViewPersonalizado.class));
            }
        });

        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });

        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityFragment.class));
            }
        });
    }
}
