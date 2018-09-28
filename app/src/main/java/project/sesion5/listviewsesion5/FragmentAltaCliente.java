package project.sesion5.listviewsesion5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentAltaCliente extends Fragment {
    Button btn_agregar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alta_cliente, container, false);

        btn_agregar = view.findViewById(R.id.btn_guardar);

        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Estoy en el fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
