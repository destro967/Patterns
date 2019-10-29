package PatternsOfCreatingObjects.Builder;

public class Director {
    private ComputerBuilder computerBuilder;

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
    }
}
