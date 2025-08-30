def buildFrontend(String tag) {
    withEnv(["TAG=${tag}"]) {
        sh """
          docker-compose build frontend
        """
    }
}
