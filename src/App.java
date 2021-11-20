import com.clueless.java8Features.FunctionalInterface.AddingTwoNumbers;
import com.clueless.java8Features.FunctionalInterface.CollectionLambdaExpression;
import com.clueless.java8Features.FunctionalInterface.CreatingFunctionalInterface;

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

        CollectionLambdaExpression cle = new CollectionLambdaExpression();
        cle.CompareStudents();

    }
}
