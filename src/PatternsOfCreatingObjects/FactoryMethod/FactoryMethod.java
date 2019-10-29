package PatternsOfCreatingObjects.FactoryMethod;

import javax.swing.text.Document;
import java.io.File;

public class FactoryMethod {
    public AbstractWriter getWriter(Object object){
        AbstractWriter writer = null;
        if (object instanceof File){
            writer = new ConcreteFileWriter();
        }else if (object instanceof Document){
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }
}
