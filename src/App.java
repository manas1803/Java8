import org.clueless.Java8Features.Generics.*;

public class App
{
  public static void main(String[] args) {
    BoxDemo bd = new BoxDemo();

    /*We are able to set any values here*/
    bd.setObject("Manas");
    bd.setObject(234);

    BoxDemoGeneric<Integer> bdg = new BoxDemoGeneric<>();
    bdg.setT(456);

    System.out.println(bdg.getT());


    /*Creating Pair generics */

    Pair<Integer,String> p1 = new OrderedPair<>(1,"Hello");
    System.out.println(p1.getKey() + " : " +  p1.getValue());
    UtiliGeneric ug = new UtiliGeneric();
    Integer i =20;
    ug.Inspect(i);

    Integer arr[] = {24,43,1,4,567,89,43,22,44,567,21,567};
    Integer ele = 23;

    int count = GenericTypesAndBoundedParams.countGreaterThan(arr,ele);

    System.out.println("Count of values greater than elementnt " + count);
  }
}
