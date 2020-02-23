package ReplItHomeWork;

public class Value {
    int value;

    public Value(int value){
        this.value = value;
    }
    public Value(){

    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean wasModified() {
        return true;

    }
}
