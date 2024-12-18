public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;


    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

   public void takeOff() {
    this.flying = true;
    System.out.println("Hawkeye takes off in the sky.");
   }
    public void ascend(int meters){
      this.altitude += meters;
        System.out.println(this.getName() + " flies upward, altitude: " + this.altitude );

    } 
    public void glide(){
        System.out.println(this.getName() + " glides into the air.");

    } 
    public void descend(int meters){
        this.altitude -= meters; 
        System.out.println("Hawkeye flies upward, altitude: " + this.altitude );

    } 
 public void land(){
    if (this.altitude <= 1 ) {
    System.out.println(this.getName() + " lands on the ground");}
    System.out.println(this.getName() + " is too high, it can't land");

 }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
