class CTest 
{
    int a;

    void test(int a){
        if (a==0){
            System.out.println(a+" 此數為 0");
        }else if (a%2==0){
            System.out.println(a+" 此處為偶數");
        }
        else{
            System.out.println(a+" 此數為奇數");
        }
    }
}
public class Class07 {
    
    public static void main(String[] args) {
        CTest t1 = new CTest();
        t1.test(3);
        t1.test(8);
        t1.test(0);
    }
}
