package aa.bb; //(1)패키지 선언 

import java.lang.*; //(2) 임포트 구문 
import java.util.*;

public class A{ //(3) 클래스 선언 
	Random r = new Random(); //(4) 멤버변수 
	String shape = "잘생긴 "; //속성(member variable)
    public A(){ //(5) 생성자(Constructor)
		System.out.print(shape + "병철이가 ");
	}
	public void m(){ //(6) 메소드(Method) 
		System.out.print("달린다");
	}
}