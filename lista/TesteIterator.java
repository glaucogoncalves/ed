package lista;

import java.util.LinkedList;
import java.util.ListIterator;

public class TesteIterator {

	public static void main(String args[])
	{

        class Minha {
    
            String ip;
            int cont;
        
            public Minha(String ip, Integer c) {
                this.ip = ip;
                this.cont = c;
            }
        }
		// Creating an empty LinkedList
		LinkedList<Minha> lista = new LinkedList<Minha>();

		// Use add() method to add elements in the list
        Minha m = new Minha("172",0);
		lista.add(m);
        Minha m1 = new Minha("174",0);
		lista.add(m1);
	
		// Setting the ListIterator at a specified position
		ListIterator<Minha> list_Iter = lista.listIterator();

		// Iterating through the created list from the position
		System.out.println("The list is as follows:");
		while(list_Iter.hasNext()){
            Minha i = list_Iter.next();
            if (i.ip.equals("172")) {
                System.out.println("Achei");
            }
		}
	}
}
