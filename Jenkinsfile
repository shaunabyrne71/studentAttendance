pipeline {
	agent any
	stages {
	   stage('Get from Repo') {
	   	steps{
	   	    	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], 
      	 		 userRemoteConfigs: [[url: 'https://github.com/shaunabyrne71/studentAttendance.git/']]])
      	 	 }
  	   }
	   stage('Compile') {
		   steps{
		       bat 'mvn compile'
		   }
	   } 
	   stage('Clean Install') {
		   steps{
		       bat 'mvn clean install -Dmaven.test.skip=true'
		   }
	   }
	   stage ('Run Test') {
            steps {
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
					
		}
		failure {
			echo "Failure"
		}
		unstable {
			echo "Unstable"
		}		
	}
}