public class Test10 {
    public static void main(String[] args) {
        TV tv = new TV(false);
        tv.on();
        tv.display();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.display();
        tv.channelDown();
        tv.display();
        tv.off();
        tv.display();
    }
}
