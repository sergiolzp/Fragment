package project.sesion5.listviewsesion5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivityFragment extends Activity {
    Button btn_agregar_cliente, btn_mostrar_lista_cliente;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        btn_agregar_cliente = findViewById(R.id.btn_cliente);
        btn_mostrar_lista_cliente = findViewById(R.id.btn_lista_cliente);

        btn_agregar_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarFragment(new FragmentAltaCliente());
            }
        });

        btn_mostrar_lista_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarFragment(new FragmentListadoClientes());
            }
        });

    }

    public void mostrarFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedor, fragment);

        fragmentTransaction.commit();
    }


}
