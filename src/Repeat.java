public class Repeat {
    public static String remove(String str) {

        if (str.length() == 0) {
            return str;
        }
        String result = "";
        if (str.charAt(0) != 'A') {
            result = result + str.charAt(0);
        }
        String reoccur = remove(str.substring(1));
        return result + reoccur;
    }
    public static void main(String[] args) {
        String name ="Abhishek";
        System.out.println(remove(name));
    }

}
