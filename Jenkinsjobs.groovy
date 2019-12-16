pipelineJob('mariadb-docker-prod') {
    definition {
        cpsScm {
            scm {
                github('stevenriggs/mariadb-docker', 'master', 'https')
            }
        }
    }
}
pipelineJob('mariadb-docker-qa') {
    definition {
        cpsScm {
            scm {
                github('stevenriggs/mariadb-docker', 'qa', 'https')
            }
        }
    }
}