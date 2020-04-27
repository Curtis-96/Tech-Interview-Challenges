import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //int[] p = {2.5, 5, 10, 25, 35, 45};
    //int[] q = {2.5, 5, 10, 25, 35, 45};
    int[] nums = new int[5];

    System.out.print("Input target weight: ");
    int target = in.nextInt();

    if((target-45)%5!=0 || target<45)
    {
      System.out.print("Weight is invalid");
    }
    else
    {
      plates(target);
    }
  }
public static void plates(int target)
{
    int p=target-45;
    int[] w= new int[6];

    while(p!=0)
    {
      if(p-90>=0 && (p-90)%5==0)
      {
        w[0]++;
        p=p-90;
        //System.out.println("out");
        //System.out.println(w[0]);
      }
      else if(p-70>=0 && (p-70)%5==0)//|| (p%70)%5 == 0)
      {
        w[1]++;
        p= p-70;

        //System.out.println(w[1]);
      }
      else if(p-50>=0 && (p-50)%5==0)// || (p%50)%5 == 0)
      {
        w[2]++;
        p= p-50;
        //System.out.println(w[2]);
      }
      else if(p-20>=0 && (p-20)%5==0)// || (p%20)%5 == 0)
      {
        w[3]++;
        p= p-20;
        //System.out.println(w[3]);
      }
      else if(p-10>=0 && (p-10)%5==0)// || (p%10)%5 == 0)
      {
        w[4]++;
        p= p-10;
        //System.out.println(w[4]);
      }
      else if(p-5==0)
      {
        w[5]++;
        p= p-5;
        //System.out.println(w[5]);
      }

    }
            System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(w[2]);
        System.out.println(w[3]);
        System.out.println(w[4]);
        System.out.println(w[5]);




}

}
