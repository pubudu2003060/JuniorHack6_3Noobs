package org.example.DTO;

public class HostelsDTO {


    private String hostel_id;
    private String hostel_name;
    private int number_of_rooms;

    public HostelsDTO(String hostel_id, String hostel_name, int number_of_rooms) {
        this.hostel_id = hostel_id;
        this.hostel_name = hostel_name;
        this.number_of_rooms = number_of_rooms;
    }

    public HostelsDTO() {
    }

    public String getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(String hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getHostel_name() {
        return hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        this.hostel_name = hostel_name;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }
}
