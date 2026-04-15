package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Gon";

        class innerClass {

            public void printAttribute() {
                System.out.println(name);
            }
        }

    static void main() {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        innerClass innerClass = outerClasses.new innerClass();

        innerClass.printAttribute();
    }
}
