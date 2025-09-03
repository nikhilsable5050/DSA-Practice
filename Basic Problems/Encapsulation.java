/*
class Student {
    private String name;

    public void setName(String newName){
        name = newName;
        }
public String getName(){
    return name;
    }
        }

public class Encapsulation {
    public static void main(String[] args){
       Student s  = new Student();
       s.setName("Nikhil");
       System.out.println(s.getName());
    }
}

 */
class Student{
    private String name;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student obj = new Student();
        obj.setName("nikhhil");
        System.out.println(obj.getName());

    }
}
