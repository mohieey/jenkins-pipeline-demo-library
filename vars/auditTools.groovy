def call() {
    node {
      sh '''
        git version
        docker version
      '''
    }
}