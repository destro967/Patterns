package PatternsOfCreatingObjects.Prototype;

public class ComplicatedObject implements Copyable {

    public enum Type{
        ONE, TWO
    }

    private Type type;

    @Override
    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType (Type type){
        this.type = type;
    }
}
