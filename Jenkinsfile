pipeline {
    agent any

    stages {	 
	   stage('build source') {
	   	echo 'building source'
	   	bat '"%JAVA_HOME%/javac" Student.java'
	   }
	   stage('build tests') {
	   	echo 'build test'
	   	bat '"%JAVA_HOME%/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }
	   stage('run tests') {
	   	echo 'running the tests'
	   	bat '"%JAVA_HOME%/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
	   }   
    }
}