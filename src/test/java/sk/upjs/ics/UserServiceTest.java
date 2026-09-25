package sk.upjs.ics;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService userService;

    @Test
    void calculateGenderRatio(){
        userService = new UserService(List.of(
                new User(null,"Alica","Krajina",User.Gender.FEMALE, LocalDate.of(2000,10,30),User.Role.STUDENT),
                new User(null,"Alica","Krajina",User.Gender.FEMALE, LocalDate.of(2000,10,30),User.Role.STUDENT),
                new User(null,"Ivan","Krajina",User.Gender.MALE, LocalDate.of(2000,10,30),User.Role.STUDENT)
        ));

        GenderRatio genderRatio = userService.calculateGenderRatio();
        assertEquals(2/3.0,genderRatio.girls());
        assertEquals(1/3.0,genderRatio.boys());
        assertEquals(0,genderRatio.unknown());
        assertEquals(0,genderRatio.other());
    }
    @Test
    void calculateGenderRatioEmpty(){
        userService = new UserService(Collections.emptyList());

        GenderRatio genderRatio = userService.calculateGenderRatio();
        assertEquals(0,genderRatio.girls());
        assertEquals(0,genderRatio.boys());
        assertEquals(0,genderRatio.unknown());
        assertEquals(0,genderRatio.other());
    }

    @Test
    void calculateGenderRatioNull(){
        userService = new UserService(null);

        GenderRatio genderRatio = userService.calculateGenderRatio();
        assertEquals(0,genderRatio.girls());
        assertEquals(0,genderRatio.boys());
        assertEquals(0,genderRatio.unknown());
        assertEquals(0,genderRatio.other());
    }
}