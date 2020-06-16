
import java.util.ArrayList;

public class Question3 {

    int index;
    ArrayList<String> al = new ArrayList <String> ();

    public Question3 (String homepage) {
        al.add(homepage);
        index = 0;
    }

    public void visit(String url) {

        if (index != (al.size()-1)) {
            for (int i = al.size()-1; i > index; i--)
                al.remove(al.get(i));
        }
        al.add(url);
        index++;

    }

    public String back(int steps) {
        if (index - steps < 0) {
            index = 0;
            return al.get(0);
        }
        index-=steps;
        return al.get(index);
    }



    public String forward(int steps) {
        if (index+steps>(al.size()-1)){
            index = al.size()-1;
            return al.get(al.size()-1);
        }
        index+=steps;
        return al.get(index);

    }

}







