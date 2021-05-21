package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val result = (bill.sum() - bill[k]) / 2

        return if (result == b) {
            "bon appetit"
        } else {
            (b - result).toString()
        }
    }
}
