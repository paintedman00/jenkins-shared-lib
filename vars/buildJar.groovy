#!/usr/bin/env groovy

def call() { 
     echo "Building the app $BRANCH_NAME"
     sh "mvn clean package"
}