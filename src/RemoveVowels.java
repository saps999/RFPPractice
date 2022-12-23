public class RemoveVowels {
    public static String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        String myName="My name is Saptarshi Biswas";
        System.out.println(removeVowels(myName));
    }
}
