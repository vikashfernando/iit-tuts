import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


    //1
        Scanner x=new Scanner(System.in);





        
        int m1;
        int m2;
        int m3;
        int m4;
        int m5;

        System.out.print("mark1: ");
        m1=x.nextInt();

        System.out.print("mark2: ");
        m2=x.nextInt();

        System.out.print("mark3: ");
        m3=x.nextInt();

        System.out.print("mark4: ");
        m4=x.nextInt();

        System.out.print("mark5: ");
        m5=x.nextInt();

        System.out.println("marks u entered: ");
        int[] marks = {m1, m2, m3, m4, m5};

        for (int i : marks) {
            System.out.println(i);
        }

        marksCatagoryMethod(marks);
        System.out.println("average of the marks is : "+(avgFider(marks)));
        System.out.println("max mark : "+(maxFinder(marks)));
        System.out.println("min mark : "+(minFinder(marks)));
        System.out.println("sorted marks: ");
        int[] r1=sorter(marks);
        for(int i:r1){
            System.out.println(i);
        }
    }


    //2
    public static void marksCatagoryMethod(int[] marks){
        int countMarksBelow40=0;
        int countMarks40_49=0;
        int countMarks50_59=0;
        int countMarks60_69=0;
        int countMarksEqualOrAbove70=0;

        for(int i:marks){
            if(i<40){
                ++countMarksBelow40;
            }else if(i>=40 && 49>=i){
                ++countMarks40_49;
            }else if(i>=50 && i<=59){
                ++countMarks50_59;
            }else if(i>=60 && 69>=i){
                ++countMarks60_69;
            }else{
                ++countMarksEqualOrAbove70;
            }
        }
        System.out.println("f: "+countMarksBelow40);
        System.out.println("40-49: "+countMarks40_49);
        System.out.println("50-59: "+countMarks50_59);
        System.out.println("60-69: "+countMarks60_69);
        System.out.println("first: "+countMarksEqualOrAbove70);
    }


    //3
    public static double avgFider(int[] marks){
        int len=marks.length;
        int sum=0;
        double avg;

        for(int i:marks){
            sum+=i;
        }
        avg=sum/len;
        return avg;
    }


    //4
    public static int maxFinder(int[] marks){

        int maxMark=marks[0];

        for(int i:marks){
            if(maxMark<i){
                maxMark=i;
            }
        }
        return maxMark;
    }


    //5
    public static int minFinder(int[] marks){
        int minMark=marks[0];

        for(int i:marks){
            if(minMark>i){
                minMark=i;
            }
        }
        return minMark;
    }


    //6
    public static int[] sorter(int[] marks){
        int[] sortedMarks=marks;
        Arrays.sort(sortedMarks);
        return sortedMarks;
    }
}