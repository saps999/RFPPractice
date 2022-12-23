public class ExceptionMain {
    public void demo(String input2) throws CustomException2{
        if (input2==null){
            throw new CustomException2("invalid input");
        }else System.out.println(input2);
    }

    public static void main(String[] args) {
        ExceptionMain exceptionMain =new ExceptionMain();
        try {
            exceptionMain.demo("Saptarshi");
            exceptionMain.demo(null);
        } catch (CustomException2 e) {
            System.out.println(e);;
        }
    }
}
