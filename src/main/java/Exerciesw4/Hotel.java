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

    public String getName() {
        return name;
    }

    public double getNumberOfSuitesAvailable() {
        return numberOfSuitesAvailable;
    }

    public double getNumberOfRoomsAvailable() {
        return numberOfRoomsAvailable;
    }

    public double getBookedSuites() {
        return bookedSuites;
    }

    public double getBookedRooms() {
        return bookedRooms;
    }
    public double getAvailableSuites() {
        return numberOfSuitesAvailable - bookedSuites;
    }
    public double getAvailableRooms() {
    return numberOfRoomsAvailable - bookedRooms;}



    public boolean bookRoom(double roomCount , boolean suites){
        if(suites){
            if(roomCount <= getAvailableSuites()){
                bookedSuites+=roomCount;
                return true;
            }
            else{
                if(roomCount <= getAvailableRooms()){
                    bookedRooms+=roomCount;
                    return true;
                }

            }

        }
        return false;
    }

}

