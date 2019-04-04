import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        int[]array= new int[size];
        for (int i=0; i<array.length;i++){
            System.out.print("Enter a mark for student " + (i+1)+ " :");
            array[i]=sc.nextInt();
        }
        int count = 0 ;
        for (int j:array){
            System.out.print(j+"\t");
            if (j>=5&&j<=10){
                count++;
            }
        }

        System.out.printf("\n The number of students passing the exam is: %d",count );
    }
}

