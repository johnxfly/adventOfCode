package com.johnny

class Day2 {
    static void main(String[] args) {
        Day2 day2 = new Day2()
        day2.solve(Part.ONE)
        day2.solve(Part.TWO)
    }

    def solve(Part level){
        List<String> lines = this.getClass().getResource( '/day2.data' ).readLines()

        int sum = 0
        for (String line in lines){
            int[] numbers = getNumbers(line)
            if (level == Part.ONE){
                sum = sum + getSpread(numbers)
            } else {
                sum = sum + getWholeDivisor(numbers)
            }
        }
        println("Day Two $level: $sum")
    }

    int[] getNumbers(String row){
        String[] split = row.split()
        int[] array = Arrays.stream(split).mapToInt{i->Integer.parseInt(i)}.toArray();
        array
    }

    int getSpread(int[] numbers){
        int min = Arrays.stream(numbers).min().getAsInt()
        int max = Arrays.stream(numbers).max().getAsInt()
        max - min
    }

    int getWholeDivisor(int[] numbers){
        int size = numbers.size() -1
        for (i in 0..size){
            for (j in i + 1..size){
                int a = numbers[i]
                int b = numbers[j]

                if (a % b == 0){
                    return a/b
                }

                if (b % a == 0){
                    return b/a
                }
            }
        }
        0
    }
}
