pipeline {
    agent any
    stages {
        stage('Preparar entorno') {
            steps {
                script {
                    echo "Preparando entorno para la ejecución de pruebas"
                }
                // Instalar dependencias si es necesario
                sh 'mvn clean install'
            }
        }
        stage('Ejecutar pruebas') {
            steps {
                script {
                    echo "Ejecutando el TestRunner con Selenium y Cucumber"
                }
                sh 'mvn -Dtest=TestRunner test"'
            }
        }
        stage('Publicar resultados') {
            steps {
                script {
                    echo "Publicando los resultados de las pruebas"
                }
                // Publicar resultados del reporte de Cucumber
                publishHTML(target: [
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber Report'
                ])
            }
        }
    }
    post {
        always {
            script {
                echo "Pipeline finalizado. Limpieza en progreso."
            }
            // Opcional: Limpieza de archivos temporales
            sh 'mvn clean'
        }
    }
}
