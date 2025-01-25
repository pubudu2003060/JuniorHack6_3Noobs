package org.example.DTO;

public class AllocationDTO {


    private String student_id;
    private String room_id;

    public AllocationDTO(String student_id, String room_id) {

        this.student_id = student_id;
        this.room_id = room_id;
    }

    public AllocationDTO() {
    }



    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }
}
