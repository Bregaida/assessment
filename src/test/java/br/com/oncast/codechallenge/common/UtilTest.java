/**
 * 
 */
package br.com.oncast.codechallenge.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author eduardobregaida
 * 
 */
public class UtilTest {

    @Test
    public void deveriaFazerACargaDosLivros() {
	Assert.assertTrue(Util.cargaInicial().size() > 0);
    }
}
