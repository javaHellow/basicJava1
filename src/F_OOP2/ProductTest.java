package F_OOP2;

import java.util.Vector;


public class ProductTest {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV",700);
//		System.out.println(t2);//(t2)에는  .toString 이 생략되어 있다.
		NoteBook nb = new NoteBook("Mac",400);	
		MicroWave mw = new MicroWave("LG전자렌지",200);
		Buyer b = new Buyer("이종선", 5000);
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
//		b.refund(t2);
		b.summary();
		
		
		//호갱님의 잔여금은 얼마이고 보너스 포인트는 얼마 입니다.
		
		System.out.println("처음산 물품"+b.item.get(2));
		
		System.out.println("종선호갱님의 남은돈  "+ b.money);
	
		System.out.println("종선호갱님의 남은포인트"+ b.bonusPoint);
		b.summary();
	}
}

class Product{
	String name;
	
	int price;
	int bonusPoint;
	
	Product(String name,int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}	
}	

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}
	@Override
	public String toString() {
		return name;
	}
}

class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
	@Override
	public String toString() {
		return name;
	}
}
class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class Buyer{
	String name;
	int money;
	int bonusPoint;
	Vector item = new Vector();
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
//		if(item.isEmpty()){
//			System.out.println("구매하신 물품이 없습니다");
//			return;
//		}
//		
//		for(int i = 0; i< item.size(); i++){
//			if(item.get(i) == p){
//				product p2 = (product)item.remove(i);
//				money += p2.price;
//				bonusPoint -= p2.bonusPoint;
//				System.out.println(p2+"를 반품하셨습니다");
//			}
//		}
//		
//		if(item.contains(p)){//반품할려고 하는 객체를 포함하고 있으면 ture
//		
//			
//		}
		if(money < p.price){
			System.out.println("꺼져");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매했습니다.");
		item.add(p);
		
	}	

	//1. 반품 refund()
	//	 구매물품이 없으면 "구매하신 물품이 없습니다."
	//	 구매물품은 있으나 우리 매장에서 산게 아니다.
	void refund(Product p){
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}else{
			System.out.println("우리매장에서 산물건이 아닙니다.");
		}
	}
	//2. 영수증	summary()
	/*
	 		영	수	증
	 
	 구매물품	LGTV   	 700만원
	 		Mac	 	 400만원
	 		LG전자렌지	 200만원
       총 구매 금액		1300만원
       고객님의 남은돈		8700만원
       	   포인트		130만점
       	   
       또 오십시오 호갱님~
	 */
	void summary(){
		System.out.println("\t" + "영"+"\t"+"수"+"\t"+"증" );
		System.out.println();
		System.out.print("구매물품");
		int sum = 0;
	for(int i = 0 ; i <item.size() ; i++){
		System.out.println("\t"+((Product)item.get(i)).name+"\t   "+((Product)item.get(i)).price+"만원");	
		sum += ((Product)item.get(i)).price;
	}	
	System.out.println("총 구매 금액");
	System.out.println("고객님의 남은돈 \t  "+money+"만원");
	System.out.println("고객님의 포인트 \t  "+bonusPoint+" 만원");
	System.out.println();
	System.out.println("또 오십시오 종선호갱님~");
	}
	
}
	
//3. 사람여러명을 관리할수 있는 클래스를 작성해주세요
//	 사람은 이름으로 구분

//4. 물품을 관리할수 있는 클래스를 만드세요


















