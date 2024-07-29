class Weight1 {
  private int[] data;
  private int sum = 0;

  public Weight1(int[] init) {
    data = new int[init.length];

    for (int j = 0 ; j < data.length ; j++) 
      data[j] = init[j];
  }
  
  public int average() {
    for (int a = 0 ; a < data.length ; a++) 
      sum += data[a];

    return sum / data.length;
  }
}

public class WeightTester1 {  
  public static void main(String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
                    
    Weight1 june = new Weight1(values);
    int avg = june.average();
    System.out.println("Average = " + avg);
  }
}      