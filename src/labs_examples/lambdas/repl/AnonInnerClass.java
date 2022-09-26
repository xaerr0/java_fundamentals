package labs_examples.lambdas.repl;

public class AnonInnerClass {
    public static void main(String[] args) {

        // Step 1) Please demonstrate the creation of an anonymous inner class from the interface AnonymousInner below

        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void methodOne() {
                System.out.println("methodOne");
            }

            @Override
            public int methodTwo(int a) {
                System.out.println(a);
                return 0;
            }
        };
        // Step 2) Demonstrate calling both methods using the object you created (by creating an anonymous inner class)

        obj.methodOne();
        obj.methodTwo(5);

    }
}

interface AnonymousInner {
    public void methodOne();
    public int methodTwo(int a);

}