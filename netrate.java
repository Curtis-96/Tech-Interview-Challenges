/*
The program parces input from the "bandwidth.csv" and "bitrate.csv" files and uses these values to compute the network bandwidth utilization of an interface.
The file "bandwidth.csv" is in the format "Server, InterfaceName, Bandwidth" (ex. "server1,eth0,20"). The file "netbitrate.csv" is in the format "Timestamp,Server,InterfaceName,NetBitRate" (ex. "2019-07-08 21:53:27,server1,eth1,100").
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Iterator;


class Main {
  public static void main(String[] args) throws Exception{
  File band = new File("bandwidth.csv");
  File bit = new File("netbitrate.csv");
  Scanner in = new Scanner(band);
  Scanner in2 = new Scanner(bit);
  ArrayList <String> f1 = new ArrayList<String>();
  ArrayList <String> f2 = new ArrayList<String>();

  while(in.hasNext())
  {
    String tmp = in.nextLine();
    f1.add(tmp);
  }

  while(in2.hasNext())
  {
    String tmp2 = in2.nextLine();
    f2.add(tmp2);
  }


  f1.remove(0);
  f2.remove(0);




for (String j : f1)
{
  String ii = j.substring(0,12);
  for(String i : f2)
  {
    if(i.contains(ii))
    {
      int parse = Integer.parseInt(i.substring(36));
      int parse2 = Integer.parseInt(j.substring(13));
      String body = i.substring(0,36);
      body = body.replaceAll(",", " ");
      float rate = (float) parse/parse2;
      System.out.println(body + rate);
    }
  }
}













  }
}
