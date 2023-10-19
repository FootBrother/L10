package L10;


class Caaaa {
    private int num;

    public Caaaa(int n) {
        num = n;
    }
    public int get(){
        return num;
    }
}

class Cbbbb extends Caaaa{
    
    public Cbbbb(int n) {
        super(n);
        
    }

    public void show(){
        System.out.println("num = " + get());
    }
}

class class05 {
    public static void main(String[] args) {
        Caaaa aa = new Caaaa(0);
        Cbbbb bb = new Cbbbb(2);
        bb.show();
    }
}
// 在cbbbb子類別增加建構元，即可運行
