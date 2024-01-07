package BookPattern;
public class Main{
    public static void main(String[] args) throws Exception {
        ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();

        // Testing with a BMP image URL
        String bmpUrl = "example.bmp";
        imageLoaderFactory.create(bmpUrl);

        // Testing with a JPG image URL
        String jpgUrl = "example.jpg";
        imageLoaderFactory.create(jpgUrl);
        }
}