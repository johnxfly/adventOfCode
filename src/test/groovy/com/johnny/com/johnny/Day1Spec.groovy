package com.johnny.com.johnny

import com.johnny.Day1
import com.johnny.Part
import spock.lang.Specification
import spock.lang.Unroll

class Day1Spec extends Specification {

    @Unroll("#index | #expected")
    def getNextIndex() {
        when:
        int next = Day1.getNextIndex(index, 10, Part.TWO)
        then:
        next == expected

        where:
        index || expected
        1     || 6
        2     || 7
        3     || 8
        4     || 9
        5     || 0
        6     || 1
        7     || 2
        8     || 3
        9     || 4
        10    || 5
    }
}