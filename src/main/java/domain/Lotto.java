package domain;

import ui.Rank;

import java.util.List;

public class Lotto {
	public static final Integer LOTTO_NUMBER_LENGTH = 6;
	public static final Integer LOTTO_MAX_NUMBER = 44;

	private final List<Integer> numbers;
	private Rank rank = Rank.NOT_YET;

	public Lotto (List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return numbers.toString();
	}

	public List<Integer> numbers () {
		return numbers;
	}

	public Rank rank (Rank rank) {
		return this.rank = rank;
	}

	public Rank rank () {
		return rank;
	}
}
