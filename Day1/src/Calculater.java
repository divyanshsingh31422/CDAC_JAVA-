import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("enter opteration you want to perform (add|substract|multiply|division) OR else exit ");
                String operation = sc.next();
                switch (operation)
                {
                    case "add":
                        System.out.println("enter 2 number ");
                        double a1 = sc.nextDouble();                
                        double a2 = sc.nextDouble();  
                        System.out.println("Sum is "+(a1+a2));
                        break;
                    case "Multiply":
                        System.out.println("enter 2 number ");
                        double a3 = sc.nextDouble();                
                        double a4 = sc.nextDouble();  
                        System.out.println("Sum is "+(a3*a4));
                        break;
                    case "Substract":
                        System.out.println("enter 2 number ");
                        double a5 = sc.nextDouble();                
                        double a6 = sc.nextDouble();  
                        System.out.println("Sum is "+(a5-a6));
                        break;
                    case "Divide":
                        System.out.println("enter 2 number ");
                        double a7 = sc.nextDouble();                
                        double a8 = sc.nextDouble();  
                        if (a8!=0) System.out.println("Sum is "+(a7/a8));
                        else System.out.println("erreo");
                        break;
                    default:
                         System.out.println("Exiting Calculator... Goodbye!");
                    sc.close(); 
                    return;
                }
        }
    }
}