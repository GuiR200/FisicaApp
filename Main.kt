fun main(args: Array<String>) {
    val calculos = Fisica()

    val forcaDoPeso = calculos.calcularForcaDoPeso(5f,5f)

    val forcaCentripeta = calculos.calcularForcaCentripeta(20f,6.0,6f)

    val impulso = calculos.calcularImpulso(25f,5f)

    val forcaElastica = calculos.calcularForcaElastica(50f,9f)

    val velocidadeMedia = calculos.calcularVelocidadeMedia(10f,5f,4f,2f)

    val mru = calculos.calcularMRU(8f,15f,3f,4f)

    val mruv = calculos.calcularMRUV(18f,16f,2f,7f,10.0)

    println("Calculo da força do peso: $forcaDoPeso")
    println("Calculo da força centripeta: $forcaCentripeta")
    println("Calculo do impulso: $impulso")
    println("Calculo da força elastica: $forcaElastica")
    println("Calculo da velocidade média $velocidadeMedia")
    println("Calculo do MRU $mru")
    println("Calculo do MRUV $mruv")
}