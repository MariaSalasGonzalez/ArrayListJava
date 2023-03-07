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
public class Pelicula extends Item{
    private String rating; //G, PG, R
    private String genero;
   
    //Constructor
    public Pelicula(String titulo, int añoPublicacion, double precioBase,
                    double impuestoVenta, String rating, String genero){
        super(titulo, añoPublicacion, precioBase, impuestoVenta);
        this.rating = rating;
        this.genero = genero;
    }
    
    //Get
    public String getRating(){
        return rating;
    }
    
    public String getGenero(){
        return genero;
    }
    
    //Set
    public void setRating(String rat){
        this.rating = rat;
    }
    
    public void setGenero(String ge){
        this.genero = ge;
    }
    
    //Metodos Calculo
    @Override
    public double calcularPrecioTotal(){
       double aux = 0;
       double precio = 0;
        if(rating == "R"){
            aux = getImpuestoVenta() + 0.05;
            precio = getPrecioBase() + aux;
        }
        return precio;
    }//fin metodo
}//fin clase


        


