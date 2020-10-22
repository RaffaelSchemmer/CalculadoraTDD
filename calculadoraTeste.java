/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raffael
 */
public class calculadoraTeste {
    
    public calculadoraTeste() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
        
        int valorA = 1;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);
        assertEquals(3, soma);
    }
    
    @Test
    public void deveriaSubrairDoisValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtracao(valorA, valorB);

        assertEquals(4, subtracao);
    }
    
    @Test
    public void deveriaMultiplicarDoisValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicacao(valorA, valorB);

        assertEquals(12, multiplicacao);
    }
    
    @Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divisao(valorA, valorB);

        assertEquals(3, divisao);
    }
}
