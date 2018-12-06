pipeline {
    agent any

    stages {	 
	   stage('build source') {
	   steps {
	    task('Building Source'){	    	
	   		bat '"%JAVA_HOME%/javac" Student.java'
	    }
	   }
	   
	   }
	   stage('build tests') {
	      steps {
	    task('build tests'){
	   	bat '"%JAVA_HOME%/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }}}
	   stage('run tests') {
	   steps {
	    task('run tests'){
	   	bat '"%JAVA_HOME%/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
	  }}
	   }   
    }
}