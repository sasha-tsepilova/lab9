package image;

public class ProxyImage implements Image{
    RealImage realImage = null;
    String fileName;
    ProxyImage(String filename){
        this.fileName = filename;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
