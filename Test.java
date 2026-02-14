abstract class A {
    A() {
        show();
    }

    abstract void show();
}

class B extends A {
    int x = 10;
    B(){
      x=20;  
    }

    void show() {
        System.out.println(x);
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
