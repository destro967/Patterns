package PatternsOfCreatingObjects.Builder;

public class Computer {
    private String display = null;
    private String systemBlock = null;
    private String manipulators = null;

    public void setDisplay (String display){
        this.display = display;
    }

    public void setSystemBlock(String systemBlock){
        this.systemBlock = systemBlock;
    }

    public void setManipulators(String manipulators){
        this.manipulators = manipulators;
    }
}
