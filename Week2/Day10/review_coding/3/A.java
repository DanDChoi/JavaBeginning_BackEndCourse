import java.lang.*;

class Human{
    String name = "아무개";
    Human(String name){
        this.name = name;
    }
    void move(){
        System.out.println("걷는다");
    }
}

class Superman extends Human {
    int power = 1000;
    Superman(){
        super("클락");
    }
    void move(){
        System.out.println("날아간다");
    }
    void shot(){
        System.out.println("광선을 쏜다");
    }
    class Hulk extends Human {
        int muscle = 500;
        Hulk(){
            super("브루스");
        }
        void move(){
            System.out.println("뛰어다닌다");
        }
        void tranfer(){
            System.out.println("변신한다");
        }
    }
    
    class God {
        public static void main(String args[]){
            Superman sm = new Superman();
            System.out.print(sm.power + "N의 힘을 가진 " + sm.name+"이 ");
            sm.move(); 
            sm.shot();
            System.out.println();
    
          
            Human m = sm;
            System.out.print(m.name+"이 ");
            m.move(); 
            //m.shot(); //제약2
            System.out.println();
    
            
            Superman sm2 = (Superman)m;
            System.out.print(sm2.power + "N의 힘을 가진 ");
            System.out.print(sm2.name+"이 ");
            sm2.move(); 
            sm2.shot();
    
            
        }
}
