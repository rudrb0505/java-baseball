package baseball;

public final class Constants {
	private Constants() {
	}

	public static final int NUMBER_LENGTH = 3;
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 9;
	public static final int ZERO = 0;
	public static final String ONLY_NUM = "^[0-9]*$";

	public static final String START_GAME = "숫자 야구 게임을 시작합니다.";
	public static final String INPUT_INSTRUCTION = "숫자를 입력해주세요 : ";
	public static final String STRIKE = "스트라이크";
	public static final String BALL = "볼";
	public static final String NOTHING = "낫싱";
	public static final String END_GAME = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	public static final String RESTART_INSTRUCTION = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
	public static final String RESTART = "1";
	public static final String END = "2";

	public static final String NOT_NUMBER = "숫자가 아닙니다.";
	public static final String NOT_THREE_DIGIT = "3자리 숫자를 입력해주세요.";
	public static final String DUPLICATED_NUMBER = "숫자가 중복됩니다.";
	public static final String ZERO_INPUT = "0은 입력할 수 없습니다.";
	public static final String NOT_ONE_TWO = "1 또는 2가 아닙니다.";
}
