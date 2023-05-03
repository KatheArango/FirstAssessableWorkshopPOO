
package com.mycompany.poovendedores;


public class Vendedor 
{
    private String cedula, nombre;
    private char sexo, zona;
    private int totalVentas;
    private float comision;

    public Vendedor(String cedula, String nombre, char sexo, char zona, int totalVentas) 
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.zona = zona;
        this.totalVentas = totalVentas;
        comision = totalVentas*0.08f;
    }

    public String getCedula() 
    {
        return cedula;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public char getZona() 
    {
        return zona;
    }

    public int getTotalVentas() 
    {
        return totalVentas;
    }
    
    public float getComision()
    {
        return comision;
    }
}
