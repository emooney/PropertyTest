pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
				withMaven {
					sh 'mvn clean compile'
				}
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
				withMaven {
					sh 'mvn test'
				}
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				
            }
        }
    }
}