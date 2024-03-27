import java.util.Scanner;

public class StudentGreadCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<=============WelCome To Student Grade Calculator");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter The Number Of Greads: ");
        int grads = sc.nextInt();
        int [] arr = new int[grads];

        int grede = 1;
        for(int i=0;i<grads;i++){
            System.out.println("Enter the Marks: "+grede);
            arr[i]= sc.nextInt();
            grede++;
        }
        int total =0;
        for(int i=0;i<grads;i++){
            total = arr[i]+total;
        }
        double avg = (double) total/grads;
        System.out.println("Yor Avarege of Grade: "+avg);
    }
}
