import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int number, horas;
        double salario_horas, salario;
        
        number = Integer.parseInt(in.readLine());
        horas = Integer.parseInt(in.readLine());
        salario_horas = Double.parseDouble(in.readLine());

        salario = horas * salario_horas;
        
        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
    
}