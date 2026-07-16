public class swap{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        a = a^b;
        b = a^b;
        a = a^b;
    }
}