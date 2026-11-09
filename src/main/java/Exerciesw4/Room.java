package Exerciesw4;

public class Room {
    private String numberofBeds;
    private String price;
    private Boolean Occupied;
    private Boolean Dirtyaf;
    private Boolean Available;

    public Room(String numberofBeds, String price) {
        this.numberofBeds = numberofBeds;
        this.price = price;
    }


    public String getNumberofBeds() {
        return numberofBeds;
    }

    public String getPrice() {
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



