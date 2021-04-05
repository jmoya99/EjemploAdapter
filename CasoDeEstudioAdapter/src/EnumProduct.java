import java.util.Enumeration;
import java.util.Vector;

/*Esta es la clase que dio el proveedor B que 
devuelve los productos como un Enumaration*/

public class EnumProduct
{
	private Vector product;
	
	public EnumProduct(){
		product = new Vector();
		setProduct("ProductA");
		setProduct("ProductB");
		setProduct("ProductC");
	}

	public void setProduct(String s){
		 product.add(s);
	}

	public Enumeration getProduct(){
		 Enumeration eProduct = product.elements();
		 return eProduct;
	}
}
