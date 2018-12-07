package com.example.jlavado.generacionmarco.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jlavado.generacionmarco.R;
import com.example.jlavado.generacionmarco.adapters.MarcoAdapter;
import com.example.jlavado.generacionmarco.modelo.Data;
import com.example.jlavado.generacionmarco.modelo.SQLConstantes;
import com.example.jlavado.generacionmarco.modelo.pojos.ItemMarco;
import com.example.jlavado.generacionmarco.modelo.pojos.POJOFragmentVivienda;

import java.util.ArrayList;

public class MarcoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MarcoAdapter marcoAdapter;
    private ArrayList<ItemMarco> itemMarcos;
    private ArrayList<String> anios;
    private ArrayList<String> meses;
    private ArrayList<String> periodos;
    private ArrayList<String> zonas;
    private String nickUsuario;
    private String idUsuario;
    private String idCargo;
    private Spinner spAnio;
    private Spinner spMeses;
    private Spinner spPeriodos;
    private Spinner spZonas;
    private Button btnFiltrar;
    private Button btnMostrarTodo;
    private LinearLayoutManager linearLayoutManager;

    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marco);
        nickUsuario = getIntent().getExtras().getString("nickUsuario");
        idUsuario = getIntent().getExtras().getString("idUsuario");
        idCargo = getIntent().getExtras().getString("idCargo");


        spAnio = (Spinner) findViewById(R.id.marco_sp_anio);
        spMeses = (Spinner) findViewById(R.id.marco_sp_mes);
        spPeriodos = (Spinner) findViewById(R.id.marco_sp_periodo);
        spZonas = (Spinner) findViewById(R.id.marco_sp_zona);
        btnFiltrar = (Button) findViewById(R.id.marco_btnFiltrar);
        btnMostrarTodo = (Button) findViewById(R.id.marco_btnMotrarTodo);

        Toolbar toolbar =  (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.nombre_encuesta));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MarcoActivity.this);
                builder.setMessage("¿Está seguro que desea salir de la aplicación?")
                        .setTitle("Aviso")
                        .setCancelable(false)
                        .setNegativeButton("No",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setPositiveButton("Sí",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });



        recyclerView = (RecyclerView) findViewById(R.id.recycler_encuestado);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        spAnio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i > 0) obtenerMeses(Integer.parseInt(spAnio.getSelectedItem().toString()));
                if(i == 0) meses = new ArrayList<String>();
                cargarSpinerMeses(meses);
                periodos = new ArrayList<String>();
                cargarSpinerPeriodos(periodos);
                zonas = new ArrayList<String>();
                cargarSpinerZonas(zonas);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        spMeses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i > 0) obtenerPeriodos(Integer.parseInt(spMeses.getSelectedItem().toString()));
                if(i == 0) periodos = new ArrayList<String>();
                cargarSpinerPeriodos(periodos);
                zonas = new ArrayList<String>();
                cargarSpinerZonas(zonas);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        spPeriodos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i > 0) obtenerZonas(Integer.parseInt(spPeriodos.getSelectedItem().toString()));
                if(i == 0) zonas = new ArrayList<String>();
                cargarSpinerZonas(zonas);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        btnFiltrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zonas.size() > 1 && spZonas.getSelectedItemPosition() != 0){
                    obtenerMarcoFiltrado(spAnio.getSelectedItem().toString(),
                            spMeses.getSelectedItem().toString(),
                            spPeriodos.getSelectedItem().toString(),
                            spZonas.getSelectedItem().toString());
                }else{
                    Toast.makeText(MarcoActivity.this, "DEBE SELECCIONAR TODOS LOS CAMPOS ANTES DE FILTRAR", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMostrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerMarcoTotal();
                spAnio.setSelection(0);
            }
        });
    }

    public void obtenerMarcoFiltrado(String anio,String mes, String periodo, String conglomerado){
        itemMarcos = new ArrayList<>();
        Data data = new Data(MarcoActivity.this);
        data.open();
//        itemMarcos = data.getListMarcoFiltrado(Integer.parseInt(anio), Integer.parseInt(mes),Integer.parseInt(periodo),Integer.parseInt(conglomerado));
        itemMarcos = data.getListMarcoFiltrado2(anio, mes,periodo,conglomerado);
        data.close();
        //setearAdapter();
    }

    public void obtenerMarcoTotal(){
        inicializarDatos();
        cargarSpinerAnios(anios);
        cargarSpinerMeses(meses);
        cargarSpinerPeriodos(periodos);
        cargarSpinerZonas(zonas);
        //setearAdapter();
    }

    public void obtenerMeses(int anio){
        meses = new ArrayList<String>();
        meses.add("Seleccione");
        for(ItemMarco itemMarco : itemMarcos){
            if(Integer.parseInt(itemMarco.getAnio())== anio){
                if(!meses.contains(itemMarco.getMes())){
                    meses.add(String.valueOf(itemMarco.getMes()));
                }
            }
        }
    }
    public void obtenerPeriodos(int mes){
        periodos = new ArrayList<String>();
        periodos.add("Seleccione");
        for(ItemMarco itemMarco : itemMarcos){
            if(Integer.parseInt(itemMarco.getMes())== mes){
                if(!periodos.contains(itemMarco.getPeriodo())){
                    periodos.add(String.valueOf(itemMarco.getPeriodo()));
                }
            }
        }
    }
    public void obtenerZonas(int periodo){
        zonas = new ArrayList<String>();
        zonas.add("Seleccione");
        for(ItemMarco itemMarco : itemMarcos){
            if(Integer.parseInt(itemMarco.getPeriodo())== periodo){
                if(!zonas.contains(itemMarco.getZona())){
                    zonas.add(String.valueOf(itemMarco.getZona()));
                }
            }
        }
    }

    public void cargarSpinerAnios(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAnio.setAdapter(adapter);
    }
    public void cargarSpinerMeses(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMeses.setAdapter(adapter);
    }

    public void cargarSpinerPeriodos(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPeriodos.setAdapter(adapter);
    }

    public void cargarSpinerZonas(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spZonas.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_marco,menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.opcion_exportar:
//                Intent intent = new Intent(MarcoActivity.this,ExportarActivity.class);
//                intent.putExtra("idUsuario",idUsuario);
//                startActivity(intent);
//                return true;
//            case R.id.opcion_importar:
//                Intent intent1 = new Intent(MarcoActivity.this,ImportarActivity.class);
//                startActivity(intent1);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
    @SuppressLint("NewApi")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Está seguro que desea salir de la aplicación?")
                    .setTitle("Aviso")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })
                    .setPositiveButton("Sí",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    finish();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }
    private void inicializarDatos() {
        itemMarcos = new ArrayList<ItemMarco>();
        anios = new ArrayList<String>();
        meses = new ArrayList<String>();
        periodos = new ArrayList<String>();
        zonas = new ArrayList<String>();
        data = new Data(this);
        data.open();
        if (idCargo.equals("1")) itemMarcos = data.getListMarco(idUsuario);
        else itemMarcos = data.getListMarcoSupervisor(idUsuario);
        data.close();
        anios.add("Seleccione");
        if (itemMarcos.size()>0) anios.add(String.valueOf(itemMarcos.get(0).getAnio()));
    }

//    public void setearAdapter(){
//        marcoAdapter = new MarcoAdapter(itemMarcos, new MarcoAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Intent intent = new Intent(getApplicationContext(), ViviendaActivity.class);
//                intent.putExtra("nickUsuario", nickUsuario);
//                intent.putExtra("idVivienda", itemMarcos.get(position).get_id()+"");
//                intent.putExtra("vivienda_zona", itemMarcos.get(position).getZona()+"");
//                intent.putExtra("vivienda_mes", itemMarcos.get(position).getMes()+"");
//                intent.putExtra("vivienda_anio", itemMarcos.get(position).getAnio()+"");
//                intent.putExtra("vivienda_periodo", itemMarcos.get(position).getPeriodo()+"");
//                intent.putExtra("idUsuario", idUsuario);
//
//                Data data = new Data(MarcoActivity.this);
//                POJOFragmentVivienda pojoFragmentVivienda = new POJOFragmentVivienda(itemMarcos.get(position).get_id()+"");
//                data.open();
//                if (!data.existeElemento(SQLConstantes.tablafragmentsvivienda,itemMarcos.get(position).get_id()+"")){
//                    data.insertarElemento(SQLConstantes.tablafragmentsvivienda,pojoFragmentVivienda.toValues());
//                }
//                data.close();
//                startActivity(intent);
//            }
//        });
//        recyclerView.setAdapter(marcoAdapter);
//    }

    @Override
    protected void onResume() {
        inicializarDatos();
        cargarSpinerAnios(anios);
        cargarSpinerMeses(meses);
        cargarSpinerPeriodos(periodos);
        cargarSpinerZonas(zonas);
        //setearAdapter();
        super.onResume();
    }
}
