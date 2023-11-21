package OOP2Lab;

class Event {
    private Event event;

    public void addEvent(Event event) {
        this.event = event;
    }

    public void runEvent() {
        if (event != null) {
            event.handleEvent();
        }
    }

    private void handleEvent() {
    }
}
