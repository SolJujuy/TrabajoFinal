package paquete1;

import java.sql.*;

import java.time.LocalDate;
import java.util.Scanner;


import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
	    ArrayList<Double> lista = new ArrayList<Double>();	
	    ArrayList<String> lista2 = new ArrayList<String>();
	    ArrayList<Integer> lista3 = new ArrayList<Integer>();
boolean falsedad=true;		
while (falsedad) {
	
	
	System.out.println("1 - libro fisico");
	System.out.println("2 - libro digital");
	System.out.println("3 - revista fisica");
	System.out.println("4 - revista digital");
	System.out.println("5 - sumar total");
	System.out.println("6 - mostrar todos los libros");
	System.out.println("7 - mostrar todas las revistas");


	int queEs = Integer.parseInt(scan.next());
	switch (queEs) {
    case 1:
    	int codig=0;
    	String editor="";
    	LocalDate publicacion= LocalDate.of(1900, 01, 01);
    	double costo=0;
    	String titu = "";
    	String autor="";
    	int cantidad=0;
    	double totalitem=0;
    	
    	System.out.println("ingrese el codigo del libro: ");
    	codig=Integer.parseInt(scan.next());
    	System.out.println("ingrese la cantidad:");
    	cantidad=Integer.parseInt(scan.next());
    	
    		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT * FROM `libro` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
				codig=res.getInt("codigo");
				editor= res.getString("editor");
				publicacion=res.getDate("publicacion").toLocalDate();
				costo = res.getDouble("costo");
			    titu = res.getString("titulo");
			    autor=res.getString("autor");
			}
			
    		} catch (Exception e) {
			System.out.println(e);
    		}
    	 libro l1 =new libro(codig, editor, publicacion, costo, titu, autor,cantidad);
    	 totalitem=l1.valorFinal(l1.getCosto()*1,18);
         lista.add(totalitem);
         lista2.add(l1.getTitulo()+" - impreso");
         lista3.add(cantidad);
         System.out.println("agregado" );
         System.out.println("_________________");
         
        break;
    case 2:
    	
    	 codig=0;
    	 editor="";
    	 publicacion= LocalDate.of(1900, 01, 01);
    	 costo=0;
    	 titu = "";
    	 autor="";
    	 cantidad=0;
    	 totalitem=0;
    	
    	System.out.println("ingrese el codigo del libro: ");
    	codig=Integer.parseInt(scan.next());
    	System.out.println("ingrese la cantidad:");
    	cantidad=Integer.parseInt(scan.next());
    	
    		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT * FROM `libro` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
				codig=res.getInt("codigo");
				editor= res.getString("editor");
				publicacion=res.getDate("publicacion").toLocalDate();
				costo = res.getDouble("costo");
			    titu = res.getString("titulo");
			    autor=res.getString("autor");
			}
			
    		} catch (Exception e) {
			System.out.println(e);
    		}
    	  l1 =new libro(codig, editor, publicacion, costo, titu, autor,cantidad);
    	 totalitem=l1.valorFinal(l1.getCosto(), l1.getcantidad())*1.08;
         lista.add(totalitem);
         lista2.add(l1.getTitulo()+" - digital");
         lista3.add(cantidad);
         System.out.println("agregado" );
         System.out.println("_________________");
         
        break;
    case 3:
     codig=0;
   	 editor="";
   	 publicacion= LocalDate.of(1900, 01, 01);
   	 costo=0;
   	 String nombre = "";
   	 cantidad=0;
   	 totalitem=0;
   	 
   	    	
   	System.out.println("ingrese el codigo del libro: ");
   	codig=Integer.parseInt(scan.next());
   	System.out.println("ingrese la cantidad:");
   	cantidad=Integer.parseInt(scan.next());
   	
   		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT * FROM `revista` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
				codig=res.getInt("codigo");
				editor= res.getString("editor");
				publicacion=res.getDate("publicacion").toLocalDate();
				costo = res.getDouble("costo");
			    nombre = res.getString("nombre");
			}
			
   		} catch (Exception e) {
			System.out.println(e);
   		}
   	 revista r1 =new revista(codig, editor, publicacion, costo, nombre,cantidad);
   	 totalitem=r1.valorFinal(r1.getCosto(), r1.getCantidad())*1.22;
        lista.add(totalitem);
        lista2.add(r1.getNombre()+" - impreso");
        lista3.add(r1.getCantidad());
        System.out.println("agregado" + r1.getNombre());
        System.out.println("_________________");
       break;
    case 4:
    	
        codig=0;
      	 editor="";
      	 publicacion= LocalDate.of(1900, 01, 01);
      	 costo=0;
      	 nombre = "";
      	 cantidad=0;
      	 totalitem=0;
      	 
      	    	
      	System.out.println("ingrese el codigo del libro: ");
      	codig=Integer.parseInt(scan.next());
      	System.out.println("ingrese la cantidad:");
      	cantidad=Integer.parseInt(scan.next());
      	
      		try {
   			Class.forName("com.mysql.cj.jdbc.Driver");
   			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
   			Statement s1 = c.createStatement();
   			String consulta="SELECT * FROM `revista` WHERE codigo="+codig;
   			ResultSet res= s1.executeQuery(consulta);
   			while(res.next()) {
   				codig=res.getInt("codigo");
   				editor= res.getString("editor");
   				publicacion=res.getDate("publicacion").toLocalDate();
   				costo = res.getDouble("costo");
   			    nombre = res.getString("nombre");
   			}
   			
      		} catch (Exception e) {
   			System.out.println(e);
      		}
      	  r1 =new revista(codig, editor, publicacion, costo, nombre,cantidad);
      	 totalitem=r1.valorFinal(r1.getCosto(), r1.getCantidad())*1.12;
           lista.add(totalitem);
           lista2.add(r1.getNombre()+" - digital");
           lista3.add(r1.getCantidad());
           System.out.println("agregado" + r1.getNombre());
           System.out.println("_________________");
          break;
    case 5: 
       double todo=0;
       System.out.println("_________________");
    	for (int i = 0; i < lista.size(); i++) {
    		System.out.println(lista3.get(i)+" - "+lista2.get(i)+": "+lista.get(i));
            todo= todo+lista.get(i);
        }           
    	System.out.println("_________________");
    	System.out.println("total: $"+todo);
    	lista.clear();
    	lista2.clear();
    	lista3.clear();
            falsedad=false;
            scan.close();
            break;   
    case 6: 
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT * FROM `libro`";
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
				System.out.println("codigo: "+res.getInt("codigo")+" - titulo "+res.getString("titulo")+" - autor: "+res.getString("autor"));
			}
			System.out.println("_________________");
   		} catch (Exception e) {
			System.out.println(e);
   		}
             break;   
    case 7: 
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT * FROM `revista`";
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
				System.out.println("codigo: "+res.getInt("codigo")+" - nombre "+res.getString("nombre"));
			}
			System.out.println("_________________");
   		} catch (Exception e) {
			System.out.println(e);
   		}
             break;
             default:
            	 System.out.println("intente de nuevo");
            	 break;
            
}
} 				
}
	

	
	
}