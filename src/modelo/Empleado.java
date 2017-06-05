/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatia
 */
// superclase abstracta Empleado
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
// constructor
    public Empleado(String nombre, String primerApellido, String nss){
        primerNombre = nombre;
        apellidoPaterno = primerApellido;
        numeroSeguroSocial = nss;
    }
    
    public void setPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    public void setApellidoPaterno(String primerApellido){
        apellidoPaterno = primerApellido;
    }
    
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public void setNumeroSeguroSocial(String nss){
        numeroSeguroSocial = nss;
    }
    
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s \nNumero de Seguro Social: %s",
                getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
    
    public abstract double ingresos();
}