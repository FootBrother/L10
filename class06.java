package L10;

class CCtriangle{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println("base = " + base + ", height = " + height);
    }
}
class CData extends CCtriangle{                 //a題
    public CData(int i, int j) {
        base = i;
        height = j;
    }

    void area(){                               //b題
        show();
        System.out.println(base * height / 2);
    }
}

public class class06 {
    public static void main(String[] args) {
        CData obj = new CData(3,10);        //c題
        obj.area();
    }
}
