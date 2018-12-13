/*
Proyecto Final: Pronostico de Personal
CIA: Kenworth Mexicana
Asignatura: Desarrollo de Software
Catedratico: Maria Angelica Astorga
Equipo: Adrian Heredia, Sergio Salomon, Edgar Pescador, Hector Montes, Jaime Rodriguez
Fecha: Junio 2018.
*/
package kwnegocio;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import kwpersistencia.KWPersistencia;

/**
 *
 * @author jaime
 */
public class procesos {
    KWPersistencia db;
    Double tiempo = 0.0; // Tiempo de vestidura motor / eje
    static GregorianCalendar cal;
    static SimpleDateFormat sdf;
    
    public procesos() {
        try {        
            this.db = new KWPersistencia();
            this.cal = new GregorianCalendar();
            this.sdf = new SimpleDateFormat("MM-dd-yyyy");             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    // Empleados por departamento
    public String empleadospordepto(Integer depto){
        String cantidad=null;
        int cant = 0;
        try {
            cant = db.readdeptos(depto);
            //System.out.println("Procesos " + cant);
        } catch (SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cantidad = Integer.toString(cant);
        return cantidad;
    }
    // Parametros 
    public String ReadParameters(int indata ) throws SQLException{
        String parametro="";   
            if (indata == 1){                
                parametro = db.RPcapacidad();
            }else{            
                parametro = db.RPprodactual();
            }          
        return parametro;
    }
    // Update Parametros
    public void UpdateParameters(int pro, int cap){
        db.updatepatameters(pro, cap);
    }
    // Agregar un modelo nuevo.
    public void addnewmodel(String model, String motor, String tmotor,
                            String t2ejes, String t3ejes){
        double time2ejes = 0.0;
        double time3ejes = 0.0;
        db.addnewmodels(model, motor, tmotor, t2ejes, t3ejes);        
    }
    // Personal requerido para ejes
    public Double recursospordeptoejes(String modelo, int cejes, int cproducir, String neumatico){        
        String tmptiempo = null;
        Double CantEmp = 0.0;        
        //System.out.println("Cant ejes " + cejes);
        try {
            tmptiempo = db.tiemporecursosejes(modelo, cejes);            
            tiempo = Double.parseDouble(tmptiempo);
            if (neumatico.equalsIgnoreCase("Si")){
                tiempo = tiempo + 0.5;
            }
            CantEmp = ((tiempo * cproducir)/8);
            //CantEmp = (int)Math.ceil(tdouble);
        } catch (SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CantEmp;
    }
    // Personal requerido para motores
    public Double recursospordeptomotores(String modelo, int cproducir){
        String tmptiempo = null;
        Double CantEmp = 0.0;
        try {
            tmptiempo = db.tiemporecursosmotores(modelo);
            tiempo = Double.parseDouble(tmptiempo);
            CantEmp = ((tiempo * cproducir)/8);
            //CantEmp = (int)Math.ceil(tdouble);
        } catch (SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return CantEmp;
    }
    // Cantidad de jubilados Motores
    public String  jubilados(String fechapro, int depto){
        //System.out.println("Fecha de entrada " + fechapro);
        String cantidad = null;
        try {
            Date date = sdf.parse(fechapro);
            date = subtractYears(date, 60);
            Date Fini = subtractDays(date, 30);
            Date Ffin = addDays(date, 30);
            String fIni = sdf.format(Fini);
            String fFin = sdf.format(Ffin);               
            cantidad = db.jubilados(depto, fIni, fFin);            
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return cantidad;
    }
    // Vacaciones
    public String vacaciones(String fechapro, int depto){
        //System.out.println("Fecha de entrada vaca " + fechapro);
        String cantidad = null;
        try {
            Date date = sdf.parse(fechapro);
            int weeknumber = WeekNumber(date);            
            cantidad = db.vacaciones(depto, weeknumber);
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(procesos.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return cantidad;
    }
    // Funciones para el calculo de las fechas.
    public static Date addDays(Date date, int days) {
        //GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);				
        return cal.getTime();
	}
    public static Date subtractDays(Date date, int days) {
        //GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);				
        return cal.getTime();
    }
    // Restar los 60 años.
    public static Date subtractYears(Date date, int years) {
        //GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -years);				
        return cal.getTime();
    }
    // Numero de semana
    public static int WeekNumber(Date date) {
        int numweek = 0;		
        numweek = cal.get(Calendar.WEEK_OF_YEAR);
       // System.out.println("Week number " + numweek);
        return numweek;
    }
}
