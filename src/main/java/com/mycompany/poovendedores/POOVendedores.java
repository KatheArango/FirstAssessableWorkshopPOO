package com.mycompany.poovendedores;
import java.util.Scanner;

public class POOVendedores 
{

    public static void main(String[] args) 
    {
        String pCedula, pNombre;
        char pSexo, pZona,opcion;
        int pTotalVentas, pCantReserv;
        Vendedor objVen,objVen2;
        Scanner lea = new Scanner (System.in);
        
        System.out.print("Digite la cantidad de posiciones del vector: ");
        pCantReserv = lea.nextInt();        
        ArregloObjetoVendedor vector = new ArregloObjetoVendedor(pCantReserv);
        lea.nextLine();
        System.out.println("Ingrese los vendedores (999 en cedula para terminar; ");
        System.out.print("Cedula del vendedor : ");
        pCedula = lea.nextLine();
        while (!pCedula.equals("999") && vector.getCantReal() < pCantReserv)
        {
            System.out.print("Digite el nombre del vendedor: ");
            pNombre = lea.nextLine();
            System.out.print("Digite el sexo del vendedor:   ");
            pSexo = lea.next().charAt(0);
            System.out.println("Digite la zona del vendedor: ");
            System.out.println("1 si es de Norte");
            System.out.println("2 si es de Sur");
            System.out.println("3 si es de Oriente");
            System.out.println("4 si es de Occidente");
            System.out.println("5 si es de Centro");
            System.out.print("Zona:                          ");
            pZona = validarOpcion();
            System.out.print("Ingrese el total de ventas:    ");
            pTotalVentas = lea.nextInt();
            vector.IngresarObjetoVendedor(pCedula, pNombre, pSexo, pZona, pTotalVentas);
            
            System.out.println("Ingrese el siguiente vendedor: ");
            System.out.print("Cedula del vendedor:           ");
            lea.nextLine();
            do
            {
                pCedula = lea.nextLine();
                if (vector.encontrarVendedor(pCedula) == true)
                {
                    System.out.println("Ese vendededor ya existe, por favor ingrese otro ");
                }
            }
            while(vector.encontrarVendedor(pCedula) == true);
        } 
        do
        {
          opcion = menuDeOpciones(); 
          switch (opcion)
          {
              case '1':
                  System.out.println("Ingrese a un nuevo vendedor: ");
                  do
                  {
                      System.out.print("Ingrese la cédula del vendedor: ");
                      pCedula = lea.nextLine();
                      if (vector.encontrarVendedor(pCedula) == true)
                      {
                        System.out.println("Ese vendededor ya existe, por favor ingrese otro ");
                      }
                  }
                  while(vector.encontrarVendedor(pCedula) == true);
                  
                  System.out.print("Digite el nombre del vendedor: ");
                  pNombre = lea.nextLine();
                  System.out.print("Digite el sexo del vendedor:   ");
                  pSexo = lea.next().charAt(0);
                  System.out.println("Digite la zona del vendedor: ");
                  System.out.println("1 si es de Norte");
                  System.out.println("2 si es de Sur");
                  System.out.println("3 si es de Oriente");
                  System.out.println("4 si es de Occidente");
                  System.out.println("5 si es de Centro");
                  System.out.print("Zona:                          ");
                  pZona = validarOpcion();
                  System.out.print("Ingrese el total de ventas:    ");
                  pTotalVentas = lea.nextInt();
                  vector.IngresarObjetoVendedor(pCedula, pNombre, pSexo, pZona, pTotalVentas);                  
                  break;
              
              case '2':
                  System.out.print("Digite la cedula del vendedor que desea retirar: ");
                  pCedula = lea.nextLine();
                  vector.retirarUnVendedor(pCedula);
                  break;
                  
              case '3':
                  objVen = vector.retornarObjetoVendedor();
                  while (vector.retornarObjetoVendedor() != null)
                  {
                      System.out.println("Cedula "+objVen.getCedula()+" de la zona "+vector.mostrarZona(objVen.getZona())+" y su comision fue de "+objVen.getComision());
                      objVen = vector.retornarObjetoVendedor();
                  }
                  break;
              case '4':
                  objVen = vector.retornarVendedoresPorZona(objVen.getZona());
                  break;
              case '5':
                  break;
              case '6':
                  break;
              case '7':
                  break;
              case '8':
                  break;
              case '9':
                  break;
          }
        }
        while(opcion != '9');
    }
    
    static char validarOpcion()
    {
        char opc;
        Scanner lea = new Scanner(System.in);
        do
        {
            opc = lea.next().charAt(0);
            
        }
        while(opc < '1' || opc > '5');
        return opc;
    }
    
    static char menuDeOpciones()
    {
        char opc;
        Scanner lea = new Scanner(System.in);
        System.out.println("Menú de opciones: ");
        System.out.println("1. Ingresar un nuevo vendedor");
        System.out.println("2. Retirar un vendedor");
        System.out.println("3. Mostrar los datos cédula, zona y comisión de todos los vendedores");
        System.out.println("4. Mostrar cédula, total ventas y comisión de una zona determinada");
        System.out.println("5. Mostrar la sumatoria de ventas de una zona determinada");
        System.out.println("6. Mostrar el promedio de ventas de la empresa");
        System.out.println("7. Mostrar la mayor comisión de las mujeres vendedoras");
        System.out.println("8. Mostrar la menor comisión de los hombres vendedores");
        System.out.println("9. Sair");
        do
        {
            System.out.print("Digite su opción: ");
            opc = lea.next().charAt(0);
        }
        while(opc < '1' || opc > '9');
        return opc;
    }
        
}
