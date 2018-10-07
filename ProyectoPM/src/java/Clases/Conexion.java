/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Alumno
 */
public class Conexion {
    String url;
    String User;
    String Pass;
    Connection con;
    Statement sta;
    ResultSet res;
    
    public Conexion(){
        url="jdbc:mysql://localhost/Usuarios";
        User="root";
        Pass="n0m3l0";
    }
    
    public String Con(String nombre, String contra){
        String ok="No";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where usua='"+nombre+"' and contra='"+contra+"';");
            if(res.next()){
                ok="Oka";
            }
            else{
                ok="Falso";
            }
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
         
        return ok;
    }
    
    
    public String Rol(String Usuario, String Contra){
        String Rol="No hay rol";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where usua='"+Usuario+"' and contra='"+Contra+"';");
            if(res.next()){
                Rol=res.getString("idrol");
            }
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        return Rol;
    }
    
    public String Insert(String Usu,String Contra, String Cor, String Nom, String Ap, String Am, String tel){
        String ok="No funciona esta cosa";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            sta.executeUpdate("insert into Usuario values('"+Usu+"','"+Contra+"','"+Cor+"','"+Nom+"','"+Ap+"','"+Am+"','"+tel+"',3);");
            ok="Usuario Dado de alta";
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
        return ok;
    }
    
    public String IngRol(String Nom, String Ap, String Am, int R){
        String Rol="No hay rol";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where Nom='"+Nom+"' and ApeP='"+Ap+"' and ApeM='"+Am+"';");
            if(res.next()){
                sta.executeUpdate("Update Usuario set IdRol='"+R+"' where Nom='"+Nom+"';");
                Rol="Rol asignado";
            }
            else
                Rol="Persona no encontrada";
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        return Rol;
    }
    public ArrayList Mostrar(){
        ArrayList<String> M= new <String>ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where idrol=3;");
            while(res.next()){
                String Nom=res.getString("Nom");
                String Ap=res.getString("ApeM");
                String Am=res.getString("ApeP");
                
                int Flag=0;
                Flag= Flag + 1;
                M.add(Nom +" "+ Ap+ " "+ Am);
            }

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return M;
         
    }
    
    public String MostrarS(){
        String M="No hay Usuarios";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where idrol=3;");
            while(res.next()){
                String Nom=res.getString("Nom");
                String Ap=res.getString("ApeM");
                String Am=res.getString("ApeP");
                
                int Flag=0;
                Flag= Flag + 1;
                M= Nom +" "+ Ap+ " "+ Am;
            }

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return M;
         
    }
}

