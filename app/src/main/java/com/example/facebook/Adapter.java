package com.example.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends BaseAdapter {
    Context c;
    int layout;
    List<Persona> datos;

    public Adapter(Context c, int layout, List<Persona> datos) {
        this.c = c;
        this.layout = layout;
        this.datos = datos;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int i) {
        return datos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View v = inflater.inflate(layout,null);
        TextView tv1 = v.findViewById(R.id.txt_mnombre);
        ImageView img = v.findViewById(R.id.imag_perfil);
        ImageView imag = v.findViewById(R.id.imag_foto);
        TextView tv = v.findViewById(R.id.publicaion);
        TextView fecha = v.findViewById(R.id.fecha);
        tv.setText(datos.get(i).getPublicaion());
        tv1.setText(datos.get(i).getTxt_mnombre());
        imag.setImageBitmap(datos.get(i).imag_foto);

        fecha.setText(datos.get(i).getFecha());
        Button b1 = v.findViewById(R.id.btn_eliminar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datos.remove(i);
                notifyDataSetChanged();

            }
        });
        return v;
    }
}
