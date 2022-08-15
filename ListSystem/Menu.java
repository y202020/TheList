
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int k=1;
      Scanner sc = new Scanner(System.in);
      ElementOperation ElOps = new ElementOperation();
        do{
          System.out.println("\t\t\t\t\t\t\t\t1.Add Element ");
          System.out.println("\t\t\t\t\t\t\t\t2.Remove Element");
          System.out.println("\t\t\t\t\t\t\t\t3.Check Element");
          System.out.println("\t\t\t\t\t\t\t\t4.Check Prices");
          System.out.println("\t\t\t\t\t\t\t\t5.Check Removed Element");
          System.out.println("\t\t\t\t\t\t\t\t6.Erase List");
          System.out.println("\t\t\t\t\t\t\t\t7. Exit !!");
          System.out.println("\t\t\t\t\t\t\t\t Enter choice");
          int ch=sc.nextInt();
          if(ch==1) {
           ElOps.AddEle();
          }else if(ch==2){
           ElOps.removeEle();
          }
          else if(ch==3){
          ElOps.CheckEle();
          }
          else if(ch==4){
          ElOps.chckPrice();
          }
          else if(ch==5){
          System.out.println("\t\t\t\t\t\t\t\tRemoved Elements :->");
          System.out.println("\t\t\t\t\t\t\t\t ->"+ElOps.Rel);
          }
          else if(ch==6){
          ElOps.formtList();
          }
          else{
          break;
          }
       System.out.println("\t\t\t\t\t\t\t\tDo you want to go to Main MENU ? 1-YES/0-NO");
       k = new Scanner(System.in).nextInt(); 
      }while(k!=0);
    }
}
