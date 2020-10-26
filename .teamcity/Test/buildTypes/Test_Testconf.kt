package Test.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Test_Testconf : BuildType({
    uuid = "f479618d-2b13-491e-8eed-516bba9a1862"
    name = "testconf"

    vcs {
        root(AbsoluteId("localgit"))
    }

    steps {
        script {
            name = "test-step"
            scriptContent = "echo 'Hello World!'"
        }
        script {
            scriptContent = "./greet.sh ryuichi"
        }
    }
})
