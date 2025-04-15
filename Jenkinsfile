pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'Java 17'
    }

    stages {
        stage('Clonar proyecto') {
            steps {
                git 'https://github.com/tu-usuario/tu-repo.git'
            }
        }

        stage('Construir app') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Construir imagen Docker') {
            steps {
                sh 'docker build -t mi-app-springboot .'
            }
        }

        stage('Levantar contenedores') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}
