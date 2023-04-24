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
    	int cantidad=0;
    	double costo=0;
    	String titu = "";
    	double totalitem=0;
    	
    	System.out.println("ingrese el codigo del libro: ");
    	codig=Integer.parseInt(scan.next());
    	System.out.println("ingrese la cantidad:");
    	cantidad=Integer.parseInt(scan.next());
    	
    		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT `costo`, `titulo` FROM `libro` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
			     titu = res.getString("titulo");
			     costo = res.getDouble("costo");   
			}
			
    		} catch (Exception e) {
			System.out.println(e);
    		}
    	
         totalitem =calculoItem(costo,1.18,cantidad);
         lista.add(totalitem);
         lista2.add(titu+" - impreso");
         lista3.add(cantidad);
         System.out.println("agregado" );
         System.out.println("_________________");
         
        break;
    case 2:
    	
    	 codig=0;
    	 cantidad=0;
    	 costo=0;
    	 titu = "";
    	 totalitem=0;
    	
    	System.out.println("ingrese el codigo del libro: ");
    	codig=Integer.parseInt(scan.next());
    	System.out.println("ingrese la cantidad:");
    	cantidad=Integer.parseInt(scan.next());
    	
    		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT `costo`, `titulo` FROM `libro` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
			     titu = res.getString("titulo");
			     costo = res.getDouble("costo");   
			}
			
    		} catch (Exception e) {
			System.out.println(e);
    		}
    	
         totalitem =calculoItem(costo,1.08,cantidad);
         lista.add(totalitem);
         lista2.add(titu+" - digital");
         lista3.add(cantidad);
         System.out.println("agregado");
         System.out.println("_________________");
   
        break;
    case 3:
    	 codig=0;
    	 cantidad=0;
    	 costo=0;
    	 titu = "";
    	 totalitem=0;
    	
    	System.out.println("ingrese el codigo de la revista: ");
    	codig=Integer.parseInt(scan.next());
    	System.out.println("ingrese la cantidad:");
    	cantidad=Integer.parseInt(scan.next());
    	
    		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT `costo`, `nombre` FROM `revista` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
			     titu = res.getString("nombre");
			     costo = res.getDouble("costo");   
			}
			
    		} catch (Exception e) {
			System.out.println(e);
    		}
    	
         totalitem =calculoItem(costo,1.22,cantidad);
         lista.add(totalitem);
         lista2.add(titu+" - impreso");
         lista3.add(cantidad);
         System.out.println("agregado");
         System.out.println("_________________");
   
        break;
    case 4:
    	
         
    	codig=0;
   	 cantidad=0;
   	 costo=0;
   	 titu = "";
   	 totalitem=0;
   	
   	System.out.println("ingrese el codigo de la revista: ");
   	codig=Integer.parseInt(scan.next());
   	System.out.println("ingrese la cantidad:");
   	cantidad=Integer.parseInt(scan.next());
   	
   		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
			Statement s1 = c.createStatement();
			String consulta="SELECT `costo`, `nombre` FROM `revista` WHERE codigo="+codig;
			ResultSet res= s1.executeQuery(consulta);
			while(res.next()) {
			     titu = res.getString("nombre");
			     costo = res.getDouble("costo");   
			}
			
   		} catch (Exception e) {
			System.out.println(e);
   		}
   	
        totalitem =calculoItem(costo,1.12,cantidad);
        lista.add(totalitem);
        lista2.add(titu+" - digital");
        lista3.add(cantidad);
        System.out.println("agregado");
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
            
}
} 				
}
	

	private static double calculoItem(double a,double b,int c) {
		double calculo=a*b*c;
		return calculo;
	}
	
}