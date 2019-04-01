package ghailene.souissi.springbootapp.controller;


import ghailene.souissi.springbootapp.entities.User;
import ghailene.souissi.springbootapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * A rest controller to execute Get and Post requests
 */
@RestController
public class SpringController {
    //an injected bean to ensure the connection with the database
    @Autowired
    private UserRepository userRepository;

    /***
     *return a message "hello...." , useful for testing the API
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index(){
        return "hello...";
    }

    /***
     * a method that takes a number and return its square
     * @param number
     * @return
     */
    @RequestMapping("square/{number}")
    public Integer square(@PathVariable("number") Integer number){
        return number*number;
    }


    /***
     * return the list of users
     * @return
     */
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    /***
     * return the age of a user given its name
     * @param name
     * @return
     */
    @GetMapping(path ="/find/{name}")
    public Integer getUser(@PathVariable("name") String name){

        return userRepository.findByName(name).getAge();
    }


}
