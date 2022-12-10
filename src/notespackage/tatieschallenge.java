package notespackage;

class Main {
  public static void main(String[] args) {
    int[] numArray = {2, 5, 9, 12, 208, 333, 18, 11, 0};

    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 == 0) {
        System.out.println("Element at index " + i + " is EVEN : " + numArray[i]);
      } else {
        System.out.println("Element at index " + i + " is ODD : " + numArray[i]);
      }
    }

    //OR....
    System.out.println("--------------");
    // Declare and initialize the even and odd arrays
    int[] evenArray = new int[numArray.length];
    int[] oddArray = new int[numArray.length];

    // Track the number of even and odd numbers
    int evenCount = 0;
    int oddCount = 0;

    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] % 2 == 0) {
        evenArray[evenCount] = numArray[i];
        evenCount++;
      } else {
        oddArray[oddCount] = numArray[i];
        oddCount++;
      }
    }

    // Print the even numbers
    System.out.println("Even numbers:");
    for (int i = 0; i < evenCount; i++) {
      System.out.println(evenArray[i]);
    }

    // Print the odd numbers
    System.out.println("Odd numbers:");
    for (int i = 0; i < oddCount; i++) {
      System.out.println(oddArray[i]);
    }

  }
}
