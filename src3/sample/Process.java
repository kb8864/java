package sample;

public interface Process {
    void execute();//インターフェースのメソッドは抽象メソッド

    static Process getInstance(){
        //return new SampleProcess();
        return new CustomProcess();
    }
}
