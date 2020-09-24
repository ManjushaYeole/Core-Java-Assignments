import java.util.Scanner;
class OneBHK{
    int roomArea;
    int hallArea;
    int price;
    OneBHK(){
        roomArea=160;
        hallArea=100;
        price=4500;
    }

    OneBHK(int roomArea,int hallArea,int price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println(roomArea+" "+hallArea+" "+price);
    }
}
class TwoBHK extends OneBHK{
    int room2Area;
    static int total=0;
    TwoBHK(){
        roomArea=200;
        room2Area=150;
        hallArea=100;
        price=4500;
    }
    TwoBHK(int roomArea,int room2Area,int hallArea,int price){
        this.roomArea=roomArea;
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price=price;
        total=total+price;
    }
    void show(){
        System.out.println(roomArea+" "+room2Area+" "+hallArea+" "+price);
        System.out.println(total);
    }

}
class FortyThree{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        TwoBHK t[]=new TwoBHK[3];
        for(int i=0;i<t.length;i++){
            System.out.println("Enter roomarea,room2area,hallarea,price");
            int r1=s.nextInt();
            int r2=s.nextInt();
            int ha=s.nextInt();
            int pr=s.nextInt();
            t[i]=new TwoBHK(r1,r2,ha,pr);
            t[i].show();
        }
    }
        
}