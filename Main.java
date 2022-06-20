import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wejscie = new Scanner(System.in);

    int liczba;
    int licznik = 0;
    
    System.out.println("Wprowadz liczbe");
    liczba=wejscie.nextInt();

    if (liczba == 0 && liczba == 1)
      System.out.println("Ta liczna nie jest pierwsza, ani złożona");
    else 
      for(int i = 1; i<=liczba;i++){
        if (liczba % i == 0)
          licznik++;
      }
      if (licznik == 2)
        System.out.println("Liczba pierwsza");
    else
        System.out.println("Liczba nie jest pierwsza");
    wejscie.close();
  }
  
}