package com.tatiramos.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    /*
    Métodos estáticos são métodos que podem ser chamados sem a necessidade de criar uma instância
    da classe. Eles são frequentemente usados para fornecer métodos de utilidade ou para acessar
    variáveis estáticas.
     */

    public static String converterDateparaDataEHora(Date date){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(date);
    }

    public static String converterDateparaData(Date date){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(date);
    }

    public static String converterDateparaHora(Date date){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(date);
    }
}
