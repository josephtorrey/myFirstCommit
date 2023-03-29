import APSCA.ArrayList;
import APSCA.List;


public class Start{
    public static void main(String[] args){
        List list = new ArrayList(20);
        for(int i=0; i<40;i++){
            list.add(i);
        }

        System.out.println(list.contains(4));
        System.out.println(list.contains(200));
        list.add(0,400);
        System.out.println(list);
        



    }
}