/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerTarefas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class FuncoesUteis {
    public static String dateToStr( Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.format(dt);
    }
    public static Date strToDate( String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
}
