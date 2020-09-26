#!/usr/bin/env groovy

def call(Map args) {

    fullName="${args.fname} ${args.lname}"
    println "fullName is: ${fullName}"
    return fullName

}

def greeting(Map args) {

    fullName="${args.fname} ${args.lname}"
    println "Hello ${fullName}"
    return "Hello ${fullName}"

}
