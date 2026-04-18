package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private final String NAME = "Leonardo";

    static class Nested {
        private final String LAST_NAME = "Santana";

        void print() {
            System.out.println(new OuterClassesTest03().NAME + " " + this.LAST_NAME);
        }
    }

    static void main() {
        new Nested().print();
    }
}
