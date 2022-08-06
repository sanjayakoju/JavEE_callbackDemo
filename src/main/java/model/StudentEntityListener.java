package model;


import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;

public class StudentEntityListener {

    @PostPersist
    public void doThing(Student student) {
        System.out.println("Student save success");
    }

    @PostUpdate
    public void updateThing(Student student) {
        System.out.println("Student update success");
    }

    @PostRemove
    public void removeThing(Student student) {
        System.out.println("Student remove success");
    }

    @PrePersist
    public void prePersist(Student student) {
        System.out.println("Student Pre persist");
    }

}
