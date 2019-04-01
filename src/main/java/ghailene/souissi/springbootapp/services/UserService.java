package ghailene.souissi.springbootapp.services;


import ghailene.souissi.springbootapp.entities.User;
import ghailene.souissi.springbootapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * a service that use directly the user repository to save users in the database
 */
@Service
public class UserService {
   @Autowired
    private UserRepository userRepository;

    /***
     * a method save , that takes a user as an argument and send it to the Mysql database
     * @param user
     * @return
     */
    public String save(User user){
        userRepository.save(user);
        return user.getName()+" is saved..!";
    }

}
