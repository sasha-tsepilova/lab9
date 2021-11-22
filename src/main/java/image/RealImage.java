package image;

public class RealImage implements Image{
    String fileName;
    public RealImage(String filename){
        this.fileName = filename;
        loadFromDisk();
    }
    void loadFromDisk(){
        System.out.println("file from path "+fileName+" loaded");

    }
    public void display(){
        System.out.println("Here is your image!");
    }
}
