package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityShow extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = this.getIntent();
        list = (ListView) this.findViewById(R.id.lvAll);
        final List<contactos> vlist=new ArrayList<contactos>();
        for(contactos p : MainActivity.l){
            vlist.add(p);
        }
        ArrayAdapter<contactos> adapter= new
                ArrayAdapter<contactos>(this, android.R.layout.simple_list_item_1, vlist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void
                    onItemClick(AdapterView<?> parent,
                                View view, int position, long id) {
                        Toast.makeText(ActivityShow.this, "name= " + vlist.get(position).getName()+ '\n' +
                                "age= " + vlist.get(position).getAge() +'\n' +
                                "mail= " + vlist.get(position).getMail() , Toast.LENGTH_LONG).show();
                    }
                });
    }
    public void cerrar(View v){
        this.finish();
    }

}
