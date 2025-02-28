package sample;

import java.awt.color.ICC_ColorSpace;

public class Item {
    private String name;
    private int price;

    {//初期化のためのブロック
        System.out.println("まずは初期化する");
    }
    public Item(String name, int price){
        super();
        System.out.println("A");
        this.name = name;
        this.price = price;
    }

    public Item(String name){
        System.out.println("B");
        this.name = name;
        this.price = 0;
    }

}
