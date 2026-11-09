package Exerciesw4;

public class Room {
    private double numberofBeds;
    private double price;
    private Boolean Occupied;
    private Boolean Dirtyaf;
    private Boolean Available;
// This is to store the value of Room
// I don't know if the assignement wants it later so I'll keep it just in case

//    public Room(String numberofBeds, String price) {
//        this.numberofBeds = numberofBeds;
//        this.price = price;
//    }


    public double getNumberofBeds() {
        return numberofBeds;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getIsOccupied() {
        return Occupied;
    }

    public Boolean getIsDirtyaf() {
        return Dirtyaf;
    }

    public Boolean getIsavailable() {
        return !Occupied && !Available;
    }
}



