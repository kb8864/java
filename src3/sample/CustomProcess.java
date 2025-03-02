package sample;

public class CustomProcess extends AbstractProcess {
    @Override
    protected void perform() {
        System.out.println("追加処理の実行");
    }
}
