import Iterator.BrowsHistory;
import Iterator.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var history = new BrowsHistory();

            history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            var url = iterator.current();
             System.out.println(url);
             iterator.next();
        }
    }
}