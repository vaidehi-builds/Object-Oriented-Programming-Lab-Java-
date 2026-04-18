package Week08;
interface Series{
    int getNext();
    void reset();
    void setStart(int x);
}
class ByTwos implements Series{
    int initial, value;
    ByTwos(){
        initial=0;value=0;
    }
    public void setStart(int x){
        initial=x;value=x;
    }
    public int getNext(){
        value+=2;return value;
    }
    public void reset(){value=initial;}
}

public class Main8b {
    public static void main(String[] args){
        Series s=new ByTwos();
        s.setStart(0);
        for(int i=0;i<5;i++){
            System.out.print(s.getNext()+" ");
        }
        System.out.println();
        s.reset();
        for(int i=0;i<6;i++){
            System.out.print(s.getNext()+" ");
        }
    }
}
