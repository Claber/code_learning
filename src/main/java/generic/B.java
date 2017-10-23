package generic;

public class B  extends A<String>{
    @Override
    String find() {
        return "Hello World!";
    }

    public static void main(String[] args){
        System.out.println(new B().find());
    }
}
