

def call() {
  node() {

    stage('Simple test') {
      sh "echo 'Hello World'"
    }

    stage('Maven version') {
      MVN_HOME = tool name: 'Maven 3.9.0', type: 'maven'
      withEnv(["PATH+MVN=${MVN_HOME}/bin"]) {
        sh 'mvn --version'
      }
    }

  }
}
