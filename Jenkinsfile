pipeline {
	agent any
	stages {
	   stage('Compile') {
		   steps{
		       bat 'mvn compile'
		   }
	   }
	   stage ('Run Test') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
                bat 'mvn -Dtest=studentTest test'
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