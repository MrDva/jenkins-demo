pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Build'
                echo 'mvn install'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}