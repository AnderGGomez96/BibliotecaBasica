/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Scanner;


public class CRUD {
    //Atributos;
    
   //metodos;
    public CRUD() {
    }
    
    public static void ingresarLibros(ArrayList<Libro> libros, Scanner entradaInt, Scanner entradaStr){
        System.out.println("Digite el titulo del libro.");
        String titulo = entradaStr.nextLine();
        
        System.out.println("Digite el autor del libro.");
        String autor=entradaStr.nextLine();
       
        System.out.println("Digite el ISBN");
        int isbn=entradaInt.nextInt();
        
        System.out.println("Digite el numero de páginas.");
        int numeroPaginas=entradaInt.nextInt();
        
        System.out.println("Digite la fecha de publicación.");
        String fechaPublicacion=entradaStr.nextLine();
        
        Libro nuevoLibro=new Libro (titulo, autor, isbn, numeroPaginas, fechaPublicacion);
        libros.add(nuevoLibro);
    }
 
    public static void listarLibros (ArrayList<Libro> libros){
        for (Libro libro : libros) {
            libro.imprimir();
        }
    }
    
    public static void menuActualizarLibros (ArrayList<Libro> libros,Scanner entradaInt, Scanner entradaStr)
    {
        Libro libroEncontrado=buscarTitulo(libros, entradaInt, entradaStr);
        if (libroEncontrado==null)
        {
            System.out.println("Libro no encontrado");
        }else
        {
            int opcion;
            menuLibro();
            opcion=entradaInt.nextInt();
            switch(opcion)
            {
                case 1:
                    actualizarTitulo(libroEncontrado, entradaInt, entradaStr);
                    break;
                case 2:
                    actualizarAutor(libroEncontrado, entradaInt,  entradaStr);
                    break;
                case 3:
                    actualizarNumeroPaginas(libroEncontrado, entradaInt,  entradaStr);
                    break;
                case 4:
                    actualizarFecha(libroEncontrado, entradaInt,  entradaStr);
                    break;
            }
        }
    }
    
    public static void deleteLibros (ArrayList<Libro> libros, Scanner entradaInt, Scanner entradaStr)
    {
        Libro libroEncontrado=buscarTitulo(libros, entradaInt, entradaStr);
        if (libros.remove(libroEncontrado))
        {
            System.out.println("Eliminacion completada con exito.");
        }else
        {
            System.out.println("Eliminacion NO completada con exito.");
        }
        
    }
    
    
    public static Libro buscarTitulo(ArrayList<Libro> libros, Scanner entradaInt, Scanner entradaStr)
    {
        int indice=0;
        System.out.println("Digite el Titulo del libro");
        String titulo=entradaStr.nextLine();
        while(!libros.get(indice).getTitulo().equals(titulo) && (indice < libros.size()))
        {
            indice++;
        }
        if (indice == libros.size())
        {
            return null;
        }else
        {
            return libros.get(indice);
        }
    }

    private static void actualizarTitulo(Libro libroEncontrado, Scanner entradaInt, Scanner entradaStr) {
        System.out.println("Digite el titulo del libro.");
        libroEncontrado.setTitulo(entradaStr.nextLine());
    }

    private static void actualizarAutor(Libro libroEncontrado, Scanner entradaInt, Scanner entradaStr) {
        System.out.println("Digite el autor del libro.");
        libroEncontrado.setAutor(entradaStr.nextLine());
    }

    private static void actualizarNumeroPaginas(Libro libroEncontrado, Scanner entradaInt, Scanner entradaStr) {
        System.out.println("Digite el numero de páginas.");
        libroEncontrado.setNumeroPaginas(entradaInt.nextInt());
    }

    private static void actualizarFecha(Libro libroEncontrado, Scanner entradaInt, Scanner entradaStr) {
        System.out.println("Digite la fecha de publicación.");
        libroEncontrado.setFechaPublicacion(entradaStr.nextLine());
    }
    
    private static void menuLibro()
    {
        System.out.println("Bienvenido al menu principal.");
        System.out.println("1<- actualizar el Titulo");
        System.out.println("2<- actualizar el Autor");
        System.out.println("3<- actualizar el Numero Paginas");
        System.out.println("4<- actualizar la Fecha Publicacion\n");
    }
}
