pipeline {
	agent any
	//environment {
	//	JAVA_HOME = "${env.JAVA_HOME}"
	//}
	stages {	 
		stage('get all from remote') {
       checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/echancrure/studentAttendance.git/']]])
   }
   stage('build source') {
       echo 'building source'
       bat '"%JAVA_HOME%/bin/javac" Student.java'
   }
   stage('build tests') {
       echo 'build test'
       bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'
   }
   stage('run tests') {
       echo 'running the tests'
       bat '"%JAVA_HOME%/bin/java" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest'
   }

			
	}
	post {
		always {
			echo "Clean Workspace"           
			cleanWs()
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