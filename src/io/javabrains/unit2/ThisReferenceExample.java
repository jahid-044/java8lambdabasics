package io.javabrains.unit2;

public class ThisReferenceExample {
    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value is: " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        //This the example of anonymous inner class with this operator
        /*thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value is: " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });*/

        thisReferenceExample.execute();


    }

    @Override
    public String toString() {
        return "This is the ThisReferenceExample class instance.";
    }
}

interface Process {
    void process(int i);
}
