package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str = og.upMethod();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이"+x+y;
	}
	
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override // ~~하는중이다
	String upMethod(){
		return x + y + z+ "오버라이드";
	}
	
	String upMethod(int k ){
		return super.upMethod(); // super는 자식과 부모를 구분하기 위해서 쓰는거며 자식내에서만 사용가능하다. upMethod를 호출하기위해서 super를 사용해야한다.
	
	}
	
}


//오버로딩은 같은 메서드 여러개 만들수 있고 오버라이딩은 구현부를 재정의 해서 사용하는것



















