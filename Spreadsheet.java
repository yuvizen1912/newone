
abstract class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public abstract void open();
    public abstract void save();
    public abstract void close();
}
 class Text extends Document{
    public Text(String name){
        super(name);
    }
    public void open(){
          System.out.println("opening text document");
    }
    public void save(){
        System.out.println("Document is saved");
    }
    public void close(){
        System.out.println("Document is closed");
    }

} 
 class Image extends Document{
    public Image(String name){
        super(name);
    }
    public void open(){
          System.out.println("opening Image document");
    }
    public void save(){
        System.out.println("Image Document is saved");
    }
    public void close(){
        System.out.println("Image Document is closed");
    }

} 
public class Spreadsheet extends Document{
    public Spreadsheet(String name){
        super(name);
    }
    public void open(){
          System.out.println("opening Spreadsheet document");
    }
    public void save(){
        System.out.println("Spreadsheet Document is saved");
    }
    public void close(){
        System.out.println("Spreadsheet Document is closed");
    }
    public void calculate() {
        System.out.println("Calculating cells...");
    }

}
class Documenteditor{
    public static Document createDocument(String type, String name){
                 String t = type.toLowerCase();
                 switch(t){
                    case "text":
                              return new Text(name);
                    case "image":
                               return new Image(name);
                    case "spreadsheet":
                               return new Spreadsheet(name);
                    default:
                               return null;
                        
                 }
                 
    }
}

public class oopswhole {
    
    
}
