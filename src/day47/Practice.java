package day47;

public class Practice {

    private void doSomething(){

    }
}
// do not recommended to make two classes in the same window
// these private messages do not see each other at all
// the two private messages are not overriding,
// because they are not visible to each other

class JavaPractice extends Practice{

    private void doSomething(){}
}
