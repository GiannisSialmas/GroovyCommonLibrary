#!/usr/bin/env groovy

def call(Map args) {

    fullName="${args.fname} ${args.lname}"
    println "fullName is: ${fullName}"
    return fullName

}
