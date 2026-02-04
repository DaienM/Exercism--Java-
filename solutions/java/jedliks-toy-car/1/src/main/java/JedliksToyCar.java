public class JedliksToyCar {

    private int  distance =0;
    private int bat= 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
       
    }

    public String distanceDisplay() {
       return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return (bat ==0) ? "Battery empty" : "Battery at " + bat + "%";
    }

    public void drive() {
        if(bat>0){
        distance+= 20;
        bat -= 1;}
        
        
        
}
}
