

import java.util.*;
public class MyTest  {

    public int myFunc(List < HashMap<String, String> > list) {

        Set <String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get("task_state").contains("active"))
                set.add(list.get(i).get("assignee_id"));
        }
        return set.size();
    }

}
