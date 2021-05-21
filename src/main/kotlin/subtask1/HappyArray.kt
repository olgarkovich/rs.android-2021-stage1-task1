package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()) {
            return sadArray
        }

        val currentArray = arrayListOf<Int>()
        for (item in sadArray) {
            currentArray.add(item)
        }
        var checkChanges = true
        while (checkChanges) {
            checkChanges = false
            val resultArray = arrayListOf<Int>()
            for (i in 0..currentArray.lastIndex) {
                if (i == 0) {
                    resultArray.add(currentArray[i])
                } else if (i == currentArray.lastIndex) {
                    resultArray.add(currentArray[i])
                } else {
                    if (currentArray[i] <= currentArray[i - 1] + currentArray[i + 1]) {
                        resultArray.add(currentArray[i])
                    } else {
                        checkChanges = true
                    }
                }
            }

            if (checkChanges) {
                currentArray.clear()
                currentArray.addAll(resultArray)
            }
            else {
                break
            }
        }

        val result = IntArray(currentArray.size)
        for (i in 0..currentArray.lastIndex) {
            result[i] = currentArray[i]
        }

        return result
    }
}
