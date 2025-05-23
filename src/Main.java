import java.util.ArrayList;
import java.util.HashMap;




public class Main {
    public static void main(String[] args) throws myemptystackexception {

//        ArrayList<String> StringList = new ArrayList<>();
//        StringList.add("String");
//        StringList.add("Ali");
//        System.out.println(StringList);
//
//        HashMap<String,Double> grades = new HashMap();
//        grades.put("Ali",10.9);
//        System.out.println(grades);
//        grades.put("Pelin",75.9);
//        System.out.println(grades);
//        grades.put("Koray",4.9);
//        System.out.println(grades);


        Stack stack = new StackArray();
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }








    }
}