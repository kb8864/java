public class Array{
    public static void main(String[] args) {
        
        char[] c;
        c = new char[3];
        int[] i = new int[3];
        String str[]= {"ようこそ","javaの世界へ" };

        c[0] = 'A'; c[1] = 'B'; c[2] = 'C';
        i[0] = 100; i[1] = 200; i[2] = 300;

        System.out.println("strの要素数：" + str.length);
        System.out.println("c[0]:" +c[0]);
        

    }
}