class Program{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var half = Fraction(1,2)
            println(half.real()) // expected 0.5

            var TwoThirds = Fraction(2,3)
            println(TwoThirds.real()) // expected 0.67

            var quarter = Fraction(1,4)
            var result = half.add(quarter)
            print(result.real()) // expected 0.75
        }
    }
}