public class DwadziesciaJeden {
    public static void main(String[] args) {
        float height = 170;
        float feet = Math.round(height / 2.54f) / 12;
        float inches = Math.round(height / 2.54f) % 12;

        System.out.println("I am " +height+"cm tall, i.e. " +(int) feet + " feet and " + (int) inches + " inches");

    }
}
