package ro.itschool.Tema.Tv;

public class Tv {
    private int channelChosen;
    private int volume;
    private String onOff;
    private boolean isOn;

    public Tv (String onOff){
        this.onOff = onOff;
        if(onOff.equals("ON") || onOff.equals("on")){
            this.isOn = true;
            System.out.println("Welcome!");
            System.out.println();
        } else if (onOff.equals("OFF") || onOff.equals("off")){
            this.isOn = false;
            System.out.println("Good bye!");
            System.out.println();
        }
    }
    public void setChannelNumber(int numberChosen){
        if(isOn) {
            if(numberChosen <= 100 && numberChosen > 0) {
                this.channelChosen = numberChosen;
            } else {
                this.channelChosen = 1;
            }
        }
    }
    public int getChannelNumber(){
        if(isOn) {
            System.out.println("Channel is: " + channelChosen);
        }
            return channelChosen;
    }
    public int nextChannel(){
        if(isOn) {
            this.channelChosen++;
            if(channelChosen > 100) {
                this.channelChosen = 1;
            }
            System.out.println("Next channel is: " + channelChosen);
        }
            return channelChosen;
    }
    public int previousChannel() {
        if(isOn) {
            this.channelChosen--;
            if(channelChosen == 0) {
                channelChosen = 100;
            }
            System.out.println("Previous channel is: " + channelChosen);
        }
        return channelChosen;
    }
    public int volumeUp() {
        if(isOn) {
            this.volume++;
            if (volume > 50) {
                volume = 50;
            }
        System.out.println("Volume: " + volume);
        }
        return volume;
    }
    public int volumeDown() {
        if(isOn) {
            this.volume--;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println("Volume: " + volume);
        }
        return  volume;
    }
}
