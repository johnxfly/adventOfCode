package com.johnny

import spock.lang.Specification
import spock.lang.Unroll

class Day17Spec extends Specification {

    @Unroll("current:#current - size:#size:  #expected")
    def "NextIndex"() {
        Day17 day17 = new Day17()
        when:
        int next = day17.nextIndex(3, current, size)

        then:
        next == expected

        where:
        current | size | size_after || expected
        0       | 1    | 2          || 1
        1       | 2    | 3          || 1
        1       | 3    | 4          || 2
        2       | 4    | 5          || 2
        2       | 5    | 6          || 6
        6       | 6    | 7          || 2
        2       | 7    | 8          || 6
        6       | 8    | 9          || 1
    }
}
