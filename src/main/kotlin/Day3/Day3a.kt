package Day3

class Day3a(pathname: String) : Day3(pathname) {

    override fun run(): Int {

        var gamma: Int = 0
        var epsilon: Int = 0
        var gammaS: String = ""
        var epsilonS: String = ""
        val bits: IntArray

        bits = IntArray(diagRepo[0].length) { 0 }
        for (number in diagRepo) {
            for ((i, c) in number.withIndex()) {
                bits[i] += if (c == '1') 1 else 0
            }
        }
        bits.forEach {
            gammaS += if (it > diagRepo.size / 2) "1" else "0"
            epsilonS += if (it < diagRepo.size / 2) "1" else "0"
        }
        gamma = gammaS.toInt(2)
        epsilon = epsilonS.toInt(2)

        println("gamma = $gamma, epsilon = $epsilon, power =  ${gamma * epsilon}")
        return gamma * epsilon
    }
}