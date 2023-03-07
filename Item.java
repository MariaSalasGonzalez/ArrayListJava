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

public abstract class Item {
    private String titulo;
    private int añoPublicacion;
    private double precioBase;
    private double impuestoVenta = 0.13;
    
    //Constructor
    public Item(String titulo, int añoPublicacion, double precioBase, double impuestoVenta) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.precioBase = precioBase;
        this.impuestoVenta = impuestoVenta;
    }
    
    //Get
    public String getTitulo() {
        return titulo;
    }
    
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public double getImpuestoVenta(){
        return impuestoVenta;
    }
    
    //Set
    public void setTitulo(String tit) {
        this.titulo = tit;
    }
    
    public void setAñoPublicacion(int añPu){
        this.añoPublicacion = añPu;
    }
    
    public void setPrecioBase(double prBa){
        this.precioBase = prBa;
    }
    
    public void setImpuestoVenta(double impVe){
        this.impuestoVenta = impVe;
    }
    
    //Metodos Calculo
    public abstract double calcularPrecioTotal();
}//fin de clase
