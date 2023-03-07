/*
 Universidad Estatal a Distancia Palmares
 Centro Comunitario Inteligente
 Programacion en Java
 Examen 2
 Instructor: Dereck Jimenez
 Estudiante: Maria Salas
 Grupo 2
*/
package examen_2;
import java.util.ArrayList;

public class CarroCompras {
    private ArrayList<Item> items;
    
    //Constructor
    public CarroCompras() {
        items = new ArrayList<>();
    }
    
    //Get
    public ArrayList<Item> getItems() {
        return items;
    }
    
    //Set
    public void setTransferencias(ArrayList<Item> items) {
        this.items = items;
    }
    
    //Metodos Calculo
    public void agregarPelicula(String titulo, int añoPublicacion, double precioBase, double impuestoVenta, String genero, String rating){
        Pelicula peli = new Pelicula(titulo, añoPublicacion, precioBase, impuestoVenta, rating, genero);
        items.add(peli);
    }//fin metodo
    
    public void agregarAlbumMusical(String titulo, int añoPublicacion, double precioBase, double impuestoVenta, String artista, double duracionMin){
        AlbumMusical albMus = new AlbumMusical(titulo, añoPublicacion,precioBase, impuestoVenta, artista, duracionMin);
        items.add(albMus);
    }//fin metodo
    
     public double calcularTotal(){
        double precioTotal = 0;
            for(Item item : items) {
                precioTotal += item.getPrecioBase();
            }
          return precioTotal;
    }//fin metodo
}//fin clase
 
