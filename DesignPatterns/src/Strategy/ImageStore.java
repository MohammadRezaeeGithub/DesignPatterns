package Strategy;

public class ImageStore {
    //we need some private fields to determin the type of compresion and filter
    //it is better to use en enum beacuse we use the different comprosser and filter
    private Compressor compressor; //it is better to use an ENUM
    private Filter filter;

    public ImageStore(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename){
        //first we have to compress image jpeg,png
//        if (compressor == "jpeg")
//            //here we need to call a function to compress using the algorithm but it does not matter here
//            System.out.println("compressing using jpeg");
//        else if (compressor == "png") {
//            System.out.println("compressing using png");
//        }
        compressor.compress(filename);//instead of all those if and else



        //apply a filter so all images can have a common look B&W , HighContrast
//        if (filter == "B&W")
//            System.out.println("applying B&W");
//        else if (filter == "highcontrast")
//            System.out.println("applying high contrast");
        filter.apply(filename);
    }
}
