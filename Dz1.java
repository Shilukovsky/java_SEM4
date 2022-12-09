import java.util.LinkedList;

public class Dz1 {

    public static void main(String[] args) {

        int[] list = {1,7,3,8,2,4,7,8,2};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : list) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}
