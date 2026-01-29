package domain;

import java.util.Objects;

public class Room {
    private String buildingAddress;
    private int roomNumber;
    private String[] tags;
    private int seats;

    public Room(String buildingAddress, int roomNumber, String[] tags, int seats) {
        this.buildingAddress = buildingAddress;
        this.roomNumber = roomNumber;
        this.tags = tags;
        this.seats = seats;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber && Objects.equals(buildingAddress, room.buildingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildingAddress, roomNumber);
    }
}