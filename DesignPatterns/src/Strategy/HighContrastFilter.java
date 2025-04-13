package Strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Applying HighContrast filter");
    }
}
