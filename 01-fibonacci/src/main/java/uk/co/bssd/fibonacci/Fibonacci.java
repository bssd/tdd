package uk.co.bssd.fibonacci;

public class Fibonacci {

	public static int[] generate(int sequenceLength) {
		int[] sequence = new int[sequenceLength];
		for (int i = 0; i < sequenceLength; i++) {
			sequence[i] = 1;
		}
		return sequence;
	}
}