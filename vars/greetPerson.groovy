#!/usr/bin/env groovy

// This has been tested and it works

//This is the default function. You can access it from the pipeline like this
//fullName = greetPerson fname: "Giannis", lname: "Sialmas"
def call(Map args) {
    fullName="${args.fname} ${args.lname}"
    println "fullName is: ${fullName}"
    return fullName
}

//This is the default function. You can access it from the pipeline like this
//greeting = greetPerson.greeting fname: "Giannis", lname: "Sialmas"
def greeting(Map args) {
    fullName="${args.fname} ${args.lname}"
    println "Hello ${fullName}"
    return "Hello ${fullName}"
}
