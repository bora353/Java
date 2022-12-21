import java.util.*;
class Product {} 
class Tv extends Product {} //Product �ڼ� TV
class Audio extends Product {} //Product �ڼ� Audio


public class Hello {
	public static void main(String[] args) {
	
ArrayList<Product> productList = new ArrayList<Product>();
ArrayList<Tv> tvList = new ArrayList<Tv>();

productList.add(new Tv()); //Product List�� Product �ڽ� ����
productList.add(new Audio()); //���� ����

tvList.add(new Tv()); //<TV>�� TV �Ǵ� TV�ڼո� ����
tvList.add(new Tv());

printAll(productList);  //�Ʒ� <Product>�־�ּ� tvList�� ����

	}
public static void printAll(ArrayList<Product> list) {
	for(Product P : list)
		System.out.println(P);
}
}



