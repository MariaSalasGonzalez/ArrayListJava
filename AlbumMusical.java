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
public class AlbumMusical extends Item {
    private String artista;
    private double duracionMin;
    
    //Constructor
    public AlbumMusical(String titulo, int añoPublicacion, double precioBase, 
                        double impuestoVenta, String artista, double duracionMin){
        super(titulo, añoPublicacion, precioBase, impuestoVenta);
        this.artista = artista;
        this.duracionMin = duracionMin;
    }
    
    //Get
    public String getArtista(){
        return artista;
    }
    
    public double getDuracionMin(){
        return duracionMin;
    }
    
    //Set
    public void setArtista(String ar){
        this.artista = ar;
    }
    
    public void setDuracionMin(double duMin){
        this.duracionMin = duMin;
    }
    
    //Metodos Calculo
    @Override
    public double calcularPrecioTotal(){
        double aux = 0;
        double precio = 0;
        if(duracionMin >= 60){
            aux = getImpuestoVenta() + 0.03;
            precio = getPrecioBase() + aux;
        }
        return precio;
    }//fin metodo 
}//fin clase
