package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private final String name = "Leonardo";

    static class Nested {
        private final String lastName = "Santana";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + this.lastName);
        }
    }

    static void main() {
        new Nested().print();
    }
}
