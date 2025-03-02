package java.sample;

public interface Sub extends Base{
    @Override
    default void show() {
        Base.super.show(); // ✅ 親の default メソッドを呼ぶ
        System.out.println("Sub の追加処理");
    }
}
