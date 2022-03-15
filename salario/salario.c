#include <stdio.h>

int main(){

    int number, horas ;
    double salario_horas, salario;

    scanf("%d", &number);
    scanf("%d", &horas);
    scanf("%lf", &salario_horas);

    salario = horas * salario_horas;

    printf("NUMBER = %d\n", number);
    printf("SALARY = U$ %.2lf\n", salario);
    
    return 0;
}