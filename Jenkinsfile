pipeline {
	agent any
	//environment {
	//	JAVA_HOME = "${env.JAVA_HOME}"
	//}
	stages {	 
		
   stage('build source') {
   steps{
       echo 'building source'
       bat '"%JAVA_HOME%/bin/javac" Student.java'
   }

       
   }
   stage('build tests') {
   steps{
       echo 'build test'
       bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
       }
   }
   stage('run tests') {
   steps{
       echo 'running the tests'
       bat '"%JAVA_HOME%/bin/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
       }
   }

			
	}
	post {
		always {
			echo "Clean Workspace"           
			//cleanWs()		
		}
		success {
			echo "Succeeded"			
		}
		failure {
			echo "Failure"
		}
		unstable {
			echo "Unstable"
		}		
	}
}