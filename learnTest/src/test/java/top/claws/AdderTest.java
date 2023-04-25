package top.claws;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author claws
 * @since 2023/4/25
 */
public class AdderTest {

    @Test
    public void add() {
        // given
        int a = 1, b = 2;
        int ansExcepted = 3;
        Adder adder = new Adder();

        // when
        int ansActual = adder.add(a, b);

        // then
        assertEquals(ansExcepted, ansActual);
    }
}