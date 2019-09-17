package com.example.clasesantiago9_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    List<String> datos;
    ArrayAdapter<String> adapter;//transforma las lista inflandolas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.grid_view);
        datos= new ArrayList<>();
        datos.add("holi");
        datos.add("codigo");

        //adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, datos);
        adapter = new ArrayAdapter<>
                (this,R.layout.grid_item, datos);
        gridView.setAdapter(adapter);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                