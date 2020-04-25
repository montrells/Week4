
import java.util.*;

public class week4 {
    static Map<Integer, String> employeeMap = new HashMap<>( );
    static StringBuilder idsBuilder = new StringBuilder(" ");
    static StringBuilder namesBuilder = new StringBuilder(" ");

    public static void main(String[] args) {

        employeeMap.put(ids(6738), employeeNames("Timothy"));
       employeeMap.put(ids(88888), employeeNames("Ruthy"));
       employeeMap.put(ids(ids(2155)), employeeNames("Harold"));
        employeeMap.put(ids(1983), employeeNames("Alex"));
        employeeMap.put(ids(7811), employeeNames("Deseree"));

       // System.out.println(employeeMap.get(ids(2155)) );
        System.out.println(employeeMap );
      //  Set<Integer> keys = employeeMap.keySet();
/*
        for ( Integer key : keys) {
            System.out.println(key + "=" + employeeMap.get(key));
        }

 */



        //ids(78373);
       //employeeNames("justin");

    }

    public static Integer ids(int b){
                Set<Integer> ids = new HashSet<>();
                //Set
                ids.add(11111);
                ids.add(22222);
                ids.add(33333);
                ids.add(44444);
                ids.add(55555);
                ids.add(b);
/*
                for (Integer i : ids){
                    System.out.println(i+ " " +idsBuilder.append("- "));
                }
               System.out.println(idsBuilder.toString());

 */
        return b;
    }

            public static String employeeNames(String a) {
                List<String> employeeNames = new ArrayList<>( );
                //List
                employeeNames.add("Tyrone");
                employeeNames.add("Roberta");
                employeeNames.add("Tericka");
                employeeNames.add("Robert");
                employeeNames.add("Franchetta");
                employeeNames.add(a);
                employeeNames.remove(0);
/*
                for (String employee : employeeNames){
                    System.out.println(employee + namesBuilder.append(" "));
                }
               System.out.println(namesBuilder.toString() );

 */


                return a;
            }




}

