public class HELLOAppUC7 {
    public static void main(String[] args) {
        String names = "World";
        if (args.length > 0) {
            names = String.join(", ", args);
        }
        System.out.println("Hello, " + names + "!");
    }
}