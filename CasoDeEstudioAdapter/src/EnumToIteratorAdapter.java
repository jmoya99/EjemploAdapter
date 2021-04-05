import java.util.Iterator;
import java.util.Enumeration;

/*Esta es la clase que se usa para adaptar un Enumeration a un Iterator, 
en el patron de diseño Adapter esta recibe el nombre de "Adapter"
*/

public class EnumToIteratorAdapter implements Iterator
{
        //Se crea un objeto de la clase que deseamos adaptar
	Enumeration enumA;
	
        //Inicializamos el objeto en el constructor
	public EnumToIteratorAdapter(Enumeration e){
		enumA = e;
	}
	
        /*En iterator se usa el metodo hasNext, mientras que en Enumaration
        se usa hasMoreElements, asi que creamos el metodo hasNext y desde este
        llamado hasMoreElements
        */
	public boolean hasNext(){
		return enumA.hasMoreElements();
	}
	
        //Aca sucede lo mismo, iterator usa next y Enumaration usa nextElement
	public Object next(){
		return enumA.nextElement();
	}
	
        //Enumaration no cuenta con una función para remover, asi que esta se deja asi
	public void remove(){
		throw new UnsupportedOperationException();
	}
}