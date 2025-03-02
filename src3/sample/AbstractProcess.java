package sample;

public abstract class AbstractProcess implements Process {
    @Override
    public void execute(){
        //具象メソッド
        System.out.println("始まり");
        perform();
        System.out.println("終わり");

    }
    protected abstract void perform();
    //抽象メソッド

}
