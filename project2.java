import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avgpercentage;
         String grade;
         int subjects;
         
         System.out.println("enter number of subjects");
         subjects = sc.nextInt();
         int[] marks = new int[subjects];
         for(int i = 0;i < subjects;i++){
            while(true){
         System.out.println("enter marks for subject" +(i+1)+": ");
           marks[i] = sc.nextInt();
           if(marks[i] > 0 && marks[i] < 100 ){
            break;
           }
           else{
            System.out.println("invalid entered marks");
           }}
           total = total + marks[i];
            }
            avgpercentage = (double) total / subjects;
            System.out.println("avgpercentage is"+avgpercentage);

            if(avgpercentage > 90)
            {
               grade = "A+";
            }
            else if(avgpercentage > 80)
            {
                grade = "A";
                            }
            else if(avgpercentage > 70)
            {   
                grade = "B+";
            }
            else if(avgpercentage > 60){
                grade = "B";
            }
            else{
                grade = "Fail";
            }
            System.out.println("Result is");
            for(int i = 0;i<subjects;i++){
                System.out.println("subject" +(i+1)+ "marks are"+marks[i]);
            }
            System.out.println("total marks are" +total);
            System.out.println("average percentage is "+avgpercentage);
            System.out.println("grade is:"+grade);
            if(avgpercentage > 60){
                System.out.println("pass");
            }
            else{
                System.out.println("Fail");
            }

            sc.close();

  

    }
    
}
