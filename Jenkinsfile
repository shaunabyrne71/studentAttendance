pipeline {
    agent any

    stages {	 
	   stage('Build') {
	   steps {
	    task('Build'){	    	
	   		bat '"%JAVA_HOME%/javac" Student.java'
	    }
	    task('Build Tests'){
	   	bat '"%JAVA_HOME%/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }
	   }
	   
	   }	   
	   stage('Run Tests') {
	   steps {
	    task('run tests'){
	   	bat '"%JAVA_HOME%/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
	  }}
	   }   
    }
    post {
        always {
            echo "Clean Workspace"           
           // cleanWs()
        }
        success {
            echo "Succeeded"

        }
        failure {
        	emailext body: "The build failed! ${env.BUILD_URL}", recipientProviders: ['c00144673@itcarlow.ie'], subject: 'FAILED PIPELINE BUILD', attachLog: true
        }
        unstable {
            echo "Unstable"
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}