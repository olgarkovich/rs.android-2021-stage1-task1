package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val resultArray = arrayListOf<String>()
        for (i in 0..inputString.lastIndex) {
            when (inputString[i]) {
                '<' -> resultArray.add(getSubstring(inputString, i, '<', '>'))
                '[' -> resultArray.add(getSubstring(inputString, i, '[', ']'))
                '(' -> resultArray.add(getSubstring(inputString, i, '(', ')'))
            }
        }

        return resultArray.toTypedArray()
    }

    private fun getSubstring(
        inputString: String,
        i: Int,
        openBracket: Char,
        closeBracket: Char
    ): String {
        var str = ""
        var checkRepeat = 0
        for (k in i + 1..inputString.lastIndex) {
            if (inputString[k] == openBracket) {
                checkRepeat++
            }

            if (inputString[k] == closeBracket) {

                if (checkRepeat > 0) {
                    str += inputString[k]
                    checkRepeat--
                } else {
                    return str
                }
            } else {
                str += inputString[k]
            }
        }
        return str
    }
}
