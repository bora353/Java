import java.util.*;
class Product {} 
class Tv extends Product {} //Product 자손 TV
class Audio extends Product {} //Product 자손 Audio


public class Hello {
	public static void main(String[] args) {
	
ArrayList<Product> productList = new ArrayList<Product>();
ArrayList<Tv> tvList = new ArrayList<Tv>();

productList.add(new Tv()); //Product List는 Product 자식 가능
productList.add(new Audio()); //위와 동일

tvList.add(new Tv()); //<TV>라서 TV 또는 TV자손만 가능
tvList.add(new Tv());

printAll(productList);  //아래 <Product>넣어둬서 tvList는 못들어감

	}
public static void printAll(ArrayList<Product> list) {
	for(Product P : list)
		System.out.println(P);
}
}



