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
        	mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "JENKINS ERROR ${env.JOB_NAME}", to: "c00144673@itcarlow.com";
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