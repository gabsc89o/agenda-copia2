package com.example.usuari.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<contactos> l = new ArrayList<contactos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void agregar2(View v){
        Intent intent=new Intent(this,ActivityAdd.class);
        this.startActivity(intent);
    }
    public void vertodos(View v){
        Intent intent=new Intent(this,ActivityShow.class);
        this.startActivity(intent);
        /*for(contactos p : l){
            exit.setText(p.getName());
        }
        System.out.println("paso1");
        for(contactos p : new ActivityAdd().getContact()){
            exit.setText(p.getName());
        }
        System.out.println("paso2");*/
    }
    public void find(View v){
        Intent intent=new Intent(this,ActivityFind.class);
        this.startActivity(intent);
    }
}
