//*1,*3,5,*6,*9,*11,*12,13,14,*17,19,20

package L10;
class Caaa {
    public int num1;
    public int num2;

    public void show(){
        System.out.println("a = " + num1 + ", b = " + num2);
    }
}
class Cbbb extends Caaa{
    public Cbbb(int a,int b){
    }  
    public void set_num(int num1, int num2){
        super.num1 = num1;
        super.num2 = num2;
    }

}
class class01 {
    public static void main(String[] args) {
        Caaa aa = new Caaa();
        Cbbb bb = new Cbbb(0, 0);
        bb.set_num(5,10);
        bb.show();
    }
}
