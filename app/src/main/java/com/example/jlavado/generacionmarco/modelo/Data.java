package com.example.jlavado.generacionmarco.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jlavado.generacionmarco.modelo.pojos.ItemMarco;
import com.example.jlavado.generacionmarco.modelo.pojos.Marco;
import com.example.jlavado.generacionmarco.modelo.pojos.POJOFragmentVivienda;
import com.example.jlavado.generacionmarco.modelo.pojos.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Data {
    Context contexto;
    SQLiteOpenHelper sqLiteOpenHelper;
    SQLiteDatabase sqLiteDatabase;

    public Data(Context contexto) {
        this.contexto = contexto;
        sqLiteOpenHelper = new DataBaseHelper(contexto);
    }

    public Data(Context contexto, int flag) throws IOException {
        this.contexto = contexto;
        sqLiteOpenHelper = new DataBaseHelper(contexto);
        createDataBase();
    }

    public Data(Context contexto, String inputPath) throws IOException {
        this.contexto = contexto;
        sqLiteOpenHelper = new DataBaseHelper(contexto);
        createDataBase(inputPath);
    }


    public void createDataBase() throws IOException {
        boolean dbExist = checkDataBase();
        if (!dbExist) {
            sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
            sqLiteDatabase.close();
            try {
                copyDataBase();
                sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_CARATULA);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FUNCIONARIOS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_HOGARES);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_VISITA_ENCUESTADOR);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_VISITA_SUPERVISOR);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_RESULTADO_ENCUESTADOR);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_RESULTADO_SUPERVISOR);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO1H);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO1V);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO2);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3_P309_RUTAS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3_P318_PERSONAS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO4);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO5);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO6);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO7);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO8);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_LAYOUTS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_COBERTURA_FRAGMENTS);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS_HOGAR);
                sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS_VIVIENDA);
                sqLiteDatabase.close();
            } catch (IOException e) {
                throw new Error("Error: copiando base de datos");
            }
        }

    }


    public void createDataBase(String inputPath) throws IOException {
        boolean dbExist = checkDataBase();
        if (dbExist) {
            File dbFile = new File(SQLConstantes.DB_PATH + SQLConstantes.DB_NAME);
            SQLiteDatabase.deleteDatabase(dbFile);
        }
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
        sqLiteDatabase.close();
        try {
            copyDataBase(inputPath);
            sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_CARATULA);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FUNCIONARIOS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_HOGARES);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_VISITA_ENCUESTADOR);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_VISITA_SUPERVISOR);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_RESULTADO_ENCUESTADOR);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_RESULTADO_SUPERVISOR);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO1H);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO1V);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO2);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3_P309_RUTAS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO3_P318_PERSONAS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO4);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO5);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO6);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO7);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_MODULO8);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_LAYOUTS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_COBERTURA_FRAGMENTS);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS_HOGAR);
            sqLiteDatabase.execSQL(SQLConstantes.SQL_CREATE_TABLA_FRAGMENTS_VIVIENDA);
            sqLiteDatabase.close();
        } catch (IOException e) {
            throw new Error("Error: copiando base de datos");
        }
    }


    public void copyDataBase() throws IOException {
        InputStream myInput = contexto.getAssets().open(SQLConstantes.DB_NAME);
        String outFileName = SQLConstantes.DB_PATH + SQLConstantes.DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) != -1) {
            if (length > 0) {
                myOutput.write(buffer, 0, length);
            }
        }
        myOutput.flush();
        myInput.close();
        myOutput.close();
    }


    public void copyDataBase(String inputPath) throws IOException {
        InputStream myInput = new FileInputStream(inputPath);
        String outFileName = SQLConstantes.DB_PATH + SQLConstantes.DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) != -1) {
            if (length > 0) {
                myOutput.write(buffer, 0, length);
            }
        }
        myOutput.flush();
        myInput.close();
        myOutput.close();

    }

    public void open() throws SQLException {
        String myPath = SQLConstantes.DB_PATH + SQLConstantes.DB_NAME;
        sqLiteDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public synchronized void close() {
        if (sqLiteDatabase != null) {
            sqLiteDatabase.close();
        }
    }

    public boolean checkDataBase() {
        try {
            String myPath = SQLConstantes.DB_PATH + SQLConstantes.DB_NAME;
            sqLiteDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
        } catch (Exception e) {
            File dbFile = new File(SQLConstantes.DB_PATH + SQLConstantes.DB_NAME);
            return dbFile.exists();
        }
        if (sqLiteDatabase != null) sqLiteDatabase.close();

        return sqLiteDatabase != null ? true : false;
    }


    public int getNumeroPais(String id) {
        int numero = 0;
        String[] whereArgs = new String[]{id};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablapaises,
                    null, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                numero = cursor.getInt(cursor.getColumnIndex(SQLConstantes.paises_numero));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return numero;
    }

    public String getCodigoPais(int numero) {
        String id = "";
        String[] whereArgs = new String[]{String.valueOf(numero)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablapaises,
                    null, SQLConstantes.WHERE_CLAUSE_NUMERO, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                id = cursor.getString(cursor.getColumnIndex(SQLConstantes.paises_id));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return id;
    }

    public int getNumeroRutaPais(String id) {
        int numero = 0;
        String[] whereArgs = new String[]{id};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablarutas,
                    null, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                numero = cursor.getInt(cursor.getColumnIndex(SQLConstantes.rutas_numero));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return numero;
    }

    public String getCodigoRutaPais(int numero) {
        String id = "";
        String[] whereArgs = new String[]{String.valueOf(numero)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablarutas,
                    null, SQLConstantes.WHERE_CLAUSE_NUMERO, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                id = cursor.getString(cursor.getColumnIndex(SQLConstantes.rutas_id));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return id;
    }


    public Marco getMarco(String idVivienda) {
        Marco marco = null;
        String[] whereArgs = new String[]{idVivienda};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamarco,
                    null, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                marco = new Marco();
                marco.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_id)));
                marco.setAnio(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_anio)));
                marco.setMes(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mes)));
                marco.setPeriodo(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_periodo)));
                marco.setConglomerado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_conglomerado)));
                marco.setCodccpp(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_codccpp)));
                marco.setNomccpp(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_nomccpp)));
                marco.setNorden(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_norden)));
                marco.setZona(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_zona)));
                marco.setManzana_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_manzana_id)));
                marco.setTipvia(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_tipvia)));
                marco.setNomvia(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_nomvia)));
                marco.setNropta(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_nropta)));
                marco.setLote(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_lote)));
                marco.setPiso(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_piso)));
                marco.setMza(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mza)));
                marco.setBlock(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_block)));
                marco.setInterior(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_interior)));
                marco.setCcdd(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_ccdd)));
                marco.setDepartamento(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_departamento)));
                marco.setCcpp(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_ccpp)));
                marco.setProvincia(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_provincia)));
                marco.setCcdi(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_ccdi)));
                marco.setDistrito(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_distrito)));
                marco.setUsuario_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_usuario_id)));
                marco.setUsuario_sup_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_usuario_sup_id)));
                marco.setEstado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_estado)));
//                marco.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_nombre)));
//                marco.setDni(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_dni)));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return marco;
    }


    public ArrayList<ItemMarco> getListMarco(String idUsuario) {
        ArrayList<ItemMarco> itemMarcos = new ArrayList<>();
        String[] whereArgs = new String[]{String.valueOf(idUsuario)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamarco,
                    null, SQLConstantes.WHERE_CLAUSE_USUARIO_ID, whereArgs, null, null, null);
            while (cursor.moveToNext()) {
                ItemMarco itemMarco = new ItemMarco();
                itemMarco.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_id)));
                itemMarco.setAnio(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_anio)));
                itemMarco.setMes(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mes)));
                itemMarco.setPeriodo(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_periodo)));
                itemMarco.setZona(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_zona)));
                itemMarco.setNorden(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_norden)));
                itemMarco.setEstado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_estado)));

                itemMarcos.add(itemMarco);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return itemMarcos;
    }

    public ArrayList<ItemMarco> getListMarcoSupervisor(String idUsuario) {
        ArrayList<ItemMarco> itemMarcos = new ArrayList<>();
        String[] whereArgs = new String[]{String.valueOf(idUsuario)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamarco,
                    null, SQLConstantes.WHERE_CLAUSE_USUARIO_SUP_ID, whereArgs, null, null, null);
            while (cursor.moveToNext()) {
                ItemMarco itemMarco = new ItemMarco();
                itemMarco.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_id)));
                itemMarco.setAnio(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_anio)));
                itemMarco.setMes(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mes)));
                itemMarco.setPeriodo(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_periodo)));
                itemMarco.setZona(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_zona)));
                itemMarco.setNorden(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_norden)));
                itemMarco.setEstado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_estado)));
                itemMarcos.add(itemMarco);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return itemMarcos;
    }

    public ArrayList<ItemMarco> getListMarcoFiltrado(int anio, int mes, int periodo, int zona) {
        ArrayList<ItemMarco> itemMarcos = new ArrayList<>();
        String[] whereArgs = new String[]{String.valueOf(anio), String.valueOf(mes), String.valueOf(periodo), String.valueOf(zona)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamarco,
                    null, SQLConstantes.WHERE_CLAUSE_ANIO + " AND " +
                            SQLConstantes.WHERE_CLAUSE_MES + " AND " +
                            SQLConstantes.WHERE_CLAUSE_PERIODO + " AND " +
                            SQLConstantes.WHERE_CLAUSE_ZONA, whereArgs, null, null, null);
            while (cursor.moveToNext()) {
                ItemMarco itemMarco = new ItemMarco();
                itemMarco.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_id)));
                itemMarco.setAnio(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_anio)));
                itemMarco.setMes(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mes)));
                itemMarco.setPeriodo(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_periodo)));
                itemMarco.setZona(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_zona)));
                itemMarco.setNorden(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_norden)));
                itemMarco.setEstado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_estado)));
                itemMarcos.add(itemMarco);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return itemMarcos;
    }

    public ArrayList<ItemMarco> getListMarcoFiltrado2(String anio, String mes, String periodo, String zona) {
        ArrayList<ItemMarco> itemMarcos = new ArrayList<>();
        String[] whereArgs = new String[]{String.valueOf(anio), String.valueOf(mes), String.valueOf(periodo), String.valueOf(zona)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamarco,
                    null, SQLConstantes.WHERE_CLAUSE_ANIO + " AND " +
                            SQLConstantes.WHERE_CLAUSE_MES + " AND " +
                            SQLConstantes.WHERE_CLAUSE_PERIODO + " AND " +
                            SQLConstantes.WHERE_CLAUSE_ZONA, whereArgs, null, null, null);
            while (cursor.moveToNext()) {
                ItemMarco itemMarco = new ItemMarco();
                itemMarco.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_id)));
                itemMarco.setAnio(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_anio)));
                itemMarco.setMes(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_mes)));
                itemMarco.setPeriodo(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_periodo)));
                itemMarco.setZona(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_zona)));
                itemMarco.setNorden(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_norden)));
                itemMarco.setEstado(cursor.getString(cursor.getColumnIndex(SQLConstantes.marco_estado)));
                itemMarcos.add(itemMarco);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return itemMarcos;
    }




    public Usuario getUsuario(String user) {
        Usuario usuario = null;
        String[] whereArgs = new String[]{user};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablausuario,
                    null, SQLConstantes.WHERE_CLAUSE_USUARIO, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                usuario = new Usuario();
                usuario.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_id)));
                usuario.setUsuario(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_usuario)));
                usuario.setClave(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_clave)));
                usuario.setDni(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_dni)));
                usuario.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_nombre)));
                usuario.setCargo_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_cargo_id)));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return usuario;
    }

    public Usuario getUsuario2(String user) {
        Usuario usuario = null;
        String[] whereArgs = new String[]{user};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablausuario,
                    null, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                usuario = new Usuario();
                usuario.set_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_id)));
                usuario.setUsuario(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_usuario)));
                usuario.setClave(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_clave)));
                usuario.setDni(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_dni)));
                usuario.setNombre(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_nombre)));
                usuario.setCargo_id(cursor.getString(cursor.getColumnIndex(SQLConstantes.usuario_cargo_id)));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return usuario;
    }

    public String getCodEstado(String numero) {
        String codigo = null;
        String[] whereArgs = new String[]{numero};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablaestados,
                    null, SQLConstantes.WHERE_CLAUSE_NUMERO, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                codigo = cursor.getString(cursor.getColumnIndex(SQLConstantes.estado_id));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return codigo;
    }


    public String getCodMunicipio(String numero, String codEstado) {
        String codigo = null;
        String[] whereArgs = new String[]{numero, codEstado};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamunicipios,
                    null, SQLConstantes.WHERE_CLAUSE_NUMERO + " AND " + SQLConstantes.WHERE_CLAUSE_ESTADO_COD, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                codigo = cursor.getString(cursor.getColumnIndex(SQLConstantes.municipios_cod_municipio));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return codigo;
    }

    public ArrayList<String> getMunicipios(String idEstado) {
        ArrayList<String> municipios = new ArrayList<>();
        municipios.add("Seleccione municipio");
        String[] whereArgs = new String[]{String.valueOf(idEstado)};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablamunicipios,
                    null, SQLConstantes.WHERE_CLAUSE_ESTADO_COD, whereArgs, null, null, null);
            while (cursor.moveToNext()) {
                String municipio = cursor.getString(cursor.getColumnIndex(SQLConstantes.municipios_nom_municipio));
                municipios.add(municipio);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return municipios;
    }


    public ArrayList<String> getUbigeos() {
        ArrayList<String> ubigeos = new ArrayList<>();
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tablaubigeo, null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                String ubigeo = cursor.getString(cursor.getColumnIndex(SQLConstantes.ubigeo_descripcion));
                ubigeos.add(ubigeo);
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return ubigeos;
    }


    public void insertarElemento(String nombreTabla, ContentValues contentValues) {
        sqLiteDatabase.insert(nombreTabla, null, contentValues);
    }

    public boolean existeElemento(String nombreTabla, String idEncuestado) {
        boolean existe = false;
        String[] whereArgs = new String[]{idEncuestado};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(nombreTabla, null, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                existe = true;
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return existe;
    }

    public void actualizarElemento(String nombreTabla, ContentValues contentValues, String idEncuestado) {
        String[] whereArgs = new String[]{idEncuestado};
        sqLiteDatabase.update(nombreTabla, contentValues, SQLConstantes.WHERE_CLAUSE_ID, whereArgs);
    }

    public void actualizarValor(String nombreTabla, String variable, String valor, String idEncuestado) {
        String[] whereArgs = new String[]{idEncuestado};
        ContentValues contentValues = new ContentValues();
        contentValues.put(variable, valor);
        sqLiteDatabase.update(nombreTabla, contentValues, SQLConstantes.WHERE_CLAUSE_ID, whereArgs);
    }

    public String[] getValores(String nombreTabla, String[] variables, String id) {
        String[] valores = new String[variables.length];
        String[] whereArgs = new String[]{id};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(nombreTabla, variables, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                for (int i = 0; i < variables.length; i++) {
                    valores[i] = cursor.getString(cursor.getColumnIndex(variables[i]));
                }
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        return valores;
    }

    public String getValor(String nombreTabla, String variable, String id) {
        String valor = "";
        String[] whereArgs = new String[]{id};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(nombreTabla, new String[]{variable}, SQLConstantes.WHERE_CLAUSE_ID, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                valor = cursor.getString(cursor.getColumnIndex(variable));
            }
        } finally {
            if (cursor != null) cursor.close();
        }
        if (valor == null) valor = "";
        return valor;
    }

    public boolean ocultarLayoutPregunta(String varLayoutPregunta, String idencuestado) {
        boolean ocultar = false;
        String valor = getValor(SQLConstantes.tablalayouts, varLayoutPregunta, idencuestado);
        if (valor.equals("0"))
            ocultar = true;
        return ocultar;
    }

    public void eliminarDato(String tabla, String id) {
        String[] whereArgs = new String[]{id};
        sqLiteDatabase.delete(tabla, SQLConstantes.WHERE_CLAUSE_ID, whereArgs);
    }

    public void eliminarDatos(String tabla, String idColumna, String valorColumna) {
        String[] whereArgs = new String[]{valorColumna};
        sqLiteDatabase.delete(tabla, idColumna + "=?", whereArgs);
    }
}