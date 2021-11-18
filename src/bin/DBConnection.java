/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAMIEXXX3
 */
public class DBConnection {
    
    private static Connection Myconnection;
   static String Ip;
    public static void init() {
    try{ 
        
          List<String> records=new ArrayList<>();
            FileReader file=new FileReader(System.getProperty("user.dir")+"\\\\serverIp.txt");
           // File file1 = new File("C:\\Users\\JAMIEXXX3\\Desktop\\jamie.txt");
            BufferedReader read =new BufferedReader(file);
            //FileWriter writer=new FileWriter(file1);
            
            String line=read.readLine();
          
            while (line!=null) { 
                 Ip=line;
                 System.out.println(line +"wff");
                 records.add(line);
                 line=read.readLine();
                
                 
               }
        
        
        Class.forName("com.mysql.jdbc.Driver");
        Myconnection=DriverManager.getConnection("jdbc:mysql://"+Ip+":3306/bin","root","root");
    }
   
    catch(ClassNotFoundException | SQLException e){} catch (IOException ex) {
          System.out.println(ex +"wow");
        }
    }
    
    public static Connection getConnection(){
        return Myconnection; }
    
    public static void close(ResultSet rs){
    
         if(rs!=null){
         try{
             rs.close();
        }
         catch(Exception e){System.out.println(e);}
         
         }
    }
    
    public void Destroy(){
    if(Myconnection!=null){
     
        try{
        Myconnection.close();
        }
        catch(Exception e){}
    
    }
  
}
    
    

    
    }
    
    