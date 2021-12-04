package Day3

class Day3b(pathname: String) : Day3(pathname) {

    override fun run(): Int {

        var oxygenL: MutableList<String> = diagRepo as MutableList<String>
        var co2L: MutableList<String> = diagRepo as MutableList<String>
        var bitN: Int

        // find oxygen
        bitN = 0
        while (oxygenL.size > 1) {
            oxygenL = countRemove(oxygenL, bitN, 0)
            bitN++
        }
        // find co2
        bitN = 0
        while (co2L.size > 1) {
            co2L = countRemove(co2L, bitN, 1)
            bitN++
        }

        val oxygen = oxygenL[0].toInt(2)
        val co2 = co2L[0].toInt(2)
        println("oxygen = $oxygen, co2 = $co2, life support =  ${oxygen * co2}")
        return oxygen * co2
    }

    private fun countRemove(numList: MutableList<String>, pos: Int, o2co2: Int): MutableList<String> {
        var numOnes: Int = 0
        val result: MutableList<String> = mutableListOf()

        // count ones
        for (number in numList) {
            if (number[pos] == '1') numOnes++
        }
        val mostCommon: Char = if (numOnes >= numList.size - numOnes) '1' else '0'

        for (num in numList) {
            if (o2co2 == 0 && num[pos] == mostCommon) {
                result.add(num)
            } else if (o2co2 == 1 && num[pos] != mostCommon) {
                result.add(num)
            }
        }

        return result
    }
}