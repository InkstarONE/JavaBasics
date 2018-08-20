package FileTest;

public class Testenum {
    public enum color {red, blue, green}
    public static void main(String[] args) {
        color c = color.green;
        switch (c){
            case red:
                System.out.println("red");
                break;
            case blue:
                System.out.println("blue");
                break;
            case green:
                System.out.println("green");
                break;
                default:
                    System.out.println("dafault");
                    break;
        }
    }
}
