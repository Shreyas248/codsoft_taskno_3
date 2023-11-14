import java.util.*;
import java.text.DecimalFormat;
public class currency{
    public static void main(String[] args)
    {
        double rupee, dollar, pound, code, euro, kwid;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("---Change you currency---\nEnter the currency number\n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwait dinar");
        code=sc.nextInt();
        if(code==1)
        {
            System.out.println("Enter the amount in Rupees:");
            rupee = sc.nextDouble();
            dollar = rupee/77.34;
            System.out.println("Dollar : "+f.format(dollar));
            pound = rupee/94.46;
            System.out.println("Pound : "+f.format(pound));
            euro = rupee/80.36;
            System.out.println("Euro : "+f.format(euro));
            kwid = rupee/251.92;
            System.out.println("Kuwait dinar : "+f.format(kwid));
        }
        else if(code == 2)
        {
            System.out.println("Enter the amount in Dollars:");
            dollar = sc.nextDouble();
            rupee = dollar*77.34;
            System.out.println("Rupees : "+f.format(rupee));
            pound = dollar*0.82;
            System.out.println("Pound : "+f.format(dollar));
            euro = dollar*0.96;
            System.out.println("Euro : "+f.format(euro));
            kwid = dollar*0.31;
            System.out.println("Kuwait dinar : "+f.format(kwid));
        }
        else if(code == 3)
        {
            System.out.println("Enter the amount in Pound:");
            pound = sc.nextDouble();
            rupee = pound*94.43;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = pound*1.22;
            System.out.println("Dollars : "+f.format(dollar));
            euro = pound*1.17;
            System.out.println("Euro : "+f.format(euro));
            kwid = pound*0.3748;
            System.out.println("Kuwait dinar : "+f.format(kwid));
        }
        else if(code == 4)
        {
            System.out.println("Enter the amount in Euro:");
            euro = sc.nextDouble();
            rupee = euro*80.43;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = euro*1.04;
            System.out.println("Dollars : "+f.format(dollar));
            pound = euro*0.85;
            System.out.println("Pounds : "+f.format(pound));
            kwid = euro*0.318949;
            System.out.println("Kuwait dinar : "+f.format(kwid));
        }
        else if(code==5)
        {
            System.out.println("Enter the amount in Kuwait Dinar:");
            kwid = sc.nextDouble();
            rupee = kwid*251.96;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = kwid*3.26;
            System.out.println("Dollar : "+f.format(dollar));
            pound = kwid*2.67;
            System.out.println("Pound : "+f.format(pound));
            euro = kwid*3.13;
            System.out.println("Euros : "+f.format(euro));
        }
        else
        {
            System.out.println("Invalid code");
        }
    }
}