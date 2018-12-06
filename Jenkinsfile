pipeline {
    agent any

    stages {	 
	   stage('Build') {
	   steps {
	    task('Build'){	    	
	   		bat '"${env.JAVA_HOME}/javac" Student.java'
	    }
	    task('Build Tests'){
	   	bat '"${env.JAVA_HOME}/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }
	   }
	   
	   }	   
	   stage('Run Tests') {
	   steps {
	    task('run tests'){
	   	bat '"${env.JAVA_HOME}/javac" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
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