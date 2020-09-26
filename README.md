# General
You can find more about groovy libraries for Jenkins at https://www.jenkins.io/doc/book/pipeline/shared-libraries/


# Setup
You can setup the library in the jenkins settings globally and either load id implicitly or explicitly.
If you want to load it explicitly, use the following commands at the top section of your Jenkinsfile to load it
```
@Library('my-shared-library') _
/* Using a version specifier, such as branch, tag, etc */
@Library('my-shared-library@1.0') _
/* Accessing multiple libraries with one statement */
@Library(['my-shared-library', 'otherlib@abc1234']) _
```
