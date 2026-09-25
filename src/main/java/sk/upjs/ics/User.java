package sk.upjs.ics;


import java.time.LocalDate;

public record User(Long Id,
                   String name,
                   String surname,
                   Gender gender,
                   LocalDate birthdate,
                   Role role) {
    public enum Role {
        STUDENT,
        TEACHER,
        ADMIN
    }
    public enum Gender{
        MALE,
        FEMALE,
        OTHER,
        UNKNOW
    }
}
