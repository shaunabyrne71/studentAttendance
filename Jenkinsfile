pipeline {
    agent any

    stages {	 
	   stage('build source') {
	   steps {
	    task('Building Source'){	    	
	   		bat '"%JAVA_HOME%/javac" Student.java'
	    }
	   }
	   
	   }
	   stage('build tests') {
	      steps {
	    task('build tests'){
	   	bat '"%JAVA_HOME%/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }}}
	   stage('run tests') {
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
        	emailext body: "The build failed! ${env.BUILD_URL}", recipientProviders: [culprits()], subject: 'FAILED PIPELINE BUILD', attachLog: true
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