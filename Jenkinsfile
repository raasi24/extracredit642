pipeline {
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {
    	// compile and generate single executable jar with all dependencies
		stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
    }
}