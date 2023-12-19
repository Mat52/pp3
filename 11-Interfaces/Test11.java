public class Test11 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.display();
        tv.setChannel(15);
        for (int i = 0; i<6;i++){
            tv.volumeUp();
        }
        tv.display();
        tv.off();
        tv.display();
        
    }
}
