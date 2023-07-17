package Task2;

public class Main {
    public static void main(String[] args) {

        Derivation<Integer>  integerGeneric = new Derivation<>();
        Derivation<String>   stringDerivation = new Derivation<>();


        integerGeneric.printGeneric(21);
        stringDerivation.printGeneric("Hello, Java!");


    }
}
