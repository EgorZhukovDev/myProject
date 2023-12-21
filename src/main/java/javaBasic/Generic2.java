package javaBasic;

public class Generic2 {
    public static void main(String[] args) {

        Accountable<String> acc1 = new AccountSecond("1235rwr", 5000);
        AccountSecond acc2 = new AccountSecond("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc1.getSum());
        acc1.setSum(111);
        System.out.println(acc1.getSum());
        System.out.println(acc2.getId());
    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class AccountSecond implements Accountable<String>{

    private String id;
    private int sum;

    AccountSecond(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

