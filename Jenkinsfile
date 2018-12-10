pipeline {
	agent any
	stages {
	   stage('Build source') {
		   steps{
		       echo 'building source'
		       bat '"%JAVA_HOME%/bin/javac" Student.java'
		       echo 'build test'
	           bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
		   }
	   }
	   stage ('Run Test') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
            }            
        } 
	}
	post {
		always {
			echo "Always"          
		}
		success {
			echo "Succeeded"
			//  junit 'target/surefire-reports/**/*.xml'			
		}
		failure {
			echo "Failure"
		}
		unstable {
			echo "Unstable"
		}		
	}
}