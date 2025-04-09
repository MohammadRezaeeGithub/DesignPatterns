package Iterator;

public interface Iterator {
    //here we can add genric option to interface and current method. <T>
    //beacuse we do not know if tommorow we use it for another object type.
    boolean hasNext();
    String current();
    void next();
}
