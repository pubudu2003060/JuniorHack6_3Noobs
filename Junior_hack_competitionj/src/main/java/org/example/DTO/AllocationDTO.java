package org.example.DTO;

import java.util.Date;

public class AllocationDTO {

    private String student_id;
    private String room_id;
    private int allocation_id;
    Date allocation_date;

    public AllocationDTO(String student_id, String room_id, int allocation_id, Date allocation_date) {
        this.student_id = student_id;
        this.room_id = room_id;
        this.allocation_id = allocation_id;
        this.allocation_date = allocation_date;
    }

    public AllocationDTO() {
    }

    public int getAllocation_id(int allocationId) {
        return allocation_id;
    }

    public void setAllocation_id(int allocation_id) {
        this.allocation_id = allocation_id;
    }

    public Date getAllocation_date() {
        return allocation_date;
    }

    public void setAllocation_date(Date allocation_date) {
        this.allocation_date = allocation_date;
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
