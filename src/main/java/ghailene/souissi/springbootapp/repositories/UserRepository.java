package ghailene.souissi.springbootapp.repositories;

import ghailene.souissi.springbootapp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/***
 * The user repository , it extends CrudRepository to avoid boilerplate (it implements methode such save, update, delete,...)
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    //a method that return the user with a given name , this method is implemented directly with spring bood based on its signature
    public User findByName(String name);
}
