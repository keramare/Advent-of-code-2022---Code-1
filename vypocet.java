import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class vypocet
{
    private Scanner scanner;

    public vypocet() throws IOException
    {
        this.nacitajVstup();
    }
    
    public void nacitajVstup() throws IOException{
    File subor = new File("subor.txt");
    Scanner scanner = new Scanner(subor);
    String  input;
    int nacitaneCislo;
    int suma = 0;
    ArrayList<Integer> hodnoty = new ArrayList<>(); 
    
    while (scanner.hasNext()) {
        input = scanner.nextLine();
        if (input.isBlank()){
            hodnoty.add(suma);
            suma = 0;
            continue;
        }
        nacitaneCislo = Integer.parseInt(input);
        suma += nacitaneCislo;   
        System.out.println(input);
    }
    System.out.println(hodnoty);
    Collections.sort(hodnoty);
    
    int sumaTroch = hodnoty.get(hodnoty.size()-1) + hodnoty.get(hodnoty.size()-2) + hodnoty.get(hodnoty.size()-3);
    System.out.println("Najvacsia suma: " + hodnoty.get(hodnoty.size()-1));
    System.out.println("Suma troch: " + sumaTroch);
    
    scanner.close();
    } 
}
