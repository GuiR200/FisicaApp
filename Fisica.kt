import kotlin.math.pow

class Fisica {
    fun calcularForcaDoPeso(massa: Float, gravidade: Float) = massa * gravidade

    fun calcularForcaCentripeta(massa: Float, velocidade: Double, raio: Float) = massa * velocidade.pow(2) / raio

    fun calcularImpulso(forca: Float, tempo: Float) = forca * tempo

    fun calcularForcaElastica(forca: Float, equilibrio: Float) = forca / equilibrio

    fun calcularVelocidadeMedia(velocidadeInicial: Float, velocidadeFinal: Float, tempoInicial: Float, tempoFinal: Float) = velocidadeFinal - velocidadeInicial / tempoFinal - tempoInicial

    fun calcularMRU(sentidoInicial: Float, velocidade: Float, tempoFinal: Float, tempoInicial : Float) = sentidoInicial + velocidade * (tempoFinal - tempoInicial)

    fun calcularMRUV(sentidoInicial : Float,velocidade : Float, tempo : Float, aceleracao : Float, tempoDaDivisao : Double) = sentidoInicial + velocidade * tempo + (aceleracao + tempoDaDivisao.pow(2) / 2)
}