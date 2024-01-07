package BookPattern;

public class ImageLoaderFactory {
    
    private Image used;
    private String url;
    private ImageLoader imageLoader;

    public ImageLoaderFactory()
    {
            this.url = url;
    }
    public void create (String url) {
        String format  = null;
        int temp = url.indexOf('.');
        for (; temp < url.length(); temp++)
        {
            format = format + url.charAt(temp);
        }
        if(format.equals("BMP"))
        {
            imageLoader = new JPGImageLoader();
            imageLoader.load(url);
        }
        if(format.equals("JPG"))
        {
            imageLoader = new BMPImageLoader();
            imageLoader.load(url);
        }
    }
}
