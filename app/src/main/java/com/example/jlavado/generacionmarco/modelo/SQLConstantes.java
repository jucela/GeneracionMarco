package com.example.jlavado.generacionmarco.modelo;

public class SQLConstantes {
    public static String DB_PATH = "/data/data/com.example.ricindigus.empove2018/databases/";
    public static String DB_NAME = "dbenpove.sqlite";

    public static String tablamarco = "marco";
    public static String tablausuario = "usuarios";
    public static String tablapaises = "paises";
    public static String tablarutas = "rutas";


    public static String tablacaratula = "caratula";
    public static String tablahogares = "hogares";
    public static String tablavisitasencuestador = "visitas_encuestador";
    public static String tablaresultadoencuestador = "resultado_encuestador";
    public static String tablaresultadosupervisor= "resultado_supervisor";
    public static String tablavisitassupervisor = "visitas_supervisor";
    public static String tablafuncionarios = "funcionarios";


    public static String tablamodulo1v = "modulo1v";
    public static String tablamodulo1h = "modulo1h";
    public static String tablaresidentes = "tablaresidentes";
    public static String tablamodulo3 = "modulo3";
    public static String tablam3p309rutas = "m3_p309_rutas";
    public static String tablam3p318personas = "m3_p318_personas";
    public static String tablamodulo4 = "modulo4";
    public static String tablamodulo5 = "modulo5";
    public static String tablamodulo6 = "modulo6";
    public static String tablamodulo7 = "modulo7";
    public static String tablamodulo8 = "modulo8";


    public static String tablamunicipios = "municipios";
    public static String tablaestados = "estados";
    public static String tablaubigeo = "ubigeo";
    public static String tablalayouts = "layouts";
    public static String tablafragments= "fragments";
    public static String tablacoberturafragments= "cobertura_fragments";
    public static String tablafragmentsvivienda= "fragments_vivienda";
    public static String tablafragmentshogar= "fragments_hogar";







    /**
     * TABLA MARCO
     * */
    public static final String marco_id = "_id";
    public static final String marco_anio = "anio";
    public static final String marco_mes = "mes";
    public static final String marco_periodo = "periodo";
    public static final String marco_zona = "zona";
    public static final String marco_ccdd = "ccdd";
    public static final String marco_departamento = "departamento";
    public static final String marco_ccpp = "ccpp";
    public static final String marco_provincia = "provincia";
    public static final String marco_ccdi = "ccdi";
    public static final String marco_distrito = "distrito";
    public static final String marco_codccpp = "codccpp";
    public static final String marco_nomccpp = "nomccpp";
    public static final String marco_conglomerado = "conglomerado";
    public static final String marco_norden = "norden";
    public static final String marco_manzana_id = "manzana_id";
    public static final String marco_tipvia = "tipvia";
    public static final String marco_nomvia = "nomvia";
    public static final String marco_nropta = "nropta";
    public static final String marco_lote = "lote";
    public static final String marco_piso = "piso";
    public static final String marco_mza = "mza";
    public static final String marco_block = "block";
    public static final String marco_interior = "interior";
    public static final String marco_usuario_id = "usuario_id";
    public static final String marco_usuario = "usuario";
    public static final String marco_nombre = "nombre";
    public static final String marco_dni = "dni";
    public static final String marco_usuario_sup_id = "usuario_sup_id";
    public static final String marco_estado = "estado";



    /**
     * TABLA UBIGEO
     * */

    public static String ubigeo_id = "_id";
    public static String ubigeo_cod_departamento = "cod_departamento";
    public static String ubigeo_nom_departamento = "nom_departamento";
    public static String ubigeo_cod_provincia = "cod_provincia";
    public static String ubigeo_nom_provincia = "nom_provincia";
    public static String ubigeo_cod_distrito = "cod_distrito";
    public static String ubigeo_nom_distrito = "nom_distrito";
    public static String ubigeo_descripcion = "descripcion";


    /**
     * TABLA MUNICIPIOS
     * */

    public static String municipios_id = "_id";
    public static String municipios_cod_municipio = "cod_municipio";
    public static String municipios_nom_municipio = "nom_municipio";
    public static String municipios_num_municipio = "num_municipio";
    public static String municipios_cod_estado = "cod_estado";
    public static String municipios_nom_estado = "nom_estado";

    /**
     * TABLA ESTADOS
     * */

    public static String estado_id = "_id";
    public static String estado_nombre = "nombre";
    public static String estado_numero = "numero";


    /**
     * TABLA USUARIOS
     * */

    public static String usuario_id = "_id";
    public static String usuario_usuario = "usuario";
    public static String usuario_clave = "clave";
    public static String usuario_dni = "dni";
    public static String usuario_nombre = "nombre";
    public static String usuario_cargo_id= "cargo_id";


    /**
     * TABLA PAISES
     * */

    public static String paises_id = "_id";
    public static String paises_numero = "numero";
    public static String paises_nombre = "nombre";

    /**
     * TABLA RUTAS PAISES
     * */

    public static String rutas_id = "_id";
    public static String rutas_numero = "numero";
    public static String rutas_nombre = "nombre";

    /**
     * TABLA CARATULA
     * */

    public static final String caratula_id = "_id";
    public static final String caratula_anio = "anio";
    public static final String caratula_mes = "mes";
    public static final String caratula_periodo = "periodo";
    public static final String caratula_conglomerado = "conglomerado";
    public static final String caratula_nom_dep = "nom_dep";
    public static final String caratula_nom_prov = "nom_prov";
    public static final String caratula_nom_dist = "nom_dist";
    public static final String caratula_nom_ccpp = "nom_ccpp";
    public static final String caratula_zona = "zona";
    public static final String caratula_manzana_id = "manzana_id";
    public static final String caratula_vivienda = "vivienda";
    public static final String caratula_latitud = "latitud";
    public static final String caratula_longitud = "longitud";
    public static final String caratula_tipvia = "tipvia";
    public static final String caratula_tipvia_o = "tipvia_o";
    public static final String caratula_nomvia = "nomvia";
    public static final String caratula_nropta = "nropta";
    public static final String caratula_block = "block";
    public static final String caratula_interior = "interior";
    public static final String caratula_piso = "piso";
    public static final String caratula_mza = "mza";
    public static final String caratula_lote = "lote";
    public static final String caratula_km = "km";
    public static final String caratula_telefono = "telefono";
    public static final String caratula_t_hogar = "t_hogar";
    public static final String caratula_usuario = "usuario";
    public static final String caratula_observaciones = "observaciones";
    public static final String caratula_cobertura = "cobertura";



    public static final String SQL_CREATE_TABLA_CARATULA =
            "CREATE TABLE " + tablacaratula + "(" +
                    caratula_id  + " INTEGER PRIMARY KEY, " +
                    caratula_anio + " TEXT," +
                    caratula_mes + " TEXT," +
                    caratula_periodo+ " TEXT," +
                    caratula_conglomerado + " TEXT," +
                    caratula_nom_dep + " TEXT," +
                    caratula_nom_prov  + " TEXT," +
                    caratula_nom_dist  + " TEXT," +
                    caratula_nom_ccpp  + " TEXT," +
                    caratula_zona  + " TEXT," +
                    caratula_manzana_id  + " TEXT," +
                    caratula_vivienda  + " TEXT," +
                    caratula_latitud + " TEXT," +
                    caratula_longitud  + " TEXT," +
                    caratula_tipvia  + " TEXT," +
                    caratula_tipvia_o  + " TEXT," +
                    caratula_nomvia  + " TEXT," +
                    caratula_nropta  + " TEXT," +
                    caratula_block  + " TEXT," +
                    caratula_interior + " TEXT," +
                    caratula_piso  + " TEXT," +
                    caratula_mza  + " TEXT," +
                    caratula_lote  + " TEXT," +
                    caratula_km  + " TEXT," +
                    caratula_telefono  + " TEXT," +
                    caratula_t_hogar  + " TEXT," +
                    caratula_usuario  + " TEXT," +
                    caratula_cobertura  + " TEXT," +
                    caratula_observaciones + " TEXT" + ");"
            ;

    /**
     * TABLA HOGARES
     * */

    public static final String hogar_id = "_id";
    public static final String hogar_id_vivienda = "id_vivienda";
    public static final String hogar_numero = "numero";
    public static final String hogar_nom_ape = "nom_ape";
    public static final String hogar_estado = "estado";
    public static final String hogar_nroviven = "nroviven";
    public static final String hogar_nropersonas = "nropersonas";
    public static final String hogar_vive = "vive";
    public static final String hogar_principal = "principal";
    public static final String hogar_cobertura = "cobertura";




    public static final String SQL_CREATE_TABLA_HOGARES =
            "CREATE TABLE " + tablahogares + "(" +
                    hogar_id  + " TEXT PRIMARY KEY," +
                    hogar_id_vivienda + " TEXT," +
                    hogar_numero + " TEXT," +
                    hogar_nom_ape + " TEXT," +
                    hogar_vive + " TEXT," +
                    hogar_nroviven + " TEXT," +
                    hogar_nropersonas + " TEXT," +
                    hogar_principal + " TEXT," +
                    hogar_cobertura + " TEXT," +
                    hogar_estado + " TEXT" + ");"
            ;

    /**
     * TABLA FRAGMENTS VIVIENDA
     * */

    public static final String fragments_vivienda_id = "_id";
    public static final String fragments_vivienda_caratula = "caratula";
    public static final String fragments_vivienda_hogares = "hogares";


    public static final String SQL_CREATE_TABLA_FRAGMENTS_VIVIENDA =
            "CREATE TABLE " + tablafragmentsvivienda + "(" +
                    fragments_vivienda_id  + " TEXT PRIMARY KEY," +
                    fragments_vivienda_caratula  + " TEXT," +
                    fragments_vivienda_hogares + " TEXT" + ");"
            ;

    /**
     * TABLA FRAGMENTS HOGARES
     * */

    public static final String fragments_hogar_id = "_id";
    public static final String fragments_hogar_id_vivienda = "id_vivienda";
    public static final String fragments_hogar_visitas_encuestador = "visitas_encuestador";
    public static final String fragments_hogar_visitas_supervisor = "visitas_supervisor";
    public static final String fragments_hogar_funcionarios = "funcionarios";
    public static final String fragments_hogar_p101p107= "p101p107";
    public static final String fragments_hogar_p108p113 = "p108p113";
    public static final String fragments_hogar_p201p207 = "p201p207";


    public static final String SQL_CREATE_TABLA_FRAGMENTS_HOGAR =
            "CREATE TABLE " + tablafragmentshogar + "(" +
                    fragments_hogar_id  + " TEXT PRIMARY KEY," +
                    fragments_hogar_id_vivienda  + " TEXT," +
                    fragments_hogar_visitas_encuestador  + " TEXT," +
                    fragments_hogar_visitas_supervisor  + " TEXT," +
                    fragments_hogar_funcionarios  + " TEXT," +
                    fragments_hogar_p101p107  + " TEXT," +
                    fragments_hogar_p108p113  + " TEXT," +
                    fragments_hogar_p201p207 + " TEXT" + ");"
            ;

    /**
     * TABLA FRAGMENTS ENCUESTADO
     * */

    public static final String fragments_id = "_id";
    public static final String fragments_id_vivienda = "id_vivienda";
    public static final String fragments_p301p305 = "p301p305";
    public static final String fragments_p306p308 = "p306p308";
    public static final String fragments_p309 = "p309";
    public static final String fragments_p310p312 = "p310p312";
    public static final String fragments_p313p317 = "p313p317";
    public static final String fragments_p318 = "p318";
    public static final String fragments_p401p404 = "p401p404";
    public static final String fragments_p405p407 = "p405p407";
    public static final String fragments_p408p410 = "p408p410";
    public static final String fragments_p411p416 = "p411p416";
    public static final String fragments_p501p505 = "p501p505";
    public static final String fragments_p506p507 = "p506p507";
    public static final String fragments_p508p511 = "p508p511";
    public static final String fragments_p512p513 = "p512p513";
    public static final String fragments_p601p604 = "p601p604";
    public static final String fragments_p605p608 = "p605p608";
    public static final String fragments_p609p612 = "p609p612";
    public static final String fragments_p613p617 = "p613p617";
    public static final String fragments_p618p621 = "p618p621";
    public static final String fragments_p622p625 = "p622p625";
    public static final String fragments_p626p629 = "p626p629";
    public static final String fragments_p630 = "p630";
    public static final String fragments_p701p705 = "p701p705";
    public static final String fragments_p706p709 = "p706p709";
    public static final String fragments_p801p804 = "p801p804";
    public static final String fragments_p805p808 = "p805p808";
    public static final String fragments_p809p812 = "p809p812";
    public static final String fragments_p813p816 = "p813p816";
    public static final String fragments_p817p820 = "p817p820";
    public static final String fragments_p821p823 = "p821p823";


    public static final String SQL_CREATE_TABLA_FRAGMENTS =
            "CREATE TABLE " + tablafragments + "(" +
                    fragments_id  + " TEXT PRIMARY KEY," +
                    fragments_id_vivienda  + " TEXT," +
                    fragments_p301p305  + " TEXT," +
                    fragments_p306p308  + " TEXT," +
                    fragments_p309  + " TEXT," +
                    fragments_p310p312  + " TEXT," +
                    fragments_p313p317  + " TEXT," +
                    fragments_p318  + " TEXT," +
                    fragments_p401p404  + " TEXT," +
                    fragments_p405p407  + " TEXT," +
                    fragments_p408p410  + " TEXT," +
                    fragments_p411p416  + " TEXT," +
                    fragments_p501p505  + " TEXT," +
                    fragments_p506p507  + " TEXT," +
                    fragments_p508p511  + " TEXT," +
                    fragments_p512p513  + " TEXT," +
                    fragments_p601p604  + " TEXT," +
                    fragments_p605p608  + " TEXT," +
                    fragments_p609p612  + " TEXT," +
                    fragments_p613p617 + " TEXT," +
                    fragments_p618p621 + " TEXT," +
                    fragments_p622p625 + " TEXT," +
                    fragments_p626p629  + " TEXT," +
                    fragments_p630  + " TEXT," +
                    fragments_p701p705  + " TEXT," +
                    fragments_p706p709  + " TEXT," +
                    fragments_p801p804  + " TEXT," +
                    fragments_p805p808  + " TEXT," +
                    fragments_p809p812  + " TEXT," +
                    fragments_p813p816  + " TEXT," +
                    fragments_p817p820  + " TEXT," +
                    fragments_p821p823 + " TEXT" + ");"
            ;

    /**
     * TABLA FRAGMENTS COBERTURA
     * */

    public static final String cobertura_fragments_id = "_id";
    public static final String cobertura_fragments_id_vivienda = "id_vivienda";
    public static final String cobertura_fragments_cp301p305 = "cp301p305";
    public static final String cobertura_fragments_cp306p308 = "cp306p308";
    public static final String cobertura_fragments_cp309 = "cp309";
    public static final String cobertura_fragments_cp310p312 = "cp310p312";
    public static final String cobertura_fragments_cp313p317 = "cp313p317";
    public static final String cobertura_fragments_cp318 = "cp318";
    public static final String cobertura_fragments_cp401p404 = "cp401p404";
    public static final String cobertura_fragments_cp405p407 = "cp405p407";
    public static final String cobertura_fragments_cp408p410 = "cp408p410";
    public static final String cobertura_fragments_cp411p416 = "cp411p416";
    public static final String cobertura_fragments_cp501p505 = "cp501p505";
    public static final String cobertura_fragments_cp506p507 = "cp506p507";
    public static final String cobertura_fragments_cp508p511 = "cp508p511";
    public static final String cobertura_fragments_cp512p513 = "cp512p513";
    public static final String cobertura_fragments_cp601p604 = "cp601p604";
    public static final String cobertura_fragments_cp605p608 = "cp605p608";
    public static final String cobertura_fragments_cp609p612 = "cp609p612";
    public static final String cobertura_fragments_cp613p617 = "cp613p617";
    public static final String cobertura_fragments_cp618p621 = "cp618p621";
    public static final String cobertura_fragments_cp622p625 = "cp622p625";
    public static final String cobertura_fragments_cp626p629 = "cp626p629";
    public static final String cobertura_fragments_cp630 = "cp630";
    public static final String cobertura_fragments_cp701p705 = "cp701p705";
    public static final String cobertura_fragments_cp706p709 = "cp706p709";
    public static final String cobertura_fragments_cp801p804 = "cp801p804";
    public static final String cobertura_fragments_cp805p808 = "cp805p808";
    public static final String cobertura_fragments_cp809p812 = "cp809p812";
    public static final String cobertura_fragments_cp813p816 = "cp813p816";
    public static final String cobertura_fragments_cp817p820 = "cp817p820";
    public static final String cobertura_fragments_cp821p823 = "cp821p823";


    public static final String SQL_CREATE_TABLA_COBERTURA_FRAGMENTS =
            "CREATE TABLE " + tablacoberturafragments + "(" +
                    cobertura_fragments_id  + " TEXT PRIMARY KEY," +
                    cobertura_fragments_id_vivienda  + " TEXT," +
                    cobertura_fragments_cp301p305  + " TEXT," +
                    cobertura_fragments_cp306p308  + " TEXT," +
                    cobertura_fragments_cp309  + " TEXT," +
                    cobertura_fragments_cp310p312  + " TEXT," +
                    cobertura_fragments_cp313p317  + " TEXT," +
                    cobertura_fragments_cp318  + " TEXT," +
                    cobertura_fragments_cp401p404  + " TEXT," +
                    cobertura_fragments_cp405p407  + " TEXT," +
                    cobertura_fragments_cp408p410  + " TEXT," +
                    cobertura_fragments_cp411p416  + " TEXT," +
                    cobertura_fragments_cp501p505  + " TEXT," +
                    cobertura_fragments_cp506p507  + " TEXT," +
                    cobertura_fragments_cp508p511  + " TEXT," +
                    cobertura_fragments_cp512p513  + " TEXT," +
                    cobertura_fragments_cp601p604  + " TEXT," +
                    cobertura_fragments_cp605p608  + " TEXT," +
                    cobertura_fragments_cp609p612  + " TEXT," +
                    cobertura_fragments_cp613p617 + " TEXT," +
                    cobertura_fragments_cp618p621 + " TEXT," +
                    cobertura_fragments_cp622p625 + " TEXT," +
                    cobertura_fragments_cp626p629  + " TEXT," +
                    cobertura_fragments_cp630  + " TEXT," +
                    cobertura_fragments_cp701p705  + " TEXT," +
                    cobertura_fragments_cp706p709  + " TEXT," +
                    cobertura_fragments_cp801p804  + " TEXT," +
                    cobertura_fragments_cp805p808  + " TEXT," +
                    cobertura_fragments_cp809p812  + " TEXT," +
                    cobertura_fragments_cp813p816  + " TEXT," +
                    cobertura_fragments_cp817p820  + " TEXT," +
                    cobertura_fragments_cp821p823 + " TEXT" + ");"
            ;

    /**
     * TABLA VISITA ENCUESTADOR
     * */

    public static final String visita_encuestador_id = "_id";
    public static final String visita_encuestador_id_vivienda = "id_vivienda";
    public static final String visita_encuestador_id_hogar = "id_hogar";
    public static final String visita_encuestador_numero = "numero";
    public static final String visita_encuestador_vis_fecha_dd = "vis_fecha_dd";
    public static final String visita_encuestador_vis_fecha_mm = "vis_fecha_mm";
    public static final String visita_encuestador_vis_fecha_aa = "vis_fecha_aa";
    public static final String visita_encuestador_vis_hor_ini = "vis_hor_ini";
    public static final String visita_encuestador_vis_min_ini = "vis_min_ini";
    public static final String visita_encuestador_vis_hor_fin = "vis_hor_fin";
    public static final String visita_encuestador_vis_min_fin = "vis_min_fin";
    public static final String visita_encuestador_prox_vis_fecha_dd = "prox_vis_fecha_dd";
    public static final String visita_encuestador_prox_vis_fecha_mm = "prox_vis_fecha_mm";
    public static final String visita_encuestador_prox_vis_fecha_aa = "prox_vis_fecha_aa";
    public static final String visita_encuestador_prox_vis_hor = "prox_vis_hor";
    public static final String visita_encuestador_prox_vis_min = "prox_vis_min";
    public static final String visita_encuestador_vis_resu = "vis_resu";
    public static final String visita_encuestador_vis_resu_esp = "vis_resu_esp";




    public static final String SQL_CREATE_TABLA_VISITA_ENCUESTADOR =
            "CREATE TABLE " + tablavisitasencuestador + "(" +
                    visita_encuestador_id  + " TEXT PRIMARY KEY," +
                    visita_encuestador_id_vivienda + " TEXT," +
                    visita_encuestador_id_hogar + " TEXT," +
                    visita_encuestador_numero + " TEXT," +
                    visita_encuestador_vis_fecha_dd + " TEXT," +
                    visita_encuestador_vis_fecha_mm + " TEXT," +
                    visita_encuestador_vis_fecha_aa + " TEXT," +
                    visita_encuestador_vis_hor_ini + " TEXT," +
                    visita_encuestador_vis_min_ini + " TEXT," +
                    visita_encuestador_vis_hor_fin + " TEXT," +
                    visita_encuestador_vis_min_fin + " TEXT," +
                    visita_encuestador_prox_vis_fecha_dd + " TEXT," +
                    visita_encuestador_prox_vis_fecha_mm + " TEXT," +
                    visita_encuestador_prox_vis_fecha_aa + " TEXT," +
                    visita_encuestador_prox_vis_hor + " TEXT," +
                    visita_encuestador_prox_vis_min + " TEXT," +
                    visita_encuestador_vis_resu + " TEXT," +
                    visita_encuestador_vis_resu_esp + " TEXT" + ");"
            ;

    /**
     * TABLA RESULTADO ENCUESTADOR
     * */

    public static final String resultado_encuestador_id = "_id";
    public static final String resultado_encuestador_id_vivienda = "id_vivienda";
    public static final String resultado_encuestador_vis_resultado_final = "vis_resultado_final";
    public static final String resultado_encuestador_vis_fecha_final_dd = "vis_fecha_final_dd";
    public static final String resultado_encuestador_vis_fecha_final_mm = "vis_fecha_final_mm";
    public static final String resultado_encuestador_vis_fecha_final_aa = "vis_fecha_final_aa";





    public static final String SQL_CREATE_TABLA_RESULTADO_ENCUESTADOR =
            "CREATE TABLE " + tablaresultadoencuestador + "(" +
                    resultado_encuestador_id  + " TEXT PRIMARY KEY," +
                    resultado_encuestador_id_vivienda + " TEXT," +
                    resultado_encuestador_vis_resultado_final + " TEXT," +
                    resultado_encuestador_vis_fecha_final_dd + " TEXT," +
                    resultado_encuestador_vis_fecha_final_mm + " TEXT," +
                    resultado_encuestador_vis_fecha_final_aa + " TEXT" + ");"
            ;

    /**
     * TABLA VISITA SUPERVISOR
     * */

    public static String visita_supervisor_id = "_id";
    public static String visita_supervisor_id_vivienda = "id_vivienda";
    public static String visita_supervisor_id_hogar = "id_hogar";
    public static String visita_supervisor_numero = "numero";
    public static String visita_supervisor_vis_fecha_dd = "vis_fecha_dd";
    public static String visita_supervisor_vis_fecha_mm = "vis_fecha_mm";
    public static String visita_supervisor_vis_fecha_aa = "vis_fecha_aa";
    public static String visita_supervisor_vis_hor_ini = "vis_hor_ini";
    public static String visita_supervisor_vis_min_ini = "vis_min_ini";
    public static String visita_supervisor_vis_hor_fin = "vis_hor_fin";
    public static String visita_supervisor_vis_min_fin = "vis_min_fin";
    public static String visita_supervisor_vis_resu = "vis_resu";
    public static String visita_supervisor_vis_resu_esp = "vis_resu_esp";

    public static final String SQL_CREATE_TABLA_VISITA_SUPERVISOR =
            "CREATE TABLE " + tablavisitassupervisor + "(" +
                    visita_supervisor_id  + " TEXT PRIMARY KEY," +
                    visita_supervisor_id_vivienda + " TEXT," +
                    visita_supervisor_id_hogar + " TEXT," +
                    visita_supervisor_numero + " TEXT," +
                    visita_supervisor_vis_fecha_dd + " TEXT," +
                    visita_supervisor_vis_fecha_mm + " TEXT," +
                    visita_supervisor_vis_fecha_aa + " TEXT," +
                    visita_supervisor_vis_hor_ini + " TEXT," +
                    visita_supervisor_vis_min_ini + " TEXT," +
                    visita_supervisor_vis_hor_fin + " TEXT," +
                    visita_supervisor_vis_min_fin + " TEXT," +
                    visita_supervisor_vis_resu + " TEXT," +
                    visita_supervisor_vis_resu_esp + " TEXT" + ");"
            ;

    /**
     * TABLA RESULTADO SUPERVISOR
     * */

    public static final String resultado_supervisor_id = "_id";
    public static final String resultado_supervisor_id_vivienda = "id_vivienda";
    public static final String resultado_supervisor_vis_resultado_final = "vis_resultado_final";
    public static final String resultado_supervisor_vis_fecha_final_dd = "vis_fecha_final_dd";
    public static final String resultado_supervisor_vis_fecha_final_mm = "vis_fecha_final_mm";
    public static final String resultado_supervisor_vis_fecha_final_aa = "vis_fecha_final_aa";


    public static final String SQL_CREATE_TABLA_RESULTADO_SUPERVISOR =
            "CREATE TABLE " + tablaresultadosupervisor + "(" +
                    resultado_supervisor_id  + " TEXT PRIMARY KEY," +
                    resultado_supervisor_id_vivienda + " TEXT," +
                    resultado_supervisor_vis_resultado_final + " TEXT," +
                    resultado_supervisor_vis_fecha_final_dd + " TEXT," +
                    resultado_supervisor_vis_fecha_final_mm + " TEXT," +
                    resultado_supervisor_vis_fecha_final_aa + " TEXT" + ");"
            ;


    /**
     * TABLA FUNCIONARIOS
     * */

    public static final String funcionarios_id = "_id";
    public static final String funcionarios_dni_encu = "dni_encu";
    public static final String funcionarios_dni_sup = "dni_sup";
    public static final String funcionarios_dni_coord = "dni_coor";
    public static final String funcionarios_nombre_encu = "nombre_encu";
    public static final String funcionarios_nombre_sup = "nombre_sup";
    public static final String funcionarios_nombre_coord = "nombre_coord";

    public static final String SQL_CREATE_TABLA_FUNCIONARIOS =
            "CREATE TABLE " + tablafuncionarios + "(" +
                    funcionarios_id  + " TEXT PRIMARY KEY ," +
                    funcionarios_dni_encu + " TEXT," +
                    funcionarios_dni_sup  + " TEXT," +
                    funcionarios_dni_coord  + " TEXT," +
                    funcionarios_nombre_encu  + " TEXT," +
                    funcionarios_nombre_sup  + " TEXT," +
                    funcionarios_nombre_coord + " TEXT" + ");"
            ;


    /**
     * TABLA MODULO 1 VIVIENDA
     * */
    public static final String modulo1_v_id = "_id";
    public static final String modulo1_v_c1_p101 = "c1_p101";
    public static final String modulo1_v_c1_p101_o = "c1_p101_o";
    public static final String modulo1_v_c1_p102 = "c1_p102";
    public static final String modulo1_v_c1_p102_o = "c1_p102_o";
    public static final String modulo1_v_c1_p103 = "c1_p103";
    public static final String modulo1_v_c1_p103_o = "c1_p103_o";
    public static final String modulo1_v_c1_p104 = "c1_p104";
    public static final String modulo1_v_c1_p104_o = "c1_p104_o";
    public static final String modulo1_v_c1_p105 = "c1_p105";
    public static final String modulo1_v_c1_p106 = "c1_p106";
    public static final String modulo1_v_c1_p107 = "c1_p107";
    public static final String modulo1_v_COB100A = "COB100A";


    /**
     * TABLA MODULO 1 HOGAR
     * */
    public static final String modulo1_h_id = "_id";
    public static final String modulo1_h_idVivienda = "id_vivienda";
    public static final String modulo1_h_c1_p108 = "c1_p108";
    public static final String modulo1_h_c1_p108_o = "c1_p108_o";
    public static final String modulo1_h_c1_p109 = "c1_p109";
    public static final String modulo1_h_c1_p109_o = "c1_p109_o";
    public static final String modulo1_h_c1_p110 = "c1_p110";
    public static final String modulo1_h_c1_p110_o = "c1_p110_o";
    public static final String modulo1_h_c1_p111 = "c1_p111";
    public static final String modulo1_h_c1_p111_o = "c1_p111_o";
    public static final String modulo1_h_c1_p112 = "c1_p112";
    public static final String modulo1_h_c1_p112_o = "c1_p112_o";
    public static final String modulo1_h_c1_p113_1 = "c1_p113_1";
    public static final String modulo1_h_c1_p113_2 = "c1_p113_2";
    public static final String modulo1_h_c1_p113_3 = "c1_p113_3";
    public static final String modulo1_h_c1_p113_4 = "c1_p113_4";
    public static final String modulo1_h_c1_p113_5 = "c1_p113_5";
    public static final String modulo1_h_c1_p113_6 = "c1_p113_6";
    public static final String modulo1_h_c1_p113_7 = "c1_p113_7";
    public static final String modulo1_h_c1_p113_8 = "c1_p113_8";
    public static final String modulo1_h_c1_p113_9 = "c1_p113_9";
    public static final String modulo1_h_c1_p113_7_o = "c1_p113_7_o";
    public static final String modulo1_h_c1_p113_8_o = "c1_p113_8_o";
    public static final String modulo1_h_c1_p113_9_o = "c1_p113_9_o";
    public static final String modulo1_h_COB100B = "COB100B";

    public static final String SQL_CREATE_TABLA_MODULO1V =
            "CREATE TABLE " + tablamodulo1v + "(" +
                    modulo1_v_id  + " TEXT PRIMARY KEY," +
                    modulo1_v_c1_p101 + " TEXT," +
                    modulo1_v_c1_p101_o + " TEXT," +
                    modulo1_v_c1_p102 + " TEXT," +
                    modulo1_v_c1_p102_o + " TEXT," +
                    modulo1_v_c1_p103 + " TEXT," +
                    modulo1_v_c1_p103_o + " TEXT," +
                    modulo1_v_c1_p104 + " TEXT," +
                    modulo1_v_c1_p104_o + " TEXT," +
                    modulo1_v_c1_p105 + " TEXT," +
                    modulo1_v_c1_p106 + " TEXT," +
                    modulo1_v_c1_p107 + " TEXT," +
                    modulo1_v_COB100A + " TEXT" + ");"
            ;

    public static final String SQL_CREATE_TABLA_MODULO1H =
            "CREATE TABLE " + tablamodulo1h + "(" +
                    modulo1_h_id  + " TEXT PRIMARY KEY," +
                    modulo1_h_idVivienda + " TEXT," +
                    modulo1_h_c1_p108 + " TEXT," +
                    modulo1_h_c1_p108_o + " TEXT," +
                    modulo1_h_c1_p109 + " TEXT," +
                    modulo1_h_c1_p109_o + " TEXT," +
                    modulo1_h_c1_p110 + " TEXT," +
                    modulo1_h_c1_p110_o + " TEXT," +
                    modulo1_h_c1_p111 + " TEXT," +
                    modulo1_h_c1_p111_o + " TEXT," +
                    modulo1_h_c1_p112 + " TEXT," +
                    modulo1_h_c1_p112_o + " TEXT," +
                    modulo1_h_c1_p113_1 + " TEXT," +
                    modulo1_h_c1_p113_2 + " TEXT," +
                    modulo1_h_c1_p113_3 + " TEXT," +
                    modulo1_h_c1_p113_4 + " TEXT," +
                    modulo1_h_c1_p113_5 + " TEXT," +
                    modulo1_h_c1_p113_6 + " TEXT," +
                    modulo1_h_c1_p113_7 + " TEXT," +
                    modulo1_h_c1_p113_7_o + " TEXT," +
                    modulo1_h_c1_p113_8 + " TEXT," +
                    modulo1_h_c1_p113_8_o + " TEXT," +
                    modulo1_h_c1_p113_9 + " TEXT," +
                    modulo1_h_c1_p113_9_o + " TEXT," +
                    modulo1_h_COB100B + " TEXT" + ");"
            ;


    /**
     * TABLA RESIDENTES
     * */
    public static final String residentes_id = "_id";
    public static final String residentes_id_informante = "id_informante";
    public static final String residentes_id_hogar = "id_hogar";
    public static final String residentes_id_vivienda = "id_vivienda";
    public static final String residentes_numero = "numero";
    public static final String residentes_c2_p202 = "c2_p202";
    public static final String residentes_c2_p203 = "c2_p203";
    public static final String residentes_c2_p204 = "c2_p204";
    public static final String residentes_c2_p205_a = "c2_p205_a";
    public static final String residentes_c2_p205_m = "c2_p205_m";
    public static final String residentes_c2_p206 = "c2_p206";
    public static final String residentes_c2_p207 = "c2_p207";
    public static final String residentes_COB200 = "COB200";
    public static final String residentes_encuestado_cobertura = "encuestado_cobertura";




    public static final String SQL_CREATE_TABLA_MODULO2 =
            "CREATE TABLE " + tablaresidentes + "(" +
                    residentes_id + " TEXT PRIMARY KEY," +
                    residentes_id_informante + " TEXT," +
                    residentes_id_hogar + " TEXT," +
                    residentes_id_vivienda + " TEXT," +
                    residentes_numero + " TEXT," +
                    residentes_c2_p202 + " TEXT," +
                    residentes_c2_p203 + " TEXT," +
                    residentes_c2_p204 + " TEXT," +
                    residentes_c2_p205_a + " TEXT," +
                    residentes_c2_p205_m + " TEXT," +
                    residentes_c2_p206 + " TEXT," +
                    residentes_c2_p207 + " TEXT," +
                    residentes_encuestado_cobertura + " TEXT," +
                    residentes_COB200 + " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 3
     * */
    public static final String modulo3_id = "_id";
    public static final String modulo3_id_informante = "idInformante";
    public static final String modulo3_id_hogar = "id_hogar";
    public static final String modulo3_id_vivienda = "id_vivienda";
    public static final String modulo3_c3_p301_d = "c3_p301_d";
    public static final String modulo3_c3_p301_m = "c3_p301_m";
    public static final String modulo3_c3_p301_a = "c3_p301_a";
    public static final String modulo3_c3_p302 = "c3_p302";
    public static final String modulo3_c3_p303_m = "c3_p303_m";
    public static final String modulo3_c3_p303_a = "c3_p303_a";
    public static final String modulo3_c3_p303_no_nacio = "c3_p303_no_nacio";
    public static final String modulo3_c3_p304 = "c3_p304";
    public static final String modulo3_c3_p305 = "c3_p305";
    public static final String modulo3_c3_p305_o = "c3_p305_o";
    public static final String modulo3_c3_p306 = "c3_p306";
    public static final String modulo3_c3_p306_o = "c3_p306_o";
    public static final String modulo3_c3_p307_d = "c3_p307_d";
    public static final String modulo3_c3_p307_m = "c3_p307_m";
    public static final String modulo3_c3_p307_a = "c3_p307_a";
    public static final String modulo3_c3_p308_e = "c3_p308_e";
    public static final String modulo3_c3_p308_m = "c3_p308_m";
    public static final String modulo3_c3_p308_e_seleccion = "c3_p308_e_seleccion";
    public static final String modulo3_c3_p308_m_seleccion = "c3_p308_m_seleccion";
    public static final String modulo3_c3_p310_1 = "c3_p310_1";
    public static final String modulo3_c3_p310_2 = "c3_p310_2";
    public static final String modulo3_c3_p310_3 = "c3_p310_3";
    public static final String modulo3_c3_p310_4 = "c3_p310_4";
    public static final String modulo3_c3_p311 = "c3_p311";
    public static final String modulo3_c3_p312_dist = "c3_p312_dist";
    public static final String modulo3_c3_p312_prov = "c3_p312_prov";
    public static final String modulo3_c3_p312_dep = "c3_p312_dep";
    public static final String modulo3_c3_p313 = "c3_p313";
    public static final String modulo3_c3_p314 = "c3_p314";
    public static final String modulo3_c3_p314_o = "c3_p314_o";
    public static final String modulo3_c3_p315_1 = "c3_p315_1";
    public static final String modulo3_c3_p315_2 = "c3_p315_2";
    public static final String modulo3_c3_p315_3 = "c3_p315_3";
    public static final String modulo3_c3_p315_4 = "c3_p315_4";
    public static final String modulo3_c3_p315_5 = "c3_p315_5";
    public static final String modulo3_c3_p315_6 = "c3_p315_6";
    public static final String modulo3_c3_p315_7 = "c3_p315_7";
    public static final String modulo3_c3_p315_8 = "c3_p315_8";
    public static final String modulo3_c3_p315_9 = "c3_p315_9";
    public static final String modulo3_c3_p315_10 = "c3_p315_10";
    public static final String modulo3_c3_p315_10_o = "c3_p315_10_o";
    public static final String modulo3_c3_p316 = "c3_p316";
    public static final String modulo3_c3_p316_o = "c3_p316_o";
    public static final String modulo3_c3_p317 = "c3_p317";
    public static final String modulo3_c3_p318 = "c3_p318";
    public static final String modulo3_obs_cap3 = "obs_cap3";
    public static final String modulo3_COB300 = "COB300";





    public static final String SQL_CREATE_TABLA_MODULO3 =
            "CREATE TABLE " + tablamodulo3 + "(" +
                    modulo3_id  + " TEXT PRIMARY KEY," +
                    modulo3_id_informante + " TEXT," +
                    modulo3_id_hogar + " TEXT," +
                    modulo3_id_vivienda + " TEXT," +
                    modulo3_c3_p301_d  + " TEXT," +
                    modulo3_c3_p301_m  + " TEXT," +
                    modulo3_c3_p301_a  + " TEXT," +
                    modulo3_c3_p302  + " TEXT," +
                    modulo3_c3_p303_no_nacio + " TEXT," +
                    modulo3_c3_p303_a + " TEXT," +
                    modulo3_c3_p303_m + " TEXT," +
                    modulo3_c3_p304  + " TEXT," +
                    modulo3_c3_p305  + " TEXT," +
                    modulo3_c3_p305_o  + " TEXT," +
                    modulo3_c3_p306  + " TEXT," +
                    modulo3_c3_p306_o  + " TEXT," +
                    modulo3_c3_p307_d  + " TEXT," +
                    modulo3_c3_p307_m  + " TEXT," +
                    modulo3_c3_p307_a  + " TEXT," +
                    modulo3_c3_p308_e  + " TEXT," +
                    modulo3_c3_p308_m  + " TEXT," +
                    modulo3_c3_p308_e_seleccion  + " TEXT," +
                    modulo3_c3_p308_m_seleccion  + " TEXT," +
                    modulo3_c3_p310_1  + " TEXT," +
                    modulo3_c3_p310_2  + " TEXT," +
                    modulo3_c3_p310_3  + " TEXT," +
                    modulo3_c3_p310_4  + " TEXT," +
                    modulo3_c3_p311  + " TEXT," +
                    modulo3_c3_p312_dist  + " TEXT," +
                    modulo3_c3_p312_prov  + " TEXT," +
                    modulo3_c3_p312_dep  + " TEXT," +
                    modulo3_c3_p313  + " TEXT," +
                    modulo3_c3_p314  + " TEXT," +
                    modulo3_c3_p314_o  + " TEXT," +
                    modulo3_c3_p315_1  + " TEXT," +
                    modulo3_c3_p315_2  + " TEXT," +
                    modulo3_c3_p315_3  + " TEXT," +
                    modulo3_c3_p315_4  + " TEXT," +
                    modulo3_c3_p315_5  + " TEXT," +
                    modulo3_c3_p315_6  + " TEXT," +
                    modulo3_c3_p315_7  + " TEXT," +
                    modulo3_c3_p315_8  + " TEXT," +
                    modulo3_c3_p315_9  + " TEXT," +
                    modulo3_c3_p315_10  + " TEXT," +
                    modulo3_c3_p315_10_o  + " TEXT," +
                    modulo3_c3_p316  + " TEXT," +
                    modulo3_c3_p316_o  + " TEXT," +
                    modulo3_c3_p317  + " TEXT," +
                    modulo3_c3_p318  + " TEXT," +
                    modulo3_obs_cap3  + " TEXT," +
                    modulo3_COB300 + " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 3 PREGUNTA 309 - RUTAS
     * */
    public static final String modulo3_p309_id = "_id";
    public static final String modulo3_p309_id_encuestado = "id_encuestado";
    public static final String modulo3_p309_id_vivienda = "id_vivienda";
    public static final String modulo3_p309_numero = "numero";
    public static final String modulo3_c3_p309_p = "c3_p309_p";
    public static final String modulo3_c3_p309_p_nom = "c3_p309_p_nom";
    public static final String modulo3_c3_p309_c = "c3_p309_c";
    public static final String modulo3_c3_p309_mod = "c3_p309_mod";
    public static final String modulo3_c3_p309_m = "c3_p309_m";
    public static final String modulo3_c3_p309_m_cod = "c3_p309_m_cod";
    public static final String modulo3_c3_p309_a = "c3_p309_a";
    public static final String modulo3_c3_p309_a_cod = "c3_p309_a_cod";

    public static final String SQL_CREATE_TABLA_MODULO3_P309_RUTAS =
            "CREATE TABLE " + tablam3p309rutas + "(" +
                    modulo3_p309_id  + " TEXT PRIMARY KEY," +
                    modulo3_p309_id_encuestado + " TEXT," +
                    modulo3_p309_id_vivienda + " TEXT," +
                    modulo3_p309_numero  + " TEXT," +
                    modulo3_c3_p309_p  + " TEXT," +
                    modulo3_c3_p309_p_nom  + " TEXT," +
                    modulo3_c3_p309_c  + " TEXT," +
                    modulo3_c3_p309_mod  + " TEXT," +
                    modulo3_c3_p309_m  + " TEXT," +
                    modulo3_c3_p309_m_cod  + " TEXT," +
                    modulo3_c3_p309_a  + " TEXT," +
                    modulo3_c3_p309_a_cod + " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 3 PREGUNTA 318 - PERSONAS
     * */
    public static final String modulo3_p318_id = "_id";
    public static final String modulo3_p318_idEncuestado = "id_encuestado";
    public static final String modulo3_p318_id_vivienda = "id_vivienda";
    public static final String modulo3_p318_numero = "numero";
    public static final String modulo3_c3_p318_f = "c3_p318_f";
    public static final String modulo3_c3_p318_s = "c3_p318_s";
    public static final String modulo3_c3_p318_e = "c3_p318_e";
    public static final String modulo3_c3_p318_p = "c3_p318_p";

    public static final String SQL_CREATE_TABLA_MODULO3_P318_PERSONAS =
            "CREATE TABLE " + tablam3p318personas + "(" +
                    modulo3_p318_id  + " TEXT PRIMARY KEY," +
                    modulo3_p318_idEncuestado + " TEXT," +
                    modulo3_p318_id_vivienda + " TEXT," +
                    modulo3_p318_numero + " TEXT," +
                    modulo3_c3_p318_f  + " TEXT," +
                    modulo3_c3_p318_s  + " TEXT," +
                    modulo3_c3_p318_e  + " TEXT," +
                    modulo3_c3_p318_p + " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 4
     * */
    public static final String modulo4_id = "_id";
    public static final String modulo4_id_informante = "id_informante";
    public static final String modulo4_id_hogar = "id_hogar";
    public static final String modulo4_id_vivienda = "id_vivienda";
    public static final String modulo4_c4_p401_1 = "c4_p401_1";
    public static final String modulo4_c4_p401_2 = "c4_p401_2";
    public static final String modulo4_c4_p401_3 = "c4_p401_3";
    public static final String modulo4_c4_p401_4 = "c4_p401_4";
    public static final String modulo4_c4_p401_5 = "c4_p401_5";
    public static final String modulo4_c4_p401_o = "c4_p401_o";
    public static final String modulo4_c4_p402 = "c4_p402";
    public static final String modulo4_c4_p403_1 = "c4_p403_1";
    public static final String modulo4_c4_p403_2 = "c4_p403_2";
    public static final String modulo4_c4_p403_3 = "c4_p403_3";
    public static final String modulo4_c4_p403_4 = "c4_p403_4";
    public static final String modulo4_c4_p403_5 = "c4_p403_5";
    public static final String modulo4_c4_p403_6 = "c4_p403_6";
    public static final String modulo4_c4_p403_7 = "c4_p403_7";
    public static final String modulo4_c4_p403_8 = "c4_p403_8";
    public static final String modulo4_c4_p403_9 = "c4_p403_9";
    public static final String modulo4_c4_p403_10 = "c4_p403_10";
    public static final String modulo4_c4_p403_11 = "c4_p403_11";
    public static final String modulo4_c4_p403_12 = "c4_p403_12";
    public static final String modulo4_c4_p403_13 = "c4_p403_13";
    public static final String modulo4_c4_p403_14 = "c4_p403_14";
    public static final String modulo4_c4_p403_o = "c4_p403_o";
    public static final String modulo4_c4_p404 = "c4_p404";
    public static final String modulo4_c4_p405_1 = "c4_p405_1";
    public static final String modulo4_c4_p405_2 = "c4_p405_2";
    public static final String modulo4_c4_p405_3 = "c4_p405_3";
    public static final String modulo4_c4_p405_4 = "c4_p405_4";
    public static final String modulo4_c4_p405_5 = "c4_p405_5";
    public static final String modulo4_c4_p405_6 = "c4_p405_6";
    public static final String modulo4_c4_p405_7 = "c4_p405_7";
    public static final String modulo4_c4_p406_1 = "c4_p406_1";
    public static final String modulo4_c4_p406_2 = "c4_p406_2";
    public static final String modulo4_c4_p406_3 = "c4_p406_3";
    public static final String modulo4_c4_p406_4 = "c4_p406_4";
    public static final String modulo4_c4_p406_5 = "c4_p406_5";
    public static final String modulo4_c4_p406_6 = "c4_p406_6";
    public static final String modulo4_c4_p406_7 = "c4_p406_7";
    public static final String modulo4_c4_p406_8 = "c4_p406_8";
    public static final String modulo4_c4_p406_o = "c4_p406_o";
    public static final String modulo4_c4_p407_1 = "c4_p407_1";
    public static final String modulo4_c4_p407_2 = "c4_p407_2";
    public static final String modulo4_c4_p407_3 = "c4_p407_3";
    public static final String modulo4_c4_p407_4 = "c4_p407_4";
    public static final String modulo4_c4_p407_5 = "c4_p407_5";
    public static final String modulo4_c4_p407_6 = "c4_p407_6";
    public static final String modulo4_c4_p407_7 = "c4_p407_7";
    public static final String modulo4_c4_p407_8 = "c4_p407_8";
    public static final String modulo4_c4_p407_9 = "c4_p407_9";
    public static final String modulo4_c4_p407_10 = "c4_p407_10";
    public static final String modulo4_c4_p407_11 = "c4_p407_11";
    public static final String modulo4_c4_p407_12 = "c4_p407_12";
    public static final String modulo4_c4_p407_13 = "c4_p407_13";
    public static final String modulo4_c4_p407_o = "c4_p407_o";
    public static final String modulo4_c4_p408_1 = "c4_p408_1";
    public static final String modulo4_c4_p408_2 = "c4_p408_2";
    public static final String modulo4_c4_p408_3 = "c4_p408_3";
    public static final String modulo4_c4_p408_4 = "c4_p408_4";
    public static final String modulo4_c4_p408_5 = "c4_p408_5";
    public static final String modulo4_c4_p408_6 = "c4_p408_6";
    public static final String modulo4_c4_p409 = "c4_p409";
    public static final String modulo4_c4_p410 = "c4_p410";
    public static final String modulo4_c4_p411_1 = "c4_p411_1";
    public static final String modulo4_c4_p411_2 = "c4_p411_2";
    public static final String modulo4_c4_p411_3 = "c4_p411_3";
    public static final String modulo4_c4_p411_4 = "c4_p411_4";
    public static final String modulo4_c4_p411_5 = "c4_p411_5";
    public static final String modulo4_c4_p411_6 = "c4_p411_6";
    public static final String modulo4_c4_p411_7 = "c4_p411_7";
    public static final String modulo4_c4_p411_8 = "c4_p411_8";
    public static final String modulo4_c4_p411_9 = "c4_p411_9";
    public static final String modulo4_c4_p411_10 = "c4_p411_10";
    public static final String modulo4_c4_p411_11 = "c4_p411_11";
    public static final String modulo4_c4_p411_12 = "c4_p411_12";
    public static final String modulo4_c4_p411_13 = "c4_p411_13";
    public static final String modulo4_c4_p411_14 = "c4_p411_14";
    public static final String modulo4_c4_p411_o = "c4_p411_o";
    public static final String modulo4_c4_p412 = "c4_p412";
    public static final String modulo4_c4_p413 = "c4_p413";
    public static final String modulo4_c4_p414 = "c4_p414";
    public static final String modulo4_c4_p415 = "c4_p415";
    public static final String modulo4_c4_p416_1 = "c4_p416_1";
    public static final String modulo4_c4_p416_2 = "c4_p416_2";
    public static final String modulo4_c4_p416_3 = "c4_p416_3";
    public static final String modulo4_c4_p416_4 = "c4_p416_4";
    public static final String modulo4_c4_p416_5 = "c4_p416_5";
    public static final String modulo4_c4_p416_6 = "c4_p416_6";
    public static final String modulo4_c4_p416_7 = "c4_p416_7";
    public static final String modulo4_c4_p416_8 = "c4_p416_8";
    public static final String modulo4_c4_p416_o = "c4_p416_o";
    public static final String modulo4_obs_cap4 = "obs_cap4";
    public static final String modulo4_COB400 = "COB400";



    public static final String SQL_CREATE_TABLA_MODULO4 =
            "CREATE TABLE " + tablamodulo4 + "(" +
                    modulo4_id  + " TEXT PRIMARY KEY," +
                    modulo4_id_informante + " TEXT," +
                    modulo4_id_hogar + " TEXT," +
                    modulo4_id_vivienda + " TEXT," +
                    modulo4_c4_p401_1  +  " TEXT," +
                    modulo4_c4_p401_2  +  " TEXT," +
                    modulo4_c4_p401_3  +  " TEXT," +
                    modulo4_c4_p401_4  +  " TEXT," +
                    modulo4_c4_p401_5  +  " TEXT," +
                    modulo4_c4_p401_o  +  " TEXT," +
                    modulo4_c4_p402  +  " TEXT," +
                    modulo4_c4_p403_1  +  " TEXT," +
                    modulo4_c4_p403_2  +  " TEXT," +
                    modulo4_c4_p403_3  +  " TEXT," +
                    modulo4_c4_p403_4  +  " TEXT," +
                    modulo4_c4_p403_5  +  " TEXT," +
                    modulo4_c4_p403_6  +  " TEXT," +
                    modulo4_c4_p403_7  +  " TEXT," +
                    modulo4_c4_p403_8  +  " TEXT," +
                    modulo4_c4_p403_9  +  " TEXT," +
                    modulo4_c4_p403_10  +  " TEXT," +
                    modulo4_c4_p403_11  +  " TEXT," +
                    modulo4_c4_p403_12  +  " TEXT," +
                    modulo4_c4_p403_13  +  " TEXT," +
                    modulo4_c4_p403_14  +  " TEXT," +
                    modulo4_c4_p403_o  +  " TEXT," +
                    modulo4_c4_p404  +  " TEXT," +
                    modulo4_c4_p405_1  +  " TEXT," +
                    modulo4_c4_p405_2  +  " TEXT," +
                    modulo4_c4_p405_3  +  " TEXT," +
                    modulo4_c4_p405_4  +  " TEXT," +
                    modulo4_c4_p405_5  +  " TEXT," +
                    modulo4_c4_p405_6  +  " TEXT," +
                    modulo4_c4_p405_7  +  " TEXT," +
                    modulo4_c4_p406_1  +  " TEXT," +
                    modulo4_c4_p406_2  +  " TEXT," +
                    modulo4_c4_p406_3  +  " TEXT," +
                    modulo4_c4_p406_4  +  " TEXT," +
                    modulo4_c4_p406_5  +  " TEXT," +
                    modulo4_c4_p406_6  +  " TEXT," +
                    modulo4_c4_p406_7  +  " TEXT," +
                    modulo4_c4_p406_8  +  " TEXT," +
                    modulo4_c4_p406_o  +  " TEXT," +
                    modulo4_c4_p407_1  +  " TEXT," +
                    modulo4_c4_p407_2  +  " TEXT," +
                    modulo4_c4_p407_3  +  " TEXT," +
                    modulo4_c4_p407_4  +  " TEXT," +
                    modulo4_c4_p407_5  +  " TEXT," +
                    modulo4_c4_p407_6  +  " TEXT," +
                    modulo4_c4_p407_7  +  " TEXT," +
                    modulo4_c4_p407_8  +  " TEXT," +
                    modulo4_c4_p407_9  +  " TEXT," +
                    modulo4_c4_p407_10  +  " TEXT," +
                    modulo4_c4_p407_11  +  " TEXT," +
                    modulo4_c4_p407_12  +  " TEXT," +
                    modulo4_c4_p407_13  +  " TEXT," +
                    modulo4_c4_p407_o  +  " TEXT," +
                    modulo4_c4_p408_1  +  " TEXT," +
                    modulo4_c4_p408_2  +  " TEXT," +
                    modulo4_c4_p408_3  +  " TEXT," +
                    modulo4_c4_p408_4  +  " TEXT," +
                    modulo4_c4_p408_5  +  " TEXT," +
                    modulo4_c4_p408_6  +  " TEXT," +
                    modulo4_c4_p409  +  " TEXT," +
                    modulo4_c4_p410  +  " TEXT," +
                    modulo4_c4_p411_1  +  " TEXT," +
                    modulo4_c4_p411_2  +  " TEXT," +
                    modulo4_c4_p411_3  +  " TEXT," +
                    modulo4_c4_p411_4  +  " TEXT," +
                    modulo4_c4_p411_5  +  " TEXT," +
                    modulo4_c4_p411_6  +  " TEXT," +
                    modulo4_c4_p411_7  +  " TEXT," +
                    modulo4_c4_p411_8  +  " TEXT," +
                    modulo4_c4_p411_9  +  " TEXT," +
                    modulo4_c4_p411_10  +  " TEXT," +
                    modulo4_c4_p411_11  +  " TEXT," +
                    modulo4_c4_p411_12  +  " TEXT," +
                    modulo4_c4_p411_13  +  " TEXT," +
                    modulo4_c4_p411_14  +  " TEXT," +
                    modulo4_c4_p411_o  +  " TEXT," +
                    modulo4_c4_p412  +  " TEXT," +
                    modulo4_c4_p413  +  " TEXT," +
                    modulo4_c4_p414  +  " TEXT," +
                    modulo4_c4_p415  +  " TEXT," +
                    modulo4_c4_p416_1  +  " TEXT," +
                    modulo4_c4_p416_2  +  " TEXT," +
                    modulo4_c4_p416_3  +  " TEXT," +
                    modulo4_c4_p416_4  +  " TEXT," +
                    modulo4_c4_p416_5  +  " TEXT," +
                    modulo4_c4_p416_6  +  " TEXT," +
                    modulo4_c4_p416_7  +  " TEXT," +
                    modulo4_c4_p416_8  +  " TEXT," +
                    modulo4_c4_p416_o  +  " TEXT," +
                    modulo4_obs_cap4  +  " TEXT," +
                    modulo4_COB400  +  " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 5
     * */
    public static final String modulo5_id = "_id";
    public static final String modulo5_id_informante = "id_informante";
    public static final String modulo5_id_hogar = "id_hogar";
    public static final String modulo5_id_vivienda = "id_vivienda";
    public static final String modulo5_c5_p501 = "c5_p501";
    public static final String modulo5_c5_p502_c = "c5_p502_c";
    public static final String modulo5_c5_p502_eleccion = "c5_p502_eleccion";
    public static final String modulo5_c5_p502 = "c5_p502";
    public static final String modulo5_c5_p502_o = "c5_p502_o";
    public static final String modulo5_c5_p503 = "c5_p503";
    public static final String modulo5_c5_p504 = "c5_p504";
    public static final String modulo5_c5_p505 = "c5_p505";
    public static final String modulo5_c5_p506_1 = "c5_p506_1";
    public static final String modulo5_c5_p506_2 = "c5_p506_2";
    public static final String modulo5_c5_p506_3 = "c5_p506_3";
    public static final String modulo5_c5_p506_4 = "c5_p506_4";
    public static final String modulo5_c5_p507 = "c5_p507";
    public static final String modulo5_c5_p507_dist = "c5_p507_dist";
    public static final String modulo5_c5_p507_prov = "c5_p507_prov";
    public static final String modulo5_c5_p507_dep = "c5_p507_dep";
    public static final String modulo5_c5_p508_1 = "c5_p508_1";
    public static final String modulo5_c5_p508_2 = "c5_p508_2";
    public static final String modulo5_c5_p508_3 = "c5_p508_3";
    public static final String modulo5_c5_p508_4 = "c5_p508_4";
    public static final String modulo5_c5_p508_5 = "c5_p508_5";
    public static final String modulo5_c5_p508_6 = "c5_p508_6";
    public static final String modulo5_c5_p508_7 = "c5_p508_7";
    public static final String modulo5_c5_p508_8 = "c5_p508_8";
    public static final String modulo5_c5_p508_9 = "c5_p508_9";
    public static final String modulo5_c5_p508_10 = "c5_p508_10";
    public static final String modulo5_c5_p508_11 = "c5_p508_11";
    public static final String modulo5_c5_p508_o = "c5_p508_o";
    public static final String modulo5_c5_p509 = "c5_p509";
    public static final String modulo5_c5_p510 = "c5_p510";
    public static final String modulo5_c5_p511 = "c5_p511";
    public static final String modulo5_c5_p511_o = "c5_p511_o";
    public static final String modulo5_c5_p512 = "c5_p512";
    public static final String modulo5_c5_p512_o = "c5_p512_o";
    public static final String modulo5_c5_p513 = "c5_p513";
    public static final String modulo5_c5_p513_o = "c5_p513_o";
    public static final String modulo5_obs_cap5 = "obs_cap5";
    public static final String modulo5_COB500 = "COB500";




    public static final String SQL_CREATE_TABLA_MODULO5 =
            "CREATE TABLE " + tablamodulo5 + "(" +
                    modulo5_id  + " TEXT PRIMARY KEY," +
                    modulo5_id_informante + " TEXT," +
                    modulo5_id_hogar + " TEXT," +
                    modulo5_id_vivienda + " TEXT," +
                    modulo5_c5_p501  +  " TEXT," +
                    modulo5_c5_p502_c  +  " TEXT," +
                    modulo5_c5_p502  +  " TEXT," +
                    modulo5_c5_p502_eleccion  +  " TEXT," +
                    modulo5_c5_p502_o  +  " TEXT," +
                    modulo5_c5_p503  +  " TEXT," +
                    modulo5_c5_p504  +  " TEXT," +
                    modulo5_c5_p505  +  " TEXT," +
                    modulo5_c5_p506_1  +  " TEXT," +
                    modulo5_c5_p506_2  +  " TEXT," +
                    modulo5_c5_p506_3  +  " TEXT," +
                    modulo5_c5_p506_4  +  " TEXT," +
                    modulo5_c5_p507  +  " TEXT," +
                    modulo5_c5_p507_dist  +  " TEXT," +
                    modulo5_c5_p507_prov  +  " TEXT," +
                    modulo5_c5_p507_dep  +  " TEXT," +
                    modulo5_c5_p508_1  +  " TEXT," +
                    modulo5_c5_p508_2  +  " TEXT," +
                    modulo5_c5_p508_3  +  " TEXT," +
                    modulo5_c5_p508_4  +  " TEXT," +
                    modulo5_c5_p508_5  +  " TEXT," +
                    modulo5_c5_p508_6  +  " TEXT," +
                    modulo5_c5_p508_7  +  " TEXT," +
                    modulo5_c5_p508_8  +  " TEXT," +
                    modulo5_c5_p508_9  +  " TEXT," +
                    modulo5_c5_p508_10  +  " TEXT," +
                    modulo5_c5_p508_11  +  " TEXT," +
                    modulo5_c5_p508_o  +  " TEXT," +
                    modulo5_c5_p509  +  " TEXT," +
                    modulo5_c5_p510  +  " TEXT," +
                    modulo5_c5_p511  +  " TEXT," +
                    modulo5_c5_p511_o  +  " TEXT," +
                    modulo5_c5_p512  +  " TEXT," +
                    modulo5_c5_p512_o  +  " TEXT," +
                    modulo5_c5_p513  +  " TEXT," +
                    modulo5_c5_p513_o  +  " TEXT," +
                    modulo5_obs_cap5  +  " TEXT," +
                    modulo5_COB500  +  " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 6
     * */
    public static final String modulo6_id = "_id";
    public static final String modulo6_id_informante = "id_informante";
    public static final String modulo6_id_hogar = "id_hogar";
    public static final String modulo6_id_vivienda = "id_vivienda";
    public static final String modulo6_c6_p601 = "c6_p601";
    public static final String modulo6_c6_p602 = "c6_p602";
    public static final String modulo6_c6_p603 = "c6_p603";
    public static final String modulo6_c6_p604_1 = "c6_p604_1";
    public static final String modulo6_c6_p604_2 = "c6_p604_2";
    public static final String modulo6_c6_p604_3 = "c6_p604_3";
    public static final String modulo6_c6_p604_4 = "c6_p604_4";
    public static final String modulo6_c6_p604_5 = "c6_p604_5";
    public static final String modulo6_c6_p604_6 = "c6_p604_6";
    public static final String modulo6_c6_p604_7 = "c6_p604_7";
    public static final String modulo6_c6_p604_8 = "c6_p604_8";
    public static final String modulo6_c6_p604_9 = "c6_p604_9";
    public static final String modulo6_c6_p604_10 = "c6_p604_10";
    public static final String modulo6_c6_p604_11 = "c6_p604_11";
    public static final String modulo6_c6_p604_o = "c6_p604_o";
    public static final String modulo6_c6_p605 = "c6_p605";
    public static final String modulo6_c6_p606 = "c6_p606";
    public static final String modulo6_c6_p607 = "c6_p607";
    public static final String modulo6_c6_p608 = "c6_p608";
    public static final String modulo6_c6_p608_o = "c6_p608_o";
    public static final String modulo6_c6_p609 = "c6_p609";
    public static final String modulo6_c6_p610_pd = "c6_p610_pd";
    public static final String modulo6_c6_p610_pl = "c6_p610_pl";
    public static final String modulo6_c6_p610_pm = "c6_p610_pm";
    public static final String modulo6_c6_p610_pmi = "c6_p610_pmi";
    public static final String modulo6_c6_p610_pj = "c6_p610_pj";
    public static final String modulo6_c6_p610_pv = "c6_p610_pv";
    public static final String modulo6_c6_p610_ps = "c6_p610_ps";
    public static final String modulo6_c6_p610_pt = "c6_p610_pt";
    public static final String modulo6_c6_p610_sd = "c6_p610_sd";
    public static final String modulo6_c6_p610_sl = "c6_p610_sl";
    public static final String modulo6_c6_p610_sm = "c6_p610_sm";
    public static final String modulo6_c6_p610_smi = "c6_p610_smi";
    public static final String modulo6_c6_p610_sj = "c6_p610_sj";
    public static final String modulo6_c6_p610_sv = "c6_p610_sv";
    public static final String modulo6_c6_p610_ss = "c6_p610_ss";
    public static final String modulo6_c6_p610_st = "c6_p610_st";
    public static final String modulo6_c6_p610_t = "c6_p610_t";
    public static final String modulo6_c6_p611 = "c6_p611";
    public static final String modulo6_c6_p611a = "c6_p611a";
    public static final String modulo6_c6_p611b = "c6_p611b";
    public static final String modulo6_c6_p612 = "c6_p612";
    public static final String modulo6_c6_p612_nro = "c6_p612_nro";
    public static final String modulo6_c6_p613 = "c6_p613";
    public static final String modulo6_c6_p614_mon = "c6_p614_mon";
    public static final String modulo6_c6_p614_esp = "c6_p614_esp";
    public static final String modulo6_c6_p615_mon = "c6_p615_mon";
    public static final String modulo6_c6_p615_esp = "c6_p615_esp";
    public static final String modulo6_c6_p616_mon = "c6_p616_mon";
    public static final String modulo6_c6_p616_esp = "c6_p616_esp";
    public static final String modulo6_c6_p616_nas = "c6_p616_nas";
    public static final String modulo6_c6_p617 = "c6_p617";
    public static final String modulo6_c6_p617_dist = "c6_p617_dist";
    public static final String modulo6_c6_p617_prov = "c6_p617_prov";
    public static final String modulo6_c6_p617_dep = "c6_p617_dep";
    public static final String modulo6_c6_p625_1 = "c6_p625_1";
    public static final String modulo6_c6_p625_2 = "c6_p625_2";
    public static final String modulo6_c6_p625_3 = "c6_p625_3";
    public static final String modulo6_c6_p625_4 = "c6_p625_4";
    public static final String modulo6_c6_p625_5 = "c6_p625_5";
    public static final String modulo6_c6_p625_6 = "c6_p625_6";
    public static final String modulo6_c6_p625_o = "c6_p625_o";
    public static final String modulo6_c6_p618 = "c6_p618";
    public static final String modulo6_c6_p619 = "c6_p619";
    public static final String modulo6_c6_p619_o = "c6_p619_o";
    public static final String modulo6_c6_p620 = "c6_p620";
    public static final String modulo6_c6_p621 = "c6_p621";
    public static final String modulo6_c6_p622 = "c6_p622";
    public static final String modulo6_c6_p622_o = "c6_p622_o";
    public static final String modulo6_c6_p623 = "c6_p623";
    public static final String modulo6_c6_p623_o = "c6_p623_o";
    public static final String modulo6_c6_p624 = "c6_p624";
    public static final String modulo6_c6_p626 = "c6_p626";
    public static final String modulo6_c6_p627 = "c6_p627";
    public static final String modulo6_c6_p628 = "c6_p628";
    public static final String modulo6_c6_p629_1 = "c6_p629_1";
    public static final String modulo6_c6_p629_2 = "c6_p629_2";
    public static final String modulo6_c6_p629_3 = "c6_p629_3";
    public static final String modulo6_c6_p629_4 = "c6_p629_4";
    public static final String modulo6_c6_p629_o = "c6_p629_o";
    public static final String modulo6_c6_p629_1_f = "c6_p629_1_f";
    public static final String modulo6_c6_p629_1_m = "c6_p629_1_m";
    public static final String modulo6_c6_p629_2_f = "c6_p629_2_f";
    public static final String modulo6_c6_p629_2_m = "c6_p629_2_m";
    public static final String modulo6_c6_p629_3_f = "c6_p629_3_f";
    public static final String modulo6_c6_p629_3_m = "c6_p629_3_m";
    public static final String modulo6_c6_p629_4_f = "c6_p629_4_f";
    public static final String modulo6_c6_p629_4_m = "c6_p629_4_m";
    public static final String modulo6_c6_p630_1 = "c6_p630_1";
    public static final String modulo6_c6_p630_1med = "c6_p630_1med";
    public static final String modulo6_c6_p630_1o = "c6_p630_1o";
    public static final String modulo6_c6_p630_1frec = "c6_p630_1frec";
    public static final String modulo6_c6_p630_1frec_o = "c6_p630_1frec_o";
    public static final String modulo6_c6_p630_1mont = "c6_p630_1mont";
    public static final String modulo6_c6_p630_2 = "c6_p630_2";
    public static final String modulo6_c6_p630_2med = "c6_p630_2med";
    public static final String modulo6_c6_p630_2o = "c6_p630_2o";
    public static final String modulo6_c6_p630_2frec = "c6_p630_2frec";
    public static final String modulo6_c6_p630_2frec_o = "c6_p630_2frec_o";
    public static final String modulo6_c6_p630_2mont = "c6_p630_2mont";
    public static final String modulo6_obs_cap6 = "obs_cap6";
    public static final String modulo6_COB600 = "COB600";

    public static final String SQL_CREATE_TABLA_MODULO6 =
            "CREATE TABLE " + tablamodulo6 + "(" +
                    modulo6_id  + " TEXT PRIMARY KEY," +
                    modulo6_id_informante + " TEXT," +
                    modulo6_id_hogar + " TEXT," +
                    modulo6_id_vivienda + " TEXT," +
                    modulo6_c6_p601  +  " TEXT," +
                    modulo6_c6_p602  +  " TEXT," +
                    modulo6_c6_p603  +  " TEXT," +
                    modulo6_c6_p604_1  +  " TEXT," +
                    modulo6_c6_p604_2  +  " TEXT," +
                    modulo6_c6_p604_3  +  " TEXT," +
                    modulo6_c6_p604_4  +  " TEXT," +
                    modulo6_c6_p604_5  +  " TEXT," +
                    modulo6_c6_p604_6  +  " TEXT," +
                    modulo6_c6_p604_7  +  " TEXT," +
                    modulo6_c6_p604_8  +  " TEXT," +
                    modulo6_c6_p604_9  +  " TEXT," +
                    modulo6_c6_p604_10  +  " TEXT," +
                    modulo6_c6_p604_11  +  " TEXT," +
                    modulo6_c6_p604_o  +  " TEXT," +
                    modulo6_c6_p605  +  " TEXT," +
                    modulo6_c6_p606  +  " TEXT," +
                    modulo6_c6_p607  +  " TEXT," +
                    modulo6_c6_p608  +  " TEXT," +
                    modulo6_c6_p608_o  +  " TEXT," +
                    modulo6_c6_p609  +  " TEXT," +
                    modulo6_c6_p610_pd  +  " TEXT," +
                    modulo6_c6_p610_pl  +  " TEXT," +
                    modulo6_c6_p610_pm  +  " TEXT," +
                    modulo6_c6_p610_pmi  +  " TEXT," +
                    modulo6_c6_p610_pj  +  " TEXT," +
                    modulo6_c6_p610_pv  +  " TEXT," +
                    modulo6_c6_p610_ps  +  " TEXT," +
                    modulo6_c6_p610_pt  +  " TEXT," +
                    modulo6_c6_p610_sd  +  " TEXT," +
                    modulo6_c6_p610_sl  +  " TEXT," +
                    modulo6_c6_p610_sm  +  " TEXT," +
                    modulo6_c6_p610_smi  +  " TEXT," +
                    modulo6_c6_p610_sj  +  " TEXT," +
                    modulo6_c6_p610_sv  +  " TEXT," +
                    modulo6_c6_p610_ss  +  " TEXT," +
                    modulo6_c6_p610_st  +  " TEXT," +
                    modulo6_c6_p610_t  +  " TEXT," +
                    modulo6_c6_p611  +  " TEXT," +
                    modulo6_c6_p611a  +  " TEXT," +
                    modulo6_c6_p611b  +  " TEXT," +
                    modulo6_c6_p612  +  " TEXT," +
                    modulo6_c6_p612_nro  +  " TEXT," +
                    modulo6_c6_p613  +  " TEXT," +
                    modulo6_c6_p614_mon  +  " TEXT," +
                    modulo6_c6_p614_esp  +  " TEXT," +
                    modulo6_c6_p615_mon  +  " TEXT," +
                    modulo6_c6_p615_esp  +  " TEXT," +
                    modulo6_c6_p616_mon  +  " TEXT," +
                    modulo6_c6_p616_esp  +  " TEXT," +
                    modulo6_c6_p616_nas  +  " TEXT," +
                    modulo6_c6_p617  +  " TEXT," +
                    modulo6_c6_p617_dist  +  " TEXT," +
                    modulo6_c6_p617_prov  +  " TEXT," +
                    modulo6_c6_p617_dep  +  " TEXT," +
                    modulo6_c6_p625_1  +  " TEXT," +
                    modulo6_c6_p625_2  +  " TEXT," +
                    modulo6_c6_p625_3  +  " TEXT," +
                    modulo6_c6_p625_4  +  " TEXT," +
                    modulo6_c6_p625_5  +  " TEXT," +
                    modulo6_c6_p625_6  +  " TEXT," +
                    modulo6_c6_p625_o  +  " TEXT," +
                    modulo6_c6_p618  +  " TEXT," +
                    modulo6_c6_p619  +  " TEXT," +
                    modulo6_c6_p619_o  +  " TEXT," +
                    modulo6_c6_p620  +  " TEXT," +
                    modulo6_c6_p621  +  " TEXT," +
                    modulo6_c6_p622  +  " TEXT," +
                    modulo6_c6_p622_o  +  " TEXT," +
                    modulo6_c6_p623  +  " TEXT," +
                    modulo6_c6_p623_o  +  " TEXT," +
                    modulo6_c6_p624  +  " TEXT," +
                    modulo6_c6_p626  +  " TEXT," +
                    modulo6_c6_p627  +  " TEXT," +
                    modulo6_c6_p628  +  " TEXT," +
                    modulo6_c6_p629_1  +  " TEXT," +
                    modulo6_c6_p629_2  +  " TEXT," +
                    modulo6_c6_p629_3  +  " TEXT," +
                    modulo6_c6_p629_4  +  " TEXT," +
                    modulo6_c6_p629_o  +  " TEXT," +
                    modulo6_c6_p629_1_f  +  " TEXT," +
                    modulo6_c6_p629_1_m  +  " TEXT," +
                    modulo6_c6_p629_2_f  +  " TEXT," +
                    modulo6_c6_p629_2_m  +  " TEXT," +
                    modulo6_c6_p629_3_f  +  " TEXT," +
                    modulo6_c6_p629_3_m  +  " TEXT," +
                    modulo6_c6_p629_4_f  +  " TEXT," +
                    modulo6_c6_p629_4_m  +  " TEXT," +
                    modulo6_c6_p630_1  +  " TEXT," +
                    modulo6_c6_p630_1med  +  " TEXT," +
                    modulo6_c6_p630_1o  +  " TEXT," +
                    modulo6_c6_p630_1frec  +  " TEXT," +
                    modulo6_c6_p630_1frec_o  +  " TEXT," +
                    modulo6_c6_p630_1mont  +  " TEXT," +
                    modulo6_c6_p630_2  +  " TEXT," +
                    modulo6_c6_p630_2med  +  " TEXT," +
                    modulo6_c6_p630_2o  +  " TEXT," +
                    modulo6_c6_p630_2frec  +  " TEXT," +
                    modulo6_c6_p630_2frec_o  +  " TEXT," +
                    modulo6_c6_p630_2mont  +  " TEXT," +
                    modulo6_obs_cap6  +  " TEXT," +
                    modulo6_COB600  +  " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 7
     * */
    public static final String modulo7_id = "_id";
    public static final String modulo7_id_informante = "id_informante";
    public static final String modulo7_id_hogar = "id_hogar";
    public static final String modulo7_id_vivienda = "id_vivienda";
    public static final String modulo7_c7_p701 = "c7_p701";
    public static final String modulo7_c7_p702_1 = "c7_p702_1";
    public static final String modulo7_c7_p702_2 = "c7_p702_2";
    public static final String modulo7_c7_p702_3 = "c7_p702_3";
    public static final String modulo7_c7_p702_4 = "c7_p702_4";
    public static final String modulo7_c7_p702_5 = "c7_p702_5";
    public static final String modulo7_c7_p702_6 = "c7_p702_6";
    public static final String modulo7_c7_p702_7 = "c7_p702_7";
    public static final String modulo7_c7_p702_8 = "c7_p702_8";
    public static final String modulo7_c7_p702_9 = "c7_p702_9";
    public static final String modulo7_c7_p702_10 = "c7_p702_10";
    public static final String modulo7_c7_p702_o = "c7_p702_o";
    public static final String modulo7_c7_p703 = "c7_p703";
    public static final String modulo7_c7_p704_1 = "c7_p704_1";
    public static final String modulo7_c7_p704_2 = "c7_p704_2";
    public static final String modulo7_c7_p704_3 = "c7_p704_3";
    public static final String modulo7_c7_p704_4 = "c7_p704_4";
    public static final String modulo7_c7_p704_5 = "c7_p704_5";
    public static final String modulo7_c7_p704_6 = "c7_p704_6";
    public static final String modulo7_c7_p704_o = "c7_p704_o";
    public static final String modulo7_c7_p705_1 = "c7_p705_1";
    public static final String modulo7_c7_p705_2 = "c7_p705_2";
    public static final String modulo7_c7_p705_3 = "c7_p705_3";
    public static final String modulo7_c7_p705_4 = "c7_p705_4";
    public static final String modulo7_c7_p705_5 = "c7_p705_5";
    public static final String modulo7_c7_p705_6 = "c7_p705_6";
    public static final String modulo7_c7_p705_7 = "c7_p705_7";
    public static final String modulo7_c7_p705_o = "c7_p705_o";
    public static final String modulo7_c7_p706 = "c7_p706";
    public static final String modulo7_c7_p707_1 = "c7_p707_1";
    public static final String modulo7_c7_p707_2 = "c7_p707_2";
    public static final String modulo7_c7_p707_3 = "c7_p707_3";
    public static final String modulo7_c7_p707_4 = "c7_p707_4";
    public static final String modulo7_c7_p707_5 = "c7_p707_5";
    public static final String modulo7_c7_p707_6 = "c7_p707_6";
    public static final String modulo7_c7_p707_7 = "c7_p707_7";
    public static final String modulo7_c7_p707_8 = "c7_p707_8";
    public static final String modulo7_c7_p707_9 = "c7_p707_9";
    public static final String modulo7_c7_p707_o = "c7_p707_o";
    public static final String modulo7_c7_p708_1 = "c7_p708_1";
    public static final String modulo7_c7_p708_2 = "c7_p708_2";
    public static final String modulo7_c7_p708_3 = "c7_p708_3";
    public static final String modulo7_c7_p708_4 = "c7_p708_4";
    public static final String modulo7_c7_p708_5 = "c7_p708_5";
    public static final String modulo7_c7_p709_1 = "c7_p709_1";
    public static final String modulo7_c7_p709_2 = "c7_p709_2";
    public static final String modulo7_c7_p709_3 = "c7_p709_3";
    public static final String modulo7_c7_p709_4 = "c7_p709_4";
    public static final String modulo7_c7_p709_5 = "c7_p709_5";
    public static final String modulo7_c7_p709_6 = "c7_p709_6";
    public static final String modulo7_c7_p709_7 = "c7_p709_7";
    public static final String modulo7_c7_p709_8 = "c7_p709_8";
    public static final String modulo7_c7_p709_9 = "c7_p709_9";
    public static final String modulo7_c7_p709_10 = "c7_p709_10";
    public static final String modulo7_c7_p709_o = "c7_p709_o";
    public static final String modulo7_obs_cap7 = "obs_cap7";
    public static final String modulo7_COB700 = "COB700";


    public static final String SQL_CREATE_TABLA_MODULO7 =
            "CREATE TABLE " + tablamodulo7 + "(" +
                    modulo7_id  + " TEXT PRIMARY KEY," +
                    modulo7_id_informante + " TEXT," +
                    modulo7_id_hogar + " TEXT," +
                    modulo7_id_vivienda + " TEXT," +
                    modulo7_c7_p701  +  " TEXT," +
                    modulo7_c7_p702_1  +  " TEXT," +
                    modulo7_c7_p702_2  +  " TEXT," +
                    modulo7_c7_p702_3  +  " TEXT," +
                    modulo7_c7_p702_4  +  " TEXT," +
                    modulo7_c7_p702_5  +  " TEXT," +
                    modulo7_c7_p702_6  +  " TEXT," +
                    modulo7_c7_p702_7  +  " TEXT," +
                    modulo7_c7_p702_8  +  " TEXT," +
                    modulo7_c7_p702_9  +  " TEXT," +
                    modulo7_c7_p702_10  +  " TEXT," +
                    modulo7_c7_p702_o  +  " TEXT," +
                    modulo7_c7_p703  +  " TEXT," +
                    modulo7_c7_p704_1  +  " TEXT," +
                    modulo7_c7_p704_2  +  " TEXT," +
                    modulo7_c7_p704_3  +  " TEXT," +
                    modulo7_c7_p704_4  +  " TEXT," +
                    modulo7_c7_p704_5  +  " TEXT," +
                    modulo7_c7_p704_6  +  " TEXT," +
                    modulo7_c7_p704_o  +  " TEXT," +
                    modulo7_c7_p705_1  +  " TEXT," +
                    modulo7_c7_p705_2  +  " TEXT," +
                    modulo7_c7_p705_3  +  " TEXT," +
                    modulo7_c7_p705_4  +  " TEXT," +
                    modulo7_c7_p705_5  +  " TEXT," +
                    modulo7_c7_p705_6  +  " TEXT," +
                    modulo7_c7_p705_7  +  " TEXT," +
                    modulo7_c7_p705_o  +  " TEXT," +
                    modulo7_c7_p706  +  " TEXT," +
                    modulo7_c7_p707_1  +  " TEXT," +
                    modulo7_c7_p707_2  +  " TEXT," +
                    modulo7_c7_p707_3  +  " TEXT," +
                    modulo7_c7_p707_4  +  " TEXT," +
                    modulo7_c7_p707_5  +  " TEXT," +
                    modulo7_c7_p707_6  +  " TEXT," +
                    modulo7_c7_p707_7  +  " TEXT," +
                    modulo7_c7_p707_8  +  " TEXT," +
                    modulo7_c7_p707_9  +  " TEXT," +
                    modulo7_c7_p707_o  +  " TEXT," +
                    modulo7_c7_p708_1  +  " TEXT," +
                    modulo7_c7_p708_2  +  " TEXT," +
                    modulo7_c7_p708_3  +  " TEXT," +
                    modulo7_c7_p708_4  +  " TEXT," +
                    modulo7_c7_p708_5  +  " TEXT," +
                    modulo7_c7_p709_1  +  " TEXT," +
                    modulo7_c7_p709_2  +  " TEXT," +
                    modulo7_c7_p709_3  +  " TEXT," +
                    modulo7_c7_p709_4  +  " TEXT," +
                    modulo7_c7_p709_5  +  " TEXT," +
                    modulo7_c7_p709_6  +  " TEXT," +
                    modulo7_c7_p709_7  +  " TEXT," +
                    modulo7_c7_p709_8  +  " TEXT," +
                    modulo7_c7_p709_9  +  " TEXT," +
                    modulo7_c7_p709_10  +  " TEXT," +
                    modulo7_c7_p709_o  +  " TEXT," +
                    modulo7_obs_cap7  +  " TEXT," +
                    modulo7_COB700  +  " TEXT" + ");"
            ;

    /**
     * TABLA MODULO 8
     * */
    public static final String modulo8_id = "_id";
    public static final String modulo8_id_informante = "id_informante";
    public static final String modulo8_id_hogar = "id_hogar";
    public static final String modulo8_id_vivienda = "id_vivienda";
    public static final String modulo8_c8_p801 = "c8_p801";
    public static final String modulo8_c8_p802 = "c8_p802";
    public static final String modulo8_c8_p803 = "c8_p803";
    public static final String modulo8_c8_p804 = "c8_p804";
    public static final String modulo8_c8_p805_1 = "c8_p805_1";
    public static final String modulo8_c8_p805_2 = "c8_p805_2";
    public static final String modulo8_c8_p805_3 = "c8_p805_3";
    public static final String modulo8_c8_p805_4 = "c8_p805_4";
    public static final String modulo8_c8_p805_5 = "c8_p805_5";
    public static final String modulo8_c8_p806_1 = "c8_p806_1";
    public static final String modulo8_c8_p806_2 = "c8_p806_2";
    public static final String modulo8_c8_p806_3 = "c8_p806_3";
    public static final String modulo8_c8_p806_4 = "c8_p806_4";
    public static final String modulo8_c8_p806_5 = "c8_p806_5";
    public static final String modulo8_c8_p806_6 = "c8_p806_6";
    public static final String modulo8_c8_p807 = "c8_p807";
    public static final String modulo8_c8_p808_1 = "c8_p808_1";
    public static final String modulo8_c8_p808_2 = "c8_p808_2";
    public static final String modulo8_c8_p808_3 = "c8_p808_3";
    public static final String modulo8_c8_p808_4 = "c8_p808_4";
    public static final String modulo8_c8_p808_5 = "c8_p808_5";
    public static final String modulo8_c8_p808_6 = "c8_p808_6";
    public static final String modulo8_c8_p808_7 = "c8_p808_7";
    public static final String modulo8_c8_p808_8 = "c8_p808_8";
    public static final String modulo8_c8_p808_9 = "c8_p808_9";
    public static final String modulo8_c8_p808_10 = "c8_p808_10";
    public static final String modulo8_c8_p808_11 = "c8_p808_11";
    public static final String modulo8_c8_p808_12 = "c8_p808_12";
    public static final String modulo8_c8_p808_13 = "c8_p808_13";
    public static final String modulo8_c8_p808_o = "c8_p808_o";
    public static final String modulo8_c8_p809 = "c8_p809";
    public static final String modulo8_c8_p810_1 = "c8_p810_1";
    public static final String modulo8_c8_p810_2 = "c8_p810_2";
    public static final String modulo8_c8_p810_3 = "c8_p810_3";
    public static final String modulo8_c8_p810_4 = "c8_p810_4";
    public static final String modulo8_c8_p810_5 = "c8_p810_5";
    public static final String modulo8_c8_p810_6 = "c8_p810_6";
    public static final String modulo8_c8_p810_7 = "c8_p810_7";
    public static final String modulo8_c8_p810_8 = "c8_p810_8";
    public static final String modulo8_c8_p810_9 = "c8_p810_9";
    public static final String modulo8_c8_p810_10 = "c8_p810_10";
    public static final String modulo8_c8_p810_11 = "c8_p810_11";
    public static final String modulo8_c8_p810_12 = "c8_p810_12";
    public static final String modulo8_c8_p810_13 = "c8_p810_13";
    public static final String modulo8_c8_p810_o = "c8_p810_o";
    public static final String modulo8_c8_p811 = "c8_p811";
    public static final String modulo8_c8_p812 = "c8_p812";
    public static final String modulo8_c8_p813_1 = "c8_p813_1";
    public static final String modulo8_c8_p813_2 = "c8_p813_2";
    public static final String modulo8_c8_p813_3 = "c8_p813_3";
    public static final String modulo8_c8_p813_4 = "c8_p813_4";
    public static final String modulo8_c8_p813_5 = "c8_p813_5";
    public static final String modulo8_c8_p813_6 = "c8_p813_6";
    public static final String modulo8_c8_p813_7 = "c8_p813_7";
    public static final String modulo8_c8_p813_8 = "c8_p813_8";
    public static final String modulo8_c8_p813_9 = "c8_p813_9";
    public static final String modulo8_c8_p813_10 = "c8_p813_10";
    public static final String modulo8_c8_p813_11 = "c8_p813_11";
    public static final String modulo8_c8_p813_12 = "c8_p813_12";
    public static final String modulo8_c8_p813_13 = "c8_p813_13";
    public static final String modulo8_c8_p813_14 = "c8_p813_14";
    public static final String modulo8_c8_p813_o = "c8_p813_o";
    public static final String modulo8_c8_p814_1 = "c8_p814_1";
    public static final String modulo8_c8_p814_2 = "c8_p814_2";
    public static final String modulo8_c8_p814_3 = "c8_p814_3";
    public static final String modulo8_c8_p814_4 = "c8_p814_4";
    public static final String modulo8_c8_p814_5 = "c8_p814_5";
    public static final String modulo8_c8_p814_6 = "c8_p814_6";
    public static final String modulo8_c8_p814_7 = "c8_p814_7";
    public static final String modulo8_c8_p814_8 = "c8_p814_8";
    public static final String modulo8_c8_p815 = "c8_p815";
    public static final String modulo8_c8_p816_1 = "c8_p816_1";
    public static final String modulo8_c8_p816_2 = "c8_p816_2";
    public static final String modulo8_c8_p816_3 = "c8_p816_3";
    public static final String modulo8_c8_p816_4 = "c8_p816_4";
    public static final String modulo8_c8_p816_5 = "c8_p816_5";
    public static final String modulo8_c8_p816_6 = "c8_p816_6";
    public static final String modulo8_c8_p816_7 = "c8_p816_7";
    public static final String modulo8_c8_p816_8 = "c8_p816_8";
    public static final String modulo8_c8_p816_9 = "c8_p816_9";
    public static final String modulo8_c8_p816_10 = "c8_p816_10";
    public static final String modulo8_c8_p816_11 = "c8_p816_11";
    public static final String modulo8_c8_p816_12 = "c8_p816_12";
    public static final String modulo8_c8_p816_13 = "c8_p816_13";
    public static final String modulo8_c8_p816_o = "c8_p816_o";
    public static final String modulo8_c8_p817 = "c8_p817";
    public static final String modulo8_c8_p818 = "c8_p818";
    public static final String modulo8_c8_p819_1 = "c8_p819_1";
    public static final String modulo8_c8_p819_2 = "c8_p819_2";
    public static final String modulo8_c8_p819_3 = "c8_p819_3";
    public static final String modulo8_c8_p819_4 = "c8_p819_4";
    public static final String modulo8_c8_p819_5 = "c8_p819_5";
    public static final String modulo8_c8_p819_6 = "c8_p819_6";
    public static final String modulo8_c8_p819_7 = "c8_p819_7";
    public static final String modulo8_c8_p819_8 = "c8_p819_8";
    public static final String modulo8_c8_p819_9 = "c8_p819_9";
    public static final String modulo8_c8_p819_10 = "c8_p819_10";
    public static final String modulo8_c8_p819_11 = "c8_p819_11";
    public static final String modulo8_c8_p819_12 = "c8_p819_12";
    public static final String modulo8_c8_p819_13 = "c8_p819_13";
    public static final String modulo8_c8_p819_14 = "c8_p819_14";
    public static final String modulo8_c8_p819_o = "c8_p819_o";
    public static final String modulo8_c8_p820_1 = "c8_p820_1";
    public static final String modulo8_c8_p820_2 = "c8_p820_2";
    public static final String modulo8_c8_p820_3 = "c8_p820_3";
    public static final String modulo8_c8_p820_4 = "c8_p820_4";
    public static final String modulo8_c8_p820_5 = "c8_p820_5";
    public static final String modulo8_c8_p820_6 = "c8_p820_6";
    public static final String modulo8_c8_p820_7 = "c8_p820_7";
    public static final String modulo8_c8_p820_8 = "c8_p820_8";
    public static final String modulo8_c8_p820_9 = "c8_p820_9";
    public static final String modulo8_c8_p820_10 = "c8_p820_10";
    public static final String modulo8_c8_p820_11 = "c8_p820_11";
    public static final String modulo8_c8_p820_o = "c8_p820_o";
    public static final String modulo8_c8_p821_1 = "c8_p821_1";
    public static final String modulo8_c8_p821_2 = "c8_p821_2";
    public static final String modulo8_c8_p821_3 = "c8_p821_3";
    public static final String modulo8_c8_p821_4 = "c8_p821_4";
    public static final String modulo8_c8_p821_5 = "c8_p821_5";
    public static final String modulo8_c8_p821_6 = "c8_p821_6";
    public static final String modulo8_c8_p821_7 = "c8_p821_7";
    public static final String modulo8_c8_p821_8 = "c8_p821_8";
    public static final String modulo8_c8_p822 = "c8_p822";
    public static final String modulo8_c8_p823_1 = "c8_p823_1";
    public static final String modulo8_c8_p823_2 = "c8_p823_2";
    public static final String modulo8_c8_p823_3 = "c8_p823_3";
    public static final String modulo8_c8_p823_4 = "c8_p823_4";
    public static final String modulo8_c8_p823_5 = "c8_p823_5";
    public static final String modulo8_c8_p823_o = "c8_p823_o";
    public static final String modulo8_obs_cap8 = "obs_cap8";
    public static final String modulo8_email = "email";
    public static final String modulo8_COB800 = "COB800";


    public static final String SQL_CREATE_TABLA_MODULO8 =
            "CREATE TABLE " + tablamodulo8 + "(" +
                    modulo8_id  + " TEXT PRIMARY KEY," +
                    modulo8_id_informante + " TEXT," +
                    modulo8_id_hogar + " TEXT," +
                    modulo8_id_vivienda + " TEXT," +
                    modulo8_c8_p801  +  " TEXT," +
                    modulo8_c8_p802  +  " TEXT," +
                    modulo8_c8_p803  +  " TEXT," +
                    modulo8_c8_p804  +  " TEXT," +
                    modulo8_c8_p805_1  +  " TEXT," +
                    modulo8_c8_p805_2  +  " TEXT," +
                    modulo8_c8_p805_3  +  " TEXT," +
                    modulo8_c8_p805_4  +  " TEXT," +
                    modulo8_c8_p805_5  +  " TEXT," +
                    modulo8_c8_p806_1  +  " TEXT," +
                    modulo8_c8_p806_2  +  " TEXT," +
                    modulo8_c8_p806_3  +  " TEXT," +
                    modulo8_c8_p806_4  +  " TEXT," +
                    modulo8_c8_p806_5  +  " TEXT," +
                    modulo8_c8_p806_6  +  " TEXT," +
                    modulo8_c8_p807  +  " TEXT," +
                    modulo8_c8_p808_1  +  " TEXT," +
                    modulo8_c8_p808_2  +  " TEXT," +
                    modulo8_c8_p808_3  +  " TEXT," +
                    modulo8_c8_p808_4  +  " TEXT," +
                    modulo8_c8_p808_5  +  " TEXT," +
                    modulo8_c8_p808_6  +  " TEXT," +
                    modulo8_c8_p808_7  +  " TEXT," +
                    modulo8_c8_p808_8  +  " TEXT," +
                    modulo8_c8_p808_9  +  " TEXT," +
                    modulo8_c8_p808_10  +  " TEXT," +
                    modulo8_c8_p808_11  +  " TEXT," +
                    modulo8_c8_p808_12  +  " TEXT," +
                    modulo8_c8_p808_13  +  " TEXT," +
                    modulo8_c8_p808_o  +  " TEXT," +
                    modulo8_c8_p809  +  " TEXT," +
                    modulo8_c8_p810_1  +  " TEXT," +
                    modulo8_c8_p810_2  +  " TEXT," +
                    modulo8_c8_p810_3  +  " TEXT," +
                    modulo8_c8_p810_4  +  " TEXT," +
                    modulo8_c8_p810_5  +  " TEXT," +
                    modulo8_c8_p810_6  +  " TEXT," +
                    modulo8_c8_p810_7  +  " TEXT," +
                    modulo8_c8_p810_8  +  " TEXT," +
                    modulo8_c8_p810_9  +  " TEXT," +
                    modulo8_c8_p810_10  +  " TEXT," +
                    modulo8_c8_p810_11  +  " TEXT," +
                    modulo8_c8_p810_12  +  " TEXT," +
                    modulo8_c8_p810_13  +  " TEXT," +
                    modulo8_c8_p810_o  +  " TEXT," +
                    modulo8_c8_p811  +  " TEXT," +
                    modulo8_c8_p812  +  " TEXT," +
                    modulo8_c8_p813_1  +  " TEXT," +
                    modulo8_c8_p813_2  +  " TEXT," +
                    modulo8_c8_p813_3  +  " TEXT," +
                    modulo8_c8_p813_4  +  " TEXT," +
                    modulo8_c8_p813_5  +  " TEXT," +
                    modulo8_c8_p813_6  +  " TEXT," +
                    modulo8_c8_p813_7  +  " TEXT," +
                    modulo8_c8_p813_8  +  " TEXT," +
                    modulo8_c8_p813_9  +  " TEXT," +
                    modulo8_c8_p813_10  +  " TEXT," +
                    modulo8_c8_p813_11  +  " TEXT," +
                    modulo8_c8_p813_12  +  " TEXT," +
                    modulo8_c8_p813_13  +  " TEXT," +
                    modulo8_c8_p813_14  +  " TEXT," +
                    modulo8_c8_p813_o  +  " TEXT," +
                    modulo8_c8_p814_1  +  " TEXT," +
                    modulo8_c8_p814_2  +  " TEXT," +
                    modulo8_c8_p814_3  +  " TEXT," +
                    modulo8_c8_p814_4  +  " TEXT," +
                    modulo8_c8_p814_5  +  " TEXT," +
                    modulo8_c8_p814_6  +  " TEXT," +
                    modulo8_c8_p814_7  +  " TEXT," +
                    modulo8_c8_p814_8  +  " TEXT," +
                    modulo8_c8_p815  +  " TEXT," +
                    modulo8_c8_p816_1  +  " TEXT," +
                    modulo8_c8_p816_2  +  " TEXT," +
                    modulo8_c8_p816_3  +  " TEXT," +
                    modulo8_c8_p816_4  +  " TEXT," +
                    modulo8_c8_p816_5  +  " TEXT," +
                    modulo8_c8_p816_6  +  " TEXT," +
                    modulo8_c8_p816_7  +  " TEXT," +
                    modulo8_c8_p816_8  +  " TEXT," +
                    modulo8_c8_p816_9  +  " TEXT," +
                    modulo8_c8_p816_10  +  " TEXT," +
                    modulo8_c8_p816_11  +  " TEXT," +
                    modulo8_c8_p816_12  +  " TEXT," +
                    modulo8_c8_p816_13  +  " TEXT," +
                    modulo8_c8_p816_o  +  " TEXT," +
                    modulo8_c8_p817  +  " TEXT," +
                    modulo8_c8_p818  +  " TEXT," +
                    modulo8_c8_p819_1  +  " TEXT," +
                    modulo8_c8_p819_2  +  " TEXT," +
                    modulo8_c8_p819_3  +  " TEXT," +
                    modulo8_c8_p819_4  +  " TEXT," +
                    modulo8_c8_p819_5  +  " TEXT," +
                    modulo8_c8_p819_6  +  " TEXT," +
                    modulo8_c8_p819_7  +  " TEXT," +
                    modulo8_c8_p819_8  +  " TEXT," +
                    modulo8_c8_p819_9  +  " TEXT," +
                    modulo8_c8_p819_10  +  " TEXT," +
                    modulo8_c8_p819_11  +  " TEXT," +
                    modulo8_c8_p819_12  +  " TEXT," +
                    modulo8_c8_p819_13  +  " TEXT," +
                    modulo8_c8_p819_14  +  " TEXT," +
                    modulo8_c8_p819_o  +  " TEXT," +
                    modulo8_c8_p820_1  +  " TEXT," +
                    modulo8_c8_p820_2  +  " TEXT," +
                    modulo8_c8_p820_3  +  " TEXT," +
                    modulo8_c8_p820_4  +  " TEXT," +
                    modulo8_c8_p820_5  +  " TEXT," +
                    modulo8_c8_p820_6  +  " TEXT," +
                    modulo8_c8_p820_7  +  " TEXT," +
                    modulo8_c8_p820_8  +  " TEXT," +
                    modulo8_c8_p820_9  +  " TEXT," +
                    modulo8_c8_p820_10  +  " TEXT," +
                    modulo8_c8_p820_11  +  " TEXT," +
                    modulo8_c8_p820_o  +  " TEXT," +
                    modulo8_c8_p821_1  +  " TEXT," +
                    modulo8_c8_p821_2  +  " TEXT," +
                    modulo8_c8_p821_3  +  " TEXT," +
                    modulo8_c8_p821_4  +  " TEXT," +
                    modulo8_c8_p821_5  +  " TEXT," +
                    modulo8_c8_p821_6  +  " TEXT," +
                    modulo8_c8_p821_7  +  " TEXT," +
                    modulo8_c8_p821_8  +  " TEXT," +
                    modulo8_c8_p822  +  " TEXT," +
                    modulo8_c8_p823_1  +  " TEXT," +
                    modulo8_c8_p823_2  +  " TEXT," +
                    modulo8_c8_p823_3  +  " TEXT," +
                    modulo8_c8_p823_4  +  " TEXT," +
                    modulo8_c8_p823_5  +  " TEXT," +
                    modulo8_c8_p823_o  +  " TEXT," +
                    modulo8_obs_cap8  +  " TEXT," +
                    modulo8_email  +  " TEXT," +
                    modulo8_COB800  +  " TEXT" + ");"
            ;


    /**
     * TABLA LAYOUTS
     * */
    public static final String layouts_id = "_id";
    public static final String layouts_id_vivienda = "id_vivienda";
    public static final String layouts_p301 = "p301";
    public static final String layouts_p302 = "p302";
    public static final String layouts_p303 = "p303";
    public static final String layouts_p304 = "p304";
    public static final String layouts_p305 = "p305";
    public static final String layouts_p306 = "p306";
    public static final String layouts_p307 = "p307";
    public static final String layouts_p308 = "p308";
    public static final String layouts_p309 = "p309";
    public static final String layouts_p310 = "p310";
    public static final String layouts_p311 = "p311";
    public static final String layouts_p312 = "p312";
    public static final String layouts_p313 = "p313";
    public static final String layouts_p314 = "p314";
    public static final String layouts_p315 = "p315";
    public static final String layouts_p316 = "p316";
    public static final String layouts_p317 = "p317";
    public static final String layouts_p318 = "p318";
    public static final String layouts_p401 = "p401";
    public static final String layouts_p402 = "p402";
    public static final String layouts_p403 = "p403";
    public static final String layouts_p404 = "p404";
    public static final String layouts_p405 = "p405";
    public static final String layouts_p406 = "p406";
    public static final String layouts_p407 = "p407";
    public static final String layouts_p408 = "p408";
    public static final String layouts_p409 = "p409";
    public static final String layouts_p410 = "p410";
    public static final String layouts_p411 = "p411";
    public static final String layouts_p412 = "p412";
    public static final String layouts_p413 = "p413";
    public static final String layouts_p414 = "p414";
    public static final String layouts_p415 = "p415";
    public static final String layouts_p416 = "p416";
    public static final String layouts_p501 = "p501";
    public static final String layouts_p502 = "p502";
    public static final String layouts_p503 = "p503";
    public static final String layouts_p504 = "p504";
    public static final String layouts_p505 = "p505";
    public static final String layouts_p506 = "p506";
    public static final String layouts_p507 = "p507";
    public static final String layouts_p508 = "p508";
    public static final String layouts_p509 = "p509";
    public static final String layouts_p510 = "p510";
    public static final String layouts_p511 = "p511";
    public static final String layouts_p512 = "p512";
    public static final String layouts_p513 = "p513";
    public static final String layouts_p601 = "p601";
    public static final String layouts_p602 = "p602";
    public static final String layouts_p603 = "p603";
    public static final String layouts_p604 = "p604";
    public static final String layouts_p605 = "p605";
    public static final String layouts_p606 = "p606";
    public static final String layouts_p607 = "p607";
    public static final String layouts_p608 = "p608";
    public static final String layouts_p609 = "p609";
    public static final String layouts_p610 = "p610";
    public static final String layouts_p611 = "p611";
    public static final String layouts_p611a = "p611a";
    public static final String layouts_p611b = "p611b";
    public static final String layouts_p612 = "p612";
    public static final String layouts_p613 = "p613";
    public static final String layouts_p614 = "p614";
    public static final String layouts_p615 = "p615";
    public static final String layouts_p616 = "p616";
    public static final String layouts_p617 = "p617";
    public static final String layouts_p618 = "p618";
    public static final String layouts_p619 = "p619";
    public static final String layouts_p620 = "p620";
    public static final String layouts_p621 = "p621";
    public static final String layouts_p622 = "p622";
    public static final String layouts_p623 = "p623";
    public static final String layouts_p624 = "p624";
    public static final String layouts_p625 = "p625";
    public static final String layouts_p626 = "p626";
    public static final String layouts_p627 = "p627";
    public static final String layouts_p628 = "p628";
    public static final String layouts_p629 = "p629";
    public static final String layouts_p630 = "p630";
    public static final String layouts_p701 = "p701";
    public static final String layouts_p702 = "p702";
    public static final String layouts_p703 = "p703";
    public static final String layouts_p704 = "p704";
    public static final String layouts_p705 = "p705";
    public static final String layouts_p706 = "p706";
    public static final String layouts_p707 = "p707";
    public static final String layouts_p708 = "p708";
    public static final String layouts_p709 = "p709";
    public static final String layouts_p801 = "p801";
    public static final String layouts_p802 = "p802";
    public static final String layouts_p803 = "p803";
    public static final String layouts_p804 = "p804";
    public static final String layouts_p805 = "p805";
    public static final String layouts_p806 = "p806";
    public static final String layouts_p807 = "p807";
    public static final String layouts_p808 = "p808";
    public static final String layouts_p809 = "p809";
    public static final String layouts_p810 = "p810";
    public static final String layouts_p811 = "p811";
    public static final String layouts_p812 = "p812";
    public static final String layouts_p813 = "p813";
    public static final String layouts_p814 = "p814";
    public static final String layouts_p815 = "p815";
    public static final String layouts_p816 = "p816";
    public static final String layouts_p817 = "p817";
    public static final String layouts_p818 = "p818";
    public static final String layouts_p819 = "p819";
    public static final String layouts_p820 = "p820";
    public static final String layouts_p821 = "p821";
    public static final String layouts_p822 = "p822";
    public static final String layouts_p823 = "p823";

    public static final String SQL_CREATE_TABLA_LAYOUTS =
            "CREATE TABLE " + tablalayouts + "(" +
                    layouts_id  + " TEXT PRIMARY KEY," +
                    layouts_id_vivienda + " TEXT," +
                    layouts_p301 + " TEXT," +
                    layouts_p302 + " TEXT," +
                    layouts_p303 + " TEXT," +
                    layouts_p304 + " TEXT," +
                    layouts_p305 + " TEXT," +
                    layouts_p306 + " TEXT," +
                    layouts_p307 + " TEXT," +
                    layouts_p308 + " TEXT," +
                    layouts_p309 + " TEXT," +
                    layouts_p310 + " TEXT," +
                    layouts_p311 + " TEXT," +
                    layouts_p312 + " TEXT," +
                    layouts_p313 + " TEXT," +
                    layouts_p314 + " TEXT," +
                    layouts_p315 + " TEXT," +
                    layouts_p316 + " TEXT," +
                    layouts_p317 + " TEXT," +
                    layouts_p318 + " TEXT," +
                    layouts_p401 + " TEXT," +
                    layouts_p402 + " TEXT," +
                    layouts_p403 + " TEXT," +
                    layouts_p404 + " TEXT," +
                    layouts_p405 + " TEXT," +
                    layouts_p406 + " TEXT," +
                    layouts_p407 + " TEXT," +
                    layouts_p408 + " TEXT," +
                    layouts_p409 + " TEXT," +
                    layouts_p410 + " TEXT," +
                    layouts_p411 + " TEXT," +
                    layouts_p412 + " TEXT," +
                    layouts_p413 + " TEXT," +
                    layouts_p414 + " TEXT," +
                    layouts_p415 + " TEXT," +
                    layouts_p416 + " TEXT," +
                    layouts_p501 + " TEXT," +
                    layouts_p502 + " TEXT," +
                    layouts_p503 + " TEXT," +
                    layouts_p504 + " TEXT," +
                    layouts_p505 + " TEXT," +
                    layouts_p506 + " TEXT," +
                    layouts_p507 + " TEXT," +
                    layouts_p508 + " TEXT," +
                    layouts_p509 + " TEXT," +
                    layouts_p510 + " TEXT," +
                    layouts_p511 + " TEXT," +
                    layouts_p512 + " TEXT," +
                    layouts_p513 + " TEXT," +
                    layouts_p601 + " TEXT," +
                    layouts_p602 + " TEXT," +
                    layouts_p603 + " TEXT," +
                    layouts_p604 + " TEXT," +
                    layouts_p605 + " TEXT," +
                    layouts_p606 + " TEXT," +
                    layouts_p607 + " TEXT," +
                    layouts_p608 + " TEXT," +
                    layouts_p609 + " TEXT," +
                    layouts_p610 + " TEXT," +
                    layouts_p611 + " TEXT," +
                    layouts_p611a + " TEXT," +
                    layouts_p611b + " TEXT," +
                    layouts_p612 + " TEXT," +
                    layouts_p613 + " TEXT," +
                    layouts_p614 + " TEXT," +
                    layouts_p615 + " TEXT," +
                    layouts_p616 + " TEXT," +
                    layouts_p617 + " TEXT," +
                    layouts_p618 + " TEXT," +
                    layouts_p619 + " TEXT," +
                    layouts_p620 + " TEXT," +
                    layouts_p621 + " TEXT," +
                    layouts_p622 + " TEXT," +
                    layouts_p623 + " TEXT," +
                    layouts_p624 + " TEXT," +
                    layouts_p625 + " TEXT," +
                    layouts_p626 + " TEXT," +
                    layouts_p627 + " TEXT," +
                    layouts_p628 + " TEXT," +
                    layouts_p629 + " TEXT," +
                    layouts_p630 + " TEXT," +
                    layouts_p701 + " TEXT," +
                    layouts_p702 + " TEXT," +
                    layouts_p703 + " TEXT," +
                    layouts_p704 + " TEXT," +
                    layouts_p705 + " TEXT," +
                    layouts_p706 + " TEXT," +
                    layouts_p707 + " TEXT," +
                    layouts_p708 + " TEXT," +
                    layouts_p709 + " TEXT," +
                    layouts_p801 + " TEXT," +
                    layouts_p802 + " TEXT," +
                    layouts_p803 + " TEXT," +
                    layouts_p804 + " TEXT," +
                    layouts_p805 + " TEXT," +
                    layouts_p806 + " TEXT," +
                    layouts_p807 + " TEXT," +
                    layouts_p808 + " TEXT," +
                    layouts_p809 + " TEXT," +
                    layouts_p810 + " TEXT," +
                    layouts_p811 + " TEXT," +
                    layouts_p812 + " TEXT," +
                    layouts_p813 + " TEXT," +
                    layouts_p814 + " TEXT," +
                    layouts_p815 + " TEXT," +
                    layouts_p816 + " TEXT," +
                    layouts_p817 + " TEXT," +
                    layouts_p818 + " TEXT," +
                    layouts_p819 + " TEXT," +
                    layouts_p820 + " TEXT," +
                    layouts_p821 + " TEXT," +
                    layouts_p822 + " TEXT," +
                    layouts_p823  +  " TEXT" + ");"
            ;

    /**
     * CLAUSULAS WHERE
     * */
    public static final String WHERE_CLAUSE_ID = "_id=?";
    public static final String WHERE_CLAUSE_NUMERO = "numero=?";
    public static final String WHERE_CLAUSE_ID_ENCUESTADO = "id_encuestado=?";
    public static final String WHERE_CLAUSE_VIVIENDA_ID = "id_vivienda=?";
    public static final String WHERE_CLAUSE_HOGAR_ID = "id_hogar=?";
    public static final String WHERE_CLAUSE_ANIO = "anio=?";
    public static final String WHERE_CLAUSE_MES = "mes=?";
    public static final String WHERE_CLAUSE_PERIODO = "periodo=?";
    public static final String WHERE_CLAUSE_ZONA = "zona=?";
    public static final String WHERE_CLAUSE_USUARIO_ID = "usuario_id=?";
    public static final String WHERE_CLAUSE_USUARIO_SUP_ID = "usuario_sup_id=?";
    public static final String WHERE_CLAUSE_USUARIO = "usuario=?";
    public static final String WHERE_CLAUSE_ESTADO_COD = municipios_cod_estado+"=?";
    public static final String WHERE_CLAUSE_DESCRIPCION = ubigeo_descripcion+"=?";
    public static final String WHERE_CLAUSE_EXISTE_MENOR = "id_hogar=? and c2_p205_a<18";










//    public static final String[] COLUMNAS_NACIONAL = {
//            nacional_codigo,nacional_apepat,nacional_aplicacion,
//            nacional_aula, nacional_discapacidad, nacional_sede
//    };
}
