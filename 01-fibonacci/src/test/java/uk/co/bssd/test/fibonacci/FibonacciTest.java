package uk.co.bssd.test.fibonacci;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import uk.co.bssd.fibonacci.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFirstNumberInSequence() {
		assertThat(Fibonacci.generate(1)[0], is(1));
	}
}