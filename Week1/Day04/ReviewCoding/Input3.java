import java.util.Scanner;

class Input3 
{
	Scanner s = new Scanner(System.in);
	void input(){
		System.out.print("����: ");
		//int i = s.nextInt();
		//System.out.println("i: " + (i+1));

		String str = s.next();
		try{
			int i = Integer.parseInt(str);
			System.out.println("�ùٸ� ���� �Է� ���: " + i);
		}catch(NumberFormatException ne){
			System.out.println("���� ���¸� �Է� ����!!");
			input();
		}
	}
	public static void main(String[] args) 
	{
		Input3 ip = new Input3();
		ip.input();
	}
}