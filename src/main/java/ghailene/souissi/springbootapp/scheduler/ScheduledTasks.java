package ghailene.souissi.springbootapp.scheduler;


import CoreProject.JsonLoader;
import ghailene.souissi.springbootapp.entities.User;
import ghailene.souissi.springbootapp.services.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

/***
 * The scheduledTasks class , it is responsible for scheduling tasks
 */
@Component
public class ScheduledTasks {
    final static Logger logger = Logger.getLogger(ScheduledTasks.class);

    //the bean injeced to call the service
    @Autowired
    UserService userService;
    //the fixed rate , it is equal to one hour
    @Scheduled(fixedRate = 3600000)
    /***
     * this method is repsonsible of parsing the Json file and sending it the Mysql database , it is repeated every hour
     */
    public void scheduledTask(){
        LinkedHashMap<String,Integer> users = JsonLoader.LoadJson("C:\\Users\\ghailenes\\Desktop\\exercice\\liste_noms_age.json");
        //looping the users map to extract informations and build a user object
        for(String key:users.keySet()){
            //the user entity
            User user = new User();
            //the id is the hashcode if the user name
            user.setId(key.hashCode());
            //the name of the user
            user.setName(key);
            //the age of the user
            user.setAge(users.get(key));

            try {
                //use the service to save the user in the Mysql database
                userService.save(user);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        logger.info("Database updated....");
    }
}
