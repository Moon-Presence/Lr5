import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №6\n"+
                "Выполнил: ст. гр. ПЭ-171\n"+
                "Осокин Р.М.\n"+
                "Задание: создание приложения для сортировки списков,\n"+
                "работы с объектами класса map\n"+
                "и сортировки элементов собственного класса");
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
