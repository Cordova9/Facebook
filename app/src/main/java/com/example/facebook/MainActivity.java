package com.example.facebook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   EditText crear_publicacion;
   Button btn_publicar;
    GridView gridView;
    List<Persona> datos;
    Adapter adapter;
    Button boton;
    Bitmap foto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Persona p1 = new  Persona("Charlie","https://www.purina.es/gato/purina-one/sites/g/files/mcldtz1856/files/2018-06/6_El_comportamiento_de_los_gatitos%20%282%29.jpg",
         "",foto,"fecha");

        btn_publicar = findViewById(R.id.btn_publicar);
        crear_publicacion = findViewById(R.id.editText);
        gridView = findViewById(R.id.gridView);
        boton = findViewById(R.id.button);
        datos = new ArrayList<>();

        adapter = new Adapter
                (this, R.layout.grid_item, datos);
       //ArrayAdapter adapter = new Arraydater (this.,android.R.simple_list_item,datos);
        gridView.setAdapter(adapter);

        btn_publicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mydate = java.text.DateFormat.getDateInstance().format(Calendar.getInstance().getTime());
                datos.add(new Persona(p1.getTxt_mnombre(),
                        p1.getImg_perfil(),
                        crear_publicacion.getText().toString(),
                        foto,
                        mydate));
                    adapter.notifyDataSetChanged();//se a cambiado algo y que actualiza



            }
        });
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(intent, 1);
                }

            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==1 && resultCode == RESULT_OK){
            foto= data.getParcelableExtra("data");

        }
    }
}

