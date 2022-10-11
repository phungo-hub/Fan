public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int s) {
        if (s < this.SLOW || s > this.HIGH) {
            System.out.println("Please re-enter speed");
            System.exit(0);
        } else {
            this.speed = s;
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff() {
        this.on = false;
    }

    public boolean getOn() {
        return this.on;
    }

    public Fan() {}

    public String toString() {
        if (this.on)
            return "Speed: " + this.getSpeed() + "\n" +
                    "Color: " + this.getColor() + "\n" +
                    "Radius: " + this.getRadius() + "\n" +
                    "fan is on";
        else
            return "Color: " + this.getColor() + "\n" +
                "Radius: " + this.getRadius() + "\n" +
                "fan is off";

    }
}
