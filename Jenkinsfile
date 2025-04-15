pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'Java 17'
    }

    stages {
        stage('Clonar proyecto') {
            steps {
                git 'https://github.com/RicardoMTT/swagger-api-springboot.git'
            }
        }

        stage('Construir app') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

    }
}
