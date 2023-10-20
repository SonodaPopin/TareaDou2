package test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Expendedor;
import main.PagoIncorrectoException;

class ExceptionTest {

@Test
@DisplayName("Test PagoIncorrectoException")
public void testPagoIncorrectoException(){
	Expendedor exp = new Expendedor(2);
    Exception exception = Assert.assertThrows(PagoIncorrectoException.class,
            ()->{
            exp.comprarProducto(null, 0);
            });}}