import java.util.Iterator;

/*
* @author https://mkyong.com/design-pattern/adapter-design-pattern/
* 
* Esta clase es la que usa la Empresa A para mostrar sus productor por medio de
* recorrer un iterador, esta clase en el patrón de diseño se le llama Client
 */
public class Product {

    /*Este es el metodo que la empresa A tiene para mostrar los productos
    recorriendo un iterador, la empresa A no desea cambiar este metodo, asi que
    por eso se usa un adaptador
     */
    public static void displayProduct(Iterator iterator) {
        for (; iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }

    
    public static void main(String[] args) {
        //Se obtienen los productos de la clase creada por el proveedor B 
        EnumProduct enumProduct = new EnumProduct();
        /*Se llama al objeto adaptador, el cual adaptara el Enumaration de productos
        * en un iterator que la Empresa A pueda usar
        */
        EnumToIteratorAdapter enumToIteratorAdapter = new EnumToIteratorAdapter(enumProduct.getProduct());
        //Ya adaptado se puede seguir usando el metodo que tiene la Empresa A
        Product.displayProduct(enumToIteratorAdapter);
    }

}
