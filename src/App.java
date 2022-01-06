import com.clueless.java8Features.FunctionalInterface.*;

import java.util.List;

public class App {

    public static void main(String[] args) {
//        CreatingFunctionalInterface cfi = ()->{
//            System.out.println("Calling the functional Interface using lambda expression");
//        };
//        cfi.method1();
//
//        AddingTwoNumbers addnums = (a,b)-> a+b;
//
//        System.out.println(addnums.Add(123,345));
//        System.out.println(addnums.Add(145,235));
//        System.out.println(addnums.Add(321,879));

//        PredicateInterface pi = new PredicateInterface();
//        pi.ImplementingPredicates();
//        pi.getStringOfLengthGretaerThan10();
//        pi.joiningThePredicate();
//        pi.PredicateWithStudents();

//        FunctionInterface fi = new FunctionInterface();
//        fi.FunctionImplementation();
//        fi.LengthOfString();
//        fi.CombineFunctions();
        ConsumerInterface ci = new ConsumerInterface();
        ci.implementConsumer();
    }
}
