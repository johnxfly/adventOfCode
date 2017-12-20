package com.johnny.com.johnny

import spock.lang.Specification

class Day3Spec extends Specification{

    def "etst"(){
        when:
        int square = 1
        for (int i = 1; square < 312051; i = i + 3){
            println ("$i square: $square")
        }

        then:
        true
    }
}
