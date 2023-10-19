package L10;

class Caaaaa {
    private int num;

    public Caaaaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    public void display() {
        System.out.println("printed from Caaaa class"); // a題
    }
}

class Cbbbbb extends Caaaaa {

    public Cbbbbb(int n) {
        super(n);
    }

    public void show() {
        System.out.println("num = " + get());
    }

    public void display(){                                       
        System.out.println("printed from Cbbbb class"); //b題
    }
}

class class09 {
    public static void main(String[] args) {
        
        Caaaaa bbb = new Cbbbbb(0);
        bbb.display();                        //c題     是cbbbb被呼叫
    }
}

