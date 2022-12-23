public class CustomException extends Exception{
    public void formFilling(int input) throws InvalidInputException {
        if(input<0){
           // System.out.println(input);
            throw new InvalidInputException("Invalid input.");
        }else System.out.println(input);
    }

    public static void main(String[] args) {
        CustomException obj=new CustomException();
        try {
            obj.formFilling(2);
        } catch (InvalidInputException e) {
            System.out.println(e);
        }
    }
}
