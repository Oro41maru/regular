public class Main {
    public static void main(String[] args) {
        String text = "Родился в 15:00, мобилизовался в 99:14, умер в 15:01";
        Vremya k = new Vremya(text);
        System.out.println(k);
    }
}