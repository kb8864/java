class Overload{
    String name;
    int engScore;
    int mathScore;

    //オーバーロード
    void setData(String n){
      name = n;
    }
    void setData(String n, int e, int m){
      name = n;
      engScore = e;
      mathScore = m;
    }
    void setScore(int e, int m){
      engScore = e;
      mathScore = m;
    }
    void display(){
      System.out.println(name + "さん");
      System.out.println("英語" + engScore + "数学" + mathScore + "点");
    }
  }
