package Exerciesw4;

public class Room {
    private double numberofBeds;
    private double price;
    private boolean occupied;
    private boolean dirtyaf;
    private boolean available;



    public Room(double numberofBeds, double price) {
        this.numberofBeds =  numberofBeds;
        this.price = price;
        this.occupied = false;
        this.dirtyaf = false;
    }


    public double getNumberofBeds() {
        return numberofBeds;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getIsOccupied() {
        return occupied;
    }

    public Boolean getIsDirtyaf() {
        return dirtyaf;
    }

    public Boolean getIsavailable() {
        return !occupied && !available;
    }

    public void getIsCheckIn() {
        if (!occupied && !dirtyaf) {
            occupied = true;
            dirtyaf = true;
        }
    }

    public void getIsCheckOut() {
        if(occupied) {
            occupied = false;
        }
    }
    public void getCleanDatShit(){
        if (!occupied) {
            dirtyaf = false;
        }
    }

}



