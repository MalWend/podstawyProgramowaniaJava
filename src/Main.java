public class Main {
    public static void main (String args[]){
        String text = "lubie jave";
        String text2 = new String("Lubie Jave");
        String text3 = "Lubie jave3";
        System.out.println(text.length());
        System.out.println(text2.length());
        System.out.println(text3.length());
        System.out.println(text3.indexOf('e'));
        System.out.println(text3.substring(3,7));

    }
}
