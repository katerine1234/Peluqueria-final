
package peluqueria;

public class Person {
    protected String name;
    protected int age;
    protected String profession;

    public Person(String name, int age, String profession){
       this.name = name; 
       this.age = age; 
       this.profession = profession; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int edad) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
}
