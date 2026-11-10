package Exerciesw4;

public class Hotel {
    private String name;
    private double numberOfSuitesAvailable;
    private double numberOfRoomsAvailable;
    private double bookedSuites;
    private double bookedRooms;

    public Hotel(String name , double numberOfSuitesAvailable , double numberOfRoomsAvailable) {

        this.name = name;
        this.numberOfSuitesAvailable = numberOfSuitesAvailable;
        this.numberOfRoomsAvailable = numberOfRoomsAvailable;
        this.numberOfSuitesAvailable = 0;
        this.numberOfRoomsAvailable = 0;
    }
    public Hotel(String name, double numberOfSuitesAvailable , double numberOfRoomsAvailable, double bookedSuites, double bookedRooms) {

        this.name = name;
        this.numberOfSuitesAvailable = numberOfSuitesAvailable;
        this.numberOfRoomsAvailable = numberOfRoomsAvailable;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

}

