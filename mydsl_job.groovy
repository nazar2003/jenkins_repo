pipelineJob("My_test_Job"){

definition {

cpsScm {

scm {
git {
remote {

url ("https://github.com/nazar2003/jenkins_repo.git")
}

}

}
}

}

}
