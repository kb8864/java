class Overload2{
    public static void main(String[] args){
        //実行用のクラス。２つのオブジェクトを作成
        Overload stu1 = new Overload();
        Overload stu2 = new Overload();
        stu1.setData("kono");
        stu1.setScore(90, 80);
        stu1.display();

        stu2.setData("tanaka", 75, 100);
        stu2.display();
    }
}
