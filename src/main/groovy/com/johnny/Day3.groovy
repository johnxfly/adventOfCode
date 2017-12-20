package com.johnny

class Day3 {
    static void main(String[] args) {
        Day3 day3 = new Day3()
        println "Day 3 part one: ${day3.solve(312051)}"
        println "Day 3 part two: ${day3.solvePartTwo(312051)}"
    }

    int solve(int input){
        int floor = Math.floor(Math.sqrt(input))
        int corner = (floor + 1)**2
        int side = 558
        int southCenter = corner - (558 / 2)    // = 312,202
        int southWest = corner - side           // = 311,923

        // the input is between southwest and southeast, so its on the south side
        // the center is 279 UP
        // 312,202 - 312051 = 151
        //151 - 279 = 430
        430
    }

    int solvePartTwo(int input){
        def spiral = [ 0, 1, 1, 2, 4, 5, 10, 11, 23, 25 ]
        -1
    }
}