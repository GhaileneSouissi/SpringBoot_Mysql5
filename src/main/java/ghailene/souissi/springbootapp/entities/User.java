package ghailene.souissi.springbootapp.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

/***
 * The user model
 */
@Entity
public class User {
    //the id , it is the hashcode of the name
    @Id
    private Integer id;
    //the user name
    private String name;
    //the user age
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
