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
                bat 'mvn install'
            }            
        } 
        stage ('Create Report') {
        	steps {
        		bat 'mvn surefire-report:report'
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