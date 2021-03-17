package sele1;
import java.util.ArrayList;
import java.util.List;

public class P19 {


public static void main(String[] args) {

List<String> a1 = new ArrayList();
a1.add("Ananya");
a1.add("pooja");
a1.add("ranu");
a1.add("tushar");
System.out.println(a1);
System.out.println("No. of elements: "+ a1.size());

for(int i=0;i<a1.size();i++) {
System.out.println(a1.get(i));
}


}

}
