import java.util.Objects;

public class Dogs extends Animals {
    //This is a class which inherits from the main class of task 1.
    public String dogsColor;


    public Dogs(String animalName, String animalHeight, int age, String dogsColor) {
        super(animalName, animalHeight, age);
        this.dogsColor = dogsColor;

    }

    public String getDogsColor (){
        return dogsColor;
    }

    public void setDogsColor (String dogsColor){
        this.dogsColor = dogsColor;

    }

    //@Override
  //  public String toString(){
    //Here is a method toString for class Dogs, it also outputs dog's color.
    //I put it in the comments.
   //     return "This animal has: " + '\n' +
    //            "a name: " + animalName + ", " + '\n' +
     //           "a height: " + animalHeight + ", " + '\n' +
     //           "a color: " + dogsColor + ", " + '\n' +
    //            "and an age: " + age + " years old."+ '\n';
 //   }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalHeight, dogsColor, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass () != obj.getClass()) return false;
        Animals animal = (Animals) obj;
        return age == animal.age && Objects.equals (animalName, animal.animalName);
    }



}