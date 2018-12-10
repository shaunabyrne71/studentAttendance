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
              bat 'mvn -Dtest=studentTest test'
          }            
        }
	}	
}