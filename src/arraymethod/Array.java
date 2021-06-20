/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethod;

import java.util.Scanner;

/**
 *
 * @author Vuthy
 */
public class Array {
     Scanner cin = new Scanner(System.in);
     boolean x = true;
     int i=-1;
     int index;
     int num;
     
    public void add(int[] arr){
        i++;
        int y=1;
        if(i==0){
            System.out.print("\nValue["+i+"]:");
            arr[i] = cin.nextInt();
        }else{
            System.out.print("\nValue["+i+"]:");
            arr[i] = cin.nextInt();
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
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
    
    public void insert(int[] arr){
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
    
    public void delete(int[] arr){
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
    
    public void update(int[] arr){
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
    
    public void display(int[] arr){
        for(int j=0;j<=i;j++){
            System.out.print(arr[j]+"\t");
        }
    }
    
    public void sort(int[] arr){
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
    
    public void search(int[] arr){
        System.out.print("Input index to search :");
        index = cin.nextInt();
        if(index<=i){
            System.out.print("\nValue index "+index+" is "+arr[index]);
        }else{
            System.out.println("Index out of Array elements");
        }
    }
    
}
