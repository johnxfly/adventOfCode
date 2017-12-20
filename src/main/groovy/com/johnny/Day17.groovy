package com.johnny

import org.apache.commons.lang3.StringUtils

class Day17 {

    static void main(String[] args) {
        Day17 day17 = new Day17()
        day17.partOne(312)
        day17.partTwo(312)
    }

    def partOne(int input){
        List<Integer> list=[0]
        int current = 0
        for (i in 1..2017) {
            int size = list.size()
            current = nextIndex(input, current, size)
            list = list.plus(current, size)
            //showList(i, current, list)
        }
        find2017(list)
    }

    // Rather than putting everything in a list we just need to keep track
    // of when the first element changes
    def partTwo(int input){
        String first
        int current = 0
        for (i in 1..50000000){
            current = ((current + input) % i) + 1
            if (current == 1) {
                first = i;
            }
        }
        println "Part Two: The value after 0 is: $first" // 42729050
    }


    int nextIndex(int input, int current, int size){
        ((current + input) % size) + 1
    }

    String find2017(def list){
        String x = list*.toString()
        println "Part One: The next number is: " + StringUtils.substringBetween(x, "2017, ",",")
    }

    def showList(int count, int current, List<Integer> list){
        int size = list.size() - 1
        StringBuffer sb = new StringBuffer()
        sb.append("$count [")
        list.eachWithIndex { int entry, int i ->
            if (i == current){
                sb.append("(")
                sb.append(entry)
                sb.append(")")
            } else {
                sb.append(entry)
            }
            if (i < size) {
                sb.append(",")
            }
        }
        sb.append("]")
        println sb.toString()
    }
}
