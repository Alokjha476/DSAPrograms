package Coding_Question.customObjectUsingJava8;
//Q3 Sort custom object using java 8?
public class Students {

    private Integer id;
    private String name;

    Students(Integer id, String name){
        this.id = id;
        this.name= name;

    }

    @Override
    public String toString() {
        return this.name+" "+ this.id+ " ";
    }
}
