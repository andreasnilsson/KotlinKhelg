public class Main {

    public static void main(String args[]) {
        System.out.println("Java.main");
        MainKt.main();


        // Kotlin from Java
        // instantiation of java from kotlin
        final Person p = new Person("name", 20, false);
//        p.setName("tomtar");
//        p.getName();
//        p.seta

        // Extension  functions from java
        MainKt.isHappy(p);
        PersonUtil.isSad(p);

    }
}
