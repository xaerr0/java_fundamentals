package labs_examples.generics.labs;

/**Write a generic class called 'Generic'.

 Inside that class create a public non-static method called printArray() that receives a generic array as a
 parameter and prints its contents to the console one line at a time.*/

class Generic <T>{

    T printArray;

    Generic(T printArray) {
        this.printArray = printArray;

    }

    public void printArray() {

        Generic<String> generic = new Generic<>("poop");
        System.out.println(generic);

            }
}
