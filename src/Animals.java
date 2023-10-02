import java.util.Objects;

public class Animals implements Comparable <Animals>{
    //This is a main class of task 1.
    public String animalName;
    public String animalHeight;
    public int age;

    public Animals (String animalName, String animalHeight, int age){
        this.animalName = animalName;
        this.animalHeight = animalHeight;
        this.age = age;
    }

    public String getAnimalName (){
        return animalName;
    }

    public String getAnimalHeight (){
        return animalHeight;
    }

    public int getAge () {
        return age;
    }

    public void setAnimalName (String animalName){
        this.animalName = animalName;
    }

    public void setAnimalHeight (String animalHeight){
        this.animalHeight = animalHeight;
    }

    public void setAge (int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "This animal has: " + '\n' +
                "a name: " + animalName + ", " + '\n' +
                "a height: " + animalHeight + ", " + '\n' +
                "and an age: " + age + " years old."+ '\n';
    }


    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalHeight, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass () != obj.getClass()) return false;
        Animals animal = (Animals) obj;
        return age == animal.age && Objects.equals (animalName, animal.animalName);
    }

    public int compareTo (Animals o){
        if (this.age == o.age){
            return 0;
        } else if (this.age < o.age){
            return -1;
        } else {
            return 1;
        }
    }
}
