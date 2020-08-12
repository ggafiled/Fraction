class Fraction {
    var top: Int
    var bottom: Int

    constructor(top: Int, bottom: Int) {
        this.top = top
        this.bottom = bottom
    }

    fun real(): String {
       return String.format("Output: %.2f",(top/bottom))
    }

    fun add(fract: Fraction): Fraction {
        var calNewDenomirator: Int = (this.bottom * fract.bottom)
        var calNewNumerator: Int = ((this.top * fract.bottom) + (fract.top * this.bottom))
        return Fraction(calNewNumerator,calNewDenomirator)
    }
}