package soudegesu.springboot.jdk9.main.demo.model;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class User {

    private int id;

    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
