package inventario;

import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
  //  CRUD operaciones = new CRUD();
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        Biblioteca biblioteca = crearBiblioteca(entradaStr);
        int opcion;
        do
        {
            menu();
            opcion = entradaInt.nextInt();
            switch (opcion)
            {
                case 1:
                   CRUD.ingresarLibros(biblioteca.getLibros(), entradaInt, entradaStr);
                break;
                    
                case 2:
                    CRUD.listarLibros(biblioteca.getLibros());
                break;
                
                case 3:
                    CRUD.menuActualizarLibros(biblioteca.getLibros(),entradaInt, entradaStr );
                break;
                
                case 4:
                    CRUD.deleteLibros(biblioteca.getLibros(), entradaInt, entradaStr);
                break;
                
            }
        }while(opcion != 5);
    }
    
    public static void menu ()
    {
        System.out.println("Bienvenido al menu principal.");
        System.out.println("1<- Ingresar libro a biblioteca");
        System.out.println("2<- Leer informacion libro");
        System.out.println("3<- Actualizar los datos de un libro");
        System.out.println("4<- Borrar  un libro");
        System.out.println("5<- Salir");
    }

    private static Biblioteca crearBiblioteca(Scanner entradaStr) {
        Biblioteca nuevaBiblioteca;
        String nombre;
        String direccion;
        System.out.println("Digite un nombre de la biblioteca");
        nombre=entradaStr.nextLine();
        System.out.println("Digite la direccion");
        direccion=entradaStr.nextLine();
        nuevaBiblioteca = new Biblioteca(nombre, direccion);
        return nuevaBiblioteca;
    }
}
