import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random c = new Random();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i =0;i<10;i++)
            a.add(c.nextInt(100));
        for(int i =0;i<10;i++)
            System.out.println(a.get(i));
        System.out.println("Sorted list");
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1>o2?-1:(o1<o2)?1:0;
            }
        });
        for(int i =0;i<10;i++)
        System.out.println(a.get(i));


        Map b = new HashMap<Integer, String>();
        for (int i =0;i<10;i++) {
            String name = "";
            for (int j = 0; j < 3; j++)
                name += (char) ('A' + c.nextInt('Z' - 1));
            b.put(i,name);
        }
        for(int i =0;i<10;i++)
        {
            System.out.println((i+1)+" - "+b.get(i));
        }

        //Student UE_171[]=new Student[10];
        //for(int i =0;i<10;i++)
        //{int u=c.nextInt(10);
          //  UE_171[i].set(u);}

        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<10;i++) {
            Student h= new Student();
            h.set(c.nextInt(10000));
            students.add(h);
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  (o1.get()>o2.get()?1:(o1.get()<o2.get())?-1:0);
            }
        });
        System.out.println("Сортированные студенты");
        for(int i =0;i<10;i++)
        System.out.println((i+1)+" - "+students.get(i).get());



    }
}
