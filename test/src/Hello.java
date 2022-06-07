import java.util.*;
public class Hello {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List < HashMap<String, String> > list = new ArrayList<>();
        while (sc.hasNext()) {
            Map <String, String > map = new HashMap<>();
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            if ( (s1.equals("exit")) || (s2.equals("exit")) || (s3.equals("exit")) )
                break;
            map.put("task_id",s1);
            map.put("assignee_id",s2);
            map.put("task_state",s3);
            list.add((HashMap<String, String>) map);
        }
sc.close();

            MyTest res = new MyTest();
        System.out.println(res.myFunc(list) );


    }
}
