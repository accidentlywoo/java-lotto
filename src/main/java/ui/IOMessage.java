package ui;

import static ui.Rank.*;

public enum IOMessage {
	ASK_INSERTMONEY("구입금액을 입력해주세요."),
	PURCHASE_MENT_SURFIX("개를 구매했습니다."),
	ASK_LOTTO_WINNER_NUMBER("지난 주 당첨 번호를 입력해 주세요."),
	ASK_LOTTO_BONUS_NUMBER("보너스 볼을 입력해 주세요."),
	PRINT_ANALYSIS_TITLE("당첨 통계"),
	PRINT_LINE("--------"),
	MATCH_3_NUMBERS("3개 일치 (" + FIFTH + "원)-"),
	MATCH_4_NUMBERS("4개 일치 (" + THIRD + "원)-"),
	MATCH_5_NUMBERS("5개 일치 (" + SECOND + "원)-"),
	MATCH_6_NUMBERS("5개 일치 (" + FIRST + "원)-"),
	MINUS_MESSAGE("(기준이 1이기 때문에 결과적으로 손해라는 의미임)");


	private String message;

	IOMessage (String message) {
		this.message = message;
	}

	public String getMessage () {
		return message;
	}
}
