class Car{
    int no;
    int speed;

    void setNo(int n){
        no = n;
    }

    void run(int s){
        speed = s;
    }

    void stop(){
        speed = 0;
    }

    void display(){
        System.out.println("自動車のナンバーは" + no + ",速度は" + speed);
    }
}