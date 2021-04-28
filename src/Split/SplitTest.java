package Split;

public class SplitTest {
    public static void main(String[] args) {
//        String chain = "this is a example chain";
//        String[] words = chain.split("\\s");
//        for(String word : words){
//            System.out.println(word);
//        }


        String birth = "04/04/1994";
        String[] words = birth.split("/",birth.length());
        for(String word : words){
            System.out.println(word);
        }

    }
}
