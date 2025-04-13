package Strategy;

public class BlckAndWhiteFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("applying B&W filter");
    }
}
