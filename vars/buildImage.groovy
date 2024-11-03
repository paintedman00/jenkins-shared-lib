#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
             withCredentials([usernamePassword(credentialsId: 'docker-hub-login', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                 sh 'docker build -t paintedman00/app-demo:jma-2.0 .'
                 sh 'echo $PASS | docker login -u $USER --password-stdin'
                 sh 'docker push paintedman00/app-demo:jma-2.0'
}
}