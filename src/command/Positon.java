package command;

public class Positon {
	
	public int row;
	public int col;

	public Positon(String positionString) {
		/*
		 * 생성 제약조건 :
		 * positionString은 a3,d4,h7과 같이 알파벳 a~h와 숫자1~8로 좌표를 명시 해줘야 한다.
		 *
		 */
		String errorMessage = "Position Class 생성 형식에 맞추어 String을 입력해주세요.";
		if(positionString.length() != 2) {
			throw new IllegalArgumentException(errorMessage);
		}
		/*
		 * TODO : 첫째, 둘째 글자 제약조건 위배시 exception 발생 시키기
		 */
		row = Integer.parseInt(positionString.substring(0, 1));
		char columnAlphabet = positionString.charAt(0);
		col = (int) columnAlphabet;
		
	}
}
