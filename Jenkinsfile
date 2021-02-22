pipeline {
    agent any
    tools {
        maven "M3"
        jdk "java8"
    }

    environment {
        app_name = 'trading-app'
    }

    stages {
        stage('Build') {
            steps {
                sh 'cd springboot && mvn clean package -DskipTests'
                echo "app_name is ${env.app_name} "
                archiveArtifacts 'Trading-app/target/trading-app-1.0-SNAPSHOT.jar'
            }
        }
        stage('Deploy_dev') {
            when { branch 'develop' }
            steps {
                echo "Current Branch is: ${env.GIT_BRANCH}"
                sh "bash ./Trading-app/scripts/eb/eb_deploy.sh ${app_name} TradingApp-env"
            }
        }
        stage('Deploy_prod') {
            when { branch 'master' }
            steps {
                echo "Current Branch is: ${env.GIT_BRANCH}"
                sh "./Trading-app/scripts/eb/eb_deploy.sh ${app_name} TradingApp-prod"
            }
        }
    }
}
