package uk.co.bssd.test.fibonacci;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import uk.co.bssd.fibonacci.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFirstNumberInSequence() {
		assertThat(valueOfSequenceAt(1), is(1));
	}
	
	@Test
	public void testSecondNumberInSequence() {
		assertThat(valueOfSequenceAt(2), is(1));
	}
	
	@Test
	public void testThirdNumberInSequence() {
		assertThat(valueOfSequenceAt(3), is(2));
	}

	private int valueOfSequenceAt(int position) {
		return generateSequenceOfLength(position)[position-1];
	}
	
	private int[] generateSequenceOfLength(int sequenceLength) {
		return Fibonacci.generate(sequenceLength);
	}
}