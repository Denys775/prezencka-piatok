package sk.upjs.ics;

import java.util.List;


public record predmet(
        String name,
        int year,
        Long ID,
        List<User> students
) {
}
