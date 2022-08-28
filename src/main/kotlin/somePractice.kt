fun main() {
}
    // about recursion
    fun recursive(a: Int): Int {
        if (a > 10000) {
            return a
        } else {
            return (a + recursive(a + 1))
        }
    }






