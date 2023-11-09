package BookPattern;

import java.util.concurrent.TimeUnit;



public class Image extends Element  implements Picture{
   
    protected String url;
    protected String imageContent;
    
    public Image(String url) {
        this.url = url;
        try{
            TimeUnit.SECONDS.sleep(5);
         } catch(InterruptedException e){
            e.getStackTrace();
         }
    
    }

    public Image(Image other){
        this.url = other.url;
    }
    @Override
    public void print(){
        System.out.println("Image with name: " + this.url);
   }
   


    @Override 
    
    public Element clone(){
        return new Image(this);
    }
    public String getUrl(){
        return url;
    }
}