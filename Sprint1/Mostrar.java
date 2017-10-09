package Peliculas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mostrar {
	
	
	//Pelicula peli = new Pelicula();
//	public static void mostrarPeli ()
//	{
//		ArrayList<Peliculas> listaPeli = new ArrayList<>();
//		
//		for(String peli:listaPeli)
//		{
//			System.out.println(peli);
//		}
//	}

////////////////
	
public static ArrayList<Pelicula> mostararPeli(){
 
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String url = "jdbc:mysql://localhost:3306/lucapeliculas.";
        String user = "root";
        String password = "1111";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Pelicula");
            rs = pst.executeQuery();

            while (rs.next()) {
            	System.out.println("MOSTRAR PELICULAS");
               
            String titulo=	rs.getString(1);
            int id= rs.getInt(2);
            String genero = rs.getString(3);
            String director = rs.getString(4);
            int anio = rs.getInt(5);
            int duracion = rs.getInt(6);
            String sinopsis = rs.getString(7);
            String ruta= rs.getString(8);
            String ruta2= rs.getString(9);
            int precio_compra= rs.getInt(10);
            int precio_alquiler = rs.getInt(11);
            
//                System.out.println("Titulo: "+rs.getString(1));
//                System.out.print("Id: "+rs.getInt(2));
//                System.out.println("Genero: "+rs.getString(3));
//                System.out.println("Director: "+rs.getString(4));
//                System.out.print("Año: "+rs.getInt(5));
//                System.out.println("Duracion: "+rs.getInt(6));
//                System.out.println("Sinopsis"+rs.getString(7));
//                System.out.println("Ruta imagen: "+rs.getString(8));
//                System.out.println("Precio Compra: "+rs.getInt(9));
//                System.out.print("Precio alquiler: "+rs.getInt(10));
          
              Pelicula  peli= new Pelicula(titulo,id,genero,director,anio,duracion,sinopsis,ruta,ruta2,precio_compra,precio_alquiler);
               listaPeliculas.add(peli);
            }
            
            return listaPeliculas;

        } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Mostrar.class.getName()); 
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
        	

        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Mostrar.class.getName(), null);
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
		return listaPeliculas;
}
}