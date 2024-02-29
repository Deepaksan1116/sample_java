public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        User user=new User();
        String name="Deepak";
        String output=user.print_name(name);
        System.out.println(output);
    }
}
