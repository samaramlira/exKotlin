fun main() {
    /*Solicitar a idade de várias pessoas e imprimir:
    Total de pessoas com menos de 21 anos. Total de pessoas
    com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/

    var somaJovens = 0
    var somaIdosos = 0
    var idade = 0

    while (idade != -99){

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        if(idade < 21){

            somaJovens++

        } else if(idade > 50) {

            somaIdosos++

        }
    }

    println("A soma de pessoas com menos de 21 anos é $somaJovens")
    println("A soma de pessoas com mais de 50 anos é $somaIdosos")
}