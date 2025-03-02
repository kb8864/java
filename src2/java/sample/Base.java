package java.sample;

public interface Base {
    default void show(){
        System.out.println("Baseのshow");
    }
}
