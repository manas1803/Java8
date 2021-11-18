import org.clueless.CollectionFramework.Collection.List.Cursors;
import org.clueless.CollectionFramework.Collection.List.ListInterface;
import org.clueless.CollectionFramework.Collection.Set.SetInterface;
import org.clueless.CollectionFramework.Collection.Set.SortedSetInterface;
import org.clueless.CollectionFramework.Map.MapInterfaceImplements;
import org.clueless.CollectionFramework.Map.SortedMap;

public class App {
  public static void main(String[] args) throws Exception{
    MapInterfaceImplements mi = new MapInterfaceImplements();
   // mi.HashMapImple();

    SortedMap sm = new SortedMap();
    sm.TreeMapImplementation();
  }
}
