package Strategy;

public interface Compressor {

    //in reality we each photo is in byte array but here we don't care bout it
    //byte[] compress(byte[] image);
    void compress(String filename);
}
