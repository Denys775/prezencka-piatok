package sk.upjs.ics;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.util.List;

public record prezencka(
        Subject predmet,
        LocalDate date,
        List<User> attendees

) {
}
