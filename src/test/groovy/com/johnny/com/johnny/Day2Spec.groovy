package com.johnny.com.johnny

import com.johnny.Day2
import spock.lang.Specification

class Day2Spec extends Specification {

    def 'getNumbers'() {
        expect:
        Day2.getNumbers('1919\t2959\t82\t    507') == [1919, 2959, 82, 507]
    }
}
