package sk.upjs.ics;

import java.util.List;

public class UserService {
    List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }
    GenderRatio calculateGenderRatio(){
        int no0fUser = users.size();
        int boys = 0, girls = 0, unknown = 0, other = 0;
        for(User u : users){
            switch (u.gender()){
                case MALE:
                    boys++;
                case FEMALE:
                    girls++;
                case OTHER:
                    other++;
                case UNKNOW:
                    unknown++;
                default:
                    unknown++;
            }
        }
        return new GenderRatio((double) boys/no0fUser,(double) girls/no0fUser,(double) unknown/no0fUser,(double) other/no0fUser);
    }
}
