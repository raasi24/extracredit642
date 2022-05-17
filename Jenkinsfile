pipeline {

    agent any
    
    stages {
    	// compile and generate single executable jar with all dependencies
		stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
    }
}