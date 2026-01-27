import java.lang.reflect.Method;
import java.util.List;

class Bird{
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void fly(){
        System.out.println(name + " is flying.");
    }
}
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException,SecurityException {
        Class birdClass=Class.forName("Bird");
        System.out.println("Class Name: " + birdClass.getName());
        System.out.println("Is Interface: " + birdClass.isInterface());
        System.out.println(birdClass.getSimpleName());
       Method[]methods= birdClass.getDeclaredMethods();
       for(Method m:methods){
        System.out.println("Method Name: " + m.getName());
       }

    
    }   
}
