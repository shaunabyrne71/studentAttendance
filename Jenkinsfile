pipeline {
	agent any
	stages {
	   stage('Compile') {
		   steps{
		       bat 'mvn compile'
		   }
	   } 
	  // stage ('Run Test') {
        //    steps {
          //      bat 'mvn -Dtest=studentTest test'
            //}            
        //}
	}
	post {
		always {
			echo "Always"          
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