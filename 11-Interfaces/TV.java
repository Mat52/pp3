public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean ison;
    private int channelNo;
    private int volumeLevelNo;

    public TV() {
        this.ison = false;
        this.channelNo = 1;
        this.volumeLevelNo = 1;
    }

    @Override
    public void off() {
        this.ison = false;
        
    }

    @Override
    public void on() {
        this.ison = true;
        this.channelNo = 1;
        this.volumeLevelNo = 1;
        
    }

    @Override
    public void channelDown() {
        if(this.channelNo > 1 && this.ison){
            this.channelNo -= 1;
        }
        
    }

    @Override
    public void channelUp() {
        if(this.channelNo <99 && this.ison){
            this.channelNo += 1;
        }
        
    }

    @Override
    public void setChannel(int channelNo) {
        if((channelNo > 0 && channelNo < 100) && this.ison){
            this.channelNo = channelNo;
        }
        
    }
    

    @Override
    public void volumeDown() {
        if(this.volumeLevelNo > 1 && this.ison){
            this.volumeLevelNo -= 1;
        }
        
    }

    @Override
    public void volumeUp() {
        if(this.volumeLevelNo <10 && this.ison){
            this.volumeLevelNo += 1;
        }
        
    }

    public void display(){
        if (this.ison){
            System.out.println("TV is on");
            System.out.println("Channel number: " + this.channelNo);
            System.out.println("Volume level: " + this.volumeLevelNo);
        }
        else{
            System.out.println("TV is off");
        }
        
    }



}
