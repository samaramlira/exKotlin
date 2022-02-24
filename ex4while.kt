fun main() {
    /*Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das
    pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se
    a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler
    os dados de 150 pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
*/

    var pessoas = 0
    var pessoasCalmas = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outrosCalmos = 0
    var pessoasNervosas40 = 0
    var pessoasCalmas18 = 0

    while (pessoas != 150){

        print("Digite sua idade: ")
        val idade = readLine()!!.toInt()

        print("Qual o seu sexo? Digite... 1 para feminino, 2 para masculino e 3 para outros: ")
        var sexo = readLine()!!.toInt()

        print("Qual sua personalidade? Digite... 1 para calma, 2 para nervosa e 3 para agressiva: ")
        var personalidade = readLine()!!.toInt()

        pessoas++

        if(personalidade == 1) {

            pessoasCalmas += 1

        }
        if(sexo == 1 && personalidade == 2){

            mulheresNervosas += 1

        }
        if(sexo == 2 && personalidade == 3) {

            homensAgressivos += 1

        }
        if(sexo == 3 && personalidade == 1) {

            outrosCalmos  += 1

        }
        if(idade > 40 && personalidade == 2) {

            pessoasNervosas40 += 1

        }
        if(idade < 18 && personalidade == 1) {

            pessoasCalmas18 += 1

        }

    }

    println("o número de pessoas calmas é: $pessoasCalmas")
    println("o número de mulheres nervosas é: $mulheresNervosas")
    println("o número de homens agressivos é: $homensAgressivos")
    println("o número de outros calmos é: $outrosCalmos")
    println("o número de pessoas nervosas com mais de 40 anos é: $pessoasNervosas40")
    println("o número de pessoas calmas com menos de 18 anos é: $pessoasCalmas18")

}