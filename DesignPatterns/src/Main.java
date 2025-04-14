import Iterator.BrowsHistory;
import Iterator.Iterator;
import Strategy.BlckAndWhiteFilter;
import Strategy.ImageStore;
import Strategy.JpegCompressor;
import Template.AuditTrail;
import Template.GeneratingReport;
import Template.TransferMoneyTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ITERATOR PATTERN TEST*********************************************************************
//        var history = new BrowsHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        Iterator iterator = history.createIterator();
//        while (iterator.hasNext()){
//            var url = iterator.current();
//             System.out.println(url);
//             iterator.next();
//        }



        //STRATEGY PATTERN TEST*********************************************************************
//        var imageStore = new ImageStore(new JpegCompressor(), new BlckAndWhiteFilter());
//        imageStore.store("A");
        //instead of passing the objects in constructure we can pass in STORE method, so for each photo we want to store
        //we can have a different FILTER and COMPRESSOR.


        //TEMPLATES PATTERN TEST*********************************************************************
        var task = new GeneratingReport();
        task.execute();//here we only have access to this method beacuse of the modification we made in methods
    }
}