pipeline {
    
    agent {
        label "master"
        
    }
    
    stages {
        
        stage("Hello world"){
            steps {
                sh  "ls -l"
            }
        }
        stage("print Build No"){
            steps {
                sh "touch /tmp/test_${BUILD_NUMBER}"
            }
        }
            
        
        
    }
    
}
