
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

interface DataDemo{
    abstract void datae();
}
public class ElementOperation {
  Scanner sc = new Scanner(System.in);
  List <String> AddEl = new ArrayList();
  List <Integer> Prc = new ArrayList();
  List <String> Rel = new ArrayList();
  public void AddEle(){
    MyInterface mf = () -> {
        int k=1,i=1;
        while(k!=0){
        //Adding Elemnts    
        System.out.println("\t\t\t\t\t\t\t\tEnter."+i+".Element ?");    
        String el = sc.next();
        AddEl.add(el);
        //Adding Prices
        System.out.println("\t\t\t\t\t\t\t\tEnter Price for Element"+i+" ?");
        int pr=sc.nextInt();
        Prc.add(pr);
        i++;
        System.out.println("\t\t\t\t\t\t\t\tDo u want to Add One More Element? 1-YES/0-NO");
        k=sc.nextInt();
        }
    };
     mf.Demo();
   }
  
  public void removeEle(){
    MyInterface mff =() ->{
        //Removing Element  
        System.out.println("\t\t\t\t\t\t\t\tEnter Element That you want to Remove ?");
        String el = sc.next();
        int idx=AddEl.indexOf(el);
        Rel.add(el);
        if(AddEl.contains(el)){
         AddEl.remove(String.valueOf(el));
         //Removing Price
         Prc.remove(idx);
         }
        else{
         System.out.println("\t\t\t\t\t\t\t\tElement Not In The List !!");
        }
    };
     mff.Demo();
   }
  
  public void CheckEle(){
      MyInterface cEle = () ->{
       if(AddEl!=null){
        System.out.println("\t\t\t\t\t\t\t\t\t\t1.Number of Items ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t2.See Items ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t Enter choice ? ");
        int cho=sc.nextInt();
       if(cho==1){
        System.out.println("\t\t\t\t\t\t\t\tNumber of Elements :-->"+AddEl.size());
       }
       else if(cho==2){
        ListIterator it = AddEl.listIterator();
        while(it.hasNext()){
        System.out.println("\t\t\t\t\t\t\t\t:->"+it.next());
        }  
       }
       }
       else if(AddEl==null){
        System.out.println("\t\t\t\t\t\t\t\t List is Empty !!");
       }
      };
      cEle.Demo();
   }
  
  public void chckPrice(){
    MyInterface cPr = () -> {
    ListIterator prc = Prc.listIterator();
       ListIterator it = AddEl.listIterator();
       if (AddEl!=null && Prc!=null) {
        while(prc.hasNext()&&it.hasNext()){
        System.out.println("\t\t\t\t\t\t\t\t:->"+it.next()+"="+prc.next()+"/-");
       }
      }else if(AddEl==null && Prc==null){
        System.out.println("\t\t\t\t\t\t\t\tList is Empty !!");  
      } 
    };
    cPr.Demo();
  }
  
  public void formtList(){
     MyInterface frLst = () ->{
      AddEl.clear();
      Prc.clear();
     };
     frLst.Demo();
  
   }
}
