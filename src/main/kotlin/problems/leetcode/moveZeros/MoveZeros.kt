package problems.leetcode.moveZeros


fun main(array: Array<String>) {
    val moveZeros = MoveZeros()
    val result = moveZeros.moveZeros(arrayOf(0, 1, 0, 3, 12))
    result.forEach {
        print("$it ")
    }
}

class MoveZeros {
    fun moveZerosOptimized(items: Array<Int>): Array<Int> {
        var lastIndex = 0
        items.forEachIndexed { index, value ->
            if (value != 0) {
                items[index] = items[lastIndex]
                items[lastIndex++] = value
            }
        }
        return items
    }

    fun moveZeros(items: Array<Int>): Array<Int> {
        var lastIndex = 0
        items.forEachIndexed { index, value ->
            if (value != 0) {
                items[lastIndex++] = value
            }
        }
        for (index in lastIndex until items.size) {
            items[index] = 0
        }
        return items
    }
}