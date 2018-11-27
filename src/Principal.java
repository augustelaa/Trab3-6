
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Marcel
 * 
 * 
 */
public class Principal {

    public static void main(String[] args) {
        // construtor de Livro: c�digo, ISBN, ano, t�tulo
        Livro a = new Livro("MJT7432", "978-0-9713-7184-2", 1912, "Titulo1");
        Livro a2 = new Livro("MJT7432", "978-0-9713-7184-2", 1912, "Titulo1-2");
        Livro b = new Livro("MIT8008", "978-0945962144", 1999, "Titulo2");
        Livro b2 = new Livro("MIT8008", "978-0945962144", 1999, "Titulo2-2");
        Livro c = new Livro("MEI4665", "0-85883-554-4", 2002, "Titulo3");
        Livro d = new Livro("MIO6668", "0-85883-555-5", 1915, "Titulo4");
        Livro e = new Livro("DIO3333", "978-0945983833", 1999, "Titulo5");
        Livro f = new Livro("PAO6472", "978-0945962144", 2007, "Titulo6");
        Livro f2 = new Livro("PAO6472", "978-0945962144", 2007, "Titulo6-2");
        Livro g = new Livro("CAO2890", "978-0945961234", 2012, "Titulo7");
        Livro h = new Livro("UVA3939", "0-85883-654-3", 2015, "Titulo8");
        Livro i = new Livro("OVO0000", "1-95883-554-4", 2000, "Titulo9");
        Livro j = new Livro("ABC1234", "123-0-9713-7184-2", 2015, "Titulo10");
        List<Livro> list1 = new LinkedList();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        list1.add(d);
        list1.add(e);
        list1.add(f);
        System.out.println("Lista dos livros da Biblioteca 1");
        System.out.print(list1.toString()+"\n");
        
        List<Livro> list2 = new ArrayList();
        list2.add(f2);
        list2.add(g);
        list2.add(h);
        list2.add(i);
        list2.add(j);
        list2.add(a2);
        list2.add(b2);
        
        System.out.println("\nLista dos livros da Biblioteca 2");
        System.out.print(list2.toString()+"\n");

        
        // a partir daqui sua equipe deve aplicar a solu��o, usando as listas das duas bibliotecas
        
    }
}
