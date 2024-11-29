public class Main {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, i love java");
            }
        };
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Anonymous inner class");
            }
        };
        greeting1.sayHello();
        greeting2.sayHello();
    }
}
