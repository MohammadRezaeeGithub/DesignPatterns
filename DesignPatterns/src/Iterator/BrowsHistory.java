package Iterator;

import java.util.ArrayList;

import java.util.List;

public class BrowsHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
         return lastUrl;
    }

    public Iterator createIterator(){
        //here we need to pass a refrence to iterate over. we pass this
        return new ListIterator(this );
    }

    //we create a nested class beacuse it is a part of implementation of BrowsHistory class
    //and also this class can have access to all properties of BrowsHistory class even if they are private
    public class ListIterator implements Iterator{

        //this is the history object that this class will iterate over
        private BrowsHistory history;
        //we need to know how many items we have visited so far.to do that we add this field.
        private int index;

        public ListIterator(BrowsHistory history){

            this.history = history;
        }

        @Override
        public boolean hasNext() {
            //as long as index is less than the items in history
            return (index < history.urls.size());
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls.get(index );
        }
    }
}
