import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

public class Lambda4 {
    public static void main(String[] args) {
        Collection<Integer>collection = new ConcurrentLinkedQueue<>();
        for (int i=1;i<21;i++){
            collection.add(i);}
        System.out.println("Total : "+collection);
        Predicate<Integer> pr = a->(a%2!=0);
        collection.removeIf(pr);
        System.out.println("Table of 2 = "+collection);
        }
    }

