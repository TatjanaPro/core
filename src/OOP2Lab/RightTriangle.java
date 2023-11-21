package OOP2Lab;

public abstract class RightTriangle implements CalculatePerimeter {
    double perimeter;
    private int legA;
    private int legB;

    private Event event;

    public RightTriangle(int legA, int legB) {
        this.legA = legA;
        this.legB = legB;
        this.event = new Event();
    }

    public int getLegA() {
        return legA;
    }

    public int getLegB() {
        return legB;
    }

    @Override
    public void calcPerimeter() {
        perimeter = getLegA() + getLegB() + Math.sqrt(getLegA() * getLegA() + getLegB() * getLegB());
        System.out.println("Right Triangle perimeter is " + perimeter);

        event.runEvent();
    }
        public void handleEvent() {
        System.out.println("Right triangle perimeter was calculated based on input");
    }
    public void addEvent(Event event) {
        event.addEvent(event);
    }
}
