package 第3章_表和栈和队列.B_表ADT;

import org.omg.CORBA.Any;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        List a = null;
//        for (String tmp : coll) {
//            System.out.println(tmp);
//        }
//        print2(coll);
        print(coll);
    }

    public static <AnyType> void print2(Collection<AnyType> collection) {
        for (AnyType item : collection) {
            System.out.println(item);
        }
    }

    public static <AnyType> void print(Collection<AnyType> collection) {
        Iterator<AnyType> itr = collection.iterator();
        System.out.println(itr.next());
        itr.remove();
        while (itr.hasNext()) {
            AnyType item = itr.next();
            System.out.println(item);
        }
        System.out.println(itr.hasNext());
    }
}

