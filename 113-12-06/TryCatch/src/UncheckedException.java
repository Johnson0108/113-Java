public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[5]);
        }catch (Exception e){
            System.out.println("程式發生錯誤:"+e.getMessage());
        }
    }
}
