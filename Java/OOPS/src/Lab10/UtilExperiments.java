package Lab10;

import java.util.*;

public class UtilExperiments {
    public static void main(String[] args){
        Vector<Integer> integers = new Vector<>();

        integers.add(20);
        integers.add(30);
        integers.add(40);
        Collections.reverse(integers);

        ArrayList ar = new ArrayList();
        ar.add("Java");
        ar.add("OK");
        ar.add(new Integer(7));
        ar.add(38);
        System.out.println(ar);
        System.out.println(ar.size());
        ar.add(2,50);
        System.out.println(ar);
        ar.remove("OK");
        System.out.println(ar);
        String s = (String)ar.get(0);	//because it returns Object type
        System.out.println(s);


        HashMap<Integer,String> map = new HashMap<>();
        //Adding elements to the map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        System.out.println("Map size is " + map.size());
        //Traversing Map


        for(Map.Entry<Integer,String> me : map.entrySet()){
            me.setValue(me.getValue() + " New");
        }
        Set<Map.Entry<Integer,String>> set = map.entrySet();	//Converting to Set so that we can traverse
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while(itr.hasNext())
        {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry<Integer,String> entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        String s1 = (String)map.get(5);
        System.out.println(s1);
        System.out.println(map);


        Stack<String> st = new Stack<>();
        st.push("Raju");
        st.push("Ok");
        st.push("Tom");
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        Vector v = new Vector();	//default capacity 10
        System.out.println(v.capacity());
        v.add("Raju");
        v.add("Ok");
        System.out.println(v.size());
        System.out.println(v);

    }
}
