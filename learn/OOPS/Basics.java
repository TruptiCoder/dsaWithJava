public class Basics {
    public static void main(String args[]){
        Pen p1 = new Pen(); //created new object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yello";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "TruptiBalbudhe";
        myAcc.setPassword("abcd");
        
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    //setters

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

    //getters
    
    void getColor(){
        System.out.println(color);
    }

    void getTip(){
        System.out.println(tip);
    }
}