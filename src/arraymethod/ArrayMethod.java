/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethod;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vuthy
 */
public class ArrayMethod {

    /**
     * @param args the command line arguments
     */
    static Scanner cin = new Scanner(System.in);
    static boolean x = true;
    static int i=-1;
    static int index;
    static int num;
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean condition=true;
        ArrayList<Integer> arr = new ArrayList();
        int choose;
        
        do{
            if(i<0){
                System.out.println("\nArray Operator");
                System.out.println("\n1.Add");
                System.out.println("2.Exit");
                System.out.print("\nChoose number :");
                choose = cin.nextInt();
                switch(choose){
                    case 1 ->{
                        add(arr);
                    }
                    default->{
                        condition=false;
                    }
                } 
            }else{
                System.out.println("\nArray Operator");
                System.out.println("1.Add");
                System.out.println("2.Insert");
                System.out.println("3.Delete");
                System.out.println("4.Update");
                System.out.println("5.Display");
                System.out.println("6.Sort");
                System.out.println("7.Search");
                System.out.print("\nChoose number :");
                choose= cin.nextInt();
                switch(choose){
                    case 1 ->{
                        add(arr);
                    }
                    case 2 ->{
                                              
                    }
                    case 3 ->{
                        
                    }
                    case 4 ->{
                        
                    }
                    case 5 ->{
                        
                    }
                    case 6 ->{
                        
                    }
                    case 7 ->{
                        
                    }
                    default ->{
                        condition=false;
                    }
                }
            }
        }while(condition==true);
    }
    
     public static void add(ArrayList<Integer> array){
         int arr;
        i++;
        int y=1;
        if(i==0){
            System.out.print("\nValue["+i+"]:");
            arr = cin.nextInt();
            array.add(arr);
        }else{
            System.out.print("\nValue["+i+"]:");
            arr = cin.nextInt();
            for(int j=0;j<array.size();j++){
                if(arr==array.get(j)){
                    array.add(arr);
                    y=0;
                    i--;  
                }
            }  
        }
        if(y==1){
            System.out.println("Data has added.");
        }else{
            System.out.println("Data is already exist");
        }      
    }
    
    public static void insert(int[] arr){
        System.out.print("Please input index to insert :");
        index = cin.nextInt();
        if(index<=i){
            i++;
            for(int k=i;k>=index;k--){
                arr[k+1]=arr[k];
            }
            System.out.print("Insert value["+index+"] : ");
            arr[index] = cin.nextInt();
        }else{
            System.out.println("Index out of Array Element");
        }  
    }
    
    public static void delete(int[] arr){
        System.out.println("\n1.Delete by Index");
        System.out.println("2.Delete by Number");
        System.out.print("Choose : ");
        num = cin.nextInt();
        switch(num){
            case 1->{
                System.out.print("Please input index to delete :");
                index = cin.nextInt();
                if(index<=i){
                    for(int l=index;l<=i;l++){
                        arr[l]=arr[l+1];
                    }
                    System.out.println("Data has deleted.");
                    i--;
                }else{
                    System.out.println("Index out of Array Element");
                }
            }
            case 2->{
                boolean a=false;
                System.out.print("Please input Number to delete :");
                int numInput = cin.nextInt();
                for(int j=0;j<=i;j++){
                    if(arr[j]==numInput){
                        for(int l=j;l<=i;l++){
                            arr[l]=arr[l+1];
                        }
                        i--;
                        a=true;    
                    }
                }
                if(a==true){
                    System.out.println("\nData has deleted!");
                }else{
                    System.out.println("\nNumber Not found!");
                }
            }
            default->{
                x=false;
            }
        }                 
    }
    
    public static void update(int[] arr){
        System.out.println("\n1.Update by Index");
        System.out.println("2.Update by Number");
        System.out.print("Choose : ");
        num = cin.nextInt();
        switch(num){
            case 1->{
                System.out.print("Please input index to update : ");
                index = cin.nextInt();
                if(index<=i){
                    System.out.print("Input new value : ");
                    arr[index]=cin.nextInt();
                    System.out.println("Data has updated.");
                }else{
                    System.out.println("Index out of Array Element");
                }
            }
            case 2->{
                boolean a=false;
                System.out.print("Please input Number to update :");
                int numInput = cin.nextInt();
                for(int j=0;j<=i;j++){
                    if(arr[j]==numInput){
                        System.out.print("\nInput new Number : ");
                        arr[j]=cin.nextInt();
                        a=true;
                    }                                        
                }
                if(a==true){
                    System.out.println("\nNumber has updated!");
                }else{
                    System.out.println("\nNumber Not found");
                }
            }
        }                 
    }
    
    public static void display(ArrayList<Integer> array){
        for(Integer arr : array){
            System.out.print(arr+"\t");
        }
//        for(int j=0;j<=i;j++){
//            System.out.print(arr[j]+"\t");
//        }
    }
    
    public static void sort(int[] arr){
        System.out.println("\t\n1. Descending");
        System.out.println("\t\n2. Ascending");
        System.out.print("Choose number : ");
        int chooseSort = cin.nextInt();
        boolean con=false;
        int temp;
        switch(chooseSort){
            case 1 ->{
                while(con==false){
                    con=true;
                    for(int j=0;j<i;j++){
                        if(arr[j]<arr[j+1]){
                            temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            con=false;
                        }   
                    }
                } 
            }
            case 2 ->{
                while(con==false){
                    con=true;
                    for(int j=0;j<i;j++){
                        if(arr[j]>arr[j+1]){
                            temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            con=false;
                        }
                    }
                }
            }
        }
        System.out.println("Data has been sorted.");
    }
    
    public static void search(int[] arr){
        System.out.print("Input index to search :");
        index = cin.nextInt();
        if(index<=i){
            System.out.print("\nValue index "+index+" is "+arr[index]);
        }else{
            System.out.println("Index out of Array elements");
        }
    }
    
}
