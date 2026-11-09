package Exerciesw4;

public class Reservations {
    private String roomType;
    private double price;
    private double numberofNights;
    private boolean weekend;
    private double reservationTotal;

    public String getRoomType() {
        return roomType;
    }
    public Reservations(String roomType, double numberofNights, boolean weekend) {
        setRoomType(roomType);
        this.numberofNights = numberofNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("King")) {
            price = 139.0;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            price = 124.0;
        }

    }

    public double getPrice() {
        if (weekend) {
            return price * 1.10;
        }
        return price;
    }

    public double getNumberofNights() {
        return numberofNights;
    }
    public void setNumberofNights(double numberofNights) {
        this.numberofNights = numberofNights;
    }
public boolean isWeekend() {
    return weekend;
}
public void setWeekend(boolean weekend) {
    this.weekend = weekend;
}
public double getReservationTotal() {
    return getPrice() * numberofNights;
}

}

