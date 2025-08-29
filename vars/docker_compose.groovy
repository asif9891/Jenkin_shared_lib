def buildFrontend(String tag) {
    withEnv(["TAG=${tag}"]) {
        sh """
          docker-compose build frontend
          docker-compose up -d frontend
        """
    }
}
