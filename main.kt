import java.util.Scanner

fun main() {
    
    val scanner = Scanner(System.`in`)
    print("A")
    
	val salario = scanner.nextInt()
    
    print("Salario: $salario")
    
    var imposto = 0.0
    val beneficios = 0.0
    
    if (salario >= 0 && salario <= 1100){0
        imposto = 0.05 * salario
    } else if (salario >= 1100.01 && salario <= 2500) {
        imposto = 0.10 * salario
    } else {
        imposto = 0.15 * salario
    }
    
    val saida = salario - imposto + beneficios
    System.out.println(saida)
    
    scanner.close()
}