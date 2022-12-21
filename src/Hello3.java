import java.util.ArrayList;
abstract

class Fruit2 {public String toString() {return "과일";}}
class Apple2 extends Fruit2 {public String toString() {return "사과";}}
class Grape2 extends Fruit2 {public String toString() {return "포도";}}

class Juice {
	String name;
	Juice(String name){this.name=name+"쥬스";}
	public String toString() {return name;}
}
class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		for(Fruit2 f : box.getList())
			tmp +=f + " ";
		return new Juice(tmp);
	}
}


class Hello3 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
	}
}


class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
		
}