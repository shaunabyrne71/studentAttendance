pipeline {
    agent any
 environment {
 	JAVA_HOME = "${env.JAVA_HOME}"
 }
    stages {	 
	   stage('Build') {
	   steps {
	    task('Build'){	  
	    	echo "${env.JAVA_HOME}"  	
	   		bat '"${JAVA_HOME}/javac" Student.java'
	    }
	    task('Build Tests'){
	   	bat '"${JAVA_HOME}/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
	   }
	   }
	   
	   }	   
	   stage('Run Tests') {
	   steps {
	    task('run tests'){
	   	bat '"${JAVA_HOME}/javac" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
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