
public class Results {
   int phy,che,mat;
   float total,per;
   
   public void calculations() {
      total = phy + che + mat;
      per = total * 100 / 450;
   }
   public void showresults() {
      System.out.println("Total Score = "+ total);
      System.out.println("Percentage = "+ per);
}
}