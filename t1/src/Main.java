public class Main{
    public static void main(String[] args) {

        //1 get user input and display it
        int m1 = 50;
        int m2 = 76;
        int m3 = 88;
        int m4 = 25;
        int m5 = 66;

        System.out.println("marks u entered: ");
        int[] marks = {m1, m2, m3, m4, m5};

        for (int i : marks) {
            System.out.println(i);
        }

        marksCatagoryMethod(marks);
        System.out.println("average of the marks is : "+(avgFider(marks)));
        System.out.println("max mark : "+(maxFinder(marks)));

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

}