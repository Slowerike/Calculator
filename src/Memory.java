

public class Memory {
    private Number resultOfPrevious = 0;

    public Number getResult() {
        return resultOfPrevious;
    }

    public void setMemory(Number number) {
        this.resultOfPrevious = number;
    }
}
