package uk.co.bssd.fibonacci;

public class Fibonacci {

	public static int[] generate(int sequenceLength) {
		int[] sequence = new int[sequenceLength];
		for (int i = 0; i < sequenceLength; i++) {
			sequence[i] = next(sequence, i);
		}
		return sequence;
	}

	private static int next(int[] sequence, int currentIndex) {
		if (currentIndex < 2) {
			return 1;
		}
		return sequence[currentIndex - 1] + sequence[currentIndex - 2];
	}
}