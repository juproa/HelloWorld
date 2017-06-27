/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FarmAnimal.Cow;
import farms.Leer;
import java.util.Date;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Pablo
 */
public class TestCow {
    
    public TestCow() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void TestCows(){
        Cow [] cows=new Cow [5];
        String[] nombre={"maria","juan","carlos","miriam","andres"};
        long[] fecha={16,17,18,19,20};
        for(int i=0;i<5;i++){
        try{
            int expectedId=(i+1);
            int actualId=0;
            String expectedName=nombre[i];
            String actualName="";
            long expectedDate=fecha[i];
            long actualDate=0;
            cows[i]=new Cow();
            
            cows[i].setId(i+1);
            actualId=cows[i].getId();
            
            cows[i].setNombre(nombre[i]);
            actualName=cows[i].getNombre();
            
            cows[i].setBornOn(new Date(116,1-i,2));
            actualDate=cows[i].getAgeInMonths();
            
            System.out.println("Vaca "+(i+1));
            assertEquals(expectedId,actualId);
            System.out.println("Id test passed");
            assertEquals(expectedName, actualName);
            System.out.println("Name test passed");
            assertEquals(expectedDate,actualDate);
            System.out.println("Date test passed");
            
        }
        catch(IndexOutOfBoundsException success){
            System.err.println("Id test NOT passed"+success.getMessage());
        }
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
}
