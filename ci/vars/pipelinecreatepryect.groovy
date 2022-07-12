def call() {
  pipeline {

    stages {

      stage('Create proyect') {
        steps {
          create_proyect(env.package,env.company,env.automatic)
        }
        post {
          success {
            echo "-> El Proyecto fue creado correctamente."
          }
        }
      }

      stage('create repo') {
        steps {
          create_repo_ms(env.company)
        }
        post {
          success {
            echo "-> Se creo el repo github"
          }
        }
      }






    }


  }

}
