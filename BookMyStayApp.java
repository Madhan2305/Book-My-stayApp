public class BookMyStayApp {
    static abstract class Room {
        String type;
        int beds;
        double price;
        Room(String type, int beds, double price) {
            this.type = type;
            this.beds = beds;
            this.price = price;
        }
        void displayRoomDetails() {
            System.out.println("Room Type: " + type);
            System.out.println("Beds: " + beds);
            System.out.println("Price: Rs" + price);
        }
    }
    static class SingleRoom extends Room {
        SingleRoom() {
            super("Single Room", 1, 1000);
        }
    }
    static class DoubleRoom extends Room {
        DoubleRoom() {
            super("Double Room", 2, 1800);
        }
    }
    static class SuiteRoom extends Room {
        SuiteRoom() {
            super("Suite Room", 3, 3600);
        }
    }

    public stat
    n(String[] args) {
        System.
    ("Welcome to Book My Stay App");
        System.
    ("Hotel Booking Management System");
        System.
    ("Application Version: 2.1\n");
        int sin
        lable = 5;
        int dou
        lable = 3;
        int sui
        able = 2;
        Room si
        SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Room Details:\n");
        single.displayRoomDetails();
        System.out.println("Available:"+singleRoomAvailable + "\n");
        doubleRoom.displayRoomDetails();
        System.out.println("Available:"+doubleRoomAvailable + "\n");
        suite.displayRoomDetails();
        System.out.println("Available:"+suiteRoomAvailable);
    }
}