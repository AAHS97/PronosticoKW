/*
Proyecto Final: Pronostico de Personal
CIA: Kenworth Mexicana
Asignatura: Desarrollo de Software
Catedratico: Maria Angelica Astorga
Equipo: Adrian Heredia, Sergio Salomon, Edgar Pescador, Hector Montes, Jaime Rodriguez
Fecha: Junio 2018.
*/

/*
    Noviembre 25 2018
    Jaime Rodiguez
    Adecuacion para agregar protecion a las tablas
    para evitar la corrupcion de datos
    esto es derivado de la revision que se realizo.
    ID  SQA2
*/
package kwpersistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KWPersistencia {
    static Connection conexion = null;
    static String Url = null;
    static Statement stmt = null;
    public KWPersistencia() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
    public static void readengines() {
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Engines");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println("Erro SQL " + ex);
        }
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(KWPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Para leer modelos en la tabla de modelos.
    public ArrayList<String> readmodelos() throws SQLException {
        ArrayList<String> modelos = new ArrayList<String>();
        int Count = 0;
        String Query = "select M.ModelID, M.Modelo "
                       + "from Modelos M";
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            //Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;integratedSecurity=true;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                modelos.add(rs.getString(2));
                Count++;
            }
        } catch (Exception ex) {
            System.out.println("Error SQL " + ex);
        }
        conexion.close();
        return modelos;
    }
    // Para leer la relacion de Modelo - Motor
    public String readmodelengine(String modelo) throws SQLException {
        String modelengine = null;
        String Query = "select top(1) M.Modelo, M.ModelID, Engines.Descripcion "
                + "from Modelos M "
                + "left join ModelEngine on M.ModelID = ModelEngine.ModelID "
                + "left join Engines on ModelEngine.EngineID = Engines.EngineID "
                + "where M.Modelo = '" + modelo +"'";
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            //System.out.println("Persistencia " + rs.getString(3));
            modelengine = rs.getString(3);
        } catch (Exception ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return modelengine;
    }
    // Leer los tiempos de los ejes por modelo
    public ArrayList<Integer> tiempodeejes(String modelo) throws SQLException{
        ArrayList<Integer> CantEjes = new ArrayList<Integer>();
        String Query = "select Ejes.Cantidad "
                + "from Modelos M "
                + "left join ModelEje on M.ModelID = ModelEje.ModelID "
                + "left join Ejes on ModelEje.EjeID = Ejes.EjeID "
                + "where M.Modelo = '" + modelo + "'";
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                String tmp = rs.getString(1);
                //System.out.println("Persistencia tie-ejes " + rs.getString(1));
                int inttemp = Integer.parseInt(tmp);
                //System.out.println("Var int " + inttemp);   
                CantEjes.add(inttemp);
            }
        } catch (Exception ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return CantEjes;        
    }
    // Leer tiempo de ejes por modelo
    public String tiemporecursosejes(String modelo, int ejes) throws SQLException{
        String tiempo = null;
        String Query = "select M.ModelID, Ejes.Tiempo "
                + "from Modelos M "
                + "left join ModelEje on M.ModelID = ModelEje.ModelID "
                + "left join Ejes on ModelEje.EjeID = Ejes.EjeID "
                + "where M.Modelo = '" + modelo + "'"
                + "and Ejes.Cantidad = " + ejes;
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {                
                tiempo = rs.getString(2);                
            }
        } catch (Exception ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return tiempo;        
    }
    // Leer tiempo de motores por modelo
    public String tiemporecursosmotores(String modelo) throws SQLException{
        String tiempo = null;
        String Query = "select top(1)M.ModelID, Engines.Tiempo "
                + "from Modelos M "
                + "left join ModelEngine on M.ModelID = ModelEngine.ModelID "
                + "left join Engines on ModelEngine.EngineID = Engines.EngineID "
                + "where M.Modelo = '" + modelo + "'";                
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {                
                tiempo = rs.getString(2);                
            }
        } catch (Exception ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return tiempo;        
    }
    // Leer la base de datos de RH, Cantidad de empleados
    public int readdeptos(int departamento) throws SQLException {
        int Cantidad = 0;
        String Query = "select COUNT(E.Nombre) "
                + "from Empleados E "
                + "where E.Activo = 1 "
                + "and E.NoDepto = " + departamento;
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=RH;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            Cantidad = rs.getInt(1);
        } catch (Exception ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return Cantidad;
    }
    // Leer la base de datos de RH, Depto y fechas
    // Extrae la fecha de contratacion.
    public ArrayList<String> readdepofechas(int depto, String field) throws SQLException {
        ArrayList<String> Fecha = new ArrayList<String>();
        String Query = "select  " + field
                + "from Empleados E "
                + "where E.Activo = 1 "
                + "and E.NoDepto = " + depto;
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=RH;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                //System.out.println(rs.getString(1));
                Fecha.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return Fecha;
    }
    // fechas de jubilados
    public String jubilados(int depto, String fini, String ffin) throws SQLException {
        String cantdias = null;
        String Query = "select  count (E.Nombre) "
                + "from Empleados E "
                + "where E.Activo = 1 "
                + "and E.NoDepto = " + depto + " "
                + "and E.FechaNacimiento "
                + "between '" + fini + "' and '" + ffin +"'";
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=RH;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                //System.out.println(rs.getString(1));
                cantdias =  rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return cantdias;
    }
    //Vacaciones
    public String vacaciones(int depto, int weeknumber) throws SQLException {
        String cantdias = null;
        String Query = "select  count (E.Nombre) "
                + "from Empleados E "
                + "where E.Activo = 1 "
                + "and E.NoDepto = " + depto + " "
                + "and DATEPART(WEEK, E.FechaContratacion) = " + weeknumber ;                
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=RH;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                //System.out.println(rs.getString(1));
                cantdias =  rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return cantdias;
    }
    // Read Parameters Capacidad
    public String RPcapacidad() throws SQLException {
        String capacidad = null;
        String Query = "select P.Capacidad "
                + "from Parametros P ";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {
                //System.out.println(rs.getString(1));
                capacidad =  rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return capacidad;
    }
    // Read Parameters Produccion Actual
    public String RPprodactual() throws SQLException {
        String pactual = null;
        String Query = "select P.ProdActual "
                + "from Parametros P ";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while (rs.next()) {                
                pactual =  rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL " + ex);
        }
        conexion.close();
        return pactual;
    }
    // Actualizar Parametros
    public void updatepatameters(int pactual, int capacidad){ 
        // String Query =  "update Parametros "  // Linea Original  // Linea Original SQA2.delete
        String Query =  "update Parametros with (updlock, rowlock) " // Linea Original SQA2.add
                        + "set ProdActual  = " + pactual 
                        + " ,Capacidad = " + capacidad;                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();           
            boolean rs =  stmt.execute(Query);
        }catch(SQLException err){
            System.out.println("Error al Actualizar " + err);
        }
    }
    // Add new Model and References
    public void addnewmodels(String model, String motor, String tmotor,
                             String t2ejes, String t3ejes){
        int modelid = (lastmodel() + 200);
        int engineid = (lastengine() + 200);
        // *** Agrega el modelo, motor y referencia ***
        newmodel(modelid, model, "nuevo");
        double timem = Double.parseDouble(tmotor);
        newengine(engineid, motor, timem);
        newrelmodelengine(modelid, engineid);
        // *** Fin de nuevo modelo - motor y referencia ***
        // Agregar eje, cantidad de ejes y referencia
        // Revisar error de indices
        double time2e = 0.0;
        double time3e = 0.0;
        if(!t2ejes.isEmpty()){
            time2e = Double.parseDouble(t2ejes);
            agregareje(modelid, 2, time2e);
            relmodeleje(modelid, modelid);
        }
        if(!t3ejes.isEmpty()){
            time3e = Double.parseDouble(t3ejes);
            // se deja el mismo ID  al eje para que no se duplique
            // si lleva 2 y 3 ejes al tercero se le agrega 1
            // para que no se duplique el indice
            agregareje((modelid+1), 3, time3e);
            relmodeleje(modelid, (modelid+1));
        }        
    }
    // Agregar eje
    public void agregareje(int id, int cant, double time){
        // String Query = "insert Ejes with "                   // Linea Original SQA2.delete
        String Query = "insert Ejes with (updlock, rowlock)"    // Linea Original SQA2.add
                        + "values  ("+id+","+cant+","+time+");";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement(); 
            stmt.execute(Query);
        }catch(SQLException err){
            System.out.println("Error al insertar en la DB Ejes" + err);
        }
    }
    // Agregar relacion modelo eje
    public void relmodeleje(int modelid, int ejeid){        
        String Query =  "insert ModelEje "
                        + "values  ("+modelid+","+ejeid+");";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            stmt.execute(Query);
        }catch(SQLException err){
            System.out.println("Error al insertar en la DB Model-Eje" + err);
        }
    }
    // Add new model
    public void newmodel(int modelid, String modelo, String desc){
        // String Query =  "insert Modelos "                        // Linea Original SQA2.delete
        String Query =  "insert Modelos with (updlock, rowlock) "   // Linea Original SQA2.add
                        + "values  ("+modelid+",'"+modelo+"','"+desc+"');";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement(); 
            stmt.execute(Query);
        }catch(SQLException err){
            //System.out.println("Error al insertar en la DB " + err);
        }
    }
    // Add new engine
    public void newengine(int id, String motor, double time){
        // String Query = "insert Engines "                         // Linea Original SQA2.delete
        String Query =  "insert Engines with (updlock, rowlock) "    // Linea Original SQA2.add
                        + "values  ("+id+",'"+motor+"',"+time+",'"+"na"+"');";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            stmt.execute(Query);
        }catch(SQLException err){
            //System.out.println("Error al insertar en la DB de Engines" + err);
        }
    }  
    // New Relation Model Engine
    public void newrelmodelengine(int modid, int motid){
        // String Query = "insert ModelEngine "                         // Linea Original SQA2.delete
        String Query =  "insert ModelEngine with (updlock, rowlock) "    // Linea Original SQA2.add
                        + "values  (" + modid + "," + motid + ");";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            stmt.execute(Query);
        }catch(SQLException err){
            System.out.println("Error al insertar en la DB de Modelo-Engines" + err);
        }
    }
    // Last ID de Modelos
    public Integer lastmodel(){
        int lastmodel = 0;
        String Query = "select M.ModelID "
        + "from Modelos M " 
        + "where ModelID = (select MAX(ModelID) from Modelos)";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while(rs.next()){
                //System.out.println("Last Record " + rs.getString(1));
                lastmodel = Integer.parseInt(rs.getString(1));
            }
        }catch(SQLException err){
            System.out.println("Error al leer la DB " + err);
        }        
        return lastmodel;
    }
    // Last ID Engine
    public Integer lastengine(){
        int lastengine = 0;
        String Query = "select E.EngineID "
        + "from Engines E " 
        + "where EngineID = (select MAX(EngineID) from Engines)";                            
        try {
            Url = "jdbc:sqlserver://JAIME-PC\\SQLEXPRESS:1433;databaseName=ERP;user=sa;password=123;";
            conexion = DriverManager.getConnection(Url);
            stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            while(rs.next()){
                //System.out.println("Last Record " + rs.getString(1));
                lastengine = Integer.parseInt(rs.getString(1));
            }
        }catch(SQLException err){
            System.out.println("Error al leer la DB " + err);
        }        
        return lastengine;
    }
}