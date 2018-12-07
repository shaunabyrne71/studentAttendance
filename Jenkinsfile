pipeline {
	agent any
	environment {
		JAVA_HOME = "${env.JAVA_HOME}"
	}
	stages {	 
		//stage('Build') {
		//	steps {					
		//			echo "${env.JAVA_HOME}"  
		//			echo "%JAVA_HOME%"	
		//			bat '"%JAVA_HOME%/bin/javac" Student.java'
		//			bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. studentTest.java'					
				  
		//	}
		//}
		stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
		stage ('Initialize') {
            steps {
                
                    //echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                
            }
        }	   
		stage('Run Tests') {
			//steps {
				//bat '"%JAVA_HOME%/bin/javac" -classpath C:/junit/junit-4.10.jar;. org.junit.runner.JUnitCore studentTest.java'			
				//mvn test	
			//}
			//steps {
           //     sh 'mvn -Dmaven.test.failure.ignore=true install' 
           // }
           // post {
           //     success {
           ///         junit 'target/surefire-reports/**/*.xml' 
           //     }
           // }
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