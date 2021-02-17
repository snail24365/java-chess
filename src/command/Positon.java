package command;

public class Positon {
	
	public int row;
	public int col;

	public Positon(String positionString) {
		/*
		 * ���� �������� :
		 * positionString�� a3,d4,h7�� ���� ���ĺ� a~h�� ����1~8�� ��ǥ�� ��� ����� �Ѵ�.
		 *
		 */
		String errorMessage = "Position Class ���� ���Ŀ� ���߾� String�� �Է����ּ���.";
		if(positionString.length() != 2) {
			throw new IllegalArgumentException(errorMessage);
		}
		/*
		 * TODO : ù°, ��° ���� �������� ����� exception �߻� ��Ű��
		 */
		row = Integer.parseInt(positionString.substring(0, 1));
		char columnAlphabet = positionString.charAt(0);
		col = (int) columnAlphabet;
		
	}
}
