package edu.eci.cvds.tdd.aerodescuentos;
import static edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest{

    //Pruebas Clases de Equivalencia
    @Test
    public void testClaseEquivalencia1(){
    
        Assert.assertEquals(427.5, calculoTarifa(450, 3, 10), 0.0);
    }

    @Test
    public void testClaseEquivalencia2(){

        Assert.assertEquals(115, calculoTarifa(115, 0, 20), 0.0);
    }

    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testClaseEquivalencia3(){
        //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(5, 2, -20);
    }


    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testClaseEquivalencia4(){
        //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(0, 5, 18);

    }

    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testClaseEquivalencia5(){
       //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(1, -2, 0);
    }

    //Prubas del Limite
    @Test
    public void testCondicion1(){
        Assert.assertEquals(0.95, calculoTarifa(1, 1, 0), 0.0);
      
    }

    @Test
    public void testCondicion2(){
        Assert.assertEquals(2, calculoTarifa(2, 0, 20), 0.0);
    }

    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testCondicion3(){

        //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(2, 0,-2);
        calculoTarifa(1, 1, 127);
    }

    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testCondicion4(){

        //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(-1, 0, 3);
    }

    @Test
    //@Test(expected= ExcepcionParametrosInvalidos.class)
    public void testCondicion5(){

        //Falta la implementacion de la Excepcion para evaluar
        calculoTarifa(1, -2, 0);
    }
}