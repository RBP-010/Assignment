package assignment;

import java.util.Scanner;

class Stockreport {
    private String name;
    private int numberofshare1;
    private double shareprice;
    public Stockreport(String name,int numberofshare,double shareprice){
        this.name=name;
        this.numberofshare1=numberofshare;
        this.shareprice=shareprice;
    }
    public double calculatestockvalue(){
        return numberofshare1 + shareprice;
    }
    public String getName(){
        return name;
    }
    public int getNumberofshare(){
        return numberofshare1;
    }
    public double getShareprice(){
        return shareprice;
    }
}
public class Stock{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofStocks;
        System.out.println("Enter the number of stocks:");
        numberofStocks = scanner.nextInt();
        Stockreport[] stockreports = new Stockreport[numberofStocks];
        // Read stock information
        for (int i=0;i<numberofStocks;i++){
            System.out.println("Enter stock information for stock" + (i+1) + ":");
            System.out.println("Stock name:");
            String name = scanner.next();
            System.out.println("Number of share:");
            int numberofshare = scanner.nextInt();
            System.out.println("Share price:");
            double shareprice = scanner.nextDouble();
            stockreports[i] = new Stockreport(name,numberofshare,shareprice);
        }
        scanner.close();
        // Generate stock report
        System.out.println("\nStock report:");
        System.out.println();
        double totalvalueofStocks = 0;
        for (Stockreport stockreport: stockreports){
            double stockvalue = stockreport.calculatestockvalue();
            totalvalueofStocks += stockvalue;
            System.out.println("Stock name:" +stockreport.getName());
            System.out.println("Number of shares:" +stockreport.getNumberofshare());
            System.out.println("Share price:" +stockreport.getShareprice());
            System.out.println("Total value:" +stockvalue);
            System.out.println();
        }
        System.out.println("Total value of all stocks:" +totalvalueofStocks);
    }}

