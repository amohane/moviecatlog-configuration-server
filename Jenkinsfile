node {
   def mvnHome
   def dockerHome
   stage('GIT checkout') {
      git 'https://github.com/amohane/moviecatlog-configuration-server.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool name: 'maven3', type: 'maven'
      dockerHome = tool name: 'Docker', type: 'org.jenkinsci.plugins.docker.commons.tools.DockerTool'
   }
   stage('Build Maven') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
         if (isUnix()) {
            sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
         }
      }
   }
   stage('Build Docker Image'){
      docker.build("amohane/moviecatlog-configuration-server:${env.BUILD_NUMBER}")
   }
}
