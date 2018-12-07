pipeline {
	agent any
	//environment {
	//	JAVA_HOME = "${env.JAVA_HOME}"
	//}
	stages {	 
		stage('Build') {
			steps {					
					echo "${env.JAVA_HOME}"  
					echo "%JAVA_HOME%"	
					bat '"%JAVA_HOME%/bin/javac" Student.java'
					bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'					
				  
			}
		}		  
		stage('Run Tests') {
			steps {
			  bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar; studentTest.java'			
				
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