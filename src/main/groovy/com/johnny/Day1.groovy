package com.johnny

class Day1 {

    static void main(String[] args) {
        Day1 day1 = new Day1()
        day1.solve(Part.ONE)
        day1.solve(Part.TWO)
    }

    def solve(Part level) {
        String data = this.getClass().getResource('/day1.data').text
        int length = data.length()
        int sum = 0;
        for (index in 0..length - 1) {
            int nextIndex = getNextIndex(index, length, level)
            int number = Integer.parseInt(data[index])
            int next = Integer.parseInt(data[nextIndex])
            if (number == next) {
                sum = sum + number;
            }
        }
        println "Day One part $level: $sum"
    }

    int getNextIndex(int index, int length, Part level) {
        if (level == Part.ONE) {
            index == length - 1 ? 0 : index + 1
        } else {
            int halfway = length / 2
            (index + halfway) % length
        }
    }
}
