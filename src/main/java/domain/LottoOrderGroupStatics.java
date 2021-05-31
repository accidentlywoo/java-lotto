package domain;

import ui.Rank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class LottoOrderGroupStatics {
	private final List<Integer> winnerNumbers;
	private final LottoOrderGroup lottoOrderGroup;
	private Integer match3 = 0;
	private Integer match4 = 0;
	private Integer match5 = 0;
	private Integer match6 = 0;

	public LottoOrderGroupStatics (List<Integer> winnerNumbers, LottoOrderGroup lottoOrderGroup) {
		this.winnerNumbers = winnerNumbers;
		this.lottoOrderGroup = lottoOrderGroup;
	}

	public void matchSetting(){
		for (Lotto lotto : lottoOrderGroup.lottos()) {
			final Integer matchCount = LottoNumberMatch.matchCount(winnerNumbers, lotto);
			match(matchCount);
		}
	}

	private void match (Integer matchCount) {
		if (matchCount == 3) {
			match3++;
		}
		if (matchCount == 4) {
			match4++;
		}
		if (matchCount == 5) {
			match5++;
		}
		if (matchCount == 6) {
			match6++;
		}
	}

	public String yield () {
		final BigDecimal lottoAmount = new BigDecimal(lottoOrderGroup.lottos().size());

		final BigDecimal rewards = new BigDecimal(
				(match3 * Rank.THIRD.money())
						+ (match4 * Rank.SECOND.money())
						+ (match5 * Rank.FIRST.money())
						+ (match6 * Rank.FIFTH.money())
		);
		if (rewards.compareTo(new BigDecimal(0)) == 0) {
			return "0";
		}

		return rewards.divide(lottoAmount, 2, RoundingMode.HALF_EVEN).toString();
	}

	public Integer match3 () {
		return match3;
	}

	public Integer match4 () {
		return match4;
	}

	public Integer match5 () {
		return match5;
	}

	public Integer match6 () {
		return match6;
	}
}
