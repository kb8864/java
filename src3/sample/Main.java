package sample;

public class Main {
    public static void main(String[] args) {
        Process p = Process.getInstance();//ここで隠蔽。実際に動作しているメソッド（インスタンスの生成を）を隠蔽している
        p.execute();//残るはProcessのexecute()のみ



    }
}
