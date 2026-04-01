package day_10;
//Design Document editor where user create different types of document like textdoc,imagedoc,spreedSheetDoc
//Requirement 
//1.Each document should open,save,close
//2.Different document types behaves differently ,text->shows text content ,Image->shows image content(renders image),spreadsheet->shows tabular data(calculates cells)
//Rules:User should not know the internal logic , document data must be protected ,System should allow adding new document types without modifying existing code
//use oops principles:encapsulation,abstraction,inheritance,polymorphism
abstract class Document {
    public abstract void open();
    public abstract void save();
    public abstract void close();
}
class TextDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening text document...");
    }
    @Override
    public void save() {
        System.out.println("Saving text document...");
    }
    @Override
    public void close() {
        System.out.println("Closing text document...");
    }
}
class ImageDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening image document...");
    }
    @Override
    public void save() {
        System.out.println("Saving image document...");
    }
    @Override
    public void close() {
        System.out.println("Closing image document...");
    }
}
class SpreadsheetDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening spreadsheet document...");
    }
    @Override
    public void save() {
        System.out.println("Saving spreadsheet document...");
    }
    @Override
    public void close() {
        System.out.println("Closing spreadsheet document...");
    }
}

public class task2 {
    public static void main(String[] args) {
        Document textDoc = new TextDocument();
        Document imageDoc = new ImageDocument();
        Document spreadsheetDoc = new SpreadsheetDocument();

        textDoc.open();
        textDoc.save();
        textDoc.close();

        imageDoc.open();
        imageDoc.save();
        imageDoc.close();

        spreadsheetDoc.open();
        spreadsheetDoc.save();
        spreadsheetDoc.close();
    }
}

       
    

