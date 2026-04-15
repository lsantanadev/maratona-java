package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Killua";

    void print(final String param) {
        final String lastName = "Zoldik";
        class LocalClass {

            public void localPrint() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }

        }
        new LocalClass().localPrint();
    }

    static void main() {

        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("oi");

    }
}
