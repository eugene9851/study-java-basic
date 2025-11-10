package ref;

public class VarChange2 {
  public static void main(String[] args) {
    Data dataA = new Data();
    dataA.value = 10;
    Data dataB = dataA;

    System.out.println("dataA.value: " + dataA.value);
    System.out.println("dataB.value: " + dataB.value);

    dataA.value = 20;

    System.out.println("dataA.value: " + dataA.value);
    System.out.println("dataB.value: " + dataB.value);
  }
}
