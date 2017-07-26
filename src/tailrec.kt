import java.math.BigInteger

/**
 * Created by gnadlinger on 18.06.17.
 */
fun main(args: Array<String>) {
        println(getFibanocciNumber(1000000,BigInteger("1"),BigInteger("0")))
}
//no stackoverflow exception with tailrec
tailrec fun getFibanocciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) {
        return b
    } else {
        return getFibanocciNumber(n - 1, a + b, a)

    }
}