public class Calculator {
    class Operation{
        public int add(int a, int b) {
            return a + b;
        }
        public int subtract(int a, int b) {
            return a - b;
        }
        public int multiply(int a, int b) {
            return a * b;
        }
        public int divide(int a, int b) {
            return a / b;
        }
    }

    public  void performOperations(int a,int b,String operation){
        Operation op = new Operation();
        switch (operation){
            case "+" -> System.out.println(op.add(a,b));
            case "-" -> System.out.println(op.subtract(a,b));
            case "*" -> System.out.println(op.multiply(a,b));
            case "/" -> System.out.println(op.divide(a,b));
            default ->  System.out.println("不支援此運算");
        }
 //       System.out.println(operation.add(1, 2));
 //       System.out.println(operation.subtract(1, 2));
 //       System.out.println(operation.multiply(1, 2));
 //       System.out.println(operation.divide(1, 2));
    }
}
