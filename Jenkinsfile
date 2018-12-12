pipeline {
	agent any	
	stages {	 
		stage('Build') {
			steps {				
					bat '"%JAVA_HOME%/bin/javac" Student.java'
					bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'				
				  
			}
		}
		stage('Test') {
            steps {
                bat '"%JAVA_HOME%/bin/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
            }           
        }	
	}
	post {
		always {
			echo "Clean Workspace"           
			cleanWs()
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
		changed {
			echo 'Changed'            
		}
	}
}