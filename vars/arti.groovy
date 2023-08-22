def call() {
  rtUpload (
      serverId: 'jfrog',
      spec: '''{
             "files": [
               {
                 "pattern": "webapp/target/*.war",
                 "target": "libs-snapshot-local"
                }
            ]
       }''',
       buildName: 'javaProject',
       buildNumber: '1',
       // Optional - Only if this build is associated with a project in Artifactory, set the project key as follows.
       project: 'my-project-key'
  )
}
