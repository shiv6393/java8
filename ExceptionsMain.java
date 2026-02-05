public class ExceptionsMain {
    public static void main(String[] args) {
          try{method();}
          catch(NullPointerException e){
             System.out.println("I am the first catch block");
          }
          catch(Exception e){
             System.out.println("I am from the second catch");
          }
          System.out.println("I am Running after the exception");
        
    }
    public static void method()throws ClassNotFoundException{
            throw new ClassNotFoundException();
        }
}
